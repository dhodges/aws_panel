(ns aws-panel.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [aws-panel.layout :refer [error-page]]
            [aws-panel.routes.home :refer [home-routes]]
            [aws-panel.routes.websockets :refer [websocket-routes]]
            [compojure.route :as route]
            [aws-panel.env :refer [defaults]]
            [mount.core :as mount]
            [aws-panel.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
   #'websocket-routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
