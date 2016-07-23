(ns aframe-reagent-boilerplate.prod
  (:require [aframe-reagent-boilerplate.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
