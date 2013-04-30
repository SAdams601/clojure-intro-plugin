(ns leiningen.clojure-intro-plugin
   (require [errors.core :as errors]))

(defn clojure-intro-plugin
        "I don't do a lot."
        [project filename & args]
        (let [full-name (str "src/" filename "/core.clj")]
            (try (load-file full-name)
             (catch Throwable e (errors/prettify-exception e)))))