;; http://www.4clojure.com/problem/28

;; Flatten a Sequence
;; Write a function which flattens a sequence.

;; Special Restrictions -> Cannot use flatten

;; case tests
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))

;; my resolution
(defn item_is_a_collection? [item]
    (coll? item))

(defn some_item_is_a_collection? [collection]
    (some true? (map #(coll? %) collection)))

(defn concat_items [collection]
    (loop [new_collection []
           index 0]
        (if (= index (count collection))
            new_collection
            (if (item_is_a_collection? (nth collection index))
                (recur (concat new_collection (nth collection index)) (inc index))
                (recur (concat new_collection (vector (nth collection index))) (inc index))
))))

(defn extract_itens [coll]
    (loop [new_collection coll]
        (if (not (some_item_is_a_collection? new_collection))
            new_collection
            (recur (concat_items new_collection))
)))
        
(extract_itens ["a" ["b"] "c"])
(extract_itens '((((:a)))))
(extract_itens '((1 2) 3 [4 [5 6]]))

;; needed to run in 4clojure platform
(fn [coll]
    (loop [new_coll coll]
        (if (not ((fn [c](some true? (map #(coll? %) c))) new_coll))
            new_coll
            (recur ((fn [c] 
                        (loop [new_collection []
                            index 0]
                        (if (= index (count c))
                            new_collection
                            (if (coll? (nth c index))
                                (recur (concat new_collection (nth c index)) (inc index))
                                (recur (concat new_collection (vector (nth c index))) (inc index))
                            )))) new_coll)))))

