;; http://www.4clojure.com/problem/30

;; Compress a Sequence

;; Write a function which removes consecutive duplicates from a sequence.

;; case tests
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

;; resolution
(fn [coll]
  (let [size (dec (count coll))]
    (loop [new_coll []
           index 0]

      (if (= index size)
        (if (= (last new_coll) (last coll))
          new_coll
          (conj new_coll (last coll)))
        (if (= (nth coll index) (last new_coll))
          (recur new_coll (inc index))
          (recur (conj new_coll (nth coll index)) (inc index))
)))))

;; or
;; this didnt work on 4clojure platform, maybe its a new function in clojure core
(dedupe coll)