;; http://www.4clojure.com/problem/29

;; Get the Caps
;; Write a function which takes a string and returns a 
;; new string containing only the capital letters.

;; case tests
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")

;; resolution

(defn letter-is-uppercased? [letter]
    (= (clojure.string/upper-case letter) letter))

(defn get-the-caps [text] 
    (filter #(letter-is-uppercased? (str %)) text))

(defn filter-uppercased-letter [text]
    (clojure.string/join (get-the-caps (re-seq #"[a-zA-Z]" text))))

(filter-uppercased-letter "HeLlO, WoRlD!")
(filter-uppercased-letter "nothing")
(filter-uppercased-letter "$#A(*&987Zf")

;; 4 clojure resolution
(fn [text] 
    (clojure.string/join (filter #(= (clojure.string/upper-case %) %) (re-seq #"[a-zA-Z]" text))))