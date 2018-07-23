(ns cptest.impl
  (:require [clojure.tools.deps.alpha.repl :as ctd.repl]
            [clojure.java.io :as io]))

(defn add-classpath [p]
  (ctd.repl/add-loader-url (.toURL (io/file p))))
