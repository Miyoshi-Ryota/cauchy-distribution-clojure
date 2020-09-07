(defproject mrcsce/cauchy-distribution "0.1.0"
  :description "A Clojure library designed to sample from a cauchy distribution.
  See also: https://github.com/Miyoshi-Ryota/cauchy-distribution-clojure"
  :url "https://github.com/Miyoshi-Ryota/cauchy-distribution-clojure"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repositories [["clojars" {:url "https://clojars.org/repo" :sign-releases false}]]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :repl-options {:init-ns cauchy-distribution.core})
