(ns aws-panel.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [aws-panel.core-test]))

(doo-tests 'aws-panel.core-test)

