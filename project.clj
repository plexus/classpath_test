(defproject cptest "0.1.0"
  :dependencies [[org.clojure/clojure "1.10.0-alpha6"]]
  :source-paths ["src"]
  :profiles

  {:pomegranate
   {:dependencies [[com.cemerick/pomegranate "1.0.0"]
                   [org.tcrawley/dynapath "1.0.0"]]
    :source-paths ["pomegranate-src"]}

   :pomegranate-old
   {:dependencies [[com.cemerick/pomegranate "0.4.0"]]
    :source-paths ["pomegranate-src"]}

   :dynapath
   {:dependencies [[org.tcrawley/dynapath "1.0.0"]]
    :source-paths ["dynapath-src"]}

   :add-lib
   {:dependencies [[org.apache.maven.resolver/maven-resolver-api "1.1.1"]
                   [org.apache.maven.resolver/maven-resolver-spi "1.1.1"]
                   [org.apache.maven.resolver/maven-resolver-impl "1.1.1"]
                   [org.apache.maven.resolver/maven-resolver-util "1.1.1"]
                   [org.apache.maven.resolver/maven-resolver-connector-basic "1.1.1"]
                   [org.apache.maven.resolver/maven-resolver-transport-file "1.1.1"]
                   [org.apache.maven.resolver/maven-resolver-transport-http "1.1.1"]
                   [org.apache.maven.resolver/maven-resolver-transport-wagon "1.1.1"]
                   [org.apache.maven/maven-resolver-provider "3.5.2"]
                   [org.slf4j/slf4j-nop "1.6.2"]
                   [org.clojure/data.xml "0.2.0-alpha5"]
                   [s3-wagon-private "1.3.1" :exclusions [ch.qos.logback/logback-classic]]
                   [org.clojure/tools.gitlibs "0.2.64"]
                   [org.clojure/tools.cli "0.3.5"]]

    :source-paths ["vendor/tools.deps.alpha/src/main/clojure"
                   "add-lib-src"]}})
