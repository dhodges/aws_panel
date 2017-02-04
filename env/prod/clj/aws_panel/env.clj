(ns aws-panel.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[aws_panel started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[aws_panel has shut down successfully]=-"))
   :middleware identity})
