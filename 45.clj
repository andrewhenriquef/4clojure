;; http://www.4clojure.com/problem/45

;; Intro to Iterate
;; The iterate function can be used to produce an infinite lazy sequence.

;; case tests
;; (= __ (take 5 (iterate #(+ 3 %) 1)))

;; resolution
[1 4 7 10 13]
