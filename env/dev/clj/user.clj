(ns user
  (:require [mount.core :as mount]
            [aws-console.figwheel :refer [start-fw stop-fw cljs]]
            aws-console.core))

(defn start []
  (mount/start-without #'aws-console.core/http-server
                       #'aws-console.core/repl-server))

(defn stop []
  (mount/stop-except #'aws-console.core/http-server
                     #'aws-console.core/repl-server))

(defn restart []
  (stop)
  (start))


