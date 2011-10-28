(defproject geocoder-clj "0.0.3"
  :description "A Clojure library for various geocoding services."
  :dependencies [[clj-http "0.2.1"]
                 [inflections "0.6.3"]
                 [org.clojure/clojure "1.3.0"]
                 [org.clojure/data.json "0.1.2"]
                 [org.dspace.dependencies/dspace-geoip "1.2.3"]]
  :multi-deps {"1.2.1" [[clj-http "0.2.1"]
                        [inflections "0.6.3"]
                        [org.clojure/clojure "1.2.1"]
                        [org.clojure/data.json "0.1.2"]
                        [org.dspace.dependencies/dspace-geoip "1.2.3"]]})