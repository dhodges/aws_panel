(ns aws-panel.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [aws-panel.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[aws_panel started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[aws_panel has shut down successfully]=-"))
   :middleware wrap-dev})
