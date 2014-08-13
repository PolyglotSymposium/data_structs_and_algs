(ns dsa.core
  (:gen-class))

(defn qsort [xs]
  (if (< 2 (count xs)) xs
  (let [f (first xs) r (rest xs)]
    (if (> (f (first r))) (conj r f) xs))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
