(ns aws-panel.notifiers.rds
  (:require [amazonica.aws.rds :as rds]
            [amazonica.core :refer [defcredential]]
            [aws-panel.notifiers.util :refer [update-id]]
            [cheshire.generate :as generate]
            [clj-time.coerce :as coerce]
            [clj-time.format :as f]
            [clojure.string :as str]
            [environ.core :refer [env]]))

(defcredential
  (env :aws-access-key-id)
  (env :aws-secret-access-key)
  (env :aws-region))

(generate/add-encoder org.joda.time.DateTime
                      (fn [data jsonGenerator]
                        (.writeString jsonGenerator
                                      (coerce/to-string data))))

(defn get-rds-instances
  []
  (:dbinstances (rds/describe-dbinstances)))

(defn update-name
  [instance]
  (assoc instance :name (get instance :dbinstance-identifier)))

(defn update-version
  [instance]
  (assoc instance :version (get instance :engine-version)))

(defn update-status
  [instance]
  (assoc instance :status (get instance :dbinstance-status)))

(defn filter-instances
  [instances]
  (->> instances
       (mapv update-id)
       (mapv update-name)
       (mapv update-version)
       (mapv update-status)))

(defn list-rds-instances
  []
  (map #(select-keys % [:id
                        :name
                        :dbname
                        :engine
                        :version
                        :status])
       (filter-instances (get-rds-instances))))
