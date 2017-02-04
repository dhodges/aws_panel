(ns aws-panel.notifiers.cloudformation
  (:require [amazonica.aws.cloudformation :as cloudform]
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

(def datetime_fmt
  (f/formatters :date-hour-minute))

(defn- get-cloud-formations
  []
  (:stacks (cloudform/describe-stacks)))

(defn- parameters-to-map
  [params]
  (sorted-map (:parameter-key params)
              (:parameter-value params)))

(defn- update-parameters
  [instance]
  (update instance :parameters
          #(apply merge (map parameters-to-map %))))

(defn- update-name
  [instance]
  (assoc instance :name (:stack-name instance)))

(defn- update-status
  [instance]
  (assoc instance :status (:stack-status instance)))

(defn- update-env
  [instance]
  (assoc instance :env
         (get-in instance [:parameters "EnvironmentType"])))

(defn- update-creation-time
  [instance]
  (let [creation-time (:creation-time instance)]
    (update instance :creation-time
            #(f/unparse datetime_fmt %))))

(defn filter-instances
  [instances]
  (->> instances
       (mapv update-id)
       (mapv update-name)
       (mapv update-status)
       (mapv update-parameters)
       (mapv update-env)
       (mapv update-creation-time)))

(defn list-stacks
  []
  (map #(select-keys % [:id
                        :name
                        :status
                        :env
                        :creation-time])
       (filter-instances (get-cloud-formations))))
