(ns cptest.impl
  (:refer-clojure :exclude [add-classpath])
  (:require [clojure.tools.deps.alpha.repl :as ctd.repl]
            [clojure.java.io :as io]))

(def impl-name "add-lib")

(defn add-classpath [p]
  (ctd.repl/add-loader-url (.toURL (io/file p))))
