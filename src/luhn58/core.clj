(ns luhn58.core
  (:require [luhn58.porter :as stem]
            [luhn58.summarize :as s]))

(defn summarize
  [text]
  (s/summarize text))
