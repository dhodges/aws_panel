(ns aws-console.notifiers.ec2
  (:require [amazonica.core :refer [defcredential]]
            [amazonica.aws.ec2 :as ec2]
            [cheshire.core :refer [generate-string]]
            [cheshire.generate :as generate]
            [clj-time.coerce :as coerce]
            [clojure.string :as str]
            [environ.core :refer [env]]))

(defcredential
  (env :aws-access-key-id)
  (env :aws-secret-access-key)
  (env :aws-region))

(generate/add-encoder org.joda.time.DateTime
                      (fn [data jsonGenerator]
                        (.writeString jsonGenerator
                                      (coerce/to-string data))))

;; "tags": [
;;   {
;;     "value": "atlas-prod",
;;     "key": "environment_name"
;;   },
;; ...
;; ],

(defn tag-to-map
  [tag]
  (sorted-map (:key tag) (:value tag)))

(defn update-tags
  [instance]
  (update-in instance [:tags] #(apply merge (map tag-to-map %))))

(defn split-name
  [name]
  (if (re-matches #"^[0-9]+.*$" name)
    (first (str/split name #"-"))
    name))

(defn update-name
  [instance]
  (assoc-in instance [:name]
            (split-name (get-in instance [:tags "Name"]))))

(defn update-env
  [instance]
  (assoc-in instance [:env]
            (or (get-in instance [:tags "environment_name"])
                "")))

(defn update-state
  [instance]
  (update-in instance [:state] #(:name %)))

(defn git-sha-from-name
  [name]
  ;; e.g. "2.512.issue_1998-718fcc6f39b72099644a7a48adca6f29b3320dda(jenkins)
  (when (re-matches #"^[0-9]+.*$" name)
    (let [git-sha (str/join "-" (rest (str/split name #"-")))]
      (first (str/split git-sha #"\(")))))

(defn update-git-sha
  [instance]
  (assoc-in instance [:git-sha]
            (git-sha-from-name (get-in instance [:tags "Name"]))))

(defn list-instances
  []
  (let [instances (->> (:reservations (ec2/describe-instances))
                       (map #(:instances %))
                       (flatten)
                       (map update-tags)
                       (map update-name)
                       (map update-env)
                       (map update-state)
                       (map update-git-sha)
                       )]
    (map #(select-keys % [:name
                          :private-ip-address
                          :env
                          :state])
         instances)))

