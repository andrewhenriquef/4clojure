;; http://www.4clojure.com/problem/23

;; Reverse a Sequence
;; Write a function which returns the total number of elements in a sequence.
;; Special Restrictions -> Cannot use reverse rseq

;; case tests
;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; resolution
(fn [coll]
    (loop [converted_collection (vec coll)
           reversed_collection []
           counter (- (count converted_collection) 1)]
        (if (= counter 0)
            (conj reversed_collection (first converted_collection))
            (recur converted_collection (conj reversed_collection (nth converted_collection counter)) (dec counter)))
))