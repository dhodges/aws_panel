(ns aws-panel.components.search-box)

(defn log [str]
  (.log js/console str))

(defn click-search
  [evt]
  (let [target (.-target evt)]
    (-> (js/$ target)
        (.next "input")
        (.focus))))

(defn search-box
  [filter]
  [:div.search
   [:i.fa.fa-search  {:on-click click-search}]
   [:input    {:type "text"
               :value @filter
               :on-change #(reset! filter (-> % .-target .-value))}]])
