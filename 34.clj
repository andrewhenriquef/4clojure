;; http://www.4clojure.com/problem/34

;; Implement range

;; Write a function which creates a list of all integers in a given range.

;; case tests
;; (= (__ 1 4) '(1 2 3))
;; (= (__ -2 2) '(-2 -1 0 1))
;; (= (__ 5 8) '(5 6 7))

;; resolution
(fn [start_at end_at]
  (loop [coll [start_at]]
    (if (= (last coll) (dec end_at))
      coll
      (recur (conj coll (inc (last coll))))
)))