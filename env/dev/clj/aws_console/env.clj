(ns aws-console.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [aws-console.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[aws_console started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[aws_console has shut down successfully]=-"))
   :middleware wrap-dev})
