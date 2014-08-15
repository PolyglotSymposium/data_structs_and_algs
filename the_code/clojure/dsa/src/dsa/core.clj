(ns dsa.core
  (:gen-class))

(defrecord MyList [next])
(def emptylist (MyList. :endoflist))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
