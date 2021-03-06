(ns aws-panel.notifiers.route53
  (:require [amazonica.aws.route53 :as route53]
            [amazonica.core :refer [defcredential]]
            [aws-panel.notifiers.util :refer [update-id]]
            [cheshire.core :refer [generate-string]]
            [cheshire.generate :as generate]
            [clj-time.coerce :as coerce]
            [clojure.string :as str]
            [environ.core :refer [env]]))

(defcredential
  (env :aws-access-key-id)
  (env :aws-secret-access-key)
  (env :aws-region))

(defonce hosted-zone
  (atom {:id "Z3PQK17IX127NB"
         :domain-name "spp.lonelyplanet.com"}))

(defn- get-record-sets
  []
  (:resource-record-sets
   (route53/list-resource-record-sets :hosted-zone-id (:id @hosted-zone))))

;; {:name "spp.lonelyplanet.com.",
;;  :type "NS",
;;  :ttl 172800,
;;  :resource-records
;;  [{:value "ns-105.awsdns-13.com."}
;;   {:value "ns-2027.awsdns-61.co.uk."}
;;   {:value "ns-837.awsdns-40.net."}
;;   {:value "ns-1261.awsdns-29.org."}
;;   ]}

(defn- update-resource-records
  [record-set]
  (update record-set :resource-records
          (fn [records]
            (str/join " " (mapv #(:value %) records)))))

(defn list-record-sets
  []
  (->> (get-record-sets)
       (mapv update-resource-records)
       (mapv update-id)))
