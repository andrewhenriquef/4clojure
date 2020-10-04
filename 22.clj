;; http://www.4clojure.com/problem/22

;; Count a Sequence
;; Write a function which returns the total number of elements in a sequence.

;; case tests
;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)

;; resolution
(fn [coll]
   (reduce + (map (fn [value] 1) coll)))