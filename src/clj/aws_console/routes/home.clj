(ns aws-console.routes.home
  (:require [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn page-resource
  [path]
  (-> (response/ok (-> path io/resource slurp))
      (response/header "Content-Type" "text/html; charset=utf-8")))

(defroutes home-routes
  (GET "/" []
       (page-resource "public/index.html"))
)

