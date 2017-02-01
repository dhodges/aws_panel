(ns aws-console.notifiers.ec2
  (:require [amazonica.core :refer [defcredential]]
            [amazonica.aws.ec2 :as ec2]
            [cheshire.core :refer [generate-string]]
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
  (f/formatters :date-hour-minute-second))

;; "tags": [
;;   {
;;     "value": "atlas-prod",
;;     "key": "environment_name"
;;   },
;; ...
;; ],

(defn- tag-to-map
  [tag]
  (sorted-map (:key tag) (:value tag)))

(defn- update-tags
  [instance]
  (update-in instance [:tags] #(apply merge (map tag-to-map %))))

(defn- split-name
  [name]
  (if (re-matches #"^[0-9]+.*$" name)
    (first (str/split name #"-"))
    name))

(defn- update-name
  [instance]
  (assoc-in instance [:name]
            (split-name (get-in instance [:tags "Name"]))))

(defn- update-env
  [instance]
  (assoc-in instance [:env]
            (or (get-in instance [:tags "environment_name"])
                "")))

(defn- update-state
  [instance]
  (update-in instance [:state] #(:name %)))

(defn- update-launch-time
  [instance]
  (update instance :launch-time #(f/unparse datetime_fmt %)))

(defn- uuid
  []
  (java.util.UUID/randomUUID))

(defn- update-id
  [instance]
  (assoc instance :id (uuid)))

(defn- describe-ec2-instances
  []
  (flatten
   (mapv #(:instances %)
         (:reservations (ec2/describe-instances)))))

(defn- filter-instances
  [instances]
  (->> instances
       (map update-tags)
       (map update-name)
       (map update-env)
       (map update-state)
       (map update-launch-time)
       (map update-id)))

(defn list-instances
  []
  (map #(select-keys % [:id
                        :name
                        :private-ip-address
                        :env
                        :launch-time
                        :state])
       (filter-instances (describe-ec2-instances))))

