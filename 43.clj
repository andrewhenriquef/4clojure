;; http://www.4clojure.com/problem/43

;; Reverse Interleave
;; Write a function which reverses the interleave process into x number of subsequences.

;; case tests
;; (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
;; (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
;; (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))

;; resolution
(fn [coll n]
    (let [total_items (count coll)]
        (loop [new_collections (into [] (repeat n (vector )))
               index_coll 0
               index_collections 0]
            (if (= index_coll total_items)
                new_collections
                (if (= index_collections n)
                    (recur new_collections index_coll 0)
                    (recur 
                        (assoc new_collections index_collections (conj (nth new_collections index_collections) (nth coll index_coll)))
                        (inc index_coll)
                        (inc index_collections))
)))))