;; http://www.4clojure.com/problem/37

;; Regular Expressions

;; Regex patterns are supported with a special reader macro.

;; case tests
;; (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;; resolution
"ABC"