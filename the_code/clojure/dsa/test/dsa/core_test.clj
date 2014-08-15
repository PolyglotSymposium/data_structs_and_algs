(ns dsa.core-test
  (:require [clojure.test :refer :all]
            [dsa.core :refer :all]))

(deftest one-element-list-has-endoflist-as-next
  (testing "one element list has endoflist as next"
   (is (= (:next (newlist 42))) :endoflist)))

(deftest one-element-list-has-set-data-as-data
  (testing "one element list has endoflist as next"
   (is (= (:data (newlist 42))) 42)))
