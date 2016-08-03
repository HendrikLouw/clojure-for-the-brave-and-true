(ns tech.hendrik.louw.clojure-for-the-brave-and-true
  (:use clojure.test))


(deftest test-vectors
  (testing "creation"
    (is (= []
           (vector)))
    (is (= [1 2 3]
           (vector 1 2 3)))
    )
  )
