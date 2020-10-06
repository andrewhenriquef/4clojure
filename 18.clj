;; http://www.4clojure.com/problem/18

;; Sequences: filter
;; The filter function takes two arguments: a predicate function (f) and a
;; sequence (s). Filter returns a new sequence consisting of all the items
;; of s for which (f item) returns true.


;; Case tests
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

;; Resolution
'(6 7)
