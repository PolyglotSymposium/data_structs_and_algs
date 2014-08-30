(ns dsa.core
  (:gen-class))

(use '[clojure.core.match :only (match)])

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

(defn div-by? [n d] (= (rem n d)0))

(defn fizzbuzz [number]
  (match [(div-by? number 3) (div-by? number 5)]
    [true true] "FizzBuzz"
    [true false] "Fizz"
    [false true] "Buzz"
    :else (str number)))

(defn fibs-beginning-at [a b]
  (lazy-seq (cons a (fibs-beginning-at b (+ a b)))))

(defn fibs-until [n]
  (take-while #(<= % n) (fibs-beginning-at 1 2)))

(defn zeckendorf
  ([n]
    (if (= 0 n) "0" (zeckendorf n (reverse (fibs-until n)))))
  ([n fibs]
    (if (= fibs [])
      ""
      (let [head (first fibs) tail (rest fibs)]
        (if (or (> head n) (= 0 n))
          (str "0" (zeckendorf n tail))
          (str "1" (zeckendorf (- n head) tail)))))))
