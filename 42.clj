;; http://www.4clojure.com/problem/42

;; Factorial Fun
;; Write a function which calculates factorials.

;; case tests
;; (= (__ 1) 1)
;; (= (__ 3) 6)
;; (= (__ 5) 120)
;; (= (__ 8) 40320)

;; resolution
#(reduce * (range 1 (inc %)))