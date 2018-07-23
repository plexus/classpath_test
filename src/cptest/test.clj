(ns cptest.test
  (:require [cptest.impl :as i]
            [clojure.java.io :as io]))

(i/add-classpath "dynamic")
(assert (= "sentinel" (slurp (io/resource "file.txt"))))

(require 'cptest.dynamic)
(assert (= :sentinel (cptest.dynamic/do-it)))
