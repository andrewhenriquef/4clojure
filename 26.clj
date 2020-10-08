;; http://www.4clojure.com/problem/26

;; Fibonacci Sequence
;; Write a function which returns the first X fibonacci numbers.

;; case tests
;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))

;; resolution
(fn [times]
    (loop [current_value 0
           coll_fib [1]]
        (if (= (count coll_fib) times)
            coll_fib
            (recur (last coll_fib) (conj coll_fib (+ (last coll_fib) current_value))))
))
        
    