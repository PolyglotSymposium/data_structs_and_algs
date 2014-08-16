(ns dsa.core
  (:gen-class))

(defrecord MyList [next data])

(defn newlist [x] (MyList. :endoflist x))
(defn mycons [elem otherlist] (MyList. otherlist elem))
(defn myhead [list] (:data list))
(defn myrest [list] (:next list))

(defn qsort [xs]
  (if (> 2 (count xs))
    xs
    (let [pivot (first xs)]
      (let [{lt true gte false} (group-by #(< % pivot) (rest xs))]
        (concat (qsort lt) [pivot] (qsort gte))))))
