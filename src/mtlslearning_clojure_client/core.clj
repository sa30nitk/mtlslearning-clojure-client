(ns mtlslearning-clojure-client.core
  (:gen-class)
  (:require [clj-http.client :as client]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (client/get "http://localhost:8080/ping"))
