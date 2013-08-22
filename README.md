# clojure-intro-plugin

A Leiningen plugin that catches thrown exceptions and reformats them to have more beginner friendly messages.

## INSTALLATION 

Fork or clone this repository and download it to you computer.

In the directory you downloaded this repo run:
   
   $ lein install

# Adding the Plugin to an Existing Leiningen Project

Put `[clojure-intro-plugin "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

## USAGE
   Using the command:
    $ lein clojure-intro-plugin

    Will open a file chooser and whatever file you select will be evaluated.
## License

Copyright © 2013

Distributed under the Eclipse Public License, the same as Clojure.
