(ns aws-console.notifiers.ec2
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

(defn update-state
  [instance]
  (update-in instance [:state] #(:name %)))

(defn split-name
  [name]
  (if (re-matches #"^[0-9]+.*$" name)
    (first (str/split name #"-"))
    name))

(defn update-name
  [instance]
  (update-in instance [:tags "Name"] split-name))

;; e.g. "2.512.issue_1998-718fcc6f39b72099644a7a48adca6f29b3320dda(jenkins)
(defn git-sha-from-name
  [name]
  (when (re-matches #"^[0-9]+.*$" name)
    (let [git-sha (str/join "-" (rest (str/split name #"-")))]
      (first (str/split git-sha #"\(")))))

(defn update-git-sha
  [instance]
  (assoc-in instance [:git-sha]
            (git-sha-from-name (get-in instance [:tags "Name"]))))

(defn raw-instances
  []
  (map #(select-keys % @instance-keys)
       (flatten (map #(:instances %)
                     (:reservations (ec2/describe-instances))))))

(defn get-instances
  []
  (->> (raw-instances)
       (mapv update-tags)
       (mapv update-state)
       (mapv update-git-sha)
       (mapv update-name)
       ))
