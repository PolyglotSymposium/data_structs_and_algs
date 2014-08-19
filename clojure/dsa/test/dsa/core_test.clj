(ns dsa.core-test
  (:require [clojure.test :refer :all]
            [dsa.core :refer :all]))

(deftest one-element-list-has-endoflist-as-next
  (testing (is (= (:next (newlist 42))) :endoflist)))

(deftest one-element-list-has-set-data-as-data
  (testing (is (= (:data (newlist 42))) 42)))

(deftest when-cons-on-one-element-list-data-of-next-is-original
  (testing (is (= (-> (mycons 35 (newlist 42)) :data :next ))) 42))

(def dummySubList (mycons 72 (newlist 91)))
(def dummyList (mycons 92 dummySubList))

(deftest head-of-list-is-data-from-current
  (testing (is (= 92 (myhead dummyList)))))

(deftest rest-of-list-is-all-nodes-below-current
  (testing (is (= dummySubList (myrest dummyList)))))



(deftest qsort-of-empty-is-empty
  (testing (is (= [] (qsort [])))))

(deftest qsort-of-one-element-is-that
  (testing (is (= [42] (qsort [42])))))

(deftest qsort-of-two-ordered-elements-is-same
  (testing (is (= [42 43] (qsort [42 43])))))

(deftest qsort-of-two-unordered-elements-is-reverse
  (testing (is (= [42 43] (qsort [43 42])))))

(deftest qsort-end-to-end
  (testing (is (= [-42 -9 -1 -1 0 9 72 99 107] (qsort [-42 0 -1 -1 99 107 72 -9 9])))))