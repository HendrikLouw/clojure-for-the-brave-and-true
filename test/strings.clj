(ns tech.hendrik.louw.clojure-for-the-brave-and-true
  (:use clojure.test)
  (:require [clojure.string :as str]))

(deftest strings
  (def test-string "Hello World")

  (testing "count"
    (is (= 0
           (count "")))
    (is (= 11
           (count test-string))))

  (testing "get"
    (is (= \H
           (get test-string 0)))
    (is (= nil
           (get test-string 55))))

  (testing "subs"
    (is (= "Hello"
           (subs test-string 0 5))))

  (testing "compare"
    (is (= 0
           (compare "Hello World" test-string))))

  (testing "str/join"
    (is (= "one, two, three"
           (str/join ", " ["one" "two" "three"]))))

  (testing "str/escape"
    (is (= "for example prevent script tags &lt;script&gt;"
           (str/escape "for example prevent script tags <script>", {\< "&lt;" \> "&gt;"}))))

  (testing "str/split"
    (is (= ["Clojure" "is" "awesome"]
           (str/split "Clojure is awesome" #" "))))

  (testing "str/replace"
    (is (= "It is light red"
           (str/replace "It is pink" #"pink" "light red")))
    (is (= "lmostAay igPay atinLay"
           (str/replace "Almost Pig Latin" #"\b(\w)(\w+)\b" "$2$1ay")))
    )

  (testing "reverse"
    (is (= "oof"
           (str/reverse "foo"))))

  (testing "index-of"
    (is (= 2
           (str/index-of test-string "l"))))

  (testing "capitalize"
    (is (= "Hello there"
           (str/capitalize "hELLo THEre"))))

  (testing "lower-case"
    (is (= "hello there"
           (str/lower-case "HELLo there"))))

  (testing "upper-case"
    (is (= "HELLO THERE"
           (str/upper-case "hello THere"))))
  )
