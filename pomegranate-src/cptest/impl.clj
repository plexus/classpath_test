(ns cptest.impl
  (:refer-clojure :exclude [add-classpath])
  (:require [cemerick.pomegranate :as pom]))

(def impl-name "pomegranate")

(defn add-classpath [p]
  (pom/add-classpath p))
