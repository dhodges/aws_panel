(ns aws-console.notifiers.core
  (:require [clojure.tools.logging :as log]
            [aws-console.routes.websockets :as ws]
            [aws-console.notifiers.ec2 :as ec2]
            [aws-console.notifiers.route53 :as route53]
            [aws-console.notifiers.cloudformation :as cloudform]
            [clojure.string :as str]))

(defonce notifiers (atom {}))

(defn notifier-exists?
  [name]
  (some #(= name %) (keys @notifiers)))

(defn set-notifier-thread
  [name thread]
  (swap!
   notifiers
   update-in
   [name :thread]
   (fn [_] thread)))

(defn pause-notifier
  [name]
  (when-let [thread (get-in @notifiers [name :thread])]
    (do
      (future-cancel thread)
      (set-notifier-thread name nil))))

(defn resume-notifier
  [name]
  (let [{:keys [update_fn frequency thread]} (get @notifiers name)]
    (when (and (not thread)
               (fn? update_fn))
      (set-notifier-thread
       name
       (future
          (loop []
            (try
              (ws/notify-clients {:name name :msg (update_fn)})
              (catch Exception e
                (log/error (str "Error when notifying " name " - " (.getMessage e)))
                (log/error (str/join "\n" (map str (.getStackTrace e))))))
            (Thread/sleep (* frequency 1000))
            (recur)))))))

(defn swap-notifier
  [_ fn frequency]
  {:update_fn fn :frequency frequency :thread nil})

;; ------------------------------------

(defn defnotifier
  [name fn frequency]
  (when (not (notifier-exists? name))
    (swap! notifiers update name swap-notifier fn frequency)))

(defn resume
  []
  (log/info "resuming notifications")
  (run! resume-notifier (keys @notifiers)))

(defn pause
  []
  (log/info "pausing notifications")
  (run! pause-notifier (keys @notifiers)))

(defn start
  []
  (ws/add-listener-connect resume)
  (ws/add-listener-disconnect pause))  

(defn stop
  []
  (log/info "stopping aws-console.notifiers")
  (pause))

;; ------------------------------------

(defnotifier :ec2-instances   ec2/list-instances 15)
(defnotifier :route53-records route53/list-record-sets 20)
(defnotifier :stacks          cloudform/list-stacks 20)


