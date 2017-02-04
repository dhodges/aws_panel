(ns aws-console.notifiers.util
  (:require [clojure.string :as str]
            [clojure.tools.logging :as log]))

(defn update-id
  [instance]
  (assoc instance :id (str (java.util.UUID/randomUUID))))

