(ns aws-console.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [aws-console.core-test]))

(doo-tests 'aws-console.core-test)

