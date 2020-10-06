;; http://www.4clojure.com/problem/14

;; Intro to Functions
;; Clojure has many different ways to create functions.


;; Case tests
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))

;; Resolution
8
