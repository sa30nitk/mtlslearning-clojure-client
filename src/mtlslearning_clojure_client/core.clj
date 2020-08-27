(ns mtlslearning-clojure-client.core
  (:gen-class)
  (:require [clj-http.client :as client]
            [clj-http.core :as client-core]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;(client/get "http://localhost:8080/ping")
  (client-core/request {:request-method :get
                        :scheme :http
                        :uri "localhost:8080/ping"}))
