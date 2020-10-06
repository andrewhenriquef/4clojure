;; http://www.4clojure.com/problem/8

;; Intro to Sets
;; Sets are collections of unique values.

;; Case tests
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; resolution
#{:a :b :c :d}