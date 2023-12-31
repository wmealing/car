;; this file is: src/my_webapp/handler.clj
(ns catch-and-release.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(println "HI")


(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/s" [] "Hello Worldssss")
  (route/not-found "4000000000000000000004"))

(def app
  ;; use #' prefix for REPL-friendly code -- see note below
  (wrap-defaults #'app-routes site-defaults))

(defn handle []
  (jetty/run-jetty #'app {:port 3000}))
