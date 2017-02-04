(ns aws-panel.routes.websockets
  (:require [compojure.core :refer [GET defroutes]]
            [org.httpkit.server
             :refer [send! with-channel on-close on-receive]]
            [cognitect.transit :as t]
            [clojure.tools.logging :as log]
            [clojure.string :as str])
  (:import [java.io ByteArrayOutputStream]))

(defonce channels (atom #{}))
(defonce listeners-connect    (atom #{}))
(defonce listeners-disconnect (atom #{}))

(defn connect! [channel]
  (log/info "channel open")
  (swap! channels conj channel)
  (doseq [fn @listeners-connect] (fn)))

(defn disconnect! [channel status]
  (log/info "channel closed:" status)
  (swap! channels #(remove #{channel} %))
  (when (= 0 (count @channels))
    (doseq [fn @listeners-disconnect] (fn))))

(defn add-listener-connect
  [fn]
  (swap! listeners-connect conj fn))

(defn add-listener-disconnect
  [fn]
  (swap! listeners-disconnect conj fn))

;; see: https://github.com/swannodette/transit-example
(defn marshall
  [msg]
  (let [baos (ByteArrayOutputStream.)
        w    (t/writer baos :json)
        _    (t/write w msg)
        ret  (.toString baos)]
    (.reset baos)
    ret))

(defn notify-clients [msg]
  (try
    (let [message (marshall msg)]
      (doseq [channel @channels]
        (send! channel message)))
    (catch Exception e
      (log/error "error marshalling message: ")
      (log/error (str msg))
      (log/error (str/join "\n" (map str (.getStackTrace e)))))))

(defn ws-handler [request]
  (with-channel request channel
    (connect! channel)
    (on-close channel (partial disconnect! channel))))

(defroutes websocket-routes
  (GET "/ws" request (ws-handler request)))

