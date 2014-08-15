(ns dsa.core-test
  (:require [clojure.test :refer :all]
            [dsa.core :refer :all]))

(deftest empty-list-has-endoflist-as-next
  (testing "empty list has endoflist as next"
   (is (= (:next emptylist)) :endoflist)))
