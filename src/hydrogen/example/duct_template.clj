(ns hydrogen.example.duct-template
    (:require [clojure.java.io :as io]))

(defn resource [path]
  (io/resource (str "hydrogen/example/" path)))

(defn foo-profile [_]
      {:deps '[[magnetcoop/stork "0.1.5"]
               [aramis "0.1.1"]]
       :dirs ["a-folder"
              "another-folder/sub1"
              "another-folder/sub2"
              "resources/{{dirs}}/new-directory"]
       :vars {:jdbc?        true
              :sqlite?      true
              :thats :amazing}
       :templates {"resources/{{dirs}}/parrot.txt" (resource "parrot.txt")
                   "src/{{dirs}}/take_over_the_world.clj" (resource "take_over_the_world.clj")}})
