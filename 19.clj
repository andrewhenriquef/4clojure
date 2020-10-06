;; http://www.4clojure.com/problem/19

;; Last Element
;; Write a function which returns the last element in a sequence.

;; Case tests
;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")

;; Resolution
(fn [coll]
  (first (reverse coll)))
