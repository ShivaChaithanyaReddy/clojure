(ns braveclojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;basic functionalities:
  (println (+  1 2 3 ))
  ;Clojure employs prefix notation, i.e operaator comes first in an expression
  (println (first [1 2 3 4]))                               ;;;First element from the vector

;;use str to concatenate strings
(str "shiva" "chaithanya" "reddy")

  )

;; control flow operations: if, do and when

;if syntax:
;(if boolean-form
; then-form
; optional-else-form)
(if true
"name is  Shiva CHaithanya"
"name is Karthik"
)

(if false
"name is karthik"
"name is Shiva")

;we can omit the else form, like follows
(if true
"name is karthik")

;;do branch is used to write multiple lines of code in if and then form.

(if true
  (do (println "Success")
      "name is Shiva Chaithanya")
  (do (println "Failure")
      "name is Karthik"))


;;when is combination of both if and do

(when true
  (println "Success")
  "my name is Shiva")

;use when if you want to do something when condition is true and want to return nil when false.

;;nil in clojure is used to represent no value.

(nil? 1) 

(nil? nil)

;;nil and false are used to represent logically false whereas all other
;; values are logically true.

(if "name is SHiva"
  "true")

(if nil
  "name is shiva"
  "name is not shiva")


(defn testing []

;;equality
(println (= 1 1))

;; or, and operators
; or returns first truthy value or the last value
; and returns first falsey value

(or false nil :name)
(or (= 0 1) (= "yes" "no"))
(or nil)

(println (and :free_wifi :hot_coffee))
(println (and :free nil false))

;;def is used to bind name to value, which is equivalent to assigning the value to a variable

(def my-name "Shiva Chaithanya Reddy")

(println "my name is " my-name)

(println "THis is my name: \"Shiva Chaithanya\" ")

(println {1 2 "Shiva" 1.2})

(println {:name "Shiva" :last "Bolla"})

(println (get {:name "Shiva" :last "Bolla"} :name))

(println (get {:gender "male" :name {:first "Shiva" :last "BOlla"}} :name))

(println (get-in {:gender "male" :name {:first "Shiva" :last "Bolla"}} [:name :first] ) )

(println (:1 {:1 2 :3 4}) )

(println (vector "shiva" 1 1.3))

;;lists

(println '(1 2 3 4))

(println (nth '(1 2 3 4) 0) )

(println "testing or " (or false "shiva" false))
)
