# clojure-intro-plugin

A Leiningen plugin that catches thrown exceptions and reformats them to have more beginner friendly messages.

## INSTALLATION 

Fork or clone this repository and download it to you computer.

In the directory you downloaded this repo run:
   
   $ lein install

# Adding the Plugin to an Existing Leiningen Project

Put `[clojure-intro-plugin "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

## USAGE

To evaluate a Clojure file inside of your project the current plugin is a little bit dumb and expects you to use the standard Leiningen file format of:

   Project Home  
   |  
   |- src  
   |  
   |-|- <directory>  
   |  
   |-|-|- core.clj  

So if you want to run core.clj within the environment enter:

    $ lein clojure-intro-plugin <directory>

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
