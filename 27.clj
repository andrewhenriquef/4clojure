;; http://www.4clojure.com/problem/27

;; Palindrome Detector
;; Write a function which returns true if the given sequence is a palindrome.
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)


;; case tests
;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))

;; resolution
(fn [coll]
    (let [quantity (int (/ (count coll) 2)) ]
        (= (take quantity coll) (take quantity (reverse coll)))))


