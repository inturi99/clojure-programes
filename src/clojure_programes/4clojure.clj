(ns clojure-programes.core
  (:gen-class))
;; the second to last element from a sequence
(defn sen-last [x]
  (nth x (- (count x) 2)))

;; Nth element from a sequence
(defn nth-elem [s x]
  (last (take (inc x) s)))
;;(= (nth-elem '(4 5 6 7) 2) 6)

;;count a sequence
(defn count-a-seq[c]
  (reduce (fn[x y](+ x 1)) 0 c))

;; sum it all up
(defn sum-it-all [x]
  (reduce + x))

;; Find The odd Numbers
(defn odd-numbers [x]
  (filter #(not= 0 (rem %1 2)) x))

(defn odd-numbers1 [x]
  (filter odd? x))

;;Reverse a Sequence
(defn reverse1 [x]
  (reverse (seq x)))

(defn reverse2 [x]
  (into '() x))

;; Palindrome
(defn palindrome [x]
  (= (seq x) (reverse (seq x))))

(defn palindrome1 [x]
  (if(string? x)(= x (apply str (reverse x)))
     (= x (reverse x ))))

;;Fibonacci
(defn fibonacci [n]
  (let [fib (fn fib* [a b] (cons a (lazy-seq (fib* b (+ b a)))))]
    (take n (fib 1 1))))

;;Max-Value
(defn maxv [x & xs]
  (reduce #(if(< %1 %2) %2 %1) (flatten (cons x xs))))

;;Get the Caps
(defn get-caps[x]
  (clojure.string/join ""(filter #(Character/isUpperCase %1)(seq x))))

(defn get-caps1[x]
  (apply str (map char (filter #(and (<= 65 %) (<= % 90)) (map int x)))))

;; Duplicate a Sequence
(defn duplicate [s]
  (let [f*
        (fn [acc s*]
          (conj acc s* s*))]
    (reduce f* [] s)))

(defn dup-seq[s]
  (reduce concat(map #(take 2 (repeat %)) s)))


;;Implement range
(defn range1[a b]
  (take(- b a)(iterate inc a)))

