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
