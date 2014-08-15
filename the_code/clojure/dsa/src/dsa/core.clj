(ns dsa.core
  (:gen-class))

(defrecord MyList [next])
(def emptylist (MyList. :endoflist))

(defn qsort [xs]
  (if (< 2 (count xs)) xs
  (let [x (first xs) r (rest xs)]
    (if (> x (first r)) (conj r x) xs))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
