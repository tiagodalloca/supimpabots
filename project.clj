(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
 "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

(defproject supimpabots.RichardTheLizard "0.0.0.1"
  :description "When Richard the Lizard arrives, everyone start loosing their wives" 
  :aot :all
  :manifest  {"robots" "supimpabots.RichardTheLizard"}
  :dependencies [[org.clojure/clojure "1.10.0-alpha6"]
                 [sax/sax "2.0.1"]
                 [net.sf.robocode/robocode.api "1.9.2.1"]

                 [org.nd4j/nd4j-native-platform "1.0.0-beta"]
                 [org.datavec/datavec-api "1.0.0-beta"]
                 [org.deeplearning4j/dl4j-spark_2.11 "1.0.0-beta_spark_2"]
                 [org.datavec/datavec-spark_2.11 "1.0.0-beta_spark_2"]])
