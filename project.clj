(defproject clojure-intro-plugin "0.1.0-SNAPSHOT"
  :description "A leinigen plugin for interacting with the clojure-intro-project"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[intro "0.1"]]
  :repositories {"local" ~(str (.toURI (java.io.File. "jars")))})
