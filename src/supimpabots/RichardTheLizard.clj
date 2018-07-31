(ns supimpabots.RichardTheLizard
  (:gen-class :extends robocode.AdvancedRobot 
              :init init
              :methods [[run [robocode.AdvancedRobot] void]])
  (:import (robocode AdvancedRobot)))

(defn -init []
  (println "Initing RTL")
  [[] nil])

(defn -run [this]
  (println "It works"))
