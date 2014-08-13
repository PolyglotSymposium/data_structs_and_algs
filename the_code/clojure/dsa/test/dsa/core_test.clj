(ns dsa.core-test
  (:require [clojure.test :refer :all]
            [dsa.core :refer :all]))

(deftest sorted-empty-list-is-empty
  (testing "sorting an empty list"
    (is (= (qsort []) []))))
