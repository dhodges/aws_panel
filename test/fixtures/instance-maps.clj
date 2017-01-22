[{:tags
  {"Name" "jenkins-agent",
   "environment_name" "jenkins-agent",
   "stackdriver_monitor" "false"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups [{:group-id "sg-ac5447c0", :group-name "VPC-BuildAgent"}],
  :instance-type "c3.large",
  :image-id "ami-4a605929",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-ffb9e550",
  :private-ip-address "10.63.1.198",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "db-loadtest",
   "aws:cloudformation:logical-id" "DBServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/loadtest/e02dfca0-c9b2-11e5-979d-503f245c6ad9",
   "aws:cloudformation:stack-name" "loadtest",
   "environment" "loadtest",
   "environment_name" "loadtest",
   "environment_type" "staging"},
  :subnet-id "subnet-9bf423f2",
  :security-groups
  [{:group-id "sg-ab7469ce",
    :group-name "loadtest-DBSecurityGroup-CIII6WOX9GCU"}],
  :instance-type "c3.2xlarge",
  :image-id "ami-7885a91b",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-71ed1ba0",
  :private-ip-address "10.63.100.202",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "worker-atlas-devint",
   "aws:autoscaling:groupName" "atlas-devint-WorkerServerGroup-LT07BFLXD2GD",
   "aws:cloudformation:logical-id" "WorkerServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-devint/3d89e9e0-763c-11e2-8078-50884d292096",
   "aws:cloudformation:stack-name" "atlas-devint",
   "environment" "atlas-devint",
   "environment_name" "atlas-devint",
   "environment_type" "staging"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-d60e1cba",
    :group-name "atlas-devint-WorkerSecurityGroup-BGHSMQTP4FEI"}],
  :instance-type "r3.xlarge",
  :image-id "ami-f1e1c592",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-c7ded219",
  :private-ip-address "10.63.1.34",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-04fde6cd439032dda",
  :private-ip-address "10.63.20.180",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "lpawspwad02", "environment_name" "shared"},
  :subnet-id "subnet-3468fc5d",
  :security-groups [{:group-id "sg-b0a5badc", :group-name "AD-SPP-LP"}],
  :instance-type "m3.medium",
  :image-id "ami-5607966c",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-d23295ef",
  :private-ip-address "10.63.38.22",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-082a9962b88cd7012",
  :private-ip-address "10.63.20.168",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prodlike-2",
   "aws:autoscaling:groupName"
   "atlas-prodlike-2-AppServerGroup-1E7RDFUBR611R",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prodlike-2/1089a5f0-df21-11e6-8549-50fae94facba",
   "aws:cloudformation:stack-name" "atlas-prodlike-2",
   "environment" "atlas-prodlike-2",
   "environment_name" "atlas-prodlike-2",
   "environment_type" "prod"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-212ffa46",
    :group-name "atlas-prodlike-2-AppSecurityGroup-18EHQNMHMD2A3"}],
  :instance-type "m1.medium",
  :image-id "ami-6d7e540e",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0d55851721a01d307",
  :private-ip-address "10.63.1.85",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prodlike-2",
   "aws:autoscaling:groupName"
   "atlas-prodlike-2-AppServerGroup-1E7RDFUBR611R",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prodlike-2/1089a5f0-df21-11e6-8549-50fae94facba",
   "aws:cloudformation:stack-name" "atlas-prodlike-2",
   "environment" "atlas-prodlike-2",
   "environment_name" "atlas-prodlike-2",
   "environment_type" "prod"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-212ffa46",
    :group-name "atlas-prodlike-2-AppSecurityGroup-18EHQNMHMD2A3"}],
  :instance-type "m1.medium",
  :image-id "ami-6d7e540e",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-096e4a591bd17226e",
  :private-ip-address "10.63.1.76",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-cst-prod",
   "aws:autoscaling:groupName" "cst-prod-AppServerGroup-1QMHQKXD2JQDY",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/cst-prod/bdd9b9b0-c667-11e2-8d19-50884d269896",
   "aws:cloudformation:stack-name" "cst-prod",
   "environment" "cst-prod"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-485a4324",
    :group-name "cst-prod-AppSecurityGroup-AUA9YQ97YH7O"}],
  :instance-type "m3.medium",
  :image-id "ami-67d7445d",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-a502460a",
  :private-ip-address "10.63.1.246",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "jenkins2-agent"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-ac5447c0", :group-name "VPC-BuildAgent"}],
  :instance-type "m3.large",
  :image-id "ami-f25b6f91",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-057f007f0fa8763c3",
  :private-ip-address "10.63.20.136",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "1.66.issue_379-718fcc6f39b72099644a7a48adca6f29b3320dda(jenkins)",
   "created_by" "Jenkins",
   "created_on" "2017-01-13T10:45:27+11:00",
   "environment_name" "devbox"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-1850547b",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0d2b2a0f1f1e1a1c3",
  :private-ip-address "10.63.20.189",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prod",
   "aws:autoscaling:groupName" "atlas-prod-AppServerGroup-3T6QF2PQCFLR",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prod/3f718fa0-b5f8-11e2-be8e-50884d262896",
   "aws:cloudformation:stack-name" "atlas-prod",
   "environment" "atlas-prod",
   "environment_name" "atlas-prod",
   "environment_type" "prod"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-c6849baa",
    :group-name "atlas-prod-AppSecurityGroup-Z7GU55Y7P9Z"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0fd8d265ea741a577",
  :private-ip-address "10.63.1.102",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "dbstandby-atlas-prod"},
  :subnet-id "subnet-69f32400",
  :security-groups
  [{:group-id "sg-df849bb3",
    :group-name "atlas-prod-DBStandbySecurityGroup-1CB62QM6RXZDU"}],
  :instance-type "c3.2xlarge",
  :image-id "ami-af452695",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-664b10b9",
  :private-ip-address "10.63.101.133",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "db-atlas-devint",
   "aws:cloudformation:logical-id" "DBServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-devint/3d89e9e0-763c-11e2-8078-50884d292096",
   "aws:cloudformation:stack-name" "atlas-devint",
   "environment" "atlas-devint",
   "environment_name" "atlas-devint",
   "environment_type" "staging"},
  :subnet-id "subnet-9bf423f2",
  :security-groups
  [{:group-id "sg-d70e1cbb",
    :group-name "atlas-devint-DBSecurityGroup-CHN63Z6MKNL"}],
  :instance-type "c3.2xlarge",
  :image-id "ami-7885a91b",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-dffc0a0e",
  :private-ip-address "10.63.100.153",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prod",
   "aws:autoscaling:groupName" "atlas-prod-AppServerGroup-3T6QF2PQCFLR",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prod/3f718fa0-b5f8-11e2-be8e-50884d262896",
   "aws:cloudformation:stack-name" "atlas-prod",
   "environment" "atlas-prod",
   "environment_name" "atlas-prod",
   "environment_type" "prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-c6849baa",
    :group-name "atlas-prod-AppSecurityGroup-Z7GU55Y7P9Z"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-05c41839220e49be3",
  :private-ip-address "10.63.20.145",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prod",
   "aws:autoscaling:groupName" "atlas-prod-AppServerGroup-3T6QF2PQCFLR",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prod/3f718fa0-b5f8-11e2-be8e-50884d262896",
   "aws:cloudformation:stack-name" "atlas-prod",
   "environment" "atlas-prod",
   "environment_name" "atlas-prod",
   "environment_type" "prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-c6849baa",
    :group-name "atlas-prod-AppSecurityGroup-Z7GU55Y7P9Z"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-05087a238ed68b20d",
  :private-ip-address "10.63.20.214",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-043c4dfc25a504c4d",
  :private-ip-address "10.63.20.242",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "porter-devint",
   "aws:cloudformation:logical-id" "PorterServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/porter-devint/d35213e0-c70e-11e6-a782-50fae957fc4a",
   "aws:cloudformation:stack-name" "porter-devint",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-00fd0d67",
    :group-name "porter-devint-PorterSecurityGroup-1GY2Q23A4BNUM"}],
  :instance-type "m3.medium",
  :image-id "ami-369dab55",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0dde1a1b3111c7ad2",
  :private-ip-address "10.63.1.127",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prod",
   "aws:autoscaling:groupName" "atlas-prod-AppServerGroup-3T6QF2PQCFLR",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prod/3f718fa0-b5f8-11e2-be8e-50884d262896",
   "aws:cloudformation:stack-name" "atlas-prod",
   "environment" "atlas-prod",
   "environment_name" "atlas-prod",
   "environment_type" "prod"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-c6849baa",
    :group-name "atlas-prod-AppSecurityGroup-Z7GU55Y7P9Z"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-00a1addb9311dd125",
  :private-ip-address "10.63.1.248",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-loadtest",
   "aws:autoscaling:groupName" "loadtest-AppServerGroup-YLF5HXD4ZKFP",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/loadtest/e02dfca0-c9b2-11e5-979d-503f245c6ad9",
   "aws:cloudformation:stack-name" "loadtest",
   "environment" "loadtest",
   "environment_name" "loadtest",
   "environment_type" "staging"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-a77469c2",
    :group-name "loadtest-AppSecurityGroup-50S5BJPQ9IB2"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-fa9e6ee1",
  :private-ip-address "10.63.20.240",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "db-atlas-prod",
   "environment" "atlas-prod",
   "environment_name" "atlas-prod",
   "environment_type" "prod"},
  :subnet-id "subnet-9bf423f2",
  :security-groups
  [{:group-id "sg-d9849bb5",
    :group-name "atlas-prod-DBSecurityGroup-FUYGE32UW7HD"}],
  :instance-type "c3.2xlarge",
  :image-id "ami-83c883b9",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-a6e19978",
  :private-ip-address "10.63.100.180",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "NAT"},
  :subnet-id "subnet-ddad4fb4",
  :security-groups [{:group-id "sg-ad5447c1", :group-name "VPC-NAT"}],
  :instance-type "t2.micro",
  :image-id "ami-53371f30",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0cb5ba688c9ea01a8",
  :private-ip-address "10.63.254.208",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "2.508.master-4d2f8157b88c3ee62f6f999a49dcbefb71fe58d5()",
   "created_by" "",
   "created_on" "2017-01-10T15:32:47+00:00",
   "environment_name" "devbox"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-35e8ed56",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0faed96448db95a54",
  :private-ip-address "10.63.20.39",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "worker-atlas-prod",
   "aws:autoscaling:groupName" "atlas-prod-WorkerServerGroup-1NAO2AJC0A9BH",
   "aws:cloudformation:logical-id" "WorkerServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prod/3f718fa0-b5f8-11e2-be8e-50884d262896",
   "aws:cloudformation:stack-name" "atlas-prod",
   "environment" "atlas-prod",
   "environment_name" "atlas-prod",
   "environment_type" "prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-dd849bb1",
    :group-name "atlas-prod-WorkerSecurityGroup-PBYH861R0BFM"}],
  :instance-type "r3.xlarge",
  :image-id "ami-f1e1c592",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-1fda2f04",
  :private-ip-address "10.63.20.173",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "utility_database", "environment_name" "shared"},
  :subnet-id "subnet-69f32400",
  :security-groups [{:group-id "sg-3b544757", :group-name "default"}],
  :instance-type "m1.small",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-2ee65a13",
  :private-ip-address "10.63.101.113",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "utility_database"},
  :subnet-id "subnet-69f32400",
  :security-groups [{:group-id "sg-ac5447c0", :group-name "VPC-BuildAgent"}],
  :instance-type "m1.small",
  :image-id "ami-09a0e433",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-efd58c33",
  :private-ip-address "10.63.101.119",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "castro-prod",
   "aws:cloudformation:logical-id" "CastroServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/castro-productionlike/f610fb10-bdbf-11e6-a2df-50fa57536cfe",
   "aws:cloudformation:stack-name" "castro-productionlike",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-bfec03d8",
    :group-name "castro-productionlike-CastroSecurityGroup-V12W5YQXHCHN"}],
  :instance-type "m3.medium",
  :image-id "ami-369dab55",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0668e0ce13366e626",
  :private-ip-address "10.63.1.195",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "castro-devint",
   "aws:cloudformation:logical-id" "CastroServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/castro-devint/405eda00-a63e-11e6-9318-50fae94facae",
   "aws:cloudformation:stack-name" "castro-devint",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-75ede611",
    :group-name "castro-devint-CastroSecurityGroup-V5258T5VZ5NS"}],
  :instance-type "m3.medium",
  :image-id "ami-369dab55",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-055c6d5d1788fb1fe",
  :private-ip-address "10.63.1.162",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "training-nginx", "aws:autoscaling:groupName" "training_nginx"},
  :subnet-id "subnet-ddad4fb4",
  :security-groups
  [{:group-id "sg-179a897b", :group-name "VPC-TrainingNginx"}],
  :instance-type "m1.small",
  :image-id "ami-6b0e2c08",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-4ab25e9b",
  :private-ip-address "10.63.254.166",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "worker-atlas-prodlike-2",
   "aws:autoscaling:groupName"
   "atlas-prodlike-2-WorkerServerGroup-15466S2SPOWW2",
   "aws:cloudformation:logical-id" "WorkerServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prodlike-2/1089a5f0-df21-11e6-8549-50fae94facba",
   "aws:cloudformation:stack-name" "atlas-prodlike-2",
   "environment" "atlas-prodlike-2",
   "environment_name" "atlas-prodlike-2",
   "environment_type" "prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-592ffa3e",
    :group-name "atlas-prodlike-2-WorkerSecurityGroup-8I1H5MZTPGO4"}],
  :instance-type "r3.xlarge",
  :image-id "ami-f1e1c592",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0f03b5f6b6f1fb4ef",
  :private-ip-address "10.63.20.30",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "Chef-Server", "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups [{:group-id "sg-aa5447c6", :group-name "VPC-Chef"}],
  :instance-type "m1.medium",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-833c5ab9",
  :private-ip-address "10.63.1.157",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "open-planet-atlas-bastion"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-b5a2d2d1", :group-name "open-planet-bastion"}],
  :instance-type "m1.medium",
  :image-id "ami-bc3913df",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-6e204ac1",
  :private-ip-address "10.63.1.81",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-train02", "environment_name" "training"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-23060340",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-01841a0126846dd48",
  :private-ip-address "10.63.20.229",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-cst-staging",
   "aws:autoscaling:groupName" "cst-staging-AppServerGroup-H7H3DJ89XMRD",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/cst-staging/2f4f8780-c1ec-11e2-b85e-50884d262896",
   "aws:cloudformation:stack-name" "cst-staging",
   "environment" "cst-staging"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-d5eaf4b9",
    :group-name "cst-staging-AppSecurityGroup-WIWX7SSOKD9F"}],
  :instance-type "m3.medium",
  :image-id "ami-67d7445d",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-38bc1c03",
  :private-ip-address "10.63.20.205",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "1.66.issue_547-d222f145be61092d3105fc045cd20c76a58db53a(jenkins)",
   "created_by" "Jenkins",
   "created_on" "2017-01-18T14:27:04+11:00",
   "environment_name" "devbox"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-15d9dd76",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-097fedbea0c16614e",
  :private-ip-address "10.63.20.32",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "jenkins-agent",
   "environment_name" "jenkins-agent",
   "stackdriver_monitor" "false"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups [{:group-id "sg-ac5447c0", :group-name "VPC-BuildAgent"}],
  :instance-type "c3.large",
  :image-id "ami-4a605929",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-eeb9e541",
  :private-ip-address "10.63.1.201",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-03b1b09523ca99ed7",
  :private-ip-address "10.63.20.74",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "worker-loadtest",
   "aws:autoscaling:groupName" "loadtest-WorkerServerGroup-1OW3UPFCU126R",
   "aws:cloudformation:logical-id" "WorkerServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/loadtest/e02dfca0-c9b2-11e5-979d-503f245c6ad9",
   "aws:cloudformation:stack-name" "loadtest",
   "environment" "loadtest",
   "environment_name" "loadtest",
   "environment_type" "staging"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-d17469b4",
    :group-name "loadtest-WorkerSecurityGroup-FBL5KXAUW3ZM"}],
  :instance-type "r3.xlarge",
  :image-id "ami-f1e1c592",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-82807099",
  :private-ip-address "10.63.20.131",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "jenkins-agent",
   "environment_name" "jenkins-agent",
   "stackdriver_monitor" "false"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups [{:group-id "sg-ac5447c0", :group-name "VPC-BuildAgent"}],
  :instance-type "c3.large",
  :image-id "ami-4a605929",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-f1b9e55e",
  :private-ip-address "10.63.1.112",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "gr-af-testing"},
  :subnet-id "subnet-3468fc5d",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m3.medium",
  :image-id "ami-e926228a",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0b42964d9957a993e",
  :private-ip-address "10.63.38.234",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-028e14d809c37b23d",
  :private-ip-address "10.63.20.11",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "porter-prod",
   "aws:cloudformation:logical-id" "PorterServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/porter-productionlike/51a6bca0-bdb9-11e6-a485-503f2373503d",
   "aws:cloudformation:stack-name" "porter-productionlike",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-8a9679ed",
    :group-name "porter-productionlike-PorterSecurityGroup-10A9MULSO5Q76"}],
  :instance-type "m3.medium",
  :image-id "ami-369dab55",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-08bd7d3fe53823c15",
  :private-ip-address "10.63.1.22",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-train01", "environment_name" "training"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-ce0225ad",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-37c0e7e8",
  :private-ip-address "10.63.20.5",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "spp-openvpn"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-da6557be", :group-name "launch-wizard-14"}],
  :instance-type "t2.micro",
  :image-id "ami-ba3e14d9",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-02422a5d4a9305931",
  :private-ip-address "10.63.1.237",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-38392fe7",
  :private-ip-address "10.63.20.237",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-devint",
   "aws:autoscaling:groupName" "atlas-devint-AppServerGroup-1KEOPY4WLOB3U",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-devint/3d89e9e0-763c-11e2-8078-50884d292096",
   "aws:cloudformation:stack-name" "atlas-devint",
   "environment" "atlas-devint",
   "environment_name" "atlas-devint",
   "environment_type" "staging"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-da0e1cb6",
    :group-name "atlas-devint-AppSecurityGroup-WAR6SV06CPXE"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-389ed397",
  :private-ip-address "10.63.1.140",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prodlike-2",
   "aws:autoscaling:groupName"
   "atlas-prodlike-2-AppServerGroup-1E7RDFUBR611R",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prodlike-2/1089a5f0-df21-11e6-8549-50fae94facba",
   "aws:cloudformation:stack-name" "atlas-prodlike-2",
   "environment" "atlas-prodlike-2",
   "environment_name" "atlas-prodlike-2",
   "environment_type" "prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-212ffa46",
    :group-name "atlas-prodlike-2-AppSecurityGroup-18EHQNMHMD2A3"}],
  :instance-type "m1.medium",
  :image-id "ami-6d7e540e",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0f0e4551f7c36ba17",
  :private-ip-address "10.63.20.244",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-prodlike-2",
   "aws:autoscaling:groupName"
   "atlas-prodlike-2-AppServerGroup-1E7RDFUBR611R",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prodlike-2/1089a5f0-df21-11e6-8549-50fae94facba",
   "aws:cloudformation:stack-name" "atlas-prodlike-2",
   "environment" "atlas-prodlike-2",
   "environment_name" "atlas-prodlike-2",
   "environment_type" "prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-212ffa46",
    :group-name "atlas-prodlike-2-AppSecurityGroup-18EHQNMHMD2A3"}],
  :instance-type "m1.medium",
  :image-id "ami-6d7e540e",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0ff5e11db57fbcec9",
  :private-ip-address "10.63.20.7",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "castro-prod-legacy",
   "aws:cloudformation:logical-id" "CastroServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/castro/0a6d3080-73bd-11e6-8ea7-50ba26ec780a",
   "aws:cloudformation:stack-name" "castro",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-7582d111",
    :group-name "castro-CastroSecurityGroup-1F5HN848Y1FHA"}],
  :instance-type "m3.medium",
  :image-id "ami-369dab55",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0dc57fb5b67403318",
  :private-ip-address "10.63.1.18",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-atlas-devint",
   "aws:autoscaling:groupName" "atlas-devint-AppServerGroup-1KEOPY4WLOB3U",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-devint/3d89e9e0-763c-11e2-8078-50884d292096",
   "aws:cloudformation:stack-name" "atlas-devint",
   "environment" "atlas-devint",
   "environment_name" "atlas-devint",
   "environment_type" "staging"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-da0e1cb6",
    :group-name "atlas-devint-AppSecurityGroup-WAR6SV06CPXE"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-22f20139",
  :private-ip-address "10.63.20.48",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-cst-prod",
   "aws:autoscaling:groupName" "cst-prod-AppServerGroup-1QMHQKXD2JQDY",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/cst-prod/bdd9b9b0-c667-11e2-8d19-50884d269896",
   "aws:cloudformation:stack-name" "cst-prod",
   "environment" "cst-prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-485a4324",
    :group-name "cst-prod-AppSecurityGroup-AUA9YQ97YH7O"}],
  :instance-type "m3.medium",
  :image-id "ami-67d7445d",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-436a9958",
  :private-ip-address "10.63.20.159",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "backup-agent-14"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-ac5447c0", :group-name "VPC-BuildAgent"}],
  :instance-type "m3.large",
  :image-id "ami-d19fc4b2",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0a9b74ba57ebb5435",
  :private-ip-address "10.63.20.76",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "app-loadtest",
   "aws:autoscaling:groupName" "loadtest-AppServerGroup-YLF5HXD4ZKFP",
   "aws:cloudformation:logical-id" "AppServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/loadtest/e02dfca0-c9b2-11e5-979d-503f245c6ad9",
   "aws:cloudformation:stack-name" "loadtest",
   "environment" "loadtest",
   "environment_name" "loadtest",
   "environment_type" "staging"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-a77469c2",
    :group-name "loadtest-AppSecurityGroup-50S5BJPQ9IB2"}],
  :instance-type "m1.medium",
  :image-id "ami-f4e1c597",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-d3d1ab7c",
  :private-ip-address "10.63.1.114",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "Jenkins-Server",
   "aws:autoscaling:groupName" "jenkins",
   "environment" "Jenkins",
   "environment_name" "Jenkins"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups [{:group-id "sg-a85447c4", :group-name "VPC-Jenkins"}],
  :instance-type "c3.2xlarge",
  :image-id "ami-79af3843",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-15ffc828",
  :private-ip-address "10.63.1.208",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "SPP-Dashboard",
   "aws:cloudformation:logical-id" "DashboardServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/dashboard/3eaa6300-65a2-11e6-8845-50fae94facba",
   "aws:cloudformation:stack-name" "dashboard",
   "environment_name" "shared"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-e4672680",
    :group-name "dashboard-DashboardSecurityGroup-DPKORLU2O1G6"}],
  :instance-type "t2.small",
  :image-id "ami-9f0e6ca5",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-06e53d7b4379ef6fa",
  :private-ip-address "10.63.20.228",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "logstash",
   "aws:cloudformation:logical-id" "LogstashServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/logstash/48e64fd0-7998-11e3-8e88-506726f6a39a",
   "aws:cloudformation:stack-name" "logstash",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-c89888aa",
    :group-name "logstash-LogstashSecurityGroup-1CLBD1EGH5PJQ"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-50bd856c",
  :private-ip-address "10.63.1.124",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "docs-prod",
   "aws:cloudformation:logical-id" "DocsServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/docs/48394d30-8386-11e6-8e19-50fae957fc56",
   "aws:cloudformation:stack-name" "docs",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-f6755792",
    :group-name "docs-DocsSecurityGroup-17SWJX0ENCQ69"}],
  :instance-type "t2.small",
  :image-id "ami-369dab55",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-01ad6a59f051447d6",
  :private-ip-address "10.63.1.141",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0400ededd4e7af925",
  :private-ip-address "10.63.20.105",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "tools",
   "aws:cloudformation:logical-id" "ToolsAgentServer",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/tools/e92777a0-deba-11e6-a757-50fae94facae",
   "aws:cloudformation:stack-name" "tools",
   "environment_name" "shared"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups
  [{:group-id "sg-12af7a75",
    :group-name "tools-ToolsAgentSecurityGroup-1CHA6KLUE6M80"}],
  :instance-type "t2.small",
  :image-id "ami-369dab55",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0f93633ed4fb22f3d",
  :private-ip-address "10.63.1.28",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "worker-atlas-prod",
   "aws:cloudformation:logical-id" "WorkerServerGroup",
   "aws:cloudformation:stack-id"
   "arn:aws:cloudformation:ap-southeast-2:949364753207:stack/atlas-prod/3f718fa0-b5f8-11e2-be8e-50884d262896",
   "aws:cloudformation:stack-name" "atlas-prod",
   "environment" "atlas-prod",
   "environment_name" "atlas-prod",
   "environment_type" "prod"},
  :subnet-id "subnet-38b45651",
  :security-groups
  [{:group-id "sg-dd849bb1",
    :group-name "atlas-prod-WorkerSecurityGroup-PBYH861R0BFM"}],
  :instance-type "r3.xlarge",
  :image-id "ami-f1e1c592",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-7a3c1aa5",
  :private-ip-address "10.63.20.43",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Jenkins-Server-TEST" "Jenkins-Server-TEST",
   "Name" "Jenkins-Server-Test"},
  :subnet-id "subnet-dfad4fb6",
  :security-groups [{:group-id "sg-a85447c4", :group-name "VPC-Jenkins"}],
  :instance-type "c3.2xlarge",
  :image-id "ami-7e230c1d",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-b948b568",
  :private-ip-address "10.63.1.154",
  :placement
  {:availability-zone "ap-southeast-2a", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "2.494.sherpa-18addcf07a7443ee80d97f9036afea83029b3727()",
   "created_by" "",
   "created_on" "2016-11-25T14:56:18+00:00",
   "environment_name" "devbox"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-c39f87a7", :group-name "Sherpa"}],
  :instance-type "m1.large",
  :image-id "ami-13af9170",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-02e5ee06de6683e47",
  :private-ip-address "10.63.20.100",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags
  {"Name" "2.494.sherpa-193bd86abdf7a9ed283d5b0d9c581d6bbe36107f()",
   "created_by" "",
   "created_on" "2016-11-24T10:19:19+00:00",
   "environment_name" "devbox"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-b7c9f7d4",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-05c2d3fd0e5a13157",
  :private-ip-address "10.63.20.227",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "atlas-standalone-template"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-fb8611c1",
  :state {:name "running", :code 16},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0af5a5b6b28667cb2",
  :private-ip-address "10.63.20.175",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}
 {:tags {"Name" "2.494.sherpa-193bd86abdf7a9ed283d5b0d9c581d6bbe36107f()"},
  :subnet-id "subnet-38b45651",
  :security-groups [{:group-id "sg-5a061536", :group-name "VPC-StandAlone"}],
  :instance-type "m1.large",
  :image-id "ami-b7c9f7d4",
  :state {:name "stopped", :code 80},
  :vpc-id "vpc-c7ad4fae",
  :instance-id "i-0a99acf54065133c0",
  :private-ip-address "10.63.20.125",
  :placement
  {:availability-zone "ap-southeast-2b", :group-name "", :tenancy "default"}}]
