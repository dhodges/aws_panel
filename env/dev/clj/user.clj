(ns user
  (:require [mount.core :as mount]
            [aws-panel.figwheel :refer [start-fw stop-fw cljs]]
            aws-panel.core))

(defn start []
  (mount/start-without #'aws-panel.core/http-server
                       #'aws-panel.core/repl-server))

(defn stop []
  (mount/stop-except #'aws-panel.core/http-server
                     #'aws-panel.core/repl-server))

(defn restart []
  (stop)
  (start))


