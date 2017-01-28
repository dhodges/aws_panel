(ns aws-console.core
  (:require [aws-console.websockets :as ws]
            [clojure.string :as str]
            [cljsjs.semantic-ui]
            [reagent.core :as r]))

(defonce app-state
  (r/atom {:ec2-instances []
           :route53-records []}))

(defn search-box
  []
  [:div.search
   [:i.fa.fa-search]
   [:input {:type "text"}]
   [:i.fa.fa-times-circle]
   ])

(defn ec2-instances
  []
  [:div.component
   [search-box]
   [:div#ec2-instances
    [:table.ui.collapsing.striped.sortable.single.line.table
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
         ])]]]])

(defn route53-records
  []
  [:div.component
   [search-box]
   [:div#route53-records
    [:table.ui.collapsing.striped.sortable.single.line.table
     [:thead
      [:tr
       [:th "Route53 name"]
       [:th "type"]
       [:th.right.aligned "ttl"]
       ]]
     [:tbody
      (for [record (:route53-records @app-state)]
        ^{:key record}
        [:tr
         [:td.collapsing (:name record)]
         [:td.collapsing (:type record)]
         [:td.collapsing (:ttl  record)]
         ])]]]])

(defn ec2-component
  []
  [ec2-instances])

(defn route53-component
  []
  [route53-records])

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
