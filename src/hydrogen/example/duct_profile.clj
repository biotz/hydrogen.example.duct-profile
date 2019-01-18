(ns hydrogen.example.duct-profile
    (:require [leiningen.new.templates :refer [renderer]]))

(def render (renderer "hydrogen.example"))

(defn hydrogen.example [data]
      {:extra-deps ['[magnetcoop/stork "0.1.5"]
                    '[aramis "0.1.1"]]
       :extra-files [["resources/{{dirs}}/parrot.txt" (render "parrot.txt" data)]
                     ["src/{{dirs}}/take_over_the_world.clj" (render "take_over_the_world.clj" data)]]})
