(ns aws-console.core
  (:require [reagent.core :as r]
            [aws-console.websockets :as ws]
            ))

(defonce app-state
  (r/atom {:ec2-instances []
           :sort-order [:tags "Name"]
           }))

(defn sort-order
  [instance]
  (get-in instance (:sort-order @app-state)))

(defn set-sort-order
  [order]
  (swap! app-state
         (fn [state]
           (update-in state [:sort-order] (constantly order)))))

(defn all-instances
  []
  (let [instances (sort-by sort-order
                           (:ec2-instances @app-state))]
    [:div#ec2.container.col-xs-12
     [:table.table-condensed
      [:thead
       [:tr
        [:th {:on-click #(set-sort-order [:tags "Name"])}
         "Name"]
        [:th {:on-click #(set-sort-order [:private-ip-address])}
         "ip"]
        [:th {:on-click #(set-sort-order [:tags "environment_name"])}
         "environ"]]]
      [:tbody
       (for [row instances]
         ^{:key row}
         [:tr
          [:td (get-in row [:tags "Name"])]
          [:td (get-in row [:private-ip-address])]
          [:td (get-in row [:tags "environment_name"])]
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
