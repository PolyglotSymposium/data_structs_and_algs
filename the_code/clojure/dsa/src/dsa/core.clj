(ns dsa.core
  (:gen-class))

(defrecord MyList [next data])
(defn newlist [x] (MyList. :endoflist x))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
