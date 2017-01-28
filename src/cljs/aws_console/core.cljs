(ns aws-console.core
  (:require [cljsjs.semantic-ui]
            [reagent.core :as r]
            [aws-console.websockets :as ws]
            [clojure.string :as str]))

(defonce app-state
  (r/atom {:ec2-instances []
           :route53-record-sets []}))

(defn ec2-instances
  []
  [:div#ec2
   [:table.ui.collapsing.striped.sortable.blue.single.line.table
    [:thead
     [:tr
      [:th "EC2 instance name"]
      [:th "private ip"]
      [:th "env"]
      [:th "launch time"]
      [:th "state"]
      ]]
    [:tbody
     (for [row (:ec2-instances @app-state)]
       ^{:key row}
       [:tr
        [:td.collapsing (:name row)]
        [:td.collapsing (:private-ip-address row)]
        [:td.collapsing (:env row)]
        [:td.collapsing (:launch-time row)]
        [:td.collapsing (:state row)]
        ])]]])

(defn route53-record-sets
  []
  [:div#route53
   [:table.ui.collapsing.striped.sortable.blue.single.line.table
    [:thead
     [:tr
      [:th "Route53 name"]
      [:th "type"]
      [:th.right.aligned "ttl"]
      [:th "values"]
      ]]
    [:tbody
     (for [record (:route53-record-sets @app-state)]
       ^{:key record}
       [:tr
        [:td.collapsing (:name record)]
        [:td.collapsing (:type record)]
        [:td.collapsing.right.aligned (:ttl  record)]
        [:td.collapsing (str/join " '" (:resource-records record))]
        ])]]])

(defn ec2-component
  []
  [ec2-instances])

(defn route53-component
  []
  [route53-record-sets])

;; ------------------------------------------------

(defn update!
  [keyword msg]
  (swap! app-state update-in [keyword] (constantly msg)))

(defn update-components!
  [state]
  (update! (:name state) (:msg state)))

(defn render
  [component id]
  (r/render
   [component] (.getElementById js/document id)))

(defn mount-components []
  (render #'ec2-component "ec2")
  (render #'route53-component "route53")
)

(defn init! []
  (ws/make-websocket!
   (str "ws://" (.-host js/location) "/ws") update-components!)
  (mount-components))
