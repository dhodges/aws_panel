(ns aws-panel.notifiers.cloudformation-test
  (:require [aws-panel.notifiers.cloudformation :as cloudform]
            [clj-time.core :as time]
            [clojure.test :refer :all]))

(def raw-stack
  {:description "Atlas Environment",
   :capabilities [],
   :tags [],
   :disable-rollback false,
   :notification-arns [],
   :stack-name "atlas-prodlike-2",
   :stack-status "CREATE_COMPLETE",
   :stack-id "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prodlike-2/f1edcdf0-e953-11e6-8e88-50fae957fc82",
   :creation-time (time/date-time 2017 2 02 14 29),
   :outputs [{:description "The URL of the website",
              :output-key "URL",
              :output-value "http://atlas-pro-ElasticL-15GSVFTIVS7LL-1431208784.ap-southeast-2.elb.amazonaws.com"}],
   :parameters [{:parameter-value "arn:aws:iam::949364753207:server-certificate/lpwildcard-20140409",
                 :parameter-key "ELBSSLCertificateId"}
                {:parameter-value "c3.2xlarge",
                 :parameter-key "DBStandbyInstanceType"}
                {:parameter-value "c3.2xlarge",
                 :parameter-key "DBInstanceType"}
                {:parameter-value "Placeholder",
                 :parameter-key "MemcachedAvailabilityZone"}
                {:parameter-value "Placeholder",
                 :parameter-key "MemcachedNameTag"}
                {:parameter-value "Placeholder",
                 :parameter-key "MemcachedSubnet"}
                {:parameter-value "subnet-dfad4fb6,subnet-38b45651",
                 :parameter-key "AppSubnets"}
                {:parameter-value "atlas",
                 :parameter-key "DBStandbyIamProfile"}
                {:parameter-value "4",
                 :parameter-key "AppMinSize"}
                {:parameter-value "ami-c03810a3",
                 :parameter-key "DBImageId"}
                {:parameter-value "EC2",
                 :parameter-key "AppAutoScalingHealthCheckType"}
                {:parameter-value "ami-f1e1c592",
                 :parameter-key "WorkerImageId"}
                {:parameter-value "Placeholder",
                 :parameter-key "MemcachedIamProfile"}

                ;; deliberately missing the verbose parameter values:
                ;; ["WorkerUserData", "DBStandbyUserData", "AppUserData", "DBUserData"]

                {:parameter-value "subnet-9bf423f2",
                 :parameter-key "DBSubnet"}
                {:parameter-value "dbstandby-atlas-prodlike-2",
                 :parameter-key "DBStandbyNameTag"}
                {:parameter-value "cache.m1.medium",
                 :parameter-key "MemcachedInstanceType"}
                {:parameter-value "spp",
                 :parameter-key "DNSPrefix"}
                {:parameter-value "ami-6d7e540e",
                 :parameter-key "AppImageId"}
                {:parameter-value "atlas",
                 :parameter-key "DBIamProfile"}
                {:parameter-value "atlas",
                 :parameter-key "WorkerIamProfile"}
                {:parameter-value "atlas",
                 :parameter-key "AppIamProfile"}
                {:parameter-value "subnet-69f32400",
                 :parameter-key "DBStandbySubnet"}
                {:parameter-value "spp.lonelyplanet.com.",
                 :parameter-key "HostedZoneName"}
                {:parameter-value "atlas-prodlike-2",
                 :parameter-key "EnvironmentName"}
                {:parameter-value "8",
                 :parameter-key "AppMaxSize"}
                {:parameter-value "ap-southeast-2a,ap-southeast-2b",
                 :parameter-key "AvailabilityZones"}
                {:parameter-value "db-atlas-prodlike-2",
                 :parameter-key "DBNameTag"}
                {:parameter-value "worker-atlas-prodlike-2",
                 :parameter-key "WorkerNameTag"}
                {:parameter-value "ami-c03810a3",
                 :parameter-key "DBStandbyImageId"}
                {:parameter-value "sppdev",
                 :parameter-key "KeyName"}
                {:parameter-value "Placeholder",
                 :parameter-key "MemcachedUserData"}
                {:parameter-value "prod",
                 :parameter-key "EnvironmentType"}
                {:parameter-value "ap-southeast-2a,ap-southeast-2b",
                 :parameter-key "AppAvailabilityZones"}
                {:parameter-value "m1.medium",
                 :parameter-key "AppInstanceType"}
                {:parameter-value "vpc-c7ad4fae",
                 :parameter-key "VpcId"}
                {:parameter-value "subnet-ddad4fb4,subnet-8ffd39e6",
                 :parameter-key "ELBSubnets"}
                {:parameter-value "4",
                 :parameter-key "AppDesiredCapacity"}
                {:parameter-value "Placeholder",
                 :parameter-key "MemcachedImageId"}
                {:parameter-value "app-atlas-prodlike-2",
                 :parameter-key "AppNameTag"}
                {:parameter-value "86400",
                 :parameter-key "ELBTTL"}
                {:parameter-value "r3.xlarge",
                 :parameter-key "WorkerInstanceType"}],})

(deftest raw-instances
  (let [stack (first (#'cloudform/filter-instances [raw-stack]))]
    (testing "raw cloudformation stacks -"

      (testing "filtering :name"
        (is (= "atlas-prodlike-2"
               (:name stack))))

      (testing "filtering :status"
        (is (= "CREATE_COMPLETE"
               (:status stack))))

      (testing "filtering :env"
        (is (= "prod"
               (:env stack))))

      (testing "filtering :creation-time"
        (is (= "2017-02-02T14:29"
               (:creation-time stack)))))))
