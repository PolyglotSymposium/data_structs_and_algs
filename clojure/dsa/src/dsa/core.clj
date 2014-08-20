(ns dsa.core
  (:gen-class))

(defrecord MyList [next data])

(defn newlist [x] (MyList. :endoflist x))
(defn mycons [elem otherlist] (MyList. otherlist elem))
(defn myhead [list] (:data list))
(defn myrest [list] (:next list))


(defn already-sorted? [xs] (> 2 (count xs)))

(defn pivot-partition [pivot remainder]
  (let [{lt true gte false} (group-by #(< % pivot) remainder)]
    [lt gte]))

(defn qsort [xs]
  (if (already-sorted? xs)
    xs
    (let [pivot (first xs)
      [lt gte] (pivot-partition pivot (rest xs))]
        (concat (qsort lt) [pivot] (qsort gte)))))

(defn anagrams [words] (or (vals (group-by sort words)) []))
