(ns aws-console.notifiers.ec2-test
  (:require [aws-console.notifiers.ec2 :as ec2]
            [aws-console.notifiers.fixtures :as fixtures]
            [clj-time.core :as time]
            [clj-time.format :as f]
            [clojure.test :refer :all]))

(def raw-ec2 {:monitoring {:state "disabled"}, 
              :tags [{:value "2.508.(HEAD detached at b5a34f4)-b5a34f4d3f90a01355a53d6c68b401fc224e757e()", 
                      :key "Name"} 
                     {:value "devbox", :key "environment_name"} 
                     {:value "25-Jan-2017 13:42", :key "created_on"} 
                     {:value "", :key "created_by"}], 
              :root-device-type "ebs", 
              :private-dns-name "", 
              :hypervisor "xen", 
              :subnet-id "subnet-38b45651", 
              :key-name "sppdev", 
              :architecture "x86_64", 
              :security-groups [{:group-id "sg-5a061536", 
                                 :group-name "VPC-StandAlone"}], 
              :source-dest-check true, 
              :root-device-name "/dev/sda1", 
              :virtualization-type "paravirtual", 
              :product-codes [], 
              :instance-type "m1.large", 
              :ami-launch-index 0, 
              :image-id "ami-36232455", 
              :state {:name "running", :code 16}, 
              :state-transition-reason "", 
              :network-interfaces [{:description "", 
                                    :subnet-id "subnet-38b45651", 
                                    :source-dest-check true, 
                                    :private-ip-addresses [{:private-ip-address "10.63.20.57", 
                                                            :primary true}], 
                                    :network-interface-id "eni-e498669f", 
                                    :vpc-id "vpc-c7ad4fae", 
                                    :mac-address "02:c8:7c:7f:c5:21", 
                                    :status "in-use", 
                                    :private-ip-address "10.63.20.57", 
                                    :owner-id "949364753207", 
                                    :groups [{:group-id "sg-5a061536", 
                                              :group-name "VPC-StandAlone"}], 
                                    :attachment {:status "attached", 
                                                 :attachment-id "eni-attach-6c18f902", 
                                                 :device-index 0, 
                                                 :attach-time "2017-01-25T13:31:31.000Z", 
                                                 :delete-on-termination true}}], 
              :vpc-id "vpc-c7ad4fae", 
              :ebs-optimized false, 
              :instance-id "i-02042de72cd06db62", 
              :iam-instance-profile {:id "AIPAJWVHOM6BKZ5GTPGN4", 
                                     :arn "arn:aws:iam::949364753207:instance-profile/atlas-standalone"}, 
              :kernel-id "aki-31990e0b", 
              :public-dns-name "", 
              :private-ip-address "10.63.20.57", 
              :placement {:tenancy "default", 
                          :group-name "", 
                          :availability-zone "ap-southeast-2b"}, 
              :client-token "1e2885cf-c86d-46c5-9a04-96c42c960bf0", 
              :launch-time (time/date-time 2017 1 25 13 31 31),
              :block-device-mappings [{:ebs {:status "attached", 
                                             :volume-id "vol-0dace6eccdd9e63d6", 
                                             :attach-time "2017-01-25T13:31:32.000Z", 
                                             :delete-on-termination true}, 
                                       :device-name "/dev/sda1"}]})

(deftest raw-instances
  (let [ec2 (first (#'ec2/filter-instances [raw-ec2]))]
    (testing "raw EC2 values -"

      (testing "filtering :name"
        (is (= "2.508.(HEAD detached at b5a34f4)"
               (:name ec2))))

      (testing "filtering :private-ip-address"
        (is (= "10.63.20.57"
               (:private-ip-address ec2))))

      (testing "filtering :env"
        (is (= "devbox"
               (:env ec2))))

      (testing "filtering :state"
        (is (= "running"
               (:state ec2))))

      (testing "filtering :launch-time"
        (is (= "2017-01-25T13:31:31"
               (:launch-time ec2)))))))
