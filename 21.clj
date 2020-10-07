;; http://www.4clojure.com/problem/21

;; Nth Element
;; Write a function which returns the Nth element from a sequence.

;; Special Restrictions -> Cannot use nth

;; case tests
;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;; resolution
(fn [coll value]
    (get (vec coll) value))