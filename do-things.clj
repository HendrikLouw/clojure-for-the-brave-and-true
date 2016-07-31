(require '[clojure.string :as str])

;; String functions
;; ----------------
(def test-string "Hello World")

;; Length of string
(count test-string)

;; Get first letter of string
(get test-string 0)

;; Get current system PATH
(get (System/getenv) "PATH")

;; Get a sub string
(subs test-string 0 5)

;; Compare
(compare "Hello World" test-string)

;; Join strings
(str/join ", " ["one" "two" "three"])


;; Escape specific characters
(str/escape "for example prevent script tags <script>",
            {\< "&lt;" \> "&gt"})

;; Split strings by using a regex
(str/split "Clojure is awesome" #" ")
