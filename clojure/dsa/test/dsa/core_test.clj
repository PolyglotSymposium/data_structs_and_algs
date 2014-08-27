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


(deftest anagrams-of-empty-is-empty
  (testing (is (= [] (anagrams [])))))

(deftest anagrams-of-one-word-is-vector-of-vector-of-that-word
  (testing (is (= [["foobar"]] (anagrams ["foobar"])))))

(deftest anagrams-works-for-two-anagrams
  (testing (is (= [["too" "oto"]] (anagrams ["too" "oto"])))))

(deftest anagrams-works-for-many
  (testing (is (= (sort [["too" "oto"] ["dog"] ["sword" "words"]]) (sort (anagrams ["too" "sword" "dog" "words" "oto"]))))))


(deftest fizz-buzz-of-3-is-Fizz
  (testing (is (= "Fizz" (fizzbuzz 3)))))

(deftest number-div-by-3-is-Fizz
  (testing (is (= "Fizz" (fizzbuzz 6)))))

(deftest fizz-buzz-of-5-is-Buzz
  (testing (is (= "Buzz" (fizzbuzz 5)))))

(deftest number-div-by-5-is-Fizz
  (testing (is (= "Buzz" (fizzbuzz 10)))))

(deftest fizz-buzz-of-2-is-2
  (testing (is (= "2" (fizzbuzz 2)))))

(deftest fizz-buzz-of-15-is-FizzBuzz
  (testing (is (= "FizzBuzz" (fizzbuzz 15)))))


(deftest fibs-until-1
  (testing (is (= [1] (fibs-until 1)))))

(deftest fibs-until-2
  (testing (is (= [1 2] (fibs-until 2)))))

(deftest fibs-until-3
  (testing (is (= [1 2 3] (fibs-until 3)))))

(deftest fibs-until-4
  (testing (is (= [1 2 3] (fibs-until 4)))))

(deftest fibs-until-5
  (testing (is (= [1 2 3 5] (fibs-until 5)))))

(deftest zeckendorf-0
  (testing (is (= "0" (zeckendorf 0)))))

(deftest zeckendorf-1
  (testing (is (= "1" (zeckendorf 1)))))

(deftest zeckendorf-2
  (testing (is (= "10" (zeckendorf 2)))))

(deftest zeckendorf-11
  (testing (is (= "10100" (zeckendorf 11)))))
