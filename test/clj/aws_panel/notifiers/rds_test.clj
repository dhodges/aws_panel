(ns aws-panel.notifiers.rds-test
  (:require [aws-panel.notifiers.rds :as rds]
            [clj-time.core :as time]
            [clojure.test :refer :all]))

(def raw-instance
  {:dbsecurity-groups [],
   :preferred-maintenance-window "tue:14:53-tue:15:23",
   :dbparameter-groups [{:dbparameter-group-name "default.postgres9.5",
                         :parameter-apply-status "in-sync"}],
   :master-username "spp_rds_user",
   :dbinstance-status "backing-up",
   :preferred-backup-window "17:00-17:30",
   :instance-create-time (time/date-time 2016 11 9 3 34)
   :copy-tags-to-snapshot false,
   :vpc-security-groups [{:status "active",
                          :vpc-security-group-id "sg-a9c6cdcd"}],
   :availability-zone "ap-southeast-2a",
   :pending-modified-values {},
   :dbi-resource-id "db-ZUSCJ3M2RIT77NMDAK5FXMVKXE",
   :storage-encrypted false,
   :dbsubnet-group {:dbsubnet-group-name "rds-postgres",
                    :subnets [{:subnet-identifier "subnet-3468fc5d",
                               :subnet-availability-zone {:name "ap-southeast-2a"},
                               :subnet-status "Active"}
                              {:subnet-identifier "subnet-69f32400",
                               :subnet-availability-zone {:name "ap-southeast-2b"},
                               :subnet-status "Active"}
                              {:subnet-identifier "subnet-9bf423f2",
                               :subnet-availability-zone {:name "ap-southeast-2a"},
                               :subnet-status "Active"}
                              {:subnet-identifier "subnet-38b45651",
                               :subnet-availability-zone {:name "ap-southeast-2b"},
                               :subnet-status "Active"}
                              {:subnet-identifier "subnet-ddad4fb4",
                               :subnet-availability-zone {:name "ap-southeast-2a"},
                               :subnet-status "Active"}
                              {:subnet-identifier "subnet-dfad4fb6",
                               :subnet-availability-zone {:name "ap-southeast-2a"},
                               :subnet-status "Active"}
                              {:subnet-identifier "subnet-8ffd39e6",
                               :subnet-availability-zone {:name "ap-southeast-2b"},
                               :subnet-status "Active"}],
                    :vpc-id "vpc-c7ad4fae",
                    :subnet-group-status "Complete",
                    :dbsubnet-group-description "rds-postgres"},
   :allocated-storage 5,
   :publicly-accessible false,
   :dbname "castro_devint",
   :license-model "postgresql-license",
   :option-group-memberships [{:status "in-sync",
                               :option-group-name "default:postgres-9-5"}],
   :cacertificate-identifier "rds-ca-2015",
   :dbinstance-class "db.t2.micro",
   :multi-az false,
   :backup-retention-period 7,
   :engine "postgres",
   :storage-type "gp2",
   :status-infos [],
   :endpoint {:address "castro-devint.cc5nahfefliq.ap-southeast-2.rds.amazonaws.com",
              :port 5432,
              :hosted-zone-id "Z32T0VRHXEXS0V"},
   :auto-minor-version-upgrade true,
   :dbinstance-identifier "castro-devint",
   :read-replica-dbinstance-identifiers [],
   :monitoring-interval 0,
   :engine-version "9.5.2",
   :db-instance-port 0,
   :latest-restorable-time (time/date-time 2017 2 4 4 36)})


(deftest raw-instances
  (let [dbinstance (first (#'rds/filter-instances [raw-instance]))]
    (testing "raw rds instances -"

      (testing "filtering :name"
        (is (= "castro-devint"
               (:name dbinstance))))

      (testing "filtering :dbname"
        (is (= "castro_devint"
               (:dbname dbinstance))))

      (testing "filtering :engine"
        (is (= "postgres"
               (:engine dbinstance))))

      (testing "filtering :version"
        (is (= "9.5.2"
               (:version dbinstance))))

      (testing "filtering :status"
        (is (= "backing-up"
               (:status dbinstance)))))))
