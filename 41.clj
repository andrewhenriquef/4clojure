;; http://www.4clojure.com/problem/41

;; Drop Every Nth Item
;; Write a function which drops every Nth item from a sequence.

;; case tests
;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;; (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;; (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

;; resolution
(fn [coll value]
    (remove (set
              (loop [items_to_remove []
                     index (dec value)]
                (if (or (= index (count coll)) (> index (count coll)))
                  items_to_remove
                  (recur (conj items_to_remove (nth coll index)) (+ index value))))) coll))