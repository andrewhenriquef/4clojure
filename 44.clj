;; http://www.4clojure.com/problem/44

;; Rotate Sequence
;; Write a function which can rotate a sequence in either direction.

;; case tests
;; (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;; (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;; (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;; (= (__ 1 '(:a :b :c)) '(:b :c :a))
;; (= (__ -4 '(:a :b :c)) '(:c :a :b))

;; resolution
(fn [rotation collection]
  (let [positive-value? (fn [value] (or (pos? value) (zero? value)))
        turns-into-positive (fn [value] (if (positive-value? value) value (* -1 value)))
        collection_size (count collection)
        double_collection_size (+ (turns-into-positive rotation) (* 2 (count collection)))
        doubled_collection (take double_collection_size (cycle collection))]
    (if (positive-value? rotation)
      (take collection_size (last (split-at rotation doubled_collection)))
      (take collection_size (last (split-at (inc (turns-into-positive rotation)) doubled_collection)))
)))