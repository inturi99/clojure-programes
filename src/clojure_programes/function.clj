(ns clojure-programes.core
  (:gen-class))

(defn is-prime? [n]
  (empty? (filter #(= 0 (mod n  %)) (range 2 n))))

 ;;Calculates the absolute value of a number
  (defn abs [n]
   (if(< n 0)
    (* -1 n)
    n))

;;returns the average of two arguments
(defn avg [a b]
  (/(+ a b ) 2))

;;Tests if a guess is close enough to the real square root
(defn good-enough? [number guess]
  (let [diff (- (* guess guess ) number)]
    (if (< (abs diff) 0.001)
      true false )))
;;returns the square root of the supplied number
(defn sqrt
  ([number](sqrt number 1.0))
  ([number guess] 
  (if (good-enough? number guess)
    guess
    (sqrt number(avg guess(/ number guess))))))

;;Calculates a number to the power of a provided exponent.
(defn power [number exponent]
  (if (zero? exponent)  1
      (* number (power number (- exponent 1)))))

;; adds all the numbers below a given limit
(defn add-up ([limit] (add-up limit 0 0))
  ([limit current sum]
   (if (< limit current)
    sum
    (recur limit (+ 1 current )(+ current sum)))))
