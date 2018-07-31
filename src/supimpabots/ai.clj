(ns supimpabots.ai
  (:import org.deeplearning4j.nn.multilayer.MultiLayerNetwork
           [org.deeplearning4j.util ModelSerializer]
           [org.datavec.api.records.reader.impl.csv CSVRecordReader]
           [org.datavec.api.split FileSplit NumberedFileInputSplit]
           [org.datavec.api.util ClassPathResource]
           [org.deeplearning4j.optimize.listeners ScoreIterationListener]
           [org.nd4j.linalg.dataset SplitTestAndTrain DataSet]
           [org.nd4j.linalg.dataset.api.preprocessor
            NormalizerStandardize
            DataNormalization]
           [org.deeplearning4j.eval Evaluation RegressionEvaluation]
           [org.deeplearning4j.datasets.datavec RecordReaderDataSetIterator]))

(defn foo [& args]
  (println "SHUT UP! I'M TRYNA THINK"))
