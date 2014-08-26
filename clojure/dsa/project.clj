(defproject dsa "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "..."}
  :dependencies [[org.clojure/clojure "1.6.0"]
  [org.clojure/core.match "0.2.1"]]
  :main ^:skip-aot dsa.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
