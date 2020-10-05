;; http://www.4clojure.com/problem/40

;; Interpose a Seq
;; Write a function which separates the items of a sequence by an arbitrary value.
;; Special Restrictions -> Cannot use interpose

;; case tests
;; (= (__ 0 [1 2 3]) [1 0 2 0 3])
;; (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
;; (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

;; resolution
(fn [new_value coll]
    (drop-last (flatten (map (fn [value] (list value new_value)) coll))))

