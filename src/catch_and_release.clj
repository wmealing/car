(ns catch-and-release
  (:require [catch-and-release.handler :as handler])
  (:gen-class)
  )

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; start the web stuff
  (handler/handle)
  )
