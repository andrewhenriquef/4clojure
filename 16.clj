;; http://www.4clojure.com/problem/16

;; Hello World
;; Write a function which returns a personalized greeting.

;; Case tests
;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

;; Resolution
(fn [name]
  (str "Hello, " name "!"))
