(ns cptest.test
  (:gen-class)
  (:require [cptest.impl :as i]
            [clojure.java.io :as io]))

(println "Testing" i/impl-name)

(defmacro try-out [name & body]
  `(do
     (print (str "    " ~name " "))
     (try
       ~@body
       (println "\u001b[32m[OK]\u001b[m")
       (catch Throwable e#
         (println "\u001b[31m[FAIL]\u001b[m")
         (println "      " (.getMessage e#))))))

(when (= "true" (System/getenv "ADD_CLASSLOADER"))
  (try-out "install dynamic classloader"
           (let [thread        (Thread/currentThread)
                 contextloader (.getContextClassLoader thread)
                 classloader   (clojure.lang.DynamicClassLoader. contextloader)]
             (.setContextClassLoader thread classloader))))

(try-out "add-classpath"
         (i/add-classpath "dynamic"))

(try-out "classpath resource"
         (assert (= "sentinel\n" (slurp (io/resource "file.txt")))))

(try-out "classpath source file"
         (require 'cptest.dynamic)
         (assert (= :sentinel ((resolve 'cptest.dynamic/do-it)))))

(defn -main [& _])
