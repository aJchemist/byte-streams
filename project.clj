(defproject byte-streams "0.2.0-alpha8"
  :description "A simple way to handle the menagerie of Java byte represenations."
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[primitive-math "0.1.4"]
                 [clj-tuple "0.1.7"]
                 [manifold "0.1.0-beta8"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.7.0-alpha2"]
                                  [reiddraper/simple-check "0.5.6"]
                                  [codox-md "0.2.0" :exclusions [org.clojure/clojure]]]}}
  :test-selectors {:stress :stress
                   :default (complement :stress)}
  :plugins [[codox "0.6.4"]]
  :codox {:writer codox-md.writer/write-docs
          :include [byte-streams]}
  :global-vars {*warn-on-reflection* true}
  :java-source-paths ["src"]
  :javac-options ["-target" "1.5" "-source" "1.5"]
  :jvm-opts ^:replace ["-server" "-Xmx4g"])
