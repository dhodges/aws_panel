(ns aws-panel.core
  (:require [aws-panel.websockets :as ws]
            [aws-panel.components.search-box :refer [search-box]]
            [clojure.string :as str]
            [reagent.core :as r]))

(defonce app-state
  (r/atom {:ec2-instances []
           :route53-records []
           :stacks []
           :rds-instances []}))

(defn log [str]
  (.log js/console str))

(defn pattern
  [filter]
  (->> (str filter)
       (str/upper-case)
       (re-pattern)))

(defn filter-content
  [filter-text rows]
  (let [filter-val #(re-find (pattern filter-text)
                             (str/upper-case (str %)))
        match-row  #(some filter-val (vals %))]
    (filter match-row rows)))

(defn ec2-instances
  []
  (let [filter (r/atom nil)]
    (fn []
      [:div#ec2-instances
       [search-box filter]
       [:div.component
        [:div.fixed-table-container
         [:div.header-background]
         [:div.fixed-table-container-inner
          [:table.ui.collapsing.striped.sortable.single.line.table
           [:thead
            [:tr
             [:th [:div.th-inner "EC2 name"]]
             [:th [:div.th-inner "private ip"]]
             [:th [:div.th-inner "env"]]
             [:th [:div.th-inner "launch time"]]
             [:th [:div.th-inner "state"]]
             ]]
           [:tbody
            (for [row (filter-content @filter (:ec2-instances @app-state))]
              ^{:key (:id row)}
              [:tr
               [:td (:name row)]
               [:td (:private-ip-address row)]
               [:td (:env row)]
               [:td (:launch-time row)]
               [:td (:state row)]
               ])]]]]]])))

(defn route53-records
  []
  (let [filter (r/atom nil)]
    (fn []
      [:div#route53-records
       [search-box filter]
       [:div.component
        [:div.fixed-table-container
         [:div.header-background]
         [:div.fixed-table-container-inner
          [:table.ui.collapsing.striped.sortable.single.line.table
           [:thead
            [:tr
             [:th [:div.th-inner "Route53 name"]]
             [:th [:div.th-inner "type"]]
             [:th [:div.th-inner "ttl"]]
             ]]
           [:tbody
            (for [row (filter-content @filter (:route53-records @app-state))]
              ^{:key (:id row)}
              [:tr
               [:td.collapsing (:name row)]
               [:td.collapsing (:type row)]
               [:td.collapsing (:ttl row)]
               ])]]]]]])))

(defn cloudformation-stacks
  []
  (let [filter (r/atom nil)]
    (fn []
      [:div#stacks
       [search-box filter]
       [:div.component
        [:div.fixed-table-container
         [:div.header-background]
         [:div.fixed-table-container-inner
          [:table.ui.collapsing.striped.sortable.single.line.table
           [:thead
            [:tr
             [:th [:div.th-inner "Cloudformations"]]
             [:th [:div.th-inner "status"]]
             [:th [:div.th-inner "env"]]
             [:th [:div.th-inner "creation-time"]]
             ]]
           [:tbody
            (for [row (filter-content @filter (:stacks @app-state))]
              ^{:key (:id row)}
              [:tr
               [:td.collapsing (:name row)]
               [:td.collapsing (:status row)]
               [:td.collapsing (:env row)]
               [:td.collapsing (:creation-time row)]
               ])]]]]]])))

(defn rds-instances
  []
  (let [filter (r/atom nil)]
    (fn []
      [:div#stacks
       [search-box filter]
       [:div.component
        [:div.fixed-table-container
         [:div.header-background]
         [:div.fixed-table-container-inner
          [:table.ui.collapsing.striped.sortable.single.line.table
           [:thead
            [:tr
             [:th [:div.th-inner "RDS name"]]
             [:th [:div.th-inner "db_name"]]
             [:th [:div.th-inner "engine"]]
             [:th [:div.th-inner "version"]]
             [:th [:div.th-inner "status"]]
             ]]
           [:tbody
            (for [row (filter-content @filter (:rds-instances @app-state))]
              ^{:key (:id row)}
              [:tr
               [:td.collapsing (:name row)]
               [:td.collapsing (:dbname row)]
               [:td.collapsing (:engine row)]
               [:td.collapsing (:version row)]
               [:td.collapsing (:status row)]
               ])]]]]]])))

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
  (render #'ec2-instances   "ec2")
  (render #'route53-records "route53")
  (render #'cloudformation-stacks "cloudformation-stacks")
  (render #'rds-instances   "rds")
  )

(defn init! []
  (ws/make-websocket!
   (str "ws://" (.-host js/location) "/ws") update-components!)
  (mount-components))
