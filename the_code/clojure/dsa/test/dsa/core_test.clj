(ns dsa.core-test
  (:require [clojure.test :refer :all]
            [dsa.core :refer :all]))

(deftest sorted-empty-list-is-empty
  (testing "sorting an empty list"
    (is (= (qsort []) []))))

(deftest sorted-single-element-list-is-same
  (testing "sorting a list with one element"
    (is (= (qsort [42]) [42]))))
