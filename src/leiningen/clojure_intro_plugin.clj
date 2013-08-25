(ns leiningen.clojure-intro-plugin
   (:require [errors.core :as errors] [seesaw.chooser :as seesaw]))

(defn clojure-intro-plugin
        "I don't do a lot."
        [project & args]
          (let [file (seesaw/choose-file :dir (System/getProperty "user.dir"))]
            (if (nil? file) nil 
            	(try (load-file (.getAbsolutePath file))
             	 (catch Throwable e (errors/prettify-exception e)))
          )))