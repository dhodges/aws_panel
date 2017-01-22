(ns aws-console.core
  (:require [reagent.core :as r]
            [aws-console.websockets :as ws]
            ))

(defonce app-state
  (r/atom {:ec2-instances [] 
           }))

(defn all-instances
  []
  (let [instances (sort-by #(get-in % [:tags "Name"])
                           (:ec2-instances @app-state))]
    [:div#ec2.container.col-xs-12
     [:table.table-condensed
      [:thead
       [:tr
        [:th "Name"]
        [:th "ip"]
        [:th "environ"]]]
      [:tbody
       (for [row instances]
         ^{:key row}
         [:tr
          [:td (get (:tags row) "Name")]
          [:td (:private-ip-address row)]
          [:td (get (:tags row) "environment_name")]
          ])]]]))
sort
(defn ec2-component
  []
  [all-instances])

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
)

(defn init! []
  (ws/make-websocket!
   (str "ws://" (.-host js/location) "/ws") update-components!)
  (mount-components))
