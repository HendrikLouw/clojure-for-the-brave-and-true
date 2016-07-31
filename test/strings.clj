(ns tech.hendrik.louw.clojure-for-the-brace-and-true
  (:use clojure.test)
  (:require [clojure.string :as str]))

(deftest strings
 (def test-string "Hello World")
  (is (= 11
         (count test-string)))

  (is (= \H
         (get test-string 0)))

  (is (= "Hello"
         (subs test-string 0 5)))

  (is (= 0
         (compare "Hello World" test-string)))

  (is (= "one, two, three"
         (str/join ", " ["one" "two" "three"])))

  (is (= "for example prevent script tags &lt;script&gt;"
         (str/escape "for example prevent script tags <script>", {\< "&lt;" \> "&gt;"})))

  (is (= ["Clojure" "is" "awesome"]
         (str/split "Clojure is awesome" #" ")))
  )
