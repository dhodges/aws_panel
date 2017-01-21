(ns aws-console.ec2
  (:require [amazonica.core :refer [defcredential]]
            [amazonica.aws.ec2 :as ec2]
            [cheshire.core :refer [generate-string]]
            [cheshire.generate :as generate]
            [clj-time.coerce :as coerce]
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

;;(ec2/describe-instances)
;; throws com.amazonaws.AmazonServiceException

(def instance-keys (atom [:image-id
                          :instance-id
                          :instance-type
                          :placement
                          :private-ip-address
                          :security-groups
                          :state
                          :subnet-id
                          :tags
                          :vpc-id]))

;; "tags": [
;;   {
;;     "value": "atlas-prod",
;;     "key": "environment_name"
;;   },
;; ...
;; ],

(defn tag-to-map
  [tag]
  (sorted-map (:key tag) (:value tag)))

(defn update-tags
  [instance]
  (update-in instance [:tags] #(apply merge (map tag-to-map %))))

(defn get-instances
  []
  (let [instances (map #(select-keys % @instance-keys)
                       (flatten (map #(:instances %)
                                     (:reservations (ec2/describe-instances)))))]
    (mapv update-tags instances)))
