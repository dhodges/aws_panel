(ns aws-panel.app
  (:require [aws-panel.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
