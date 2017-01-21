(ns aws-console.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[aws_console started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[aws_console has shut down successfully]=-"))
   :middleware identity})
