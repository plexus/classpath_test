(ns cptest.impl
  (:require [cemerick.pomegranate :as pom]))

(defn add-classpath [p]
  (pom/add-classpath p))
