(ns mtlslearning-clojure-client.core
  (:gen-class)
  (:require [clj-http.client :as client]
            [clj-http.core :as client-core]))


(def client-ks "resources/clientKeyStore/localhost")
(def client-ks-pass "localhost-client")

(def client-ts "resources/clientTrustStore/localhost-trust-store")
(def client-ts-pass "localhost-server")


(def secure-request {:request-method :get :uri "/ping"
                     :debug          true
                     :server-port    8443 :scheme :https
                     :keystore       client-ks :keystore-pass client-ks-pass
                     :trust-store    client-ts :trust-store-pass client-ts-pass
                     :server-name    "localhost" :insecure? true})

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;(client/get "http://localhost:8080/ping")
  ;(client-core/request {:request-method :get
  ;                      :scheme :http
  ;                      :uri "localhost:8080/ping"})
  (let [response (client-core/request secure-request)
        _        (prn (:body response))]
    response))
