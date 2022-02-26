package com;

public class DataSet {
    public static  String[] questionSet = {
            "\\question\n"+
                    "  What is the fundamental unit of computing in cloud computing?\n"+
                    "\\begin{parts}\n"+
                    " \\part Physical server\n"+
                    " \\part VM\n"+
                    " \\part Block\n"+
                    " \\part Subnet\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  If you use a cluster that is managed by a cloud provider, which of these will be managed for you by the cloud provider?\n"+
                    "\\begin{parts}\n"+
                    " \\part Monitoring\n"+
                    " \\part Networking\n"+
                    " \\part Some security management tasks\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You need serverless computing for file processing and running the backend of a website; which two products can you choose from Google Cloud Platform?\n"+
                    "\\begin{parts}\n"+
                    " \\part Kubernetes Engine and Compute Engine\n"+
                    " \\part App Engine and Cloud Functions\n"+
                    " \\part Cloud Functions and Compute Engine\n"+
                    " \\part Cloud Functions and Kubernetes Engine\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been asked to design a storage system for a web application that allows users to upload large data files to be analyzed by a business intelligence workflow. The files should be stored in a high-availability storage system. File system functionality is not required. Which storage system in Google Cloud Platform should be used?\n"+
                    "\\begin{parts}\n"+
                    " \\part Block storage\n"+
                    " \\part Object storage\n"+
                    " \\part Cache\n"+
                    " \\part Network File System\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " All block storage systems use what block size?\n"+
                    "\\begin{parts}\n"+
                    " \\part 4KB\n"+
                    " \\part 8KB\n"+
                    " \\part 16KB\n"+
                    " \\part Block size can vary.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been asked to set up network security in a virtual private cloud. Your company wants to have multiple subnetworks and limit traffic between the subnetworks. Which network security control would you use to control the flow of traffic between subnets?\n"+
                    "\\begin{parts}\n"+
                    " \\part Identity access management\n"+
                    " \\part Router\n"+
                    " \\part Firewall\n"+
                    " \\part IP address table\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you create a machine learning service to identify text in an image, what type of servers should you choose to manage compute resources?\n"+
                    "\\begin{parts}\n"+
                    " \\part VMs\n"+
                    " \\part Clusters of VMs\n"+
                    " \\part No servers; specialized services are serverless\n"+
                    " \\part VMs running Linux only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Investing in servers for extended periods of time, such as committing to use servers for three to five years, works well when?\n"+

                    "\\begin{parts}\n"+
                    " \\part A company is just starting up\n"+
                    " \\part A company can accurately predict server need for an extended period of time\n"+
                    " \\part A company has a fixed IT budget\n"+
                    " \\part A company has a variable IT budget\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your company is based in X and will be running a virtual server for Y. What factor determines the unit per minute cost?\n"+
                    "\\begin{parts}\n"+
                    " \\part The time of day the VM is run\n"+
                    " \\part The characteristics of the server\n"+
                    " \\part The application you run\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You plan to use Cloud Vision to analyze images and extract text seen in the image. You plan to process between 1,000 and 2,500 images per hour. How many VMs should you allocate to meet peak demand?\n"+
                    "\\begin{parts}\n"+
                    " \\part 1\n"+
                    " \\part 10\n"+
                    " \\part 25\n"+
                    " \\part None; Cloud Vision is a serverless service.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have to run a number of services to support an application. Which of the following is a good deployment model?\n"+
                    "\\begin{parts}\n"+
                    " \\part Run on a large, single VM\n"+
                    " \\part Use containers in a managed cluster\n"+
                    " \\part Use two large VMs, making one of them read only\n"+
                    " \\part Use a small VM for all services and increase the size of the VM when CPU utilization exceeds 90 percent\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have created a VM. Which of the following system administration operations are you allowed to perform on it?\n"+
                    "\\begin{parts}\n"+
                    " \\part Configure the file system\n"+
                    " \\part Patch operating system software\n"+
                    " \\part Change file and directory permissions\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Cloud Filestore is based on what file system technology?\n"+
                    "\\begin{parts}\n"+
                    " \\part Network File System (NFS)\n"+
                    " \\part XFS\n"+
                    " \\part EXT4\n"+
                    " \\part ReiserFS\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When setting up a network in GCP, your network the resources in it are treated as what?\n"+
                    "\\begin{parts}\n"+
                    " \\part Virtual private cloud\n"+
                    " \\part Subdomain\n"+
                    " \\part Cluster\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You need to store data for X and therefore you are using a cache for Y. How will the cache affect data retrieval?\n"+
                    "\\begin{parts}\n"+
                    " \\part A cache improves the execution of client-side JavaScript.\n"+
                    " \\part A cache will continue to store data even if power is lost, improving availability.\n"+
                    " \\part Caches can get out of sync with the system of truth.\n"+
                    " \\part Using a cache will reduce latency, since retrieving from a cache is faster than retrieving from SSDs or HDDs.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Why can cloud providers offer elastic resource allocation?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud providers can take resources from lower-priority customers and give them to higher-priority customers.\n"+
                    " \\part Extensive resources and the ability to quickly shift resources between customers enables public cloud providers to offer elastic resource allocation more efficiently than can be done in smaller data centers.\n"+
                    " \\part They charge more the more resources you use.\n"+
                    " \\part They don’t.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What is not a characteristic of specialized services in Google Cloud Platform?\n"+
                    "\\begin{parts}\n"+
                    " \\part They are serverless; you do not need to configure servers or clusters.\n"+
                    " \\part They provide a specific function, such as translating text or analyzing images.\n"+
                    " \\part They require monitoring by the user.\n"+
                    " \\part They provide an API to access the functionality of the service.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your client’s transactions must access a drive attached to a VM that allows for random access to parts of files. What kind of storage does the attached drive provide?\n"+
                    "\\begin{parts}\n"+
                    " \\part Object storage\n"+
                    " \\part Block storage\n"+
                    " \\part NoSQL storage\n"+
                    " \\part Only SSD storage\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are deploying a new relational database to support a web application. Which type of storage system would you use to store data files of the database?\n"+
                    "\\begin{parts}\n"+
                    " \\part Object storage\n"+
                    " \\part Data storage\n"+
                    " \\part Block storage\n"+
                    " \\part Cache\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A user prefers services that require minimal setup; why would you recommend Cloud Storage, App Engine, and Cloud Functions?\n"+
                    "\\begin{parts}\n"+
                    " \\part They are charged only by time.\n"+
                    " \\part They are serverless.\n"+
                    " \\part They require a user to configure VMs.\n"+
                    " \\part They can only run applications written in Go.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are planning to deploy a SaaS application for customers in North America, Europe, and Asia. To maintain scalability, you will need to distribute workload across servers in multiple regions. Which GCP service would you use to implement the workload distribution?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud DNS\n"+
                    " \\part Cloud Spanner\n"+
                    " \\part Cloud Load Balancing\n"+
                    " \\part Cloud CDN\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have decided to deploy a set of microservices using containers. You could install and manage Docker on Compute Engine instances, but you’d rather have GCP provide some container management services. Which two GCP services allow you to run containers in a managed service?\n"+
                    "\\begin{parts}\n"+
                    " \\part App Engine standard environment and App Engine flexible environment\n"+
                    " \\part Kubernetes Engine and App Engine standard environment\n"+
                    " \\part Kubernetes Engine and App Engine flexible environment\n"+
                    " \\part App Engine standard environment and Cloud Functions\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Why would an API developer want to use the Apigee API platform?\n"+
                    "\\begin{parts}\n"+
                    " \\part To get the benefits of routing and rate-limiting\n"+
                    " \\part Authentication  services\n"+
                    " \\part Version control of code\n"+
                    " \\part A and B\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are deploying an API to the public Internet and are concerned that your service will be subject to DDoS attacks. Which GCP service should you consider to protect your API?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Armor\n"+
                    " \\part Cloud CDN\n"+
                    " \\part Cloud IAM\n"+
                    " \\part VPCs\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have an application that uses a Pub/Sub message queue to maintain a list of tasks that are to be processed by another application. The application that consumes messages from the Pub/Sub queue removes the message only after completing the task. It takes approximately 10 seconds to complete a task. It is not a problem if two or more VMs perform the same task. What is a cost-effective configuration for processing this workload?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use preemptible VMs\n"+
                    " \\part Use standard VMs\n"+
                    " \\part Use DataProc\n"+
                    " \\part Use Spanner\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your department is deploying an application that has a database backend. You are concerned about the read load on the database server and want to have data available in memory to reduce the time to respond to queries and to reduce the load on the database server. Which GCP service would you use to keep data in memory?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud SQL\n"+
                    " \\part Cloud Memorystore\n"+
                    " \\part Cloud Spanner\n"+
                    " \\part Cloud Datastore\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  The Cloud SDK can be used to configure and manage resources in which of the following services?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine\n"+
                    " \\part Cloud Storage\n"+
                    " \\part Network firewalls\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What server configuration is required to use Cloud Functions?\n"+
                    "\\begin{parts}\n"+
                    " \\part VM configuration\n"+
                    " \\part Cluster configuration\n"+
                    " \\part Pub/Sub configuration\n"+
                    " \\part None\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been assigned the task of consolidating log data generated by each instance of an application. Which of the Stackdriver management tools would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part Monitoring\n"+
                    " \\part Trace\n"+
                    " \\part Debugger\n"+
                    " \\part Logging\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which specialized services are most likely to be used to build a data warehousing platform that requires complex extraction, transformation, and loading operations on batch data as well as processing streaming data?\n"+
                    "\\begin{parts}\n"+
                    " \\part Apigee API platform\n"+
                    " \\part Data analytics\n"+
                    " \\part AI and machine learning\n"+
                    " \\part Cloud SDK\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "Your company has deployed 100,000 Internet of Things (IoT) sensors to collect data on the state of equipment in several factories. Each sensor will collect and send data to a data  store every 5 seconds. Sensors will run continuously. Daily reports will produce data on the  maximum, minimum, and average value for each metric collected on each sensor. There is no need to support transactions in this application. Which database product would you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Spanner\n"+
                    " \\part Cloud Bigtable\n"+
                    " \\part Cloud SQL MySQL\n"+
                    " \\part Cloud SQL PostgreSQL\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are the lead developer on a medical application that uses patients’ smartphones to capture biometric data. The app is required to collect data and store it on the smartphone when data cannot be reliably transmitted to the backend application. You want to minimize the amount of development you have to do to keep data synchronized between smartphones and backend data stores. Which data store option should you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Firestore\n"+
                    " \\part Cloud Spanner\n"+
                    " \\part Cloud Datastore\n"+
                    " \\part Cloud SQL\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A software engineer comes to you for a recommendation. She has implemented a machine learning algorithm to identify cancerous cells in medical images. The algorithm is computationally intensive, makes many mathematical calculations, requires immediate access to large amounts of data, and cannot be easily distributed over multiple servers. What kind of Compute Engine configuration would you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part High memory, high CPU\n"+
                    " \\part High memory, high CPU, GPU\n"+
                    " \\part Mid-level memory, high CPU\n"+
                    " \\part High CPU, GPU\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are tasked with mapping the authentication and authorization policies of your\n"+
                    "remises applications to GPC’s authentication and authorization mechanisms. The GCP documentation states that an identity must be authenticated in order to grant privileges to that identity. What does the term identity refer to?\n"+
                    "\\begin{parts}\n"+
                    " \\part VM ID\n"+
                    " \\part User\n"+
                    " \\part Role\n"+
                    " \\part Set of privileges\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A client is developing an application that will need to analyze large volumes of text information. The client is not expert in text mining or working with language. What GCP service would you recommend they use?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Vision\n"+
                    " \\part Cloud ML\n"+
                    " \\part Cloud Natural Language Processing\n"+
                    " \\part Cloud Text Miner\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Data scientists in your company want to use a machine learning library available only in Apache Spark. They want to minimize the amount of administration and DevOps work. How would you recommend they proceed?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use Cloud Spark\n"+
                    " \\part Use Cloud Dataproc\n"+
                    " \\part Use Bigquery\n"+
                    " \\part Install Apache Spark on a cluster of VMs\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Database designers at your company are debating the best way to move a database to GCP. The database supports an application with a global user base. Users expect support for transactions and the ability to query data using commonly used query tools. The database designers decide that any database service they choose will\n"+
                    " to support ANSI 2011 and global transactions. Which database service would you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud SQL\n"+
                    " \\part Cloud Spanner\n"+
                    " \\part Cloud Datastore\n"+
                    " \\part Cloud Bigtable\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which specialized service supports both batch and stream processing workflows?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Dataproc\n"+
                    " \\part Bigquery\n"+
                    " \\part Cloud Datastore\n"+
                    " \\part AutoML\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have a Python application you’d like to run in a scalable environment with the least amount of management overhead. Which GCP product would you select?\n"+
                    "\\begin{parts}\n"+
                    " \\part App Engine flexible environment\n"+
                    " \\part Cloud Engine\n"+
                    " \\part App Engine standard environment\n"+
                    " \\part Kubernetes Engine\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A product manager at your company reports that customers are complaining about the reliability of one of your applications. The application is crashing periodically, but\n"+
                    "lopers have not found a common pattern that triggers the crashes. They are concerned that they do not have good insight into the behavior of the application and want to perform a detailed review of all crash data. Which Stackdriver tool would you use to view consolidated crash information?\n"+
                    "\\begin{parts}\n"+
                    " \\part DataProc\n"+
                    " \\part Monitoring\n"+
                    " \\part Logging\n"+
                    " \\part Error Reporting\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are designing cloud applications for a healthcare provider. The records management application will manage medical information for patients. Access to this data is limited to a small number of employees. The billing department application will have insurance and payment information. Another group of employees will have access billing information. In addition, the billing system will have two components: a private insurance billing system and a government payer billing system. Government regulations require that software used to bill the government must be isolated from other software systems. Which of the following resource hierarchies would meet these requirements and provide the most flexibility to adapt to changing requirements?\n"+
                    "\\begin{parts}\n"+
                    " \\part One organization, with folders for records management and billing. The billing folder would have private insurer and government payer folders within it. Common constraints would be specified in organization-level policies. Other policies would be defined at the appropriate folder.\n"+
                    " \\part One folder for records management, one for billing, and no organization. Policies defined at the folder level.\n"+
                    " \\part One organization, with folders for records management, private insurer, and government payer below the organization. All constraints would be specified in organization level policies. All folders would have the same policy constraints.\n"+
                    " \\part None of the above.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you create a hierarchy, you can have more than one of which structure?\n"+
                    "\\begin{parts}\n"+
                    " \\part Organization only\n"+
                    " \\part Folder only\n"+
                    " \\part Folder and project\n"+
                    " \\part Project only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are designing an application that uses a series of services to transform data from its original form into a format suitable for use in a data warehouse. Your transformation application will write to the message queue as it processes each input file. You don’t want to give users permission to write to the message queue. You could allow the application to write to the message queue by using which of the following?\n"+
                    "\\begin{parts}\n"+
                    " \\part Billing account\n"+
                    " \\part Service account\n"+
                    " \\part Messaging account\n"+
                    " \\part Folder\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your company has a number of policies that need to be enforced for all projects. You  decide to apply policies to the resource hierarchy. Not long after you apply the policies, an engineer finds that an application that had worked prior to implementing policies is no longer working. The engineer would like you to create an exception for the application. How can you override a policy inherited from another entity in the resource hierarchy?\n"+
                    "\\begin{parts}\n"+
                    " \\part Inherited policies can be overridden by defining a policy at a folder or project level.\n"+
                    " \\part Inherited policies cannot be overridden.\n"+
                    " \\part Policies can be overridden by linking them to service accounts.\n"+
                    " \\part Policies can be overridden by linking them to billing accounts.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Constraints are used in resource hierarchy policies. Which of the following are types of constraints allowed?\n"+
                    "\\begin{parts}\n"+
                    " \\part Allow a specific set of values\n"+
                    " \\part Deny a specific set of values\n"+
                    " \\part Deny a value and all its child values\n"+
                    " \\part Allow all allowed values\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A team with four members needs you to set up a project that needs only general permissions for all resources. You are granting each person a primitive role for different levels of access, depending on their responsibilities in the project. Which of the following are not included as primitive roles in Google Cloud Platform?\n"+
                    "\\begin{parts}\n"+
                    " \\part Owner\n"+
                    " \\part Publisher\n"+
                    " \\part Editor\n"+
                    " \\part Viewer\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are deploying a new custom application and want to delegate some administration tasks to DevOps engineers. They do not need all the privileges of a full application administrator, but they do need a subset of those privileges. What kind of role should you use to grant those privileges?\n"+
                    "\\begin{parts}\n"+
                    " \\part Primitive\n"+
                    " \\part Predefined\n"+
                    " \\part Advanced\n"+
                    " \\part Custom\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  An app for a finance company needs access to a database and a Cloud Storage bucket. There is no predefined role that grants all the needed permissions without granting some permissions that are not needed. You decide to create a custom role. When defining custom roles, you should follow which of the following principles?\n"+
                    "\\begin{parts}\n"+
                    " \\part Rotation of duties\n"+
                    " \\part Least principle\n"+
                    " \\part Defense in depth\n"+
                    " \\part Least privilege\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  How many organizations can you create in a resource hierarchy?\n"+
                    "\\begin{parts}\n"+
                    " \\part 1\n"+
                    " \\part 2\n"+
                    " \\part 3\n"+
                    " \\part Unlimited\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are contacted by the finance department of your company for advice on how to automate payments for GCP services. What kind of account would you recommend setting up?\n"+
                    "\\begin{parts}\n"+
                    " \\part Service account\n"+
                    " \\part Billing account\n"+
                    " \\part Resource account\n"+
                    " \\part Credit account\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are experimenting with GCP for your company. You do not have permission to incur costs. How can you experiment with GCP without incurring charges?\n"+
                    "\\begin{parts}\n"+
                    " \\part You can’t; all services incur charges.\n"+
                    " \\part You can use a personal credit card to pay for charges.\n"+
                    " \\part You can use only free services in GCP.\n"+
                    " \\part You can use only serverless products, which are free to use.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your DevOps team has decided to use Stackdriver monitoring and logging. You have been asked to set up Stackdriver workspaces. When you set up a Stackdriver workspace, what kind of resource is it associated with?\n"+
                    "\\begin{parts}\n"+
                    " \\part A Compute Engine instance only\n"+
                    " \\part A Compute Engine instance or Kubernetes Engine cluster only\n"+
                    " \\part A Compute Engine instance, Kubernetes Engine cluster, or App Engine app\n"+
                    " \\part A project\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A large enterprise is planning to use GCP across a number of subdivisions. Each subdivision is managed independently and has its own budget. Most subdivisions plan to spend tens\n"+
                    "thousands of dollars per month. How would you recommend they set up their billing account(s)?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use a single self-service billing account.\n"+
                    " \\part Use multiple self-service billing accounts.\n"+
                    " \\part Use a single invoiced billing account.\n"+
                    " \\part Use multiple invoiced billing accounts.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . An application administrator is responsible for managing all resources in a project. She wants to delegate responsibility for several service accounts to another administrator. If additional service accounts are created, the other administrator should manage those as well. What is the best way to delegate privileges needed to manage the service accounts?\n"+
                    "\\begin{parts}\n"+
                    " \\part Grant iam.serviceAccountUser to the administrator at the project level.\n"+
                    " \\part Grant iam.serviceAccountUser to the administrator at the service account level.\n"+
                    " \\part Grant iam.serviceProjectAccountUser to the administrator at the project level.\n"+
                    " \\part Grant iam.serviceProjectAccountUser to the administrator at the service account level.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You work for a retailer with a large number of brick and mortar stores. Every night the stores upload daily sales data. You have been tasked with creating a service that verifies the uploads every night. You decide to use a service account. Your manager questions the security of your proposed solution, particularly about authenticating the service account. You explain the authentication mechanism used by service accounts. What authentication mechanism is used?\n"+
                    "\\begin{parts}\n"+
                    " \\part Username and password\n"+
                    " \\part Two-factor authentication\n"+
                    " \\part Encrypted keys\n"+
                    " \\part Biometrics\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What objects in GCP are sometimes treated as resources and sometimes as identities?\n"+
                    "\\begin{parts}\n"+
                    " \\part Billing accounts\n"+
                    " \\part Service accounts\n"+
                    " \\part Projects\n"+
                    " \\part Roles\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You plan to develop a web application using products from the GCP that already include established roles for managing permissions such as read-only access or the ability to delete old versions. Which of the following roles offers these capabilities?\n"+
                    "\\begin{parts}\n"+
                    " \\part Primitive roles\n"+
                    " \\part Predefined roles\n"+
                    " \\part Custom roles\n"+
                    " \\part Application roles\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are reviewing a new GCP account created for use by the finance department. An auditor has questions about who can create projects by default. You explain who has privileges to create projects by default. Who is included?\n"+
                    "\\begin{parts}\n"+
                    " \\part Only project administrators\n"+
                    " \\part All users\n"+
                    " \\part Only users without the role resourcemanager.projects.create\n"+
                    " \\part Only billing account users\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . How many projects can be created in an account?\n"+
                    "\\begin{parts}\n"+
                    " \\part 10\n"+
                    " \\part 25\n"+
                    " \\part There is no limit.\n"+
                    " \\part Each account has a limit determined by Google.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are planning how to grant privileges to users of your company’s GCP account. You need to document what each user will be able to do. Auditors are most concerned about a role called Organization IAM roles. You explain that users with that role can perform a number of tasks, which include all of the following except which one?\n"+
                    "\\begin{parts}\n"+
                    " \\part Defining the structure of the resource hierarchy\n"+
                    " \\part Determining what privileges a user should be assigned\n"+
                    " \\part Defining IAM policies over the resource hierarchy\n"+
                    " \\part Delegating other management roles to other users\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are deploying a Python web application to GCP. The application uses only custom code and basic Python libraries. You expect to have sporadic use of the application for the foreseeable future and want to minimize both the cost of running the application and the DevOps overhead of managing the application. Which computing service is the best option for running the application?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine\n"+
                    " \\part App Engine standard environment\n"+
                    " \\part App Engine flexible environment\n"+
                    " \\part Kubernetes Engine\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your manager is concerned about the rate at which the department is spending on cloud services. You suggest that your team use preemptible VMs for all of the following except which one?\n"+
                    "\\begin{parts}\n"+
                    " \\part Database server\n"+
                    " \\part Batch processing with no fixed time requirement to complete\n"+
                    " \\part High-performance computing cluster\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What parameters need to be specified when creating a VM in Compute Engine?\n"+
                    "\\begin{parts}\n"+
                    " \\part Project and zone\n"+
                    " \\part Username and admin role\n"+
                    " \\part Billing account\n"+
                    " \\part Cloud Storage bucket\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your company has licensed a third-party software package that runs on Linux. You will run multiple instances of the software in a Docker container. Which of the following GCP services could you use to deploy this software package?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine only\n"+
                    " \\part Kubernetes Engine only\n"+
                    " \\part Compute Engine, Kubernetes Engine, and the App Engine flexible environment only\n"+
                    " \\part Compute Engine, Kubernetes Engine, the App Engine flexible environment, or the App Engine standard environment\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You can specify packages to install into a Docker container by including commands in which file?\n"+
                    "\\begin{parts}\n"+
                    " \\part Docker.cfg\n"+
                    " \\part Dockerfile\n"+
                    " \\part Config.dck\n"+
                    " \\part install.cfg\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  How much memory of a node does Kubernetes require as overhead?\n"+
                    "\\begin{parts}\n"+
                    " \\part 10GB to 20GB\n"+
                    " \\part 1GB to 2GB\n"+
                    " \\part 1.5GB\n"+
                    " \\part A scaled amount starting at 25 percent of memory and decreasing to 2 percent of marginal memory as the total amount of memory increases.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your manager is making a presentation to executives in your company advocating that you start using Kubernetes Engine. You suggest that the manager highlight all the features Kubernetes provides to reduce the workload on DevOps engineers. You describe several features, including all of the following except which one?\n"+
                    "\\begin{parts}\n"+
                    " \\part Load balancing across Compute Engine VMs that are deployed in a Kubernetes cluster\n"+
                    " \\part Security scanning for vulnerabilities\n"+
                    " \\part Automatic scaling of nodes in the cluster\n"+
                    " \\part Automatic upgrading of cluster software as needed\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your company is about to release a new online service that builds on a new user interface experience driven by a set of services that will run on your servers. There is a separate set of services that manage authentication and authorization. A data store set of services keeps track of account information. All three sets of services must be highly reliable and scale to meet demand. Which of the GCP services is the best option for deploying this?\n"+
                    "\\begin{parts}\n"+
                    " \\part App Engine standard environment\n"+
                    " \\part Compute Engine\n"+
                    " \\part Cloud Functions\n"+
                    " \\part Kubernetes Engine\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A mobile application uploads images for analysis, including identifying objects in the image and extracting text that may be embedded in the image. A third party has created the mobile application, and you have developed the image analysis service. You both agree to use Cloud Storage to store images. You want to keep the two services completely decoupled, but you need a way to invoke the image analysis as soon as an image is uploaded. How should this be done?\n"+
                    "\\begin{parts}\n"+
                    " \\part Change the mobile app to start a VM running the image analysis service and have that VM copy the file from storage into local storage on the VM. Have the image service run on the VM.\n"+
                    " \\part Write a function in Python that is invoked by Cloud Functions when a new image file is written to the Cloud Storage bucket that receives new images. The function should submit the URL of the uploaded file to the image analysis service. The image analysis service will then load the image from Cloud Storage, perform analysis, and generate results, which can be saved to Cloud Storage.\n"+
                    " \\part Have a Kubernetes cluster running continuously, with one pod dedicated to listing the contents of the upload bucket and detecting new files in Cloud Storage and another pod dedicated to running the image analysis software.\n"+
                    " \\part Have a Compute Engine VM running and continuously listing the contents of the upload bucket in Cloud Storage to detect new files. Another VM should be continually running the image analysis software.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your team is developing a new pipeline to analyze a stream of data from sensors on manufacturing devices. The old pipeline occasionally corrupted data because parallel threads overwrote data written by other threads. You decide to use Cloud Functions as  part of the pipeline. As a developer of a Cloud Function, what do you have to do to prevent multiple invocations of the function from interfering with each other?\n"+
                    "\\begin{parts}\n"+
                    " \\part Include a check in the code to ensure another invocation is not running at the same time.\n"+
                    " \\part Schedule each invocation to run in a separate process.\n"+
                    " \\part Schedule each invocation to run in a separate thread.\n"+
                    " \\part Nothing. GCP ensures that function invocations do not interfere with each other.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A client of yours processes personal and health information for hospitals. All health information needs to be protected according to government regulations. Your client wants to move their application to Google Cloud but wants to use the encryption library that they have used in the past. You suggest that all VMs running the application have the encryption library installed. Which kind of image would you use for that?\n"+
                    "\\begin{parts}\n"+
                    " \\part Custom image\n"+
                    " \\part Public image\n"+
                    " \\part CentOS 6 or 7\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What is the lowest level of the resource hierarchy?\n"+
                    "\\begin{parts}\n"+
                    " \\part Folder\n"+
                    " \\part Project\n"+
                    " \\part File\n"+
                    " \\part VM instance\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your company is seeing a marked increase in the rate of customer growth in Europe. Latency is becoming an issue because your application is running in us-central1. You suggest deploying your services to a region in Europe. You have several choices. You should consider all of the following factors except which one?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cost\n"+
                    " \\part Latency\n"+
                    " \\part Regulations\n"+
                    " \\part Reliability\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What role gives users full control over Compute Engine instances?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Manager role\n"+
                    " \\part Compute Admin role\n"+
                    " \\part Compute Manager role\n"+
                    " \\part Compute Security Admin\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following are limitations of a preemptible VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part Will be terminated within 24 hours.\n"+
                    " \\part May not always be available. Availability may vary across zones and regions.\n"+
                    " \\part Cannot migrate to a regular VM.\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Custom VMs can have up to how many vCPUs?\n"+
                    "\\begin{parts}\n"+
                    " \\part 16\n"+
                    " \\part 32\n"+
                    " \\part 64\n"+
                    " \\part 128\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When using the App Engine standard environment, which of the following language’s runtime is not supported?\n"+
                    "\\begin{parts}\n"+
                    " \\part Java\n"+
                    " \\part Python\n"+
                    " \\part C\n"+
                    " \\part Go\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Kubernetes reserves CPU resources in percentage of cores available. The percentage is what range?\n"+
                    "\\begin{parts}\n"+
                    " \\part 1 percent to 10 percent\n"+
                    " \\part 0.25 percent to 6 percent\n"+
                    " \\part 0.25 percent to 2 percent\n"+
                    " \\part 10 percent to 12 percent\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Kubernetes deployments can be in what states?\n"+
                    "\\begin{parts}\n"+
                    " \\part Progressing, stalled, completed\n"+
                    " \\part Progressing, completed, failed\n"+
                    " \\part Progressing, stalled, failed, completed\n"+
                    " \\part Progressing, stalled, running, failed, completed\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A client has brought you in to help reduce their DevOps overhead. Engineers are spending too much time patching servers and optimizing server utilization. They want to move to serverless platforms as much as possible. Your client has heard of Cloud Functions and wants to use them as much as possible. You recommend all of the following types of applications except which one?\n"+
                    "\\begin{parts}\n"+
                    " \\part Long-running data warehouse data load procedures\n"+
                    " \\part IoT backend processing\n"+
                    " \\part Mobile application event processing\n"+
                    " \\part Asynchronous workflows\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have just opened the GCP console at console.google.com. You have authenticated with the user you want to use. What is one of the first things you should do before performing tasks on VMs?\n"+
                    "\\begin{parts}\n"+
                    " \\part Open Cloud Shell.\n"+
                    " \\part Verify you can SSH into a VM.\n"+
                    " \\part Verify that the selected project is the one you want to work with.\n"+
                    " \\part Review the list of running VMs.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What is a one-time task you will need to complete before using the console?\n"+
                    "\\begin{parts}\n"+
                    " \\part Set up billing\n"+
                    " \\part Create a project\n"+
                    " \\part Create a storage bucket\n"+
                    " \\part Specify a default zone\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A colleague has asked for your assistance setting up a test environment in Google Cloud. They have never worked in GCP. You suggest starting with a single VM. Which of the following is the minimal set of information you will need?\n"+
                    "\\begin{parts}\n"+
                    " \\part A name for the VM and a machine type\n"+
                    " \\part A name for the VM, a machine type, a region, and a zone\n"+
                    " \\part A name for the VM, a machine type, a region, a zone, and a CIDR block\n"+
                    " \\part A name for the VM, a machine type, a region, a zone, and an IP address\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  An architect has suggested a particular machine type for your workload. You are in the console creating a VM and you don’t see the machine type in the list of available machine types. What could be the reason for this?\n"+
                    "\\begin{parts}\n"+
                    " \\part You have selected the incorrect subnet.\n"+
                    " \\part That machine type is not available in the zone you specified.\n"+
                    " \\part You have chosen an incompatible operating system.\n"+
                    " \\part You have not specified a correct memory configuration.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your manager asks for your help with understanding cloud computing costs. Your team runs dozens of VMs for three different applications. Two of the applications are for use by the marketing department and one is use by the finance department. Your manager wants a way to bill each department for the cost of the VMs used for their applications. What would you suggest to help solve this problem?\n"+
                    "\\begin{parts}\n"+
                    " \\part Access controls\n"+
                    " \\part Persistent disks\n"+
                    " \\part Labels and descriptions\n"+
                    " \\part Descriptions only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  If you wanted to set the preemptible property using Cloud Console, in which section of the Create An Instance page would you find the option?\n"+
                    "\\begin{parts}\n"+
                    " \\part Availability Policy\n"+
                    " \\part Identity And API Access\n"+
                    " \\part Sole Tenancy\n"+
                    " \\part Networking\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You need to set up a server with a high level of security. You want to be prepared in case  of attacks on your server by someone trying to inject a rootkit (a kind of malware that can alter the operating system). Which option should you select when creating a VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part Firewall\n"+
                    " \\part Shield VM\n"+
                    " \\part Project-wide SSH keys\n"+
                    " \\part Boot disk integrity check\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  All of the following parameters can be set when adding an additional disk through Google Cloud Console, except one. Which one?\n"+
                    "\\begin{parts}\n"+
                    " \\part Disk type\n"+
                    " \\part Encryption key management\n"+
                    " \\part Block size\n"+
                    " \\part Source image for the disk\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You lead a team of cloud engineers who maintain cloud resources for several departments in your company. You’ve noticed a problem with configuration drift. Some machine configurations are no longer in the same state as they were when created. You can’t find notes or documentation on how the changes were made or why. What practice would you implement to solve this problem?\n"+
                    "\\begin{parts}\n"+
                    " \\part Have all cloud engineers use only command-line interface in Cloud Shell.\n"+
                    " \\part Write scripts using gcloud commands to change configuration and store those scripts in a version control system.\n"+
                    " \\part Take notes when making changes to configuration and store them in Google Drive.\n"+
                    " \\part Limit privileges so only you can make changes so you will always know when and why configurations were changed.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When using the Cloud SDK command-line interface, which of the following is part of commands for administering resources in Compute Engine?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances\n"+
                    " \\part gcloud instances\n"+
                    " \\part gcloud instances compute\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A newly hired cloud engineer is trying to understand what VMs are running in a particular project. How could the engineer get summary information on each VM running in a project?\n"+
                    "\\begin{parts}\n"+
                    " \\part Execute the command gcloud compute list\n"+
                    " \\part Execute the command gcloud compute instances list\n"+
                    " \\part Execute the command gcloud instances list\n"+
                    " \\part Execute the command gcloud list instances\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When creating a VM using the command line, how should you specify labels for the VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use the --labels option with labels in the format of KEYS:VALUES.\n"+
                    " \\part Use the --labels option with labels in the format of KEYS=VALUE.\n"+
                    " \\part Use the --labels option with labels in the format of KEYS,VALUES.\n"+
                    " \\part This is not possible in the command line.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . In the boot disk advanced configuration, which operations can you specify when creating a new VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part Add a new disk, reformat an existing disk, attach an existing disk\n"+
                    " \\part Add a new disk and reformat an existing disk\n"+
                    " \\part Add a new disk and attach an existing disk\n"+
                    " \\part Reformat an existing disk and attach an existing disk\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have acquired a 10 GB data set from a third-party research firm. A group of data scientists would like to access this data from their statistics programs written in R. R works well with Linux and Windows file systems, and the data scientists are familiar with file operations in R. The data scientists would each like to have their own dedicated VM with the data available in the VM’s file system. What is a way to make this data readily available on a VM and minimize the steps the data scientists will have to take?\n"+
                    "\\begin{parts}\n"+
                    " \\part Store the data in Cloud Storage.\n"+
                    " \\part Create VMs using a source image created from a disk with the data on it.\n"+
                    " \\part Store the data in Google Drive.\n"+
                    " \\part Load the data into BigQuery.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . The Network tab of the create VM form is where you would perform which of the following operations?\n"+
                    "\\begin{parts}\n"+
                    " \\part Set the IP address of the VM\n"+
                    " \\part Add a network interface to the VM\n"+
                    " \\part Specify a default router\n"+
                    " \\part Change firewall configuration rules\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to create a VM using the gcloud command. What parameter would you include to specify the type of boot disk?\n"+
                    "\\begin{parts}\n"+
                    " \\part boot-disk-type\n"+
                    " \\part boot-disk\n"+
                    " \\part disk-type\n"+
                    " \\part type-boot-disk\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following commands will create a VM with four CPUs that is named web-server-1?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances create --machine-type=n1-standard-4 web-server-1\n"+
                    " \\part gcloud compute instances create --cpus=4 web-server-1\n"+
                    " \\part gcloud compute instances create --machine-type=n1-standard-4 –instance- name web-server-1\n"+
                    " \\part gcloud compute instances create --machine-type=n1-4-cpu web-server-1\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following commands will stop a VM named web-server-1?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances halt web-server-1\n"+
                    " \\part gcloud compute instances --terminate web-server1\n"+
                    " \\part gcloud compute instances stop web-server-1\n"+
                    " \\part gcloud compute stop web-server-1\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have just created an Ubuntu VM and want to log into the VM to install some software packages. Which network service would you use to access the VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part FTP\n"+
                    " \\part SSH\n"+
                    " \\part RDP\n"+
                    " \\part ipconfig\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your management team is considering three different cloud providers. You have been asked to summarize billing and cost information to help the management team compare cost structures between clouds. Which of the following would you mention about the cost of VMs in GCP?\n"+
                    "\\begin{parts}\n"+
                    " \\part VMs are billed in 1-second increments, cost varies with the number of CPUs and amount of memory in a machine type, you can create custom machine types, preemptible VMs cost up to 80 percent less than standard VMs, and Google offers discounts for sustained usage.\n"+
                    " \\part VMs are billed in 1-second increments and VMs can run up to 24 hours before they will be be shut down.\n"+
                    " \\part Google offers discounts for sustained usage in only some regions, cost varies with the number of CPUs and amount of memory in a machine type, you can create custom machine types, preemptible VMs cost up to 80 percent less than standard VMs.\n"+
                    " \\part VMs are charged for a minimum of 1 hour of use and cost varies with the number of CPUs and amount of memory in a machine type.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which page in Google Cloud Console would you use to create a single instance of a VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine\n"+
                    " \\part App Engine\n"+
                    " \\part Kubernetes Engine\n"+
                    " \\part Cloud Functions\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You view a list of Linux VM instances in the console. All have public IP addresses assigned. You notice that the SSH option is disabled for one of the instances. Why might that be the case?\n"+
                    "\\begin{parts}\n"+
                    " \\part The instance is preemptible and therefore does not support SSH.\n"+
                    " \\part The instance is stopped.\n"+
                    " \\part The instance was configured with the No SSH option.\n"+
                    " \\part The SSH option is never disabled.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have noticed unusually slow response time when issuing commands to a Linux server, and you decide to reboot the machine. Which command would you use in the console to reboot?\n"+
                    "\\begin{parts}\n"+
                    " \\part Reboot\n"+
                    " \\part Reset\n"+
                    " \\part Restart\n"+
                    " \\part Shutdown followed by Startup\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  In the console, you can filter the list of VM instances by which of the following?\n"+
                    "\\begin{parts}\n"+
                    " \\part Labels only\n"+
                    " \\part Member of managed instance group only\n"+
                    " \\part Labels, status, or members of managed instance group\n"+
                    " \\part Labels and status only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You will be building a number of machine learning models on an instance and attaching GPU to the instance. When you run your machine learning models they take an unusually long time to run. It appears that GPU is not being used. What could be the cause of this?\n"+
                    "\\begin{parts}\n"+
                    " \\part GPU libraries are not installed.\n"+
                    " \\part The operating system is based on Ubuntu.\n"+
                    " \\part You do not have at least eight CPUs in the instance.\n"+
                    " \\part There isn’t enough persistent disk space available.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you add a GPU to an instance, you must ensure that:\n"+
                    "\\begin{parts}\n"+
                    " \\part The instance is set to terminate during maintenance.\n"+
                    " \\part The instance is preemptible.\n"+
                    " \\part The instance does not have nonboot disks attached.\n"+
                    " \\part The instance is running Ubuntu 14.02 or later.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are using snapshots to save copies of a 100GB disk. You make a snapshot and then add 10GB of data. You create a second snapshot. How much storage is used in total for the two snapshots (assume no compression)?\n"+
                    "\\begin{parts}\n"+
                    " \\part 210 GB, with 100GB for the first and 110GB for the second\n"+
                    " \\part 110 GB, with 100GB for the first and 10GB for the second\n"+
                    " \\part 110 GB, with 110 for the second (the first snapshot is deleted automatically)\n"+
                    " \\part 221 GB, with 100GB for the first, 110GB for the second, plus 10 percent of the second snapshot (11 GB) for metadata overhead\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have decided to delegate the task of making backup snapshots to a member of your team. What role would you need to grant to your team member to create snapshots?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Image Admin\n"+
                    " \\part Storage Admin\n"+
                    " \\part Compute Snapshot Admin\n"+
                    " \\part Compute Storage Admin\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  The source of an image may be:\n"+
                    "\\begin{parts}\n"+
                    " \\part Only disks\n"+
                    " \\part Snapshots or disks only\n"+
                    " \\part Disks, snapshots, or another image\n"+
                    " \\part Disks, snapshots, or any database export file\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have built images using Ubuntu 14.04 and now want users to start using Ubuntu \n"+
                    "	16.04. You don’t want to just delete images based on Ubuntu 14.04, but you want users to know they should start using Ubuntu 16.04. What feature of images would you use to accomplish this?\n"+
                    "\\begin{parts}\n"+
                    "\\part Redirection\n"+
                    "\\part Deprecated\n"+
                    "\\part Unsupported\n"+
                    "\\part Migration\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to generate a list of VMs in your inventory and have the results in JSON format. What command would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances list\n"+
                    " \\part gcloud compute instances describe\n"+
                    " \\part gcloud compute instances list --format json\n"+
                    " \\part gcloud compute instances list --output json\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You would like to understand details of how GCP starts a virtual instance. Which optional parameter would you use when starting an instance to display those details?\n"+
                    "\\begin{parts}\n"+
                    " \\part --verbose\n"+
                    " \\part --async\n"+
                    " \\part --describe\n"+
                    " \\part --details\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which command will delete an instance named ch06-instance-3?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances delete instance=ch06-instance-3\n"+
                    " \\part gcloud compute instance stop ch06-instance-3\n"+
                    " \\part gcloud compute instances delete ch06-instance-3\n"+
                    " \\part gcloud compute delete ch06-instance-3\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are about to delete an instance named ch06-instance-1 but want to keep its boot disk. You do not want to keep other attached disks. What gcloud command would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances delete ch06-instance-1 ––keep-disks=boot\n"+
                    " \\part gcloud compute instances delete ch06-instance-1 ––save-disks=boot\n"+
                    " \\part gcloud compute instances delete ch06-instance-1 ––keep-disks=filesystem\n"+
                    " \\part gcloud compute delete ch06-instance-1 ––keep-disks=filesystem\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to view a list of fields you can use to sort a list of instances. What command would you use to see the field names?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances list\n"+
                    " \\part gcloud compute instances describe\n"+
                    " \\part gcloud compute instances list --detailed\n"+
                    " \\part gcloud compute instances describe --detailed\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are deploying an application that will need to scale and be highly available. Which of these Compute Engine components will help achieve scalability and high availability?\n"+
                    "\\begin{parts}\n"+
                    " \\part Preemptible instances\n"+
                    " \\part Instance groups\n"+
                    " \\part Cloud Storage\n"+
                    " \\part GPUs\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Before creating an instance group, you need to create what?\n"+
                    "\\begin{parts}\n"+
                    " \\part Instances in the instance group\n"+
                    " \\part Instance group template\n"+
                    " \\part Boot disk image\n"+
                    " \\part Source snapshot\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . How would you delete an instance group template using the command line?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances instance-template delete\n"+
                    " \\part glcoud compute instance-templates delete\n"+
                    " \\part gcloud compute delete instance-template\n"+
                    " \\part gcloud compute delete instance-templates\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What can be the basis for scaling up an instance group?\n"+
                    "\\begin{parts}\n"+
                    " \\part CPU utilization and operating system updates\n"+
                    " \\part Disk usage and CPU utilization only\n"+
                    " \\part Network latency, load balancing capacity, and CPU utilization\n"+
                    " \\part Disk usage and operating system updates only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . An architect is moving a legacy application to Google Cloud and wants to minimize the changes to the existing architecture while administering the cluster as a single entity. The legacy application runs on a load-balanced cluster that runs nodes with two different configurations. The two configurations are required because of design decisions made several years ago. The load on the application is fairly consistent, so there is rarely a need to scale up or down. What GCP Compute Engine resource would you recommended using?\n"+
                    "\\begin{parts}\n"+
                    " \\part Preemptible instances\n"+
                    " \\part Unmanaged instance groups\n"+
                    " \\part Managed instance groups\n"+
                    " \\part GPUs\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A new engineer is asking for clarification about when it is best to use Kubernetes and when to use instance groups. You point out that Kubernetes uses instance groups. What purpose do instance groups play in a Kubernetes cluster?\n"+
                    "\\begin{parts}\n"+
                    " \\part They monitor the health of instances.\n"+
                    " \\part They create pods and deployments.\n"+
                    " \\part They create sets of VMs that can be managed as a unit.\n"+
                    " \\part They create alerts and notification channels.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What kinds of instances are required to have a Kubernetes cluster?\n"+
                    "\\begin{parts}\n"+
                    " \\part A cluster master and nodes to execute workloads.\n"+
                    " \\part A cluster master, nodes to execute workloads, and Stackdriver nodes to monitor node health.\n"+
                    " \\part Kubernetes nodes; all instances are the same.\n"+
                    " \\part Instances with at least four vCPUs.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What is a pod in Kubernetes?\n"+
                    "\\begin{parts}\n"+
                    " \\part A set of containers\n"+
                    " \\part Application code deployed in a Kubernetes cluster\n"+
                    " \\part A single instance of a running process in a cluster\n"+
                    " \\part A controller that manages communication between clients and Kubernetes services\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have developed an application that calls a service running in a Kubernetes cluster. The service runs in pods that can be terminated if they are unhealthy and replaced with other pods that might have a different IP address. How should you code your application to ensure it functions properly in this situation?\n"+
                    "\\begin{parts}\n"+
                    " \\part Query Kubernetes for a list of IP addresses of pods running the service you use.\n"+
                    " \\part Communicate with Kubernetes services so applications do not have to be coupled to specific pods.\n"+
                    " \\part Query Kubernetes for a list of pods running the service you use.\n"+
                    " \\part Use a gcloud command to get the IP addresses needed.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have noticed that an application’s performance has degraded significantly. You have recently made some configuration changes to resources in your Kubernetes cluster and suspect that those changes have alerted the number of pods running in the cluster. Where would you look for details on the number of pods that should be running?\n"+
                    "\\begin{parts}\n"+
                    " \\part Deployments\n"+
                    " \\part Stackdriver\n"+
                    " \\part ReplicaSet\n"+
                    " \\part Jobs\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are deploying a high availability application in Kubernetes Engine. You want to maintain availability even if there is a major network outage in a data center. What feature of Kubernetes Engine would you employ?\n"+
                    "\\begin{parts}\n"+
                    " \\part Multiple instance groups\n"+
                    " \\part Multizone/region  cluster\n"+
                    " \\part Regional deployments\n"+
                    " \\part Load balancing\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to write a script to deploy a Kubernetes cluster with GPUs. You have deployed clusters before, but you are not sure about all the required parameters. You need to deploy this script as quickly as possible. What is one way to develop this script quickly?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use the GPU template in the Kubernetes Engine cloud console to generate the gcloud "+
                    "and to create the cluster\n"+
                    " \\part Search the Web for a script\n"+
                    " \\part Review the documentation on gcloud parameters for adding GPUs\n"+
                    " \\part Use an existing script and add parameters for attaching GPUs\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What gcloud command will create a cluster named ch07-cluster-1 with four nodes?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud beta container clusters create ch07-cluster-1 --num-nodes=4\n"+
                    " \\part gcloud container beta clusters create ch07-cluster-1 --num-nodes=4\n"+
                    " \\part gcloud container clusters create ch07-cluster-1 --num-nodes=4\n"+
                    " \\part gcloud beta container clusters create ch07-cluster-1 4\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When using Create Deployment from Cloud Console, which of the following cannot be specified for a deployment?\n"+
                    "\\begin{parts}\n"+
                    " \\part Container image\n"+
                    " \\part Application name\n"+
                    " \\part Time to live (TTL)\n"+
                    " \\part Initial command\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Deployment configuration files created in Cloud Console use what type of file format?\n"+
                    "\\begin{parts}\n"+
                    " \\part CSV\n"+
                    " \\part YAML\n"+
                    " \\part TSV\n"+
                    " \\part JSON\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What command is used to run a Docker image on a cluster?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud container run\n"+
                    " \\part gcloud beta container run\n"+
                    " \\part kubectl run\n"+
                    " \\part kubectl beta run\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What command would you use to have 10 replicas of a deployment named "+ "-app-deploy?\n"+
                    "\\begin{parts}\n"+
                    " \\part kubectl upgrade deployment ch07-app-deploy --replicas=5\n"+
                    " \\part gcloud containers deployment ch07-app-deploy --replicas=5\n"+
                    " \\part kubectl scale deployment ch07-app-deploy --replicas=10\n"+
                    " \\part kubectl scale deployment ch07-app-deploy --pods=5\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Stackdriver is used for what operations on Kubernetes clusters?\n"+
                    "\\begin{parts}\n"+
                    " \\part Notifications only\n"+
                    " \\part Monitoring and notifications only\n"+
                    " \\part Logging only\n"+
                    " \\part Notifications, monitoring, and logging\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Before monitoring a Kubernetes cluster, what must you create with Stackdriver?\n"+
                    "\\begin{parts}\n"+
                    " \\part Log\n"+
                    " \\part Workspace\n"+
                    " \\part Pod\n"+
                    " \\part ReplicaSet\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What kind of information is provided in the Details page about an instance in Stackdriver?\n"+
                    "\\begin{parts}\n"+
                    " \\part CPU usage only\n"+
                    " \\part Network traffic only\n"+
                    " \\part Disk I/O, CPU usage, and network traffic\n"+
                    " \\part CPU usage and disk I/O\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When creating an alerting policy, what can be specified?\n"+
                    "\\begin{parts}\n"+
                    " \\part Conditions, notifications, and time to live\n"+
                    " \\part Conditions, notifications, and documentation\n"+
                    " \\part Conditions only\n"+
                    " \\part Conditions, documentation, and time to live\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your development team needs to be notified if there is a problem with applications running on several Kubernetes clusters. Different team members prefer different notification methods in addition to Stackdriver alerting. What is the most efficient way to send notifications and meet your team’s requests?\n"+
                    "\\begin{parts}\n"+
                    " \\part Set up SMS text messaging, Slack, and email notifications on an alert.\n"+
                    " \\part Create a separate alert for each notification channel.\n"+
                    " \\part Create alerts with email notifications and have those notification emails forwarded to other notification systems.\n"+
                    " \\part Use a single third-party notification mechanism.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A new engineer is trying to set up alerts for a Kubernetes cluster. The engineer seems to be creating a large number of alerts and you are concerned this is not the most efficient way and will lead to more maintenance work than required. You explain that a more efficient way is to create alerts and apply them to what?\n"+
                    "\\begin{parts}\n"+
                    " \\part One instance only\n"+
                    " \\part An instance or entire group\n"+
                    " \\part A group only\n"+
                    " \\part A pod\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are attempting to execute commands to initiate a deployment on a Kubernetes cluster. The commands are not having any effect. You suspect that a Kubernetes component is not functioning correctly. What component could be the problem?\n"+
                    "\\begin{parts}\n"+
                    " \\part The Kubernetes API\n"+
                    " \\part A StatefulSet\n"+
                    " \\part Cloud SDK gcloud commands\n"+
                    " \\part ReplicaSet\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have deployed an application to a Kubernetes cluster. You have noticed that several pods are starved for resources for a period of time and the pods are shut down. When resources are available, new instantiations of those pods are created. Clients are still able to connect to pods even though the new pods have different IP addresses from the pods that were terminated. What Kubernetes component makes this possible?\n"+
                    "\\begin{parts}\n"+
                    " \\part Services\n"+
                    " \\part ReplicaSet\n"+
                    " \\part Alerts\n"+
                    " \\part StatefulSet\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are running several microservices in a Kubernetes cluster. You’ve noticed some performance degradation. After reviewing some logs, you begin to think the cluster may be improperly configured, and you open Cloud Console to investigate. How do you see the details of a specific cluster?\n"+
                    "\\begin{parts}\n"+
                    " \\part Type the cluster name into the search bar.\n"+
                    " \\part Click the cluster name.\n"+
                    " \\part Use the gcloud cluster details command.\n"+
                    " \\part None of the above.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are viewing the details of a cluster in Cloud Console and want to see how many vCPUs are available in the cluster. Where would you look for that information?\n"+
                    "\\begin{parts}\n"+
                    " \\part Node Pools section of the Cluster Details page\n"+
                    " \\part Labels section of the Cluster Details page\n"+
                    " \\part Summary line of the Cluster Listing page\n"+
                    " \\part A and C\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been assigned to help diagnose performance problems with applications running on several Kubernetes clusters. The first thing you want to do is understand, at a high level, the characteristics of the clusters. Which command should you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud container list\n"+
                    " \\part gcloud container clusters list\n"+
                    " \\part gcloud clusters list\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you first try to use the kubectl command, you get an error message indicating that the resource cannot be found or you cannot connect to the cluster. What command would you use to try to eliminate the error?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud container clusters access\n"+
                    " \\part gdcloud container clusters get-credentials\n"+
                    " \\part gcloud auth container\n"+
                    " \\part gcloud auth container clusters\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  An engineer recently joined your team and is not aware of your team’s standards for creating clusters and other Kubernetes objects. In particular, the engineer has not properly labeled several clusters. You want to modify the labels on the cluster from Cloud Console. How would you do it?\n"+
                    "\\begin{parts}\n"+
                    " \\part Click the Connect button.\n"+
                    " \\part Click the Deploy menu option.\n"+
                    " \\part Click the Edit menu option.\n"+
                    " \\part Type the new labels in the Labels section.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You receive a page in the middle of the night informing you that several services running on a Kubernetes cluster have high latency when responding to API requests. You review monitoring data and determine that there are not enough resources in the cluster to keep up with the load. You decide to add six more VMs to the cluster. What parameters will you need to specify when you issue the cluster resize command?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cluster size\n"+
                    " \\part Cluster name\n"+
                    " \\part Node pool name\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to modify the number of pods in a cluster. What is the best way to do that?\n"+
                    "\\begin{parts}\n"+
                    " \\part Modify pods directly\n"+
                    " \\part Modify deployments\n"+
                    " \\part Modify node pools directly\n"+
                    " \\part Modify nodes\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to see a list of deployments. Which option from the Kubernetes Engine navigation menu would you select?\n"+
                    "\\begin{parts}\n"+
                    " \\part Clusters\n"+
                    " \\part Storage\n"+
                    " \\part Workloads\n"+
                    " \\part Deployments\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What actions are available from the Actions menu when viewing deployment details?\n"+
                    "\\begin{parts}\n"+
                    " \\part Scale and Autoscale only\n"+
                    " \\part Autoscale, Expose, and Rolling Update\n"+
                    " \\part Add, Modify, and Delete\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What is the command to list deployments from the command line?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud container clusters list-deployments\n"+
                    " \\part gcloud container clusters list\n"+
                    " \\part kubectl get deployments\n"+
                    " \\part kubectl deployments list\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What parameters of a deployment can be set in the Create Deployment page in Cloud Console?\n"+
                    "\\begin{parts}\n"+
                    " \\part Container image\n"+
                    " \\part Cluster name\n"+
                    " \\part Application name\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Where can you view a list of services when using Cloud Console?\n"+
                    "\\begin{parts}\n"+
                    " \\part In the Deployment Details page\n"+
                    " \\part In the Container Details page\n"+
                    " \\part In the Cluster Details page\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What kubectl command is used to add a service?\n"+
                    "\\begin{parts}\n"+
                    " \\part run\n"+
                    " \\part start\n"+
                    " \\part initiate\n"+
                    " \\part deploy\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are supporting machine learning engineers who are testing a series of classifiers. They have five classifiers, called ml-classifier-1, ml-classifier-2, etc. They have found that ml-classifier-3 is not functioning as expected and they would like it removed from the cluster. What would you do to delete a service called ml-classifier-3?\n"+
                    "\\begin{parts}\n"+
                    " \\part Run the command kubectl delete service ml-classifier-3.\n"+
                    " \\part Run the command kubectl delete ml-classifier-3.\n"+
                    " \\part Run the command gcloud service delete ml-classifier-3.\n"+
                    " \\part Run the command gcloud container service delete ml-classifier-3.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What service is responsible for managing container images?\n"+
                    "\\begin{parts}\n"+
                    " \\part Kubernetes Engine\n"+
                    " \\part Compute Engine\n"+
                    " \\part Container Registry\n"+
                    " \\part Container Engine\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What command is used to list container images in the command line?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud container images list\n"+
                    " \\part gcloud container list images\n"+
                    " \\part kubectl list container images\n"+
                    " \\part kubectl container list images\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A data warehouse designer wants to deploy an extraction, transformation, and load process to Kubernetes. The designer provided you with a list of libraries that should be installed, including drivers for GPUs. You have a number of container images that you think may meet the requirements. How could you get a detailed description of each of those containers?\n"+
                    "\\begin{parts}\n"+
                    " \\part Run the command gcloud container images list details.\n"+
                    " \\part Run the command gcloud container images describe.\n"+
                    " \\part Run the command gcloud image describe.\n"+
                    " \\part Run the command gcloud container describe.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have just created a deployment and want applications outside the cluster to have access to the services provided by the deployment. What do you need to do to the service?\n"+
                    "\\begin{parts}\n"+
                    " \\part Give it a public IP address.\n"+
                    " \\part Issue a kubectl expose deployment command.\n"+
                    " \\part Issue a gcloud expose deployment command.\n"+
                    " \\part Nothing, making it accessible must be done at the cluster level.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have deployed an application to a Kubernetes cluster that processes sensor data from a fleet of delivery vehicles. The volume of incoming data depends on the number of vehicles making deliveries. The number of vehicles making deliveries is dependent on the number of customer orders. Customer orders are high during daytime hours, holiday seasons, and when major advertising campaigns are run. You want to make sure you have enough nodes\n"+
                    "ing to handle the load, but you want to keep your costs down. How should you configure your Kubernetes cluster?\n"+
                    "\\begin{parts}\n"+
                    " \\part Deploy as many nodes as your budget allows.\n"+
                    " \\part Enable autoscaling.\n"+
                    " \\part Monitor CPU, disk, and network utilization and add nodes as necessary.\n"+
                    " \\part Write a script to run gcloud commands to add and remove nodes when peaks usually start and end, respectively.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When using Kubernetes Engine, which of the following might a cloud engineer need to configure?\n"+
                    "\\begin{parts}\n"+
                    " \\part Nodes, pods, services, and clusters only\n"+
                    " \\part Nodes, pods, services, clusters, and container images\n"+
                    " \\part Nodes, pods, clusters, and container images only\n"+
                    " \\part Pods, services, clusters, and container images only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have designed a microservice that you want to deploy to production. Before it can be deployed, you have to review how you will manage the service lifecycle. The architect is particularly concerned about how you will deploy updates to the service with minimal disruption. What aspect of App Engine components would you use to minimize disruptions during updates to the service?\n"+
                    "\\begin{parts}\n"+
                    " \\part Services\n"+
                    " \\part Versions\n"+
                    " \\part Instance groups\n"+
                    " \\part Instances\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You’ve just released an application running in App Engine Standard. You notice that there are peak demand periods in which you need up to 12 instances, but most of the time 5 instances are sufficient. What is the best way to ensure that you have enough instances to meet demand without spending more than you have to?\n"+
                    "\\begin{parts}\n"+
                    " \\part Configure your app for autoscaling and specify max instances of 12 and min instances of 5.\n"+
                    " \\part Configure your app for basic scaling and specify max instances of 12 and min instances of 5.\n"+
                    " \\part Create a cron job to add instances just prior to peak periods and remove instances after the peak period is over.\n"+
                    " \\part Configure your app for instance detection and do not specify a max or minimum number of instances.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  In the hierarchy of App Engine components, what is the lowest-level component?\n"+
                    "\\begin{parts}\n"+
                    " \\part Application\n"+
                    " \\part Instance\n"+
                    " \\part Version\n"+
                    " \\part Service\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What command should you use to deploy an App Engine app from the command line?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud components app deploy\n"+
                    " \\part gcloud app deploy\n"+
                    " \\part gcloud components instances deploy\n"+
                    " \\part gcloud app instance deploy\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have deployed a Django 1.5 Python application to App Engine. This version of Django requires Python 3. For some reason, App Engine is trying to run the application using Python 2. What file would you check and possibly modify to ensure that Python 3 is used with this application?\n"+
                    "\\begin{parts}\n"+
                    " \\part app.config\n"+
                    " \\part app.yaml\n"+
                    " \\part services.yaml\n"+
                    " \\part deploy.yaml\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have several App Engine apps you plan to deploy from your project. What have you failed to account for in this design?\n"+
                    "\\begin{parts}\n"+
                    " \\part App Engine only supports one app per project.\n"+
                    " \\part App Engine only supports two apps per project.\n"+
                    " \\part App Engine apps exist outside of projects.\n"+
                    " \\part Nothing, this is a common pattern.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  The latest version of your microservice code has been approved by your manager, but the product owner does not want the new features released until a press release is published. You’d like to get the code out but not expose it to customers. What is the best way to get the code out as soon as possible without exposing it to customers?\n"+
                    "\\begin{parts}\n"+
                    " \\part Deploy with gcloud app deploy --no-traffic.\n"+
                    " \\part Write a cron job to deploy after the press release is published.\n"+
                    " \\part Deploy with gcloud app deploy --no-promote.\n"+
                    " \\part Deploy as normal after the press release is published.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have just deployed an app that hosts services that provide the current time in any time zone. The project containing the code is called current-time-zone, the service providing the user interface is called time-zone-ui, and the service performing the calculation is called time-zone-calculate. What is the URL where a user could find your service?\n"+
                    "\\begin{parts}\n"+
                    " \\part current-time-zone.appengine.com\n"+
                    " \\part current-time-zone.appspot.com\n"+
                    " \\part time-zone-ui.appspot.com\n"+
                    " \\part time-zone-calculate.appspot.com\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are concerned that as users make connections to your application, the performance will degrade. You want to make sure that more instances are added to your App Engine application when there are more than 20 concurrent requests. What parameter would you specify in app.yaml?\n"+
                    "\\begin{parts}\n"+
                    " \\part max-concurrent-requests\n"+
                    " \\part target-throughput-utilization\n"+
                    " \\part max-instances\n"+
                    " \\part max-pending-latency\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What parameters can be configured with basic scaling?\n"+
                    "\\begin{parts}\n"+
                    " \\part max instances and min instances\n"+
                    " \\part idle timeout and min instances\n"+
                    " \\part idle timeout and max instances\n"+
                    " \\part idle timeout and target throughput utilization\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . The runtime parameter in app.yaml is used to specify what?\n"+
                    "\\begin{parts}\n"+
                    " \\part The script to execute\n"+
                    " \\part The URL to access the application\n"+
                    " \\part The language runtime environment\n"+
                    " \\part The maximum time an application can run\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What are the two kinds of instances available in App Engine Standard?\n"+
                    "\\begin{parts}\n"+
                    " \\part Resident and dynamic\n"+
                    " \\part Persistent and dynamic\n"+
                    " \\part Stable and dynamic\n"+
                    " \\part Resident and nonresident\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You work for a startup, and costs are a major concern. You are willing to take a slight performance hit if it will save you money. How should you configure the scaling for your apps running in App Engine?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use dynamic instances by specifying autoscaling or basic scaling.\n"+
                    " \\part Use resident instances by specifying autoscaling or basic scaling.\n"+
                    " \\part Use dynamic instances by specifying manual scaling.\n"+
                    " \\part Use resident instances by specifying manual scaling.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A team of developers has created an optimized version of a service. This should run 30 percent faster in most cases. They want to roll it out to all users immediately, but you are concerned that the substantial changes need to be released slowly in case there are significant bugs. What can you do to allocate some users to the new version without exposing all users to it?\n"+
                    "\\begin{parts}\n"+
                    " \\part Issue the command gcloud app services set-traffic.\n"+
                    " \\part Issue the command gcloud instances services set-traffic.\n"+
                    " \\part Issue the command gcloud app set-traffic.\n"+
                    " \\part Change the target IP address of the service for some clients.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What parameter to gcloud app services set-traffic is used to specify the method to use when splitting traffic?\n"+
                    "\\begin{parts}\n"+
                    " \\part ––split-traffic\n"+
                    " \\part ––split-by\n"+
                    " \\part ––traffic-split\n"+
                    " \\part ––split-method\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What parameter to gcloud app services set-traffic is used to specify the percentage of traffic that should go to each instance?\n"+
                    "\\begin{parts}\n"+
                    " \\part ––split-by\n"+
                    " \\part ––splits\n"+
                    " \\part ––split-percent\n"+
                    " \\part ––percent-split\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have released a new version of a service. You have been waiting for approval from the product manager to start sending traffic to the new version. You get approval to route traffic to the new version. What parameter to gcloud app services set-traffic is used to specify that traffic should be moved to a newer version of the app?\n"+
                    "\\begin{parts}\n"+
                    " \\part ––move-to-new\n"+
                    " \\part ––migrate-to-new\n"+
                    " \\part ––migrate\n"+
                    " \\part ––move\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . The status of what components can be viewed in the App Engine console?\n"+
                    "\\begin{parts}\n"+
                    " \\part Services only\n"+
                    " \\part Versions only\n"+
                    " \\part Instances and versions\n"+
                    " \\part Services, versions, and instances\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What are valid methods for splitting traffic?\n"+
                    "\\begin{parts}\n"+
                    " \\part By IP address only\n"+
                    " \\part By HTTP cookie only\n"+
                    " \\part Randomly and by IP address only\n"+
                    " \\part By IP address, HTTP cookies, and randomly\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What is the name of the cookie used by App Engine when cookie-based splitting is used?\n"+
                    "\\begin{parts}\n"+
                    " \\part GOOGID\n"+
                    " \\part GOOGAPPUID\n"+
                    " \\part APPUID\n"+
                    " \\part UIDAPP\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A product manager is proposing a new application that will require several backend services, three business logic services, and access to relational databases. Each service will provide a single function, and it will require several of these services to complete a business task. Service execution time is dependent on the size of input and is expected to take up to 30 minutes in some cases. Which GCP product is a good serverless option for running this related service?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Functions\n"+
                    " \\part Compute Engine\n"+
                    " \\part App Engine\n"+
                    " \\part Cloud Storage\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been asked to deploy a cloud function to reformat image files as soon as they are uploaded to Cloud Storage. You notice after a few hours that about 10 percent of the files are not processed correctly. After reviewing the files that failed, you realize they are all substantially larger than average. What could be the cause of the failures?\n"+
                    "\\begin{parts}\n"+
                    " \\part There is a syntax error in the function code.\n"+
                    " \\part The wrong runtime was selected.\n"+
                    " \\part The timeout is too low to allow enough time to process large files.\n"+
                    " \\part There is a permissions error on the Cloud Storage bucket containing the files.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When an action occurs in GCP, such as a file being written to Cloud Storage or a message being added to a Cloud Pub/Sub topic, that action is called what?\n"+
                    "\\begin{parts}\n"+
                    " \\part An incident\n"+
                    " \\part An event\n"+
                    " \\part A trigger\n"+
                    " \\part A log entry\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  All of the following generate events that can be triggered using Cloud Functions, except which one?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Storage\n"+
                    " \\part Cloud Pub/Sub\n"+
                    " \\part SSL\n"+
                    " \\part Firebase\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which runtimes are supported in Cloud Functions?\n"+
                    "\\begin{parts}\n"+
                    " \\part Node.js 5, Node.js 6, and Node.js 8\n"+
                    " \\part Node.js 8, Python, and Go\n"+
                    " \\part Node.js 6, Node.js 8, and Python\n"+
                    " \\part Node.js 8, Python, and Go\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  An HTTP trigger can be invoked by making a request using which of the following?\n"+
                    "\\begin{parts}\n"+
                    " \\part GET only\n"+
                    " \\part POST and GET only\n"+
                    " \\part DELETE, POST, and GET\n"+
                    " \\part DELETE, POST, REVISE, and GET\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What types of events are available to Cloud Functions working with Cloud Storage?\n"+
                    "\\begin{parts}\n"+
                    " \\part Upload or finalize and delete only\n"+
                    " \\part Upload or finalize, delete, and list only\n"+
                    " \\part Upload or finalize, delete, and metadata update only\n"+
                    " \\part Upload or finalize, delete, metadata update, and archive\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are tasked with designing a function to execute in Cloud Functions. The function will need more than the default amount of memory and should be applied only when a finalize event occurs after a file is uploaded to Cloud Storage. The function should only apply its logic to files with a standard image file type. Which of the following required features cannot be specified in a parameter and must be implemented in the function code?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud function name\n"+
                    " \\part Memory allocated for the function\n"+
                    " \\part File type to apply the function to\n"+
                    " \\part Event type\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  How much memory can be allocated to a Cloud Function?\n"+
                    "\\begin{parts}\n"+
                    " \\part 128MB  to 256MB\n"+
                    " \\part 128MB to 512MB\n"+
                    " \\part 128MB to 1GB\n"+
                    " \\part 128MB  to 2GB\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . How long can a cloud function run by default before timing out?\n"+
                    "\\begin{parts}\n"+
                    " \\part 30 seconds\n"+
                    " \\part 1 minute\n"+
                    " \\part 9 minutes\n"+
                    " \\part 20 minutes\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to use the command line to manage Cloud Functions that will be written in Python. In addition to running the gcloud components update command, what command should you run to ensure you can work with Python functions?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud component install\n"+
                    " \\part gcloud components install beta\n"+
                    " \\part gcloud components install python\n"+
                    " \\part gcloud functions install beta\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to create a cloud function to transform audio files into different formats. The audio files will be uploaded into Cloud Storage. You want to start transformations as soon as the files finish uploading. Which trigger would you specify in the cloud function to cause it to execute after the file is uploaded?\n"+
                    "\\begin{parts}\n"+
                    " \\part google.storage.object.finalize\n"+
                    " \\part google.storage.object.upload\n"+
                    " \\part google.storage.object.archive\n"+
                    " \\part google.storage.object.metadataUpdate\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are defining a cloud function to write a record to a database when a file in Cloud Storage is archived. What parameters will you have to set when creating that function?\n"+
                    "\\begin{parts}\n"+
                    " \\part runtime only\n"+
                    " \\part trigger-resource only\n"+
                    " \\part runtime, trigger-resource, trigger-event only\n"+
                    " \\part runtime, trigger-resource, trigger-event,  file-type\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You’d like to stop using a cloud function and delete it from your project. Which command would you use from the command line to delete a cloud function?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud functions delete\n"+
                    " \\part gcloud components function delete\n"+
                    " \\part gcloud components delete\n"+
                    " \\part gcloud delete functions\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have been asked to deploy a cloud function to work with Cloud Pub/Sub. As you review the Python code, you notice a reference to a Python function called base64.b64decode. Why would a decode function be required in a Pub/Sub cloud function?\n"+
                    "\\begin{parts}\n"+
                    " \\part It’s not required and should not be there.\n"+
                    " \\part Messages in Pub/Sub topics are encoded to allow binary data to be used in places where text data is expected. Messages need to be decoded to access the data in the message.\n"+
                    " \\part It is required to add padding characters to the end of the message to make all messages the same length.\n"+
                    " \\part The decode function maps data from a dictionary data structure to a list data structure.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of these commands will deploy a Python cloud function called pub-sub-function-test?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud functions deploy pub-sub-function-test \n"+
                    " \\part gcloud functions deploy pub-sub-function-test --runtime python37\n"+
                    " \\part gcloud functions deploy pub-sub-function-test --runtime python37 --trigger-topic gcp-ace-exam-test-topic \n" +
                    " \\part gcloud functions deploy pub-sub-function-test --runtime python --trigger-topic gcp-ace-exam-test-topic \n" +
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When specifying a Cloud Storage cloud function, you have to specify an event type, such as finalize, delete, or archive. When specifying a Cloud Pub/Sub cloud function, you do not have to specify an event type. Why is this the case?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Pub/Sub does not have triggers for event types.\n"+
                    " \\part Cloud Pub/Sub has triggers on only one event type, when a message is published.\n"+
                    " \\part Cloud Pub/Sub determines the correct event type by analyzing the function code.\n"+
                    " \\part The statement in the question is incorrect; you do have to specify an event type with Cloud Pub/Sub functions.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your company has a web application that allows job seekers to upload résumé files. Some files are in Microsoft Word, some are PDFs, and others are text files. You would like to  store all résumés as PDFs. How could you do this in a way that minimizes the time between upload and conversion and with minimal amounts of coding?\n"+
                    "\\begin{parts}\n"+
                    " \\part Write an App Engine application with multiple services to convert all documents to PDF.\n"+
                    " \\part Implement a Cloud Function on Cloud Storage to execute on a finalize event. The function checks the file type, and if it is not PDF, the function calls a PDF converter function and writes the PDF version to the bucket that has the original.\n"+
                    " \\part Add the names of all files to a Cloud Pub/Sub topic and have a batch job run at regular intervals to convert the original files to PDF.\n"+
                    " \\part Implement a Cloud Function on Cloud Pub/Sub to execute on a finalize event. The function checks the file type, and if it is not PDF, the function calls a PDF converter function and writes the PDF version to the bucket that has the original.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What are options for uploading code to a cloud function?\n"+
                    "\\begin{parts}\n"+
                    " \\part Inline editor\n"+
                    " \\part Zip upload\n"+
                    " \\part Cloud source repository\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What type of trigger allows developers to use HTTP POST, GET, and PUT calls to invoke a cloud function?\n"+
                    "\\begin{parts}\n"+
                    " \\part HTTP\n"+
                    " \\part Webhook\n"+
                    " \\part Cloud HTTP\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are tasked with defining lifecycle configurations on buckets in Cloud Storage. You  need to consider all possible options for transitioning from one storage class to another. All of the following transitions are allowed except for one. Which one is that?\n"+
                    "\\begin{parts}\n"+
                    " \\part Nearline to coldline\n"+
                    " \\part Regional to nearline\n"+
                    " \\part Multiregional to coldline\n"+
                    " \\part Regional to multiregional\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your manager has asked for your help in reducing Cloud Storage charges. You know that some of the files stored in Cloud Storage are rarely accessed. What kind of storage would you recommend for those files?\n"+
                    "\\begin{parts}\n"+
                    " \\part Nearline\n"+
                    " \\part Regional\n"+
                    " \\part Coldline\n"+
                    " \\part Multiregional\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are working with a startup developing analytics software for IoT data. You have to be able to ingest large volumes of data consistently and store it for several months. The startup has several applications that will need to query this data. Volumes are expected to grow to petabyte volumes. Which database should you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Spanner\n"+
                    " \\part Bigtable\n"+
                    " \\part BigQuery\n"+
                    " \\part Datastore\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A software developer on your team is asking for your help improving the query performance of a database application. The developer is using a Cloud SQL MySQL, Second Generation instance. Which options would you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part Memorystore and SSD persistent disks\n"+
                    " \\part Memorystore and HDD persistent disks\n"+
                    " \\part Datastore and SSD persistent disks\n"+
                    " \\part Datastore and HDD persistent disks\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are creating a set of persistent disks to store data for exploratory data analysis. The disks will be mounted on a virtual machine in the us-west2-a zone. The data is historical data retrieved from Cloud Storage. The data analysts do not need peak performance\n"+
                    "are more concerned about cost than performance. The data will be stored in a local relational database. Which type of storage would you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part SSDs\n"+
                    " \\part HDDs\n"+
                    " \\part Datastore\n"+
                    " \\part Bigtable\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which of the following statements about Cloud Storage is not true?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Storage buckets can have retention periods.\n"+
                    " \\part Lifecycle configurations can be used to change storage class from regional to multiregional.\n"+
                    " \\part Cloud Storage does not provide block-level access to data within files stored in buckets.\n"+
                    " \\part Cloud Storage is designed for high durability.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When using versioning on a bucket, what is the latest version of the object called?\n"+
                    "\\begin{parts}\n"+
                    " \\part Live version\n"+
                    " \\part Top version\n"+
                    " \\part Active version\n"+
                    " \\part Safe version\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A product manager has asked for your advice on which database services might be options for a new application. Transactions and support for tabular data are important. Ideally, the database would support common query tools. What databases would you recommend the product manager consider?\n"+
                    "\\begin{parts}\n"+
                    " \\part BigQuery and Spanner\n"+
                    " \\part Cloud SQL and Spanner\n"+
                    " \\part Cloud SQL and Bigtable\n"+
                    " \\part Bigtable and Spanner\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  The Cloud SQL service provides fully managed relational databases. What two types of databases are available in Cloud SQL?\n"+
                    "\\begin{parts}\n"+
                    " \\part SQL Server and MySQL\n"+
                    " \\part SQL Server and PostgreSQL\n"+
                    " \\part PostgreSQL and MySQL\n"+
                    " \\part MySQL and Oracle\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following Cloud Spanner configurations would have the highest hourly cost?\n"+
                    "\\begin{parts}\n"+
                    " \\part Located in us-central1\n"+
                    " \\part Located in nam3\n"+
                    " \\part Located in us-west1-a\n"+
                    " \\part Located in nam-eur-asia1\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following are database services that do not require you to specify configuration information for VMs?\n"+
                    "\\begin{parts}\n"+
                    " \\part BigQuery only\n"+
                    " \\part Datastore only\n"+
                    " \\part Firebase and Datastore\n"+
                    " \\part BigQuery, Datastore, and Firebase\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What kind of data model is used by Datastore?\n"+
                    "\\begin{parts}\n"+
                    " \\part Relational\n"+
                    " \\part Document\n"+
                    " \\part Wide-column\n"+
                    " \\part Graph\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have been tasked with creating a data warehouse for your company. It must support tens of petabytes of data and use SQL for a query language. Which managed database service would you choose?\n"+
                    "\\begin{parts}\n"+
                    " \\part BigQuery\n"+
                    " \\part Bigtable\n"+
                    " \\part Cloud SQL\n"+
                    " \\part SQL Server\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A team of mobile developers is developing a new application. It will require synchronizing data between mobile devices and a backend database. Which database service would you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part BigQuery\n"+
                    " \\part Firestore\n"+
                    " \\part Spanner\n"+
                    " \\part Bigtable\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A product manager is considering a new set of features for an application that will require additional storage. What features of storage would you suggest the product manager consider?\n"+
                    "\\begin{parts}\n"+
                    " \\part Read and write patterns only\n"+
                    " \\part Cost only\n"+
                    " \\part Consistency and cost only\n"+
                    " \\part None, they are all relevant considerations.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What is the maximum size of a Memorystore cache?\n"+
                    "\\begin{parts}\n"+
                    " \\part 100GB\n"+
                    " \\part 300GB\n"+
                    " \\part 400GB\n"+
                    " \\part 50GB\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Once a bucket has its storage class set to coldline, what are other storage classes it can transition to?\n"+
                    "\\begin{parts}\n"+
                    " \\part Regional\n"+
                    " \\part Nearline\n"+
                    " \\part Multi-regional\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Before you can start storing data in BigQuery, what must you create?\n"+
                    "\\begin{parts}\n"+
                    " \\part A data set\n"+
                    " \\part A bucket\n"+
                    " \\part A persistent disk\n"+
                    " \\part An entity\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What features can you configure when running a Second Generation MySQL database in Cloud SQL?\n"+
                    "\\begin{parts}\n"+
                    " \\part Machine type\n"+
                    " \\part Maintenance windows\n"+
                    " \\part Failover replicas\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A colleague is wondering why some storage charges are so high. They explain that they have moved all their storage to nearline and coldline storage. They routinely access most of the object on any given day. What is one possible reason the storage costs are higher than expected?\n"+
                    "\\begin{parts}\n"+
                    " \\part Nearline and coldline incur access charges.\n"+
                    " \\part Transfer charges.\n"+
                    " \\part Multiregional coldline is more expensive.\n"+
                    " \\part Regional coldline is more expensive.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Cloud SQL is a fully managed relational database service, but database administrators  still have to perform some tasks. Which of the following tasks do Cloud SQL users need to perform?\n"+
                    "\\begin{parts}\n"+
                    " \\part Applying security patches\n"+
                    " \\part Performing regularly scheduled backups\n"+
                    " \\part Creating databases\n"+
                    " \\part Tuning the operating system to optimize Cloud SQL performance\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which of the following commands is used to create a backup of a Cloud SQL database?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud sql backups create\n"+
                    " \\part gsutil sql backups create\n"+
                    " \\part gcloud sql create backups\n"+
                    " \\part gcloud sql backups export\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which of the following commands will run an automatic backup at 3:00 a.m. on an instance called ace-exam-mysql?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud sql instances patch ace-exam-mysql --backup-start-time 03:00\n"+
                    " \\part gcloud sql databases patch ace-exam-mysql –-backup-start-time 03:00\n"+
                    " \\part cbt sql instances patch ace-exam-mysql -–backup-start-time 03:00\n"+
                    " \\part bq gcloud sql instances patch ace-exam-mysql -–backup-start-time 03:00\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What is the query language used by Datastore?\n"+
                    "\\begin{parts}\n"+
                    " \\part SQL\n"+
                    " \\part MDX\n"+
                    " \\part GQL\n"+
                    " \\part DataFrames\n"+
                    "\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What is the correct command-line structure to export data from Datastore?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud datastore export \'[NAMESPACE]\' gs://[BUCKET NAME]\n"+
                    " \\part gcloud datastore export gs://[BUCKET NAME]\n"+
                    " \\part gcloud datastore export --namespaces='[NAMESPACE]' gs://[BUCKET NAME]\n"+
                    " \\part gcloud datastore dump --namespaces='[NAMESPACE]' gs://[BUCKET NAME]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you enter a query into the BigQuery query form, BigQuery analyzes the query and displays an estimate of what metric?\n"+
                    "\\begin{parts}\n"+
                    " \\part Time required to enter the query\n"+
                    " \\part Cost of the query\n"+
                    " \\part Amount of data scanned\n"+
                    " \\part Number of bytes passed between servers in the BigQuery cluster\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to get an estimate of the volume of data scanned by BigQuery from the command line. Which option shows the command structure you should use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud BigQuery query estimate [SQL QUERY]\n"+
                    " \\part bq ––location=[LOCATION] query --use legacy-sql=false ––dry-run [SQL QUERY]\n"+
                    " \\part gsutil ––location=[LOCATION] query --use legacy-sql=false ––dry-run [SQL QUERY]\n"+
                    " \\part cbt BigQuery query estimate [SQL QUERY]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are using Cloud Console and want to check on some jobs running in BigQuery. You navigate to the BigQuery part of the console. Which menu item would you click to view jobs?\n"+
                    "\\begin{parts}\n"+
                    " \\part Job History.\n"+
                    " \\part Active Jobs.\n"+
                    " \\part My Jobs.\n"+
                    " \\part You can’t view job status in the console; you have to use bq on the command line.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to estimate the cost of running a BigQuery query. What two services within Google Cloud Platform will you need to use?\n"+
                    "\\begin{parts}\n"+
                    " \\part BigQuery and Billing\n"+
                    " \\part Billing and Pricing Calculator\n"+
                    " \\part BigQuery and Pricing Calculator\n"+
                    " \\part Billing and Pricing Calculator\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have just created a Cloud Spanner instance. You have been tasked with creating a way to store data about a product catalog. What is the next step after creating a Cloud Spanner instance that you would perform to enable you to load data?\n"+
                    "\\begin{parts}\n"+
                    " \\part Run gcloud spanner update-security-patches.\n"+
                    " \\part Create a database within the instance.\n"+
                    " \\part Create tables to hold the data.\n"+
                    " \\part Use the Cloud Spanner console to import data into tables created with the instance.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have created a Cloud Spanner instance and database. According to Google best practices, how often should you update VM packages using apt-get?\n"+
                    "\\begin{parts}\n"+
                    " \\part Every 24 hours.\n"+
                    " \\part Every 7 days.\n"+
                    " \\part Every 30 days.\n"+
                    " \\part Never, Cloud Spanner is a managed service.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your software team is developing a distributed application and wants to send messages from one application to another. Once the consuming application reads a message, it should be deleted. You want your system to be robust to failure, so messages should be available for at least three days before they are discarded. Which GCP service is best designed to support this use case?\n"+
                    "\\begin{parts}\n"+
                    " \\part Bigtable\n"+
                    " \\part Dataproc\n"+
                    " \\part Cloud Pub/Sub\n"+
                    " \\part Cloud Spanner\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your manager asks you to set up a bare-bones Pub/Sub system as a sandbox for new developers to learn about messaging systems. What are the two resources within Pub/Sub you will need to create?\n"+
                    "\\begin{parts}\n"+
                    " \\part Topics and tables\n"+
                    " \\part Topics and databases\n"+
                    " \\part Topics and subscriptions\n"+
                    " \\part Tables and subscriptions\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your company is launching an IoT service and will receive large volumes of streaming data. You have to store this data in Bigtable. You want to explore the Bigtable environment from the command line. What command would you run to ensure you have command-line tools installed?\n"+
                    "\\begin{parts}\n"+
                    " \\part apt-get install bigtable-tools\n"+
                    " \\part apt-get install cbt\n"+
                    " \\part gcloud components install cbt\n"+
                    " \\part gcloud components install bigtable-tools\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You need to create a table called iot-ingest-data in Bigtable. What command would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part cbt createtable iot-ingest-data\n"+
                    " \\part gcloud bigtable tables create ace-exam-bt-table\n"+
                    " \\part gcloud bigtable create tables ace-exam-bt-table\n"+
                    " \\part gcloud create ace-exam-bt-table\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Cloud Dataproc is a managed service for which two big data platforms?\n"+
                    "\\begin{parts}\n"+
                    " \\part Spark and Cassandra\n"+
                    " \\part Spark and Hadoop\n"+
                    " \\part Hadoop and Cassandra\n"+
                    " \\part Spark and TensorFlow\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Your department has been asked to analyze large batches of data every night. The jobs will run for about three to four hours. You want to shut down resources as soon as the analysis is done, so you decide to write a script to create a Dataproc cluster every night at midnight. What command would you use to create a cluster called spark-nightly-analysis in the us-west2-a zone?\n"+
                    "\\begin{parts}\n"+
                    " \\part bq dataproc clusters create spark-nightly-analysis ––zone us-west2-a\n"+
                    " \\part gcloud dataproc clusters create spark-nightly-analysis ––zone us-west2-a\n"+
                    " \\part gcloud dataproc clusters spark-nightly-analysis ––zone us-west2-a\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have a number of buckets containing old data that is hardly ever used. You don’t want to delete it, but you want to minimize the cost of storing it. You decide to change the storage class to coldline for each of those buckets. What is the command structure that you would use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud rewrite -s [STORAGE-CLASS] gs://[PATH-TO-OBJECT]\n"+
                    " \\part gsutil rewrite -s [STORAGE-CLASS] gs://[PATH-TO-OBJECT]\n"+
                    " \\part cbt rewrite -s [STORAGE-CLASS] gs://[PATH-TO-OBJECT]\n"+
                    " \\part bq rewrite -s [STORAGE-CLASS] gs://[PATH-TO-OBJECT]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to rename an object stored in a bucket. What command structure would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gsutil cp gs://[BUCKET-NAME]/[OLD-OBJECT-NAME] gs://[BUCKET-NAME]/ [NEW-OBJECT-NAME]\n"+
                    " \\part gsutil mv gs://[BUCKET-NAME]/[OLD-OBJECT-NAME] gs://[BUCKET-NAME]/ [NEW-OBJECT-NAME]\n"+
                    " \\part gsutil mv gs://[OLD-OBJECT-NAME] gs://[NEW-OBJECT-NAME]\n"+
                    " \\part gcloud mv gs://[OLD-OBJECT-NAME] gs://[NEW-OBJECT-NAME]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . An executive in your company emails you asking about creating a recommendation system that will help sell more products. The executive has heard there are some GCP solutions that may be good fits for this problem. What GCP service would you recommend the executive look into?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Dataproc, especially Spark and its machine learning library\n"+
                    " \\part Cloud Dataproc, especially Hadoop\n"+
                    " \\part Cloud Spanner, which is a global relational database that can hold a lot of data\n"+
                    " \\part Cloud SQL, because SQL is a powerful query language\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which of the following commands is used to create buckets in Cloud Storage?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud storage buckets create\n"+
                    " \\part gsutil storage buckets create\n"+
                    " \\part gsutil mb\n"+
                    " \\part gcloud mb\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You need to copy files from your local device to a bucket in Cloud Storage. What command would you use? Assume you have Cloud SDK installed on your local computer.\n"+
                    "\\begin{parts}\n"+
                    " \\part gsutil copy\n"+
                    " \\part gsutil cp\n"+
                    " \\part gcloud cp\n"+
                    " \\part gcloud storage objects copy\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are migrating a large number of files from a local storage system to Cloud Storage. You want to use the Cloud Console instead of writing a script. Which of the following Cloud Storage operations can you perform in the console?\n"+
                    "\\begin{parts}\n"+
                    " \\part Upload files only\n"+
                    " \\part Upload folders only\n"+
                    " \\part Upload files and folders\n"+
                    " \\part Compare local files with files in the bucket using the diff command\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A software developer asks for your help exporting data from a Cloud SQL database. The developer tells you which database to export and which bucket to store the export file in, but hasn’t mentioned which file format should be used for the export file. What are the options for the export file format?\n"+
                    "\\begin{parts}\n"+
                    " \\part CSV and XML\n"+
                    " \\part CSV and JSON\n"+
                    " \\part JSON and SQL\n"+
                    " \\part CSV and SQL\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A database administrator has asked for an export of a MySQL database in Cloud SQL. The database administrator will load the data into another relational database and would to do it with the least amount of work. Specifically, the loading method should not require the data base administrator to define a schema. What file format would you recommend for this task?\n"+
                    "\\begin{parts}\n"+
                    " \\part SQL\n"+
                    " \\part CSV\n"+
                    " \\part XML\n"+
                    " \\part JSON\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which command will export a MySQL database called ace-exam-mysql1 to a file called "+
                    "exam-mysql-export.sql in a bucket named ace-exam-buckete1?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud storage export sql ace-exam-mysql1 gs://ace-exam-buckete1/ace- exam-mysql-export.sql  ––database=mysql\n"+
                    " \\part gcloud sql export ace-exam-mysql1 gs://ace-exam-buckete1/ace-exam- mysql-export.sql  ––database=mysql\n"+
                    " \\part gcloud sql export sql ace-exam-mysql1 gs://ace-exam-buckete1/ace-exam- mysql-export.sql  ––database=mysql\n"+
                    " \\part gcloud sql export sql ace-exam-mysql1 gs://ace-exam-mysql-export.sql/ ace-exam-buckete1/  ––database=mysql\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  As part of a compliance regimen, your team is required to back up data from your Datastore database to an object storage system. Your data is stored in the default namespace. What command would you use to export the default namespace from Datastore to a bucket called ace-exam-bucket1?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud datastore export ––namespaces=(default) gs://ace-exam-bucket1\n"+
                    " \\part gcloud datastore export ––namespaces=(default) ace-exam-bucket1\n"+
                    " \\part gcloud datastore dump ––namespaces=(default) gs://ace-exam-bucket1\n"+
                    " \\part gcloud datastore dump ––namespaces=(default) ace-exam-bucket1\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  As required by your company’s policy, you need to back up your Datastore database at least once per day. An auditor is questioning whether or not Datastore export is sufficient. You explain that the Datastore export command produces what outputs?\n"+
                    "\\begin{parts}\n"+
                    " \\part A single entity file\n"+
                    " \\part A metadata file\n"+
                    " \\part A metadata file and a folder with the data\n"+
                    " \\part A metadata file, an entity file, and a folder with the data\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which of the following file formats is not an option for an export file when exporting from BigQuery?\n"+
                    "\\begin{parts}\n"+
                    " \\part CSV\n"+
                    " \\part XML\n"+
                    " \\part Avro\n"+
                    " \\part JSON\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following file formats is not supported when importing data into BigQuery?\n"+
                    "\\begin{parts}\n"+
                    " \\part CSV\n"+
                    " \\part Parquet\n"+
                    " \\part Avro\n"+
                    " \\part YAML\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have received a large data set from an Internet of Things (IoT) system. You want to use BigQuery to analyze the data. What command-line command would you use to make data available for analysis in BigQuery?\n"+
                    "\\begin{parts}\n"+
                    " \\part bq load ––autodetect ––source-format=[FORMAT] [DATASET].[TABLE] [PATH-TO-SOURCE]\n"+
                    " \\part bq import ––autodetect ––source-format=[FORMAT] [DATASET].[TABLE] [PATH-TO-SOURCE]\n"+
                    " \\part gloud BigQuery load ––autodetect ––source-format=[FORMAT] [DATASET]. [TABLE] [PATH-TO-SOURCE]\n"+
                    " \\part gcloud BigQuery load ––autodetect ––source-format=[FORMAT] [DATASET]. [TABLE] [PATH-TO-SOURCE]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have set up a Cloud Spanner process to export data to Cloud Storage. You notice that each time the process runs you incur charges for another GCP service, which you think is related to the export process. What other GCP service might be incurring charges during the Cloud Spanner export?\n"+
                    "\\begin{parts}\n"+
                    " \\part Dataproc\n"+
                    " \\part Dataflow\n"+
                    " \\part Datastore\n"+
                    " \\part bq\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . As a developer on a project using Bigtable for an IoT application, you will need to export data from Bigtable to make some data available for analysis with another tool. What would you use to export the data, assuming you want to minimize the amount of effort required on your part?\n"+
                    "\\begin{parts}\n"+
                    " \\part A Java program designed for importing and exporting data from Bigtable\n"+
                    " \\part gcloud bigtable table export\n"+
                    " \\part bq bigtable table export\n"+
                    " \\part An import tool provided by the analysis tool\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have just exported from a Dataproc cluster. What have you exported?\n"+
                    "\\begin{parts}\n"+
                    " \\part Data in Spark DataFrames\n"+
                    " \\part All tables in the Spark database\n"+
                    " \\part Configuration data about the cluster\n"+
                    " \\part All tables in the Hadoop database\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A team of data scientists has requested access to data stored in Bigtable so that they can train machine learning models. They explain that Bigtable does not have the features required to build machine learning models. Which of the following GCP services are they most likely to use to build machine learning models?\n"+
                    "\\begin{parts}\n"+
                    " \\part Datastore\n"+
                    " \\part Dataflow\n"+
                    " \\part Dataproc\n"+
                    " \\part DataAnalyze\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . The correct command to create a Pub/Sub topic is which of the following?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud pubsub topics create\n"+
                    " \\part gcloud pubsub create topics\n"+
                    " \\part bq pubsub create topics\n"+
                    " \\part cbt pubsub topics create\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following commands will create a subscription on the topic\n" +
                    "ace-exam-topic1?\n\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud pubsub create ––topic=ace-exam-topic1 ace-exam-sub1\n"+
                    " \\part gcloud pubsub subscriptions create ––topic=ace-exam-topic1\n"+
                    " \\part gcloud pubsub subscriptions create ––topic=ace-exam-topic1 ace-exam-sub1\n"+
                    " \\part gsutil pubsub subscriptions create ––topic=ace-exam-topic1 ace-exam-sub1\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What is one of the direct advantages of using a message queue in distributed systems?\n"+
                    "\\begin{parts}\n"+
                    " \\part It increases security.\n"+
                    " \\part It decouples services, so if one lags, it does not cause other services to lag.\n"+
                    " \\part It supports more programming languages.\n"+
                    " \\part It stores messages until they are read by default.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . To ensure you have installed beta gcloud commands, which command should you run?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud components beta install\n"+
                    " \\part gcloud components install beta\n"+
                    " \\part gcloud commands install beta\n"+
                    " \\part gcloud commands beta install\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What parameter is used to tell BigQuery to automatically detect the schema of a file on import?\n"+
                    "\\begin{parts}\n"+
                    " \\part ––autodetect\n"+
                    " \\part ––autoschema\n"+
                    " \\part ––detectschema\n"+
                    " \\part ––dry run\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . The compression options deflate and snappy are available for what file types when exporting from BigQuery?\n"+
                    "\\begin{parts}\n"+
                    " \\part Avro\n"+
                    " \\part CSV\n"+
                    " \\part XML\n"+
                    " \\part Thrift\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Virtual private clouds have a 	scope.\n"+
                    "\\begin{parts}\n"+
                    " \\part Zonal\n"+
                    " \\part Regional\n"+
                    " \\part Super-regional\n"+
                    " \\part Global\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been tasked with defining CIDR ranges to use with a project. The project includes 2 VPCs with several subnets in each VPC. How many CIDR ranges will you need to define?\n"+
                    "\\begin{parts}\n"+
                    " \\part One for each VPC\n"+
                    " \\part One for each subnet\n"+
                    " \\part One for each region\n"+
                    " \\part One for each zone\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  The legal department needs to isolate its resources on its own VPC. You want to have network provide routing to any other service available on the global network. The VPC network has not learned global routes. What parameter may have been missed when creating the VPC subnets?\n"+
                    "\\begin{parts}\n"+
                    " \\part DNS server policy\n"+
                    " \\part Dynamic routing\n"+
                    " \\part Static routing policy\n"+
                    " \\part Systemic routing policy\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  The command to create a VPC from the command line is:\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute networks create\n"+
                    " \\part gcloud networks vpc create\n"+
                    " \\part gsutil networks vpc create\n"+
                    " \\part gcloud compute create networks\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have created several subnets. Most of them are sending logs to Stackdriver. One subnet is not sending logs. What option may have been misconfigured when creating the subnet that is not forwarding logs?\n"+
                    "\\begin{parts}\n"+
                    " \\part Flow Logs\n"+
                    " \\part Private IP Access\n"+
                    " \\part Stackdriver Logging\n"+
                    " \\part Variable-Length Subnet Masking\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  At what levels of the resource hierarchy can a shared VPC be created?\n"+
                    "\\begin{parts}\n"+
                    " \\part Folders and resources\n"+
                    " \\part Organizations and project\n"+
                    " \\part Organizations and folders\n"+
                    " \\part Folders and subnets\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are using Cloud Console to create a VM that you want to exist in a custom subnet you just created. What section of the Create Instance form would you use to specify the custom subnet?\n"+
                    "\\begin{parts}\n"+
                    " \\part Networking tab of the Management, Security, Disks, Networking, Sole Tenancy section\n"+
                    " \\part Management tab of the Management, Security, Disks, Networking, Sole Tenancy section\n"+
                    " \\part Sole Tenancy tab of Management, Security, Disks, Networking, Sole Tenancy\n"+
                    " \\part Sole Tenancy tab of Management, Security, Disks, Networking\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to implement interproject communication between VPCs. Which feature of VPCs would you use to implement this?\n"+
                    "\\begin{parts}\n"+
                    " \\part VPC peering\n"+
                    " \\part Interproject peering\n"+
                    " \\part VPN\n"+
                    " \\part Interconnect\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to limit traffic to a set of instances. You decide to set a specific network tag on each instance. What part of a firewall rule can reference the network tag to determine the set of instances affected by the rule?\n"+
                    "\\begin{parts}\n"+
                    " \\part Action\n"+
                    " \\part Target\n"+
                    " \\part Priority\n"+
                    " \\part Direction\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What part of a firewall rule determines whether a rule applies to incoming or outgoing traffic?\n"+
                    "\\begin{parts}\n"+
                    " \\part Action\n"+
                    " \\part Target\n"+
                    " \\part Priority\n"+
                    " \\part Direction\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to define a CIDR range that applies to all destination addresses. What IP address would you specify?\n"+
                    "\\begin{parts}\n"+
                    "\\part  0.0.0/0\n"+
                    "\\part  10.0.0.0/8\n"+
                    "\\part  172.16.0.0/12\n"+
                    "\\part  192.168.0.0/16\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are using gcloud to create a firewall rule. Which command would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud network firewall-rules create\n"+
                    " \\part gcloud compute firewall-rules create\n"+
                    " \\part gcloud network rules create\n"+
                    " \\part gcloud compute rules create\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are using gcloud to create a firewall rule. Which parameter would you use to specify the subnet it should apply to?\n"+
                    "\\begin{parts}\n"+
                    " \\part ––subnet\n"+
                    " \\part ––network\n"+
                    " \\part ––destination\n"+
                    " \\part ––source-ranges\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . An application development team is deploying a set of specialized service endpoints and wants to limit traffic so that only traffic going to one of the endpoints is allowed through by firewall rules. The service endpoints will accept any UDP traffic and each endpoint will use a port in the range of 20000–30000. Which of the following commands would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute firewall-rules create fwr1 --allow=udp:20000-30000\n"+
                    "rection=ingress\n"+
                    " \\part gcloud network firewall-rules create fwr1 --allow=udp:20000-30000\n"+
                    "rection=ingress\n"+
                    " \\part gcloud compute firewall-rules create fwr1 --allow=udp\n"+
                    " \\part gcloud compute firewall-rules create fwr1 --direction=ingress\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have a rule to allow inbound traffic to a VM. You want it to apply only if there is not another rule that would deny that traffic. What priority should you give this rule?\n"+
                    "\\begin{parts}\n"+
                    " \\part 0\n"+
                    " \\part 1\n"+
                    " \\part 1000 \n"+
                    " \\part 65535\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to create a VPN using Cloud Console. What section of Cloud Console should you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine\n"+
                    " \\part App Engine\n"+
                    " \\part Hybrid Connectivity\n"+
                    " \\part IAM & Admin\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are using Cloud Console to create a VPN. You want to configure the GCP end of the VPN. What section of the Create VPN form would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part Tunnels\n"+
                    " \\part Routing Options\n"+
                    " \\part Google Compute Engine VPN\n"+
                    " \\part IKE Version\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want the router on a tunnel you are creating to learn routes from all GCP regions on the network. What feature of GCP routing would you enable?\n"+
                    "\\begin{parts}\n"+
                    " \\part Global dynamic routing\n"+
                    " \\part Regional routing\n"+
                    " \\part VPC\n"+
                    " \\part Firewall rules\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . When you create a cloud router, what kind of unique identifier do you need to assign for the BGP protocol?\n"+
                    "\\begin{parts}\n"+
                    " \\part IP address\n"+
                    " \\part ASN\n"+
                    " \\part Dynamic load routing ID\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are using gcloud to create a VPN. Which command would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute target-vpn-gateways only\n"+
                    " \\part gcloud compute forwarding-rule and gcloud compute target-vpn-gateways only\n"+
                    " \\part gcloud compute vpn-tunnels only\n"+
                    " \\part gcloud compute forwarding-rule, gcloud compute target-vpn-gateways, and gcloud compute vpn-tunnels\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What record type is used to specify the IPv4 address of a domain?\n"+
                    "\\begin{parts}\n"+
                    " \\part AAAA\n"+
                    " \\part A\n"+
                    " \\part NS\n"+
                    " \\part SOA\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  The CEO of your startup just read a news report about a company that was attacked by something called cache poisoning. The CEO wants to implement additional security measures to reduce the risk of DNS spoofing and cache poisoning. What would you recommend?\n"+
                    "\\begin{parts}\n"+
                    " \\part Using DNSSEC\n"+
                    " \\part Adding SOA records\n"+
                    " \\part Adding CNAME records\n"+
                    " \\part Deleting CNAME records\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What do the TTL parameters specify in a DNS record?\n"+
                    "\\begin{parts}\n"+
                    " \\part Time a record can exist in a cache before it should be queried again\n"+
                    " \\part Time a client has to respond to a request for DNS information\n"+
                    " \\part Time allowed to create a CNAME record\n"+
                    " \\part Time before a human has to manually verify the information in the DNS record\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What command is used to create a DNS zone in the command line?\n"+
                    "\\begin{parts}\n"+
                    " \\part gsutil dns managed-zones create\n"+
                    " \\part gcloud beta dns managed-zones create\n"+
                    " \\part gcloud beta managed-zones create\n"+
                    " \\part gcloud beta dns create managed zones\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What parameter is used to make a DNS zone private?\n"+
                    "\\begin{parts}\n"+
                    " \\part --private\n"+
                    " \\part --visibility=private\n"+
                    " \\part --private=true\n"+
                    " \\part --status=private\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which load balancers provide global load balancing?\n"+
                    "\\begin{parts}\n"+
                    " \\part HTTP(S) only\n"+
                    " \\part SSL Proxy and TCP Proxy only\n"+
                    " \\part HTTP(S), SSL Proxy, and TCP Proxy\n"+
                    " \\part Internal TCP/UDP, HTTP(S), SSL Proxy, and TCP Proxy\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Which regional load balancer allows for load balancing based on IP protocol, address, and port?\n"+
                    "\\begin{parts}\n"+
                    " \\part HTTP(S)\n"+
                    " \\part SSL Proxy\n"+
                    " \\part TCP Proxy\n"+
                    " \\part Network TCP/UDP\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are configuring a load balancer and want to implement private load balancing. Which option would you select?\n"+
                    "\\begin{parts}\n"+
                    " \\part Only Between My VMs\n"+
                    " \\part Enable Private\n"+
                    " \\part Disable Public\n"+
                    " \\part Local Only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What two components need to be configured when creating a TCP Proxy load balancer?\n"+
                    "\\begin{parts}\n"+
                    " \\part Frontend and forwarding rule\n"+
                    " \\part Frontend and backend\n"+
                    " \\part Forwarding rule and backend only\n"+
                    " \\part Backend and forwarding rule only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A health check is used to check what resources?\n"+
                    "\\begin{parts}\n"+
                    " \\part Load balancer\n"+
                    " \\part VMs\n"+
                    " \\part Storage buckets\n"+
                    " \\part Persistent disks\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Where do you specify the ports on a TCP Proxy load balancer that should have their traffic forwarded?\n"+
                    "\\begin{parts}\n"+
                    " \\part Backend\n"+
                    " \\part Frontend\n"+
                    " \\part Network Services section\n"+
                    " \\part VPC\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What command is used to create a network load balancer at the command line?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute forwarding-rules create\n"+
                    " \\part gcloud network forwarding-rules create\n"+
                    " \\part gcloud compute create forwarding-rules\n"+
                    " \\part gcloud network create forwarding-rules\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A team is setting up a web service for internal use. They want to use the same IP address for the foreseeable future. What type of IP address would you assign?\n"+
                    "\\begin{parts}\n"+
                    " \\part Internal\n"+
                    " \\part External\n"+
                    " \\part Static\n"+
                    " \\part Ephemeral\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are starting up a VM to experiment with a new Python data science library. You’ll SSH via the server name into the VM, use the Python interpreter interactively for a while and then shut down the machine. What type of IP address would you assign to this VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part Ephemeral\n"+
                    " \\part Static\n"+
                    " \\part Permanent\n"+
                    " \\part IPv8\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have created a subnet called sn1 using 192.168.0.0 with 65,534 addresses. You realize that you will not need that many addresses, and you’d like to reduce that number to 254. Which of the following commands would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute networks subnets expand-ip-range sn1 --prefix-length=24\n"+
                    " \\part gcloud compute networks subnets expand-ip-range sn1 --prefix-length=-8\n"+
                    " \\part gcloud compute networks subnets expand-ip-range sn1 --size=256\n"+
                    " \\part There is no command to reduce the number of IP addresses available.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have created a subnet called sn1 using 192.168.0.0. You want it to have 14 addresses. What prefix length would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part 32\n"+
                    " \\part 28\n"+
                    " \\part 20\n"+
                    " \\part 16\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want all your network traffic to route over the Google network and not traverse the public Internet. What level of network service should you choose?\n"+
                    "\\begin{parts}\n"+
                    " \\part Standard\n"+
                    " \\part Google-only\n"+
                    " \\part Premium\n"+
                    " \\part Non-Internet\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You have a website hosted on a Compute Engine VM. Users can access the website using the domain name you provided. You do some maintenance work on the VM and stop the server and restart it. Now users cannot access the website. No other changes have occurred on the subnet. What might be the cause of the problem?\n"+
                    "\\begin{parts}\n"+
                    " \\part The restart caused a change in the DNS record.\n"+
                    " \\part You used an ephemeral instead of a static IP address.\n"+
                    " \\part You do not have enough addresses available on your subnet.\n"+
                    " \\part Your subnet has changed.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are deploying a distributed system. Messages will be passed between Compute Engine VMs using a reliable UDP protocol. All VMs are in the same region. You want to use the load balancer that best fits these requirements. Which kind of load balancer would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part Internal TCP/UDP\n"+
                    " \\part TCP Proxy\n"+
                    " \\part SSL Proxy\n"+
                    " \\part HTTP(S)\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to use Cloud Console to review the records in a DNS entry. What section of Cloud Console would you navigate to?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine\n"+
                    " \\part Network Services\n"+
                    " \\part Kubernetes Engine\n"+
                    " \\part Hybrid Connectivity\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What are the categories of Cloud Launcher solutions?\n"+
                    "\\begin{parts}\n"+
                    " \\part Data sets only\n"+
                    " \\part Operating systems only\n"+
                    " \\part Developer tools and operating systems only\n"+
                    " \\part Data sets, operating systems, and developer tools\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What is the other name of Cloud Launcher?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Deployment Manager\n"+
                    " \\part Marketplace\n"+
                    " \\part Cloud Tools\n"+
                    " \\part Cloud Solutions: Third Party\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Where do you navigate to launch a Cloud Launcher solution?\n"+
                    "\\begin{parts}\n"+
                    " \\part Overview page of the solution\n"+
                    " \\part Main Cloud Launcher page\n"+
                    " \\part Network Services\n"+
                    " \\part None of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to quickly identify the set of operating systems available in Cloud Launcher. Which of these steps would help with that?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use Google Search to search the Web for a listing.\n"+
                    " \\part Use filters in Cloud Launcher.\n"+
                    " \\part Scroll through the list of solutions displayed on the start page of Cloud Launcher.\n"+
                    " \\part It is not possible to filter to operating systems.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to use Cloud Launcher to deploy a WordPress site. You notice there is more than one WordPress option. Why is that?\n"+
                    "\\begin{parts}\n"+
                    " \\part It’s a mistake. Submit a ticket to Google support.\n"+
                    " \\part Multiple vendors may offer the same application.\n"+
                    " \\part It’s a mistake. Submit a ticket to the vendors.\n"+
                    " \\part You will never see such an option.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have used Cloud Launcher to deploy a WordPress site and would now like to deploy a database. You notice that the configuration form for the databases is different from the form used with WordPress. Why is that?\n"+
                    "\\begin{parts}\n"+
                    " \\part It’s a mistake. Submit a ticket to Google support.\n"+
                    " \\part You’ve navigated to a different subform of Cloud Launcher.\n"+
                    " \\part Configuration properties are based on the application you are deploying and will be different depending on what application you are deploying.\n"+
                    " \\part This cannot happen.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been asked by your manager to deploy a WordPress site. You expect heavy traffic, and your manager wants to make sure the VM hosting the WordPress site has enough resources. Which resources can you configure when launching a WordPress site using Cloud Launcher?\n"+
                    "\\begin{parts}\n"+
                    " \\part Machine type\n"+
                    " \\part Disk type\n"+
                    " \\part Disk size\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You would like to define as code the configuration of a set of application resources. The GCP service for creating resources using a configuration file made up of resource specifications defined in YAML syntax is called what?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine\n"+
                    " \\part Deployment Manager\n"+
                    " \\part Marketplace Manager\n"+
                    " \\part Marketplace Deployer\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What file format is used to define Deployment Manager configuration files?\n"+
                    "\\begin{parts}\n"+
                    " \\part XML\n"+
                    " \\part JSON\n"+
                    " \\part CSV\n"+
                    " \\part YAML\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A Deployment Manager configuration file starts with what term?\n"+
                    "\\begin{parts}\n"+
                    " \\part Deploy\n"+
                    " \\part Resources\n"+
                    " \\part Properties\n"+
                    " \\part YAML\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following are used to define a resource in a Cloud Deployment Manager configuration file?\n"+
                    "\\begin{parts}\n"+
                    " \\part type only\n"+
                    " \\part properties only\n"+
                    " \\part name and type only\n"+
                    " \\part type, properties, and name\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What properties may be set when defining a disk on a VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part A device name only\n"+
                    " \\part A Boolean indicating a boot disk and a Boolean indicating autodelete\n"+
                    " \\part A Boolean indicating autodelete only\n"+
                    " \\part A device name, a Boolean indicating a boot disk, and a Boolean indicating autodelete\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You need to look up what images are available in the zone in which you want to deploy a VM. What command would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute images list\n"+
                    " \\part gcloud images list\n"+
                    " \\part gsutil compute images list\n"+
                    " \\part gcloud compute list images\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to use a template file with Deployment Manager. You expect the file to be complicated. What language would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part Jinja2\n"+
                    " \\part Ruby\n"+
                    " \\part Go\n"+
                    " \\part Python\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What command launches a deployment?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud deployment-manager deployments create\n"+
                    " \\part gcloud cloud-launcher deployments create\n"+
                    " \\part gcloud deployment-manager deployments launch\n"+
                    " \\part gcloud cloud-launcher deployments launch\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A DevOps engineer is noticing a spike in CPU utilization on your servers. You explain you have just launched a deployment. You’d like to show the DevOps engineer the details of a deployment you just launched. What command would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud cloud-launcher deployments describe\n"+
                    " \\part gcloud deployment-manage deployments list\n"+
                    " \\part gcloud deployment-manager deployments describe\n"+
                    " \\part gcloud cloud-launcher deployments list\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . If you expand the More link in the Networking section when deploying a Cloud Launcher solution, what will you be able to configure?\n"+
                    "\\begin{parts}\n"+
                    " \\part IP addresses\n"+
                    " \\part Billing\n"+
                    " \\part Access controls\n"+
                    " \\part Custom machine type\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What are the license types referenced in Cloud Launcher?\n"+
                    "\\begin{parts}\n"+
                    " \\part Free only\n"+
                    " \\part Free and Paid only\n"+
                    " \\part Free and Bring your own license (BYOL) only\n"+
                    " \\part Free, paid, and bring your own license\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which license type will add charges to your GCP bill when using Cloud Launcher with this type of license?\n"+
                    "\\begin{parts}\n"+
                    " \\part Free\n"+
                    " \\part Paid\n"+
                    " \\part BYOL\n"+
                    " \\part Chargeback\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are deploying a Cloud Launcher application that includes a LAMP stack. What software will this deploy?\n"+
                    "\\begin{parts}\n"+
                    " \\part Apache server and Linux only\n"+
                    " \\part Linux only\n"+
                    " \\part MySQL and Apache only\n"+
                    " \\part Apache, MySQL, Linux, and PHP\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What does IAM stand for?\n"+
                    "\\begin{parts}\n"+
                    " \\part Identity and Authorization Management\n"+
                    " \\part Identity and Access Management\n"+
                    " \\part Identity and Auditing Management\n"+
                    " \\part Individual Access Management\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you navigate to IAM & Admin in Cloud Console, what appears in the main body of the page?\n"+
                    "\\begin{parts}\n"+
                    " \\part Members and roles assigned\n"+
                    " \\part Roles only\n"+
                    " \\part Members only\n"+
                    " \\part Roles and permissions assigned\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Why are primitive roles classified in a category in addition to IAM?\n"+
                    "\\begin{parts}\n"+
                    " \\part They are part of IAM.\n"+
                    " \\part They were created before IAM.\n"+
                    " \\part They were created after IAM.\n"+
                    " \\part They are not related to access control.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  A developer intern is confused about what roles are used for. You describe IAM roles as a collection of what?\n"+
                    "\\begin{parts}\n"+
                    " \\part Identities\n"+
                    " \\part Permissions\n"+
                    " \\part Access control lists\n"+
                    " \\part Audit logs\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to list roles assigned to users in a project called ace-exam-project. What gcloud"+
                    "and would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud iam get-iam-policy ace-exam-project\n"+
                    " \\part gcloud projects list ace-exam-project\n"+
                    " \\part gcloud projects get-iam-policy ace-exam-project\n"+
                    " \\part gcloud iam list ace-exam-project\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are working in the form displayed after clicking the Add link in the IAM form of IAM & Admin in Cloud Console. There is a parameter called New Members. What items would you enter in that parameter?\n"+
                    "\\begin{parts}\n"+
                    " \\part Individual users only\n"+
                    " \\part Individual users or groups\n"+
                    " \\part Roles or individual users\n"+
                    " \\part Roles or groups\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been assigned the App Engine Deployer role. What operations can you perform?\n"+
                    "\\begin{parts}\n"+
                    " \\part Write new versions of an application only\n"+
                    " \\part Read application configuration and settings only\n"+
                    " \\part Read application configuration and settings and write new configurations\n"+
                    " \\part Read application configuration and settings and write new versions\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You want to list permissions in a role using Cloud Console. Where would you go to see that?\n"+
                    "\\begin{parts}\n"+
                    " \\part IAM & Admin; select Roles. All permissions will be displayed.\n"+
                    " \\part IAM & Admin; select Roles. Check the box next to a role to display the permissions in that role.\n"+
                    " \\part IAM & Admin; select Audit Logs.\n"+
                    " \\part IAM & Admin; select Service Accounts and then Roles.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You are meeting with an autidor to discuss security practices in the cloud. The auditor asks how you implement several best practices. You describe how IAM predefined roles help to implement which security best practice(s)?\n"+
                    "\\begin{parts}\n"+
                    " \\part Least privilege\n"+
                    " \\part Separation of duties\n"+
                    " \\part Defense in depth\n"+
                    " \\part Options A and B\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What launch stages are available when creating custom roles?\n"+
                    "\\begin{parts}\n"+
                    " \\part Alpha and beta only\n"+
                    " \\part General availability only\n"+
                    " \\part Disabled only\n"+
                    " \\part Alpha, beta, general availability, and disabled\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . The gcloud command to create a custom role is what?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud project roles create\n"+
                    " \\part gcloud iam roles create\n"+
                    " \\part gcloud project create roles\n"+
                    " \\part gcloud iam create roles\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A DevOps engineer is confused about the purpose of scopes. Scopes are access controls that are applied to what kind of resources?\n"+
                    "\\begin{parts}\n"+
                    " \\part Storage buckets\n"+
                    " \\part VM instances\n"+
                    " \\part Persistent disks\n"+
                    " \\part Subnets\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A scope is identified using what kind of identifier?\n"+
                    "\\begin{parts}\n"+
                    " \\part A randomly generated ID\n"+
                    " \\part A URL beginning with https://www.googleserviceaccounts/\n"+
                    " \\part A URL beginning with https://www.googleapis.com/auth/\n"+
                    " \\part A URL beginning with https://www.googleapis.com/auth/PROJECT-ID]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . A VM instance is trying to read from a Cloud Storage bucket. Reading the bucket is allowed by IAM roles granted to the service account of the VM. Reading buckets is denied by the scopes assigned to the VM. What will happen if the VM tries to read from the bucket?\n"+
                    "\\begin{parts}\n"+
                    " \\part The application performing the read will skip over the read operation.\n"+
                    " \\part The read will execute because the most permissive permission is allowed.\n"+
                    " \\part The read will not execute because both scopes and IAM roles are applied to determine what operations can be performed.\n"+
                    " \\part The read operation will succeed, but a message will be logged to Stackdriver Logging.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What are the options for setting scopes in a VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part Allow Default Access and Allow Full Access only\n"+
                    " \\part Allow Default Access, Allow Full Access, and Set Access for Each API\n"+
                    " \\part Allow Full Access or Set Access For Each API only\n"+
                    " \\part Allow Default Access and Set Access For Each API only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What gcloud command would you use to set scopes?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances set-scopes\n"+
                    " \\part gcloud compute instances set-service-account\n"+
                    " \\part gcloud compute service-accounts set-scopes\n"+
                    " \\part gcloud compute service-accounts define-scopes\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What gcloud command would you use to assign a service account when creating a VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part gcloud compute instances create [INSTANCE NAME] --service-account [SERVICE ACCOUNT EMAIL]\n"+
                    " \\part gcloud compute instances create-service-account [INSTANCE NAME][SERVICE ACCOUNT EMAIL]\n"+
                    " \\part gcloud compute instances define-service-account [INSTANCE NAME][SERVICE ACCOUNT EMAIL]\n"+
                    " \\part gcloud compute create instances-service-account [INSTANCE NAME][SERVICE ACCOUNT EMAIL]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What GCP service is used to view audit logs?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine\n"+
                    " \\part Cloud Storage\n"+
                    " \\part Stackdriver Logging\n"+
                    " \\part Custom logging\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What options are available for filtering log messages when viewing audit logs?\n"+
                    "\\begin{parts}\n"+
                    " \\part Period time and log level only\n"+
                    " \\part Resource, type of log, log level, and period of time only\n"+
                    " \\part Resource and period of time only\n"+
                    " \\part Type of log only\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . An auditor needs to review audit logs. You assign read-only permission to a custom role you create for auditors. What security best practice are you following?\n"+
                    "\\begin{parts}\n"+
                    " \\part Defense in depth\n"+
                    " \\part Least privilege\n"+
                    " \\part Separation of duties\n"+
                    " \\part Vulnerability scanning\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What Stackdriver service is used to generate alerts when the CPU utilization of a VM exceeds 80 percent?\n"+
                    "\\begin{parts}\n"+
                    " \\part Logging\n"+
                    " \\part Monitoring\n"+
                    " \\part Cloud Trace\n"+
                    " \\part Cloud Debug\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have just created a virtual machine, and you’d like Stackdriver Monitoring to alert you via email whenever the CPU average utilization exceeds 75 percent for 5 minutes. What do you need to do to the VM to have this happen?\n"+
                    "\\begin{parts}\n"+
                    " \\part Install a Stackdriver workspace\n"+
                    " \\part Install the Stackdriver monitoring agent on the VM\n"+
                    " \\part Edit the VM configuration in Cloud Console and check the Monitor With Stackdriver checkbox\n"+
                    " \\part Set a notification channel\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Stackdriver can be used to monitor resources where?\n"+
                    "\\begin{parts}\n"+
                    " \\part In Google Cloud Platform only\n"+
                    " \\part In Google Cloud Platform and Amazon Web Services only\n"+
                    " \\part In Google Cloud Platform and on premises data centers\n"+
                    " \\part In Google Cloud Platform, Amazon Web Services, and on premises data centers\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Grouping a set of metrics that arrive in a period of time into regular-sized buckets is called what?\n"+
                    "\\begin{parts}\n"+
                    " \\part Aggregation\n"+
                    " \\part Alignment\n"+
                    " \\part Minimization\n"+
                    " \\part Consolidation\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have created a condition of CPU utilization, and you want to receive notifications. Which of the following are options?\n"+
                    "\\begin{parts}\n"+
                    " \\part Email only\n"+
                    " \\part PagerDuty only\n"+
                    " \\part Hipchat and PagerDuty\n"+
                    " \\part Email, PagerDuty, and Hipchat\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you create a policy to notify you of a potential problem with your infrastructure, you can specify optional documentation. Why would you bother putting documentation in that form?\n"+
                    "\\begin{parts}\n"+
                    " \\part It is saved to Cloud Storage for future use.\n"+
                    " \\part It can help you or a colleague understand the purpose of the policy.\n"+
                    " \\part It can contain information that would help someone diagnose and correct the problem.\n"+
                    " \\part Options B and C.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  What is alert fatigue, and why is it a problem?\n"+
                    "\\begin{parts}\n"+
                    " \\part Too many alert notifications are sent for events that do not require human intervention, and eventually DevOps engineers begin to pay less attention to notifications.\n"+
                    " \\part Too many alerts put unnecessary load on your systems.\n"+
                    " \\part Too few alerts leave DevOps engineers uncertain of the state of your applications and infrastructure.\n"+
                    " \\part Too many false alerts\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  How long is log data stored in Stackdriver Logging?\n"+
                    "\\begin{parts}\n"+
                    " \\part 7 days\n"+
                    " \\part 15 days\n"+
                    " \\part 30 days\n"+
                    " \\part 60 days\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You need to store log entries for a longer period of time than Stackdriver Logging retains them. What is the best option for preserving log data?\n"+
                    "\\begin{parts}\n"+
                    " \\part There is no option; once the data retention period passes, Stackdriver Logging deletes the data.\n"+
                    " \\part Create a log sink and export the log data using Stackdriver Logging’s export functionality.\n"+
                    " \\part Write a Python script to use the Stackdriver API to write the data to Cloud Storage.\n"+
                    " \\part Write a Python script to use the Stackdriver API to write the data to BigQuery.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following are options for logging sinks?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Storage bucket only\n"+
                    " \\part BigQuery dataset and Cloud Storage bucket only\n"+
                    " \\part Cloud Pub/Sub topic only\n"+
                    " \\part Cloud Storage bucket, BigQuery dataset, and Cloud Pub/Sub topic\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following can be used to filter log entries when viewing logs in Stackdriver Logging?\n"+
                    "\\begin{parts}\n"+
                    " \\part Label or text search only\n"+
                    " \\part Resource type and log type only\n"+
                    " \\part Time and resource type only\n"+
                    " \\part Label or text search, resource type, log type, and time\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Which of the following is not a standard log level that can be used to filter log viewings?\n"+
                    "\\begin{parts}\n"+
                    " \\part Critical\n"+
                    " \\part Halted\n"+
                    " \\part Warning\n"+
                    " \\part Info\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are viewing log entries and spot one that looks suspicious. You are not familiar with the kind of log entry, and you want to see the complete details of the log entry as quickly as possible. What would you do?\n"+
                    "\\begin{parts}\n"+
                    " \\part Drill down one by one into each structure in the log entry.\n"+
                    " \\part Click Expand all to show all details.\n"+
                    " \\part Write a Python script to reformat the log entry.\n"+
                    " \\part Click the Show Detail link next to the log entry.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What Stackdriver service is best for identifying where bottlenecks exist in your application?\n"+
                    "\\begin{parts}\n"+
                    " \\part Monitoring\n"+
                    " \\part Logging\n"+
                    " \\part Trace\n"+
                    " \\part Debug\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . There is a bug in a microservice. You have reviewed application outputs but cannot identify the problem. You decide you need to step through the code. What Stackdriver service would you use to give you insight into the status of the services at particular points in execution?\n"+
                    "\\begin{parts}\n"+
                    " \\part Monitoring\n"+
                    " \\part Logging\n"+
                    " \\part Trace\n"+
                    " \\part Debug\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You believe there may be a problem with BigQuery in the us-central zone. Where would you go to check the status of the BigQuery service for the quickest access to details?\n"+
                    "\\begin{parts}\n"+
                    " \\part Email Google Cloud Support.\n"+
                    " \\part Check https://status.cloud.google.com/.\n"+
                    " \\part Check https://bigquery.status.cloud.google.com/.\n"+
                    " \\part Call Google tech support.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You would like to estimate the cost of GCP resources you will be using. Which services would require you to have information on the virtual machines you will be using?\n"+
                    "\\begin{parts}\n"+
                    " \\part Compute Engine and BigQuery\n"+
                    " \\part Compute Engine and Kubernetes Engine\n"+
                    " \\part BigQuery and Kubernetes Engine\n"+
                    " \\part BigQuery and Cloud Pub/Sub\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You are generating an estimate of the cost of using BigQuery. One of the parameters is Query Pricing. You have to specify a value in TB units. What is the value you are specifying?\n"+
                    "\\begin{parts}\n"+
                    " \\part The amount of data stored in BigQuery\n"+
                    " \\part The amount of data returned by the query\n"+
                    " \\part The amount of data scanned by the query\n"+
                    " \\part The amount of data in Cloud Storage bucket\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . Why do you need to specify the operating system to be used when estimating the cost of a VM?\n"+
                    "\\begin{parts}\n"+
                    " \\part All operating systems are charged a fixed rate.\n"+
                    " \\part Some operating systems incur a cost.\n"+
                    " \\part It’s not necessary; it is only included for documentation.\n"+
                    " \\part To estimate the cost of Bring Your Own License configurations.\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to create a custom metric for use in Stackdriver Monitoring but do not want to use the low-level Stackdriver API. What is an alternative open source option for working with custom metrics?\n"+
                    "\\begin{parts}\n"+
                    " \\part Prometheus\n"+
                    " \\part OpenCensus\n"+
                    " \\part Grafana\n"+
                    " \\part Nagios\n"+
                    "\\end{parts}\n"
    };
    public static String[] answerSet = {
            "\\item    B. The basic unit for purchasing computing resources is the virtual machine (VM). A physical server underlies VMs, but the resources of a physical server are allocated to VMs. Blocks and subnets are not relevant to the fundamental unit of computing.",
            "\\item    D. When using managed clusters, the cloud provider will monitor the health of nodes in the cluster, set up networking between nodes in the cluster, and configure firewall and other security controls.",
            "\\item    B. App Engine is a serverless platform for running applications, while Cloud Functions is a service for executing short-running functions in response to events. Kubernetes Engine is a managed cluster service, and both Kubernetes Engine and Compute Engine require you to configure servers.",
            "\\item    B. Object storage, like Cloud Storage, provides redundantly stored objects without limits on the amount of data you can store, which makes option B correct. Since file system functionality is not required, option D is not a good option. Block storage could be used, but you would have to manage your own replication to ensure high availability. Caches are transient, in-memory storage and are not high-availability, persistent storage systems.",
            "\\item    D. Block sizes in a block storage system can vary; therefore, option D is the correct answer. Block size is established when a file system is created. 4KB block sizes are commonly used in Linux.",
            "\\item    C. Firewalls in Google Cloud Platform (GCP) are software-defined network controls that limit the flow of traffic into and out of a network or subnetwork, so option C is the correct answer. Routers are used to move traffic to appropriate destinations on the network. Identity access management is used for authenticating and authorizing users; it is not relevant to network controls between subnetworks. IP address tables are not a security control.",
            "\\item    C. Option C is correct because specialized services in GCP are serverless. Google manages the compute resources used by the services. There is no need for a user to allocate or monitor VMs.",
            "\\item    B. Option B is correct; investing in servers works well when an organization can accurately predict the number of servers and other equipment it will need for an extended period and can utilize that equipment consistently. Startups are not established businesses with histories that can guide expected needs in three to five years. It does not matter if a budget is fixed or variable; investing in servers should be based on demand for server capacity.",
            "\\item    B. The characteristics of the server, such as the number of virtual servers, the amount of memory, and the region where you run the VM, influence the cost, so option B is correct. Time of day is not a factor, nor is the type of application you run on the VM.",
            "\\item   . D. Cloud Vision is one of GCP’s specialized services. Users of the service do not need to configure any VMs to use the service.",
            "\\item   . B. Containers give the most flexibility for using the resources of a cluster efficiently and orchestration platforms reduce the operations overhead, which makes option B correct. Running in a single cluster is not recommended because if the server fails, all services will be down. Using two VMs with one read-only is not useful. Read-only servers are sometimes used with databases, but there was no mention of databases in the question. Using a small VM and upgrading when it is no longer able to keep up with the workload delivers poor quality service to users and should be avoided.",
            "\\item   . D. All of the operations are available to a system administrator after creating a VM, so option D is correct.",
            "\\item   . A. Option A is correct; Cloud Filestore is based on Network Filesystem (NSF), which is a distributed file management system. The other options are file systems supported by Linux but are not the foundation of Cloud Filestore.",
            "\\item   . A. When you create a network, it is treated as a virtual private cloud, which makes option A correct. Resources are added to the VPC and are not accessible outside the VPC unless you explicitly configure them to be. A subdomain is related to web domains and not related to GPC network configuration. Clusters, such as Kubernetes clusters, may be in your network, but are not a characteristic of the network.",
            "\\item   . D. Caches use memory, and that makes them the fastest storage type for reading data, so option D is right. Caches are data stores on the backend of distributed systems, not the clients. A cache would have no effect on client-side JavaScript execution. Caches do not store data in a cache if power is lost; the data would have to be reloaded. Caches can get out of sync with the system of truth because the system of truth could be updated, but the cache may not be updated. Caches have faster read times than SSDs and HDDs.",
            "\\item   . B.  Option B is correct; cloud providers have large capacity and can quickly allocate those resources to different customers. With a mix of customers and workloads, they can optimize the allocation of resources. Option A is incorrect; cloud providers do not take resources from one customer to give them to another, with the exception of preemptible instances. Option C is incorrect; cloud providers usually offer discounts for increased use.",
            "\\item   . C. Specialized services are monitored by Google so users do not have to monitor them; therefore, option C is correct. Specialized services provide a specific compute functionality but do not require the user to configure any resources. They also provide APIs.",
            "\\item   . B. Attached drives are block storage devices. Cloud Storage is the object storage service and does not attach directly to a VM. NoSQL is a type of database, not a storage system. Attached drives may be either SSDs or hard drives.",
            "\\item   . C. Databases require persistent storage on block devices. Object storage does not provide data block or file system storage, making option C the correct answer. Data storage is not a type of storage system. Caches are often used with databases to improve read performance, but they are volatile and are not suitable for persistently storing data files.",
            "\\item   . B. All three services are serverless, so the user does not need to configure VMs; therefore, option B is correct. Cloud Storage is charged based on time and size of data stored. App Engine Standard and Cloud Functions are not restricted to just the Go language.",
            "\\item    C. Cloud Load Balancing distributes workloads within and across regions, provides health checks, and implements autoscaling. Cloud DNS provides domain name services, such as translating a URL like www.example.com to an IP address. Cloud Spanner is a distributed relational database but does not implement workload distribution. Cloud CDN distributes content across regions to reduce latency when delivering content to users across the globe.",
            "\\item    C. App Engine flexible environments allow you to run containers on the App Engine PaaS. Kubernetes Engine is an orchestration platform for running containers. Both provide container management services. The App Engine standard environment runs applications in language-specific sandboxes and is not a general container management system. Cloud Functions is a serverless service for running code in response to events. It does not provide container services.",
            "\\item    D. Options A and B are both correct answers. The Apigee API platform provides policybased rate-limiting and routing services to help accommodate spikes in traffic. It also provides OAuth 2.0 and SAML authentication. It does not provide version control; Cloud Source Repositories is the service user for version control.",
            "\\item    A. Cloud Armor builds on GCP’s load balancing services to provide the ability to allow or restrict access based on IP address, deploy rules to counter cross-site scripting attacks, and provide countermeasures to SQL injection attacks. Cloud CDN is a content distribution service, not a security service. Identity Access Management is a security service, but it is for authentication and authorization, not denial-of-service mitigation. Virtual private clouds are used to restrict network access to an organization’s resources, but it does not have features to mitigate denial-of-service attacks. Also, Cloud CDN acts as a first line of defense in the case of DDoS attacks.",
            "\\item    A. This is a good use case for preemptible VMs because they could reduce the cost of running the second application without the risk of losing work. Since tasks are deleted from the queue only after they are completed if a preemptible VM is shut down before completing the task, another VM can perform the task. Also, there is no harm in running a task more than once, so if two VMs do the same task, it will not adversely affect the output of the application. DataProc and Spanner are not appropriate products for this task.",
            "\\item    B.  Cloud Memorystore is the only GCP designed to cache data in memory. Cloud SQL is  a relational database service and might be a good option for the backend database. Cloud Spanner is a global relational database and is a good option when you need a globally consistent database. Cloud Datastore is a document database suitable for product catalogs, user profiles, and other semistructured data.",
            "\\item    D. All three of the services listed, Compute Engine, Cloud Storage, and network firewalls, can be managed and configured using Cloud SDK.",
            "\\item    D. Cloud Functions is a serverless product, no configuration is required.",
            "\\item    D. The Stackdriver Logging product is used to consolidate and manage logs generated by applications and servers.",
            "\\item   . B. The data analytics set of specialized services includes products that help with extraction, transformation, and loading (ETL) and work with both batch and streaming data. The Apigee API platform is used for managing APIs and does not meet the needs described. AI and machine learning might be useful for analyzing data in the data warehouse, but the services in that set are not always helpful for ETL operations. Cloud SDK is used to control services but by itself is not directly able to perform the operations needed.",
            "\\item   . B. Bigtable is designed to accept billions of rows of data. Collecting data from 100,000 sensors every 5 seconds will generate 6,000,000 data points every minute, or 8,640,000,000 data points per day. Spanner is a relational database and supports transactions, but they are not needed. Cloud SQL MySQL and Cloud SQL PostgreSQL would be difficult to scale to this level of read and write performance.",
            "\\item   . A. Cloud Firestore is a mobile database service that can synchronize data between mobile devices and centralized storage. Spanner is a global relational database for large-scale applications that require transaction support in highly scaled databases. Datastore and Cloud SQL could be used but would require more custom development to synchronize data between mobile devices and the centralized data store.",
            "\\item   . B. A computationally intensive application obviously requires high CPUs, but the fact that there are many mathematical calculations indicates that a GPU should be used. You might consider running this in a cluster, but the work is not easily distributed over multiple servers, so you will need to have a single server capable of handling the load. Immediate access to large amounts of data indicates that a high-memory machine should be recommended.",
            "\\item   . B. Identities are abstractions of users. They can also represent characteristics of processes that run on behalf of a human user or a VM in the GCP. Identities are not related to VM IDs. Roles are collections of privileges that can be granted to identities. Option D is synonymous with option C.",
            "\\item   . C. Cloud Natural Language Processing provides functionality for analyzing text. Cloud Text Miner does not exist. Cloud ML is a general-purpose machine learning service that could be applied to text analysis but would require knowledge of language processing, which the client does not have. Cloud Vision is for image processing.",
            "\\item   . B. Both options B and D would meet the need of running Spark, which would give the data scientists access to the machine library they need. However, option D requires that they manage and monitor the cluster of servers, which would require more DevOps and administration work than if they used the Dataproc service. Option C, BigQuery, is a scalable database, not a platform for running Spark. Cloud Spark is a fictitious product and does not exist in the GCP.",
            "\\item   . B. Option B is correct. Spanner supports ANSI 2011 standard SQL and global transactions. Cloud SQL supports standard SQL but does not have global transaction. Datastore and Bigtable are NoSQL databases.",
            "\\item   . A. Dataproc is designed to execute workflows in both batch and streaming modes, which makes option A correct. BigQuery is a data warehouse service. Datastore is a document database. AutoML is a machine learning service.",
            "\\item   . C. App Engine standard environment provides a serverless Python sandbox that scales automatically, so option C is correct. App Engine flexible environment runs containers and requires more configuration. Cloud Engine and Kubernetes Engine both require significant management and monitoring.",
            "\\item   . D. Error reporting consolidates crash information, which makes Error Reporting the right answer. Monitoring collects metrics on application and server performance. Logging is a log management service. Dataproc is not part of Stackdriver; it is a managed Hadoop and Spark service.",
            "\\item    A. Option A, the correct answer, separates the two main applications into their own folders and further allows separating private insurance from government payer, but using folders for each. This satisfies the regulatory need to keep the government payer software isolated from other software. Option B does not include an organization, which is the root of the resource hierarchy. Option C is not flexible with regard to differences in constraints on different applications. Option D is false because option A does meet the requirements.",
            "\\item    C. Resource hierarchies have a single organization at the root, which makes option C correct. Below that, there are folders that can contain other folders or projects. Folders can contain multiple folders and multiple projects.",
            "\\item    B. Service accounts are designed to give applications or VMs permission to perform tasks. Billing accounts are for associating charges with a payment method. Folders are part of resource hierarchies and have nothing to do with enabling an application to perform a task. Messaging accounts are a fictitious option.",
            "\\item    B. Inherited policies can be overridden by defining a policy at a folder or project level. Service accounts and billing accounts are not part of the resource hierarchy and are not involved in overriding policies.",
            "\\item    E. All of the listed types of constraints are supported in policies.",
            "\\item    B. Option B is the correct answer because Publisher is not a primitive role. Owner, Editor, and Viewer are the three primitive privileges in GCP.",
            "\\item    D. Primitive roles only include the Owner, Editor, and View permissions. Predefined roles are designed for GCP products and services, like App Engine and BigQuery. For a custom application, you can create sets of privileges that give the user with that role as much permission as needed but not more.",
            "\\item    D. Users should have only the privileges that are needed to carry out their duties. This is the principle of least privilege. Rotation of duties is another security principle related to having different people perform a task at a different times. Defense in depth is the practice of using multiple security controls to protect the same asset. Option B is not a real security principal.",
            "\\item    A. A resource hierarchy has only one organization, which makes option A correct. You can, however, create multiple folders and projects within a resource hierarchy.",
            "\\item   . B. In option B, the correct answer, the billing account is used to specify payment information and should be used to set up automatic payments. Service accounts are used to grant privileges to a VM and are not related to billing and payments. Resource accounts and credit accounts do not exist.",
            "\\item   . C. GCP offers a free service level for many products, which makes option C the correct answer. You can use these services without having to set up a billing account. Google charges for serverless products, such as Cloud Functions and App Engine, when customers exceed the amount allowed under the free tier.",
            "\\item   . D. Stackdriver Workspaces are linked to projects, not individual resources like VM instances, clusters, or App Engine apps, so option D is correct. Options A, B, and C all incorrectly indicate that Workspaces are associated with individual compute resources.",
            "\\item   . D. Large enterprises should use invoicing when incurring large charges, which makes option D the right answer. A self-service account is appropriate only for amounts that are within the credit limits of credit cards. Since the subdivisions are independently managed and have their own budgets, each should have its own billing accounts.",
            "\\item   . A. When a user is granted iam.serviceAccountUser at the project level, that user can manage all service accounts in the project, so option A is correct. If a new service account is created, they will automatically have privilege to manage that service account. You could grant iam.serviceAccountUser to the administrator at the service account level, but that would require setting the role for all service accounts. If a new service account is created, the application administrator would have to grant iam.serviceAccountUser to the other administrator on the new service account. iam.serviceProjectAccountUser is a fictional role.",
            "\\item   . C. When a service account is created, Google generates encrypted keys for authentication, making option C correct. Usernames and passwords are not an option for service accounts. Two-factor authentication is an authentication practice that requires two forms of authentication, such as a username password pair and a code from an authentication device. Biometrics cannot be used by services and is not an option.",
            "\\item   . B. Service accounts are resources that are managed by administrators, but they also function as identities that can be assigned roles, which makes option B the correct answer. Billing accounts are not related to identities. Projects are not identities; they cannot take on roles. Roles are resources but not identities. They can take on privileges, but those privileges are used only when they are attached to an identity.",
            "\\item   . B. Predefined roles are defined for a particular product, such as App Services or Compute Engine, so option B is the right answer. They bundle privileges often needed together when managing or using a service. Primitive roles are building blocks for other roles. Custom roles are created by users to meet their particular needs; Application roles is a fictitious role.",
            "\\item   . B. By default all users in an organization can create projects, which makes option B correct. The role resourcemanager.projects.create is the role that allows users to create projects. The billing account is not associated with creating projects.",
            "\\item   . D. The maximum number of organizations is determined on a per-account basis by Google, so option D is the correct answer. If you need additional organizations, you can contact Google and ask for an increase in your limit.",
            "\\item   . B. Users with the Organization IAM role are not necessarily responsible for determining what privileges should be assigned to users. That is determined based on the person’s role in the organization and the security policies established within the organization, which makes option B correct.",
            "\\item    B. The App Engine standard environment can run Python applications, which can autoscale down to no instances when there is no load and thereby minimize costs. Compute Engine and the App Engine flexible environment both require more configuration management than the App Engine standard environment. Kubernetes Engine is used when a cluster of servers is needed to support large or multiple applications using the same computing resources.",
            "\\item    A. Database servers require high availability to respond to queries from users or applications. Preemptible machines are guaranteed to shut down in at most 24 hours. A batch processing job with no fixed time requirements could use preemptible machines as long as the VM is restarted. High-performance computing clusters can use preemptible machines because work on a preemptible machine can be automatically rescheduled for another node on the cluster when a server is preempted. D is incorrect because there is a correct answer in the set of options.",
            "\\item    A. VMs are created in projects, which are part of the resource hierarchy. They are also located in geographic regions and data centers, so a zone is specified as well. Usernames and admin roles are not specified during creation. The billing account is tied to a project and so does not have to be specified when the VM is created. Cloud storage buckets are created independently of VMs. Not all VMs will make use of storage buckets.",
            "\\item    C. Compute Engine can run Docker containers if you install Docker on the VM. Kubernetes and the App Engine flexible environment support Docker containers. The App Engine standard environment provides language-specific runtime environments and does not allow customers to specify custom Docker images for use.",
            "\\item    B. The name of the file that is used to build and configure a Docker container is Dockerfile.",
            "\\item    D. Kubernetes uses 25 percent of memory up to 4GB and then slightly less for the next 4GB, and it continues to reduce the percentage of additional memory down to 2 percent of memory over 128GB.",
            "\\item    B. Kubernetes provides load balancing, scaling, and automatic upgrading of software. It does not provide vulnerability scanning. GCP does have a Cloud Security Scanner product, but that is designed to work with App Engine to identify common application vulnerabilities.",
            "\\item    D. The scenario described is a good fit for Kubernetes. Each of the groups of services can be structured in pods and deployed using Kubernetes deployment. Kubernetes Engine manages node health, load balancing, and scaling. App Engine Standard Edition has language-specific sandboxes and is not a good fit for this use case. Cloud Functions is designed for short-running event processing and is not the kind of continuous processing needed in this scenario. Compute Engine could meet the requirements of this use case, but it would require more effort on the part of application administrators and DevOps professionals to configure load balancers, monitor health, and manage software deployments.",
            "\\item    B. This is an ideal use case for Cloud Functions. The cloud function is triggered by a file upload event. The cloud function calls the image processing service. With this setup, the two services are independent. No additional servers are required. Option A violates the requirement to keep the services independent. Options C and D incur more management overhead and will probably cost more to operate than option B.",
            "\\item   . D. Each invocation of a cloud function runs in a secure, isolated runtime environment. There is no need to check whether other invocations are running. With the Cloud Functions service, there is no way for a developer to control code execution at the process or thread level.",
            "\\item   . A. You would create a custom image after you installed the custom code, in this case the encryption library. A public image does not contain custom code, but it could be used as the base that you add custom code to. Both CentOS and Ubuntu are Linux distributions. You could use either as the base image that you add custom code to, but on their own, they do not have custom code.",
            "\\item   . B. Projects are the lowest level of the resource hierarchy. The organization is at the top of the hierarchy, and folders are between the organization and projects. VM instances are not part of the resource hierarchy.",
            "\\item   . D. All Google regions have the same level of service level agreement, so reliability is the same. Costs may differ between regions. Regulations may require that data stay within a geographic area, such as the European Union. Latency is a consideration when you want a region that is close to end users or data you will need is already stored in a particular region.",
            "\\item   . B. Compute Engine Admin Role is the role that gives users complete control over instances. Options A and C are fictitious roles. Compute Engine Security Admin gives users the privileges to create, modify, and delete SSL certificates and firewall rules.",
            "\\item   . D. Preemptible VMs will be terminated after 24 hours. Google does not guarantee that preemptible VMs will be available. Once an instance is started as a preemptible machine, it cannot migrate to a regular VM. You could, however, save a snapshot and use that to create a new regular instance.",
            "\\item   . C. Custom VMs can have up to 64 CPUs and up to 6.5GB of memory per vCPU.",
            "\\item   . C. The C programming language is not supported in the App Engine standard environment. If you need to run a C application, it can be compiled and run in a container running in the App Engine flexible environment.",
            "\\item   . B. Kubernetes reserves CPU capacity according to the following schedule:  1. 6 percent of the first core         2. 1 percent of the next core (up to two cores)         3. 0.5 percent of the next two cores (up to four cores)         4. 0.25 percent of any cores above four cores ",
            "\\item    B. The only states a Kubernetes deployment can be in are progressing, completed, and failed.",
            "\\item   . A. Cloud Functions is best suited for event-driven processing, such as a file being uploaded to Cloud Storage or an event being writing to a Pub/Sub queue. Long-running jobs, such as loading data into a data warehouse, are better suited to Compute Engine or App Engine.",
            "\\item    C.  You should verify the project selected because all operations you perform will apply to resources in the selected project, making option C the correct answer. You do not need to open Cloud Shell unless you want to work with the command line, and if you did, you should verify that the project is correctly selected first. Logging into a VM using SSH is one of the tasks that requires you to be working with the correct project, so logging in via SSH should not happen before verifying the project. The list of VMs in the VM Instance window is a list of VMs in the current project. You should verify which project you are using to ensure you are viewing the set of VMs you think you are using.",
            "\\item    A. You will need to set up billing if it is not already enabled when you start using the console, so option A is the right answer. You may create a project, but you will be able to do this only if billing is enabled. You do not need to create a storage bucket to work with the console. Specifying a default zone is not a one-time task; you may change zones throughout the life of your project.",
            "\\item    B.  The name of the VM, the region and zone, and the machine type can all be specified in the console along with other parameters, so option B is correct. Option A is missing required parameters. A CIDR block is a range of IP addresses that is associated with a subnet and not needed to create a VM. An IP address is assigned automatically so it is not required.",
            "\\item    B. Different zones may have different machine types available, so you will need to specify a region first and then a zone to determine the set of machine types available. If the machine type does not appear in the list, it is not available in that zone. This makes option B the correct answer. Options A and C are incorrect. Subnets and IP addresses are not related to the machine types available. Unless you are specifying a custom machine type, you do not specify the amount of memory; that is defined by the machine type, so option D is incorrect.",
            "\\item    C. Labels and descriptions are for helping us track our own attributes of resources; GCP does not need them to perform its tasks. As the number of servers grows, it can become difficult to track which VMs are used for which applications and services, so option C is the correct answer. Labels and a general description will help administrators track numbers of VMs and their related costs. Options A and B are used for security and storage but do not help with managing multiple VMs. Option D is only partially correct. Descriptions are helpful but so are labels.",
            "\\item    A. The Availability Policy section within the Management tab is where you set preemptibility, so option A is correct. Identity And API Access is used to control the VM’s access to Google Cloud APIs and which service account is used with the VM. Sole Tenancy is used  if you need to run your VMs on physical servers that only run your VMs. Networking is used to set network tags and change the network interface.",
            "\\item    B. Shield VM is an advanced set of security controls that includes Integrity Monitoring, a check to ensure boot images have not been tampered with, which makes option B the right answer. Firewalls are used to control ingress and egress of network traffic to a server or subnet. Project-wide SSH keys are used for authenticating users across servers within a project. Boot disk integrity check is a fictional feature.",
            "\\item    C. Block size is not an option in the Additional Disks dialog, so option C is correct. Encryption key management, disk type, and the option of specifying a source image are all available options.",
            "\\item    B. Using version-controlled scripts is the best approach of the four options. Scripts can be documented with reasons for the changes and they can be run repeatedly on different machines to implement the same change. This reduces the chance of error when manually entering a command. Option A does not help to improve documenting why changes were made. Option C could help improve documentation, but executable scripts are precise and accurate reflections of what was executed. Notes may miss details. Option D is not advisable. You could become a bottleneck to making changes, changes cannot be made when you are unavailable, and your memory may not be a reliable way to track all configuration changes.",
            "\\item   . A. gcloud compute instances is the start of commands for administering Compute Engine resources, making option A the right answer. Option B, gcloud instances, is missing the compute keyword that indicates we are working with Compute Engine. Option C has switched the order of compute and instances. Option D is false because option A is the correct answer.",
            "\\item   . B. Option B follows the pattern of the glcoud command, which is hierarchical and starts with the glcoud name of the service, in this case compute for Compute Engine, followed by the next level down, which in this case is instances. Finally, there is the action or verb, in this case list. Option A is missing the term instances to indicate you are working with VM instances. Option C is missing the compute keyword to indicate you are working with Compute Engine. Option D is missing the compute instance keyword and has switched the order of instances and list.",
            "\\item   . B. The correct format is to use the --labels parameter and specify the key followed by an equal sign followed by the value in option B. Options A and C have the wrong character separating the key and value. Option D is incorrect because it is possible to specify labels in the command line.",
            "\\item   . C. The two operations you can specify when using the book disk configuration are adding a new disk and attaching an existing disk, so option C is correct. Reformatting an existing disk is not an option, so options A, B, and D cannot be the correct answer.",
            "\\item   . B. 10 GB of data is small enough to store on a single disk. By creating an image of a disk with the data stored on it, you can specify that source image when creating a VM. Option A would require the data scientist to copy the data from Cloud Storage to a disk on the VM. Option C would similarly require copying the data. Option D would load data into a database, not a file system as specified in the requirements.",
            "\\item   . B. In the Network tab of the VM form, you can add another network interface, so option B is correct. GCP sets the IP address, so option A is incorrect. There is no option to specify a router or change firewall rules on the Network tab, so options C and D are incorrect.",
            "\\item   . A. The correct option is boot-disk-type, which is option A. The other three options are not parameters to the gcloud compute instances command.",
            "\\item   . A. Option A is the correct command. It is the only option that includes a correct machine type and properly specifies the name of the instance. Option B uses the --cpus parameter, which does not exist. Option C uses the parameter instance-name, which does not exist. The instance name is passed as an argument and does not need a parameter name. Option D is incorrect because machine type n1-4-cpu is not a valid machine type.",
            "\\item   . C. Option C is the correct command, which is gcloud compute instances, to indicate you are working with VMs, followed by the stop command and the name of the VM. Option A is incorrect because halt is not an option. Option B is incorrect because –terminate is not a parameter. Option D is missing the word instances, which indicates you are working with VMs.",
            "\\item   . B. SSH is service for connecting to a remote server and logging into a terminal window. Once logged in, you would have access to a command line, so option B is the right answer. FTP is a file transfer protocol and does not allow you to log in and perform system administration tasks. RDP is a protocol used to remotely access Windows servers, not Ubuntu, which is a Linux distribution. ipconfig is a command-line utility for configuring IP stacks on a device and does not allow you to log into a remote server.",
            "\\item   . A. All of the statements in option A are true and relevant to billing and costs. Option B is correct that VMs are billed in 1-second increments, but the only preemptible VMs are shut down within 24 hours of starting. Option C is incorrect because discounts are not limited to some regions. Option D is incorrect because VMs are not charged for a minimum of 1 hour.",
            "\\item    A. The Compute Engine page is where you have the option of creating a single VM instance, so option A is the correct answer. App Engine is used for containers and running applications in language-specific runtime environments. Kubernetes Engine is used to create and manage Kubernetes clusters. Cloud Functions is where you would create a function to run in Google’s serverless cloud function environment.",
            "\\item    B. Instances can be stopped, and when they are, then you cannot connect to them via SSH, which makes option B the correct answer. Starting the instance will enable SSH access. Option A is not correct because you can log into preemptible machines. Option C is incorrect because there is no No SSH option. Option D is incorrect because the SSH option can be disabled.",
            "\\item    B. The Reset command can be used to restart a VM; thus, option B is correct. The properties of the VM will not change, but data in memory will be lost. There is no Reboot, Restart, Shutdown, or Startup option in the console.",
            "\\item    C. Labels, members of a managed instance group, and status are all available for filtering, so option C is the correct answer. You can also filter by internal IP, external IP, zone, network, deletion protection, and member of a managed or unmanaged instance group.",
            "\\item    A. To function properly, the operating system must have GPU libraries installed, so option A is correct. The operating system does not have to be Ubuntu based, and there is no need to have at least eight CPUs in an instance before you can attach and use a GPU. Available disk space does not determine if a GPU is used or not.",
            "\\item    A. If you add a GPU to a VM, you must set the instance to terminate during maintenance, which makes option A the correct response. This is set in the Availability Policies section of the VM configuration form. The instance does not need to be preemptible and it can have non-boot disks attached. The instance is not required to run Ubuntu 14.02 or later.",
            "\\item    B. When you first create a snapshot, GCP will make a full copy of the data on the persistent disk. The next time you create a snapshot from that disk, GCP will only copy the data that has changed since the last snapshot. Option A is incorrect; GCP does not store a full copy of the second snapshot. Option C is incorrect; the first snapshot is not deleted automatically. Option D is incorrect, subsequent snapshots do not incur 10 percent overhead.",
            "\\item    D. To work with snapshots, a user must be assigned the Compute Storage Admin role, which makes option D the correct answer. The other options are fictitious roles.",
            "\\item    C. Images can be created from four sources, namely, disks, snapshots, cloud storage files, or another image, so option C is the right answer. Database export files are not sources for images.",
            "\\item   . B. Deprecated marks the image as no longer supported and allows you to specify a replacement image to use going forward, making option B the correct answer. Deprecated images are available for use but may not be patched for security flaws or have other updates. The other options are fictitious features of images.",
            "\\item   . C. The base command for working with instances is gcloud compute instances, which makes option C the correct answer. The list command is used to show details of all instances. By default, output is in human-readable form, not json. Using the --format json option forces the output to be in JSON format. --output is not a valid option.",
            "\\item   . B. –-async causes information about the start process to be displayed; therefore, option B is correct. --verbose is an analogous parameter in many Linux commands. --describe provides details about an instance but not necessarily the startup process. --details is not a valid parameter.",
            "\\item   . C. The command to delete an instance is gcloud compute instances delete followed by the name of the instance, so option C is correct. Option A is incorrect because there is no instance parameter. Option B is incorrect because that command stops but does not delete the instance. Option D is missing instances in the command, which is required to indicate what type of entity is being deleted.",
            "\\item   . A. gcloud compute instances is the base command followed by delete, the name of the instance, and --keep-disks=boot, so option A is correct. There is no --save-disk parameter. Option C is wrong because filesystem is not a valid value for the keep-disk parameter. Option D is missing the instances option which is required in the command.",
            "\\item   . B. The correct answer is option B, which is to use the describe command. Option A will show some fields but not all. Options C and D are incorrect because there is no detailed parameter.",
            "\\item   . B. Instance groups are sets of VMs that can be configured to scale and are used with load balancers, which contribute to improving availability, so option B is correct. Preemptible instances are not highly available because they can be shut down at any time by GCP. Cloud Storage is not a Compute Engine component. GPUs can help improve throughput for math-intensive operations but do not contribute to high availability.",
            "\\item   . B. An instance group template is used to specify how the instance group should be created, which makes option B the correct answer. Option A is incorrect because instances are created automatically when an instance group is created. Boot disk images and snapshots do not have to be created before creating an instance group.",
            "\\item   . B. The command to delete an instance group is gcloud compute instance-template delete, so option B is correct. Option A incorrectly includes the term instances. Option C is in incorrect order. Option D is wrong because instance-template is in the wrong position and is plural in the option.",
            "\\item   . C. You can configure an autoscaling policy to trigger adding or removing instances based on CPU utilization, monitoring metric, load balancing capacity, or queue-based workloads. Disk, network latency, and memory can trigger scaling if monitoring metrics on those resources are configured. So, option C is correct.",
            "\\item   . B. Unmanaged instance groups are available for limited use cases such as this. Unmanaged instance groups are not recommended in general. Managed instance groups are the recommended way to use instance groups, but the two different configurations prevents their use. Preemptible instances and GPUs are not relevant to this scenario.",
            "\\item    C. Kubernetes creates instance groups as part of the process of creating a cluster, which makes option C the correct answer. Stackdriver, not instance groups, is used to monitor the health of nodes and to create alerts and notifications. Kubernetes creates pods and deployments; they are not provided by instance groups.",
            "\\item    A. A Kubernetes cluster has a single cluster master and one or more nodes to execute workloads, so option A is the correct answer. Stackdriver is not part of the Kubernetes cluster; it is a separate GCP service. Kubernetes does not require instances with at least four vCPUs; in fact, the default node configuration uses one vCPU.",
            "\\item    C. Pods are single instances of a running process in a cluster, so option C is correct. Pods run containers but are not sets of containers. Application code runs in containers that are deployed in pods. Pods are not controllers, so they cannot manage communication with clients and Kubernetes services.",
            "\\item    B. Services are applications that provide API endpoints that allow applications to discover pods running a particular application, making option B correct. Options A and C, if they could be coded using the API designed for managing clusters, would require more code than working with services and are subject to changes in a larger set of API functions. Option D is not an actual option.",
            "\\item    C. ReplicaSets are controllers that are responsible for maintaining the correct number of pods, which makes option C the correct answer. Deployments are versions of application code running on a cluster. Stackdriver is a monitoring and logging service that monitors but does not control Kubernetes clusters. Jobs is an abstraction of workloads and is not tied to the number of pods running in a cluster.",
            "\\item    B. Multizone/multiregion clusters are available in Kubernetes Engine and are used to provide resiliency to an application, so option B is correct. Option A refers to instance groups that are a feature of Compute Engine, not directly of Kubernetes Engine. Option C is incorrect; regional deployments is a fictitious term. Load balancing distributes load and is part of Kubernetes by default. If load is not distributed across zones or regions, it does not help to add resiliency across data centers.",
            "\\item    A. Option A is the best answer. Starting with an existing template, filling in parameters, and generating the gcloud command is the most reliable way. Option D may work, but multiple parameters that are needed for your configuration may not be in the script you start with. There may be some trial and error with this option. Options B and C may lead to a solution but could take some time to complete.",
            "\\item    A. The correct command is option A. Option B has beta in the wrong position. Option C is missing beta. Option D is missing the --num-nodes parameter name.",
            "\\item    C. Time to Live is not an attribute of deployments, so option C is the correct answer. Application name, container image, and initial command can all be specified.",
            "\\item   . B. Deployment configuration files created in Cloud Console are saved in YAML format. CSV, TSV, and JSON are not used.",
            "\\item   . C. The kubectl command is used to control workloads on a Kubernetes cluster once it is created, so option C is correct. Options A and B are incorrect because gcloud is not used to manipulate Kubernetes processes. Option D is wrong because beta is not required in kubectl commands.",
            "\\item   . C. Option C is the correct command. Option A uses the term upgrade instead of scale. Option B incorrectly uses gcloud. Option D uses the incorrect parameter pods.",
            "\\item   . D. Stackdriver is a comprehensive monitoring, logging, alerting, and notification service that can be used to monitor Kubernetes clusters.",
            "\\item   . B. Workspaces are logical structures for storing information about resources in a project that are being monitored, so option B is correct. Stackdriver works with logs, but a log is not required before starting to use Stackdriver. Pods and ReplicaSets are part of Kubernetes, not Stackdriver.",
            "\\item   . C. The Stackdriver Instance Detail page includes time-series charts on CPU usage, network traffic, and disk I/O.",
            "\\item   . B. When creating an alert policy, you can specify conditions, notifications, and documentation, making option B the correct answer. Options A and D are incorrect because there is no Time to Live attribute on policies. Option C is wrong because it does not include notifications and documentation.",
            "\\item   . A. Alerts can have multiple channels, so Option A is correct. Channels include email, webhooks, and SMS text messaging as well as third-party tools such as PagerDuty, Campfire, and Slack. There is no need for multiple alerts with individual notifications. Option C is ad hoc and would require additional maintenance overhead. Option D does not meet requirements.",
            "\\item   . B. Alerts are assigned to instances or sets of instances; therefore, option B is correct. Option A is incorrect because it does not include groups. Option C is incorrect because it does not include instances. Option D is wrong because alerts are not assigned to pods.",
            "\\item   . A. All interactions with the cluster are done through the master using the Kubernetes API. If an action is to be taken on a node, the command is issued by the cluster master, so option A is the correct answer. Options B and D are incorrect because they are controllers within the cluster and do not impact how commands are received from client devices. Option C is incorrect because kubectl, not gcloud, is used to initiate deployments.",
            "\\item   . A. Services provide a level of indirection to accessing pods. Pods are ephemeral. Clients connect to services, which can discover pods. ReplicaSets and StatefulSets provide managed pods. Alerts are for reporting on the state of resources.",
            "\\item    B. When on the Cloud Console pages, you can click the cluster name to see a Details page, so option B is the correct answer. Typing the name of cluster in the search bar does not always return cluster details; it can return instance group details. There is no such command as gcloud cluster details.",
            "\\item    D. You can find the number of vCPUs on the cluster listing in the Total Cores column or on the Details page in the Node Pool section in the size parameter, making option D correct. The Labels section does not have vCPU information.",
            "\\item    B. The correct command includes gcloud container to describe the service, clusters to indicate the resource you are referring to, and list to indicate the command, which makes option B the correct answer. Options A and C are not valid commands.",
            "\\item    B. It is likely you do not have access privileges to the cluster. The gdcloud container clusters get-credentials command is the correct command to configure kubectl to use GCP credentials for the cluster, so option B is the right option. Options A, C, and D are invalid commands.",
            "\\item    C. Clicking the Edit button allows you to change, add, or remove labels, so option C is the correct answer. The Connect button is on the cluster listing page, and the Deploy button is for creating new deployments. There is no way to enter labels under the Labels section when displaying details.",
            "\\item    D. When resizing, the gcloud container clusters resize command requires the name of the cluster and the node pool to modify. The size is required to specify how many nodes should be running. Therefore, option D is correct.",
            "\\item    B. Pods are used to implement replicas of a deployment. It is a best practice to modify the deployments, which are configured with a specification of the number of replicas that should always run, so option B is the correct answer. Option A is incorrect; you should not modify pods directly. Options C and D are incorrect because they do not change the numuber of pods running an application.",
            "\\item    C. Deployments are listed under Workloads, making option C the correct answer. The Cluster option shows details about clusters but does not have details on deployments. Storage shows information about persistent volumes and storage classes. Deployments is not an option.",
            "\\item    B. There are four actions available for deployments (Autoscale, Expose, Rolling Update, and Scale), so option B is correct. Add, Modify, and Delete are not options.",
            "\\item   . C. Since deployments are managed by Kubernetes and not GCP, we need to use a kubectl command and not a gcloud command, which makes option C correct. Option D is incorrect because it follows the gcloud command structure, not the kubectl command structure. The kubectl command has the verb, like get, before the resource type, like deployments, for example.",
            "\\item   . D. You can specify container image, cluster name, and application name along with the labels, initial command, and namespace; therefore, option D is the correct answer.",
            "\\item   . A. The Deployment Details page includes services, so option A is the correct answer. Containers are used to implement services; service details are not available there. The Clusters Detail page does not contain information on services running in the cluster.",
            "\\item   . A. kubectl run is the command used to start a deployment. It takes a name for the deployment, an image, and a port specification. The other options are not valid kubectl commands.",
            "\\item   . A. Option A shows the correct command, which is kubectl delete service ml-classifier-3. Option B is missing the service term. Options C and D cannot be correct because services are managed by Kubernetes, not GCP.",
            "\\item   . C. The Container Registry is the service for managing images that can be used in other services, including Kubernetes Engine and Compute Engine, making option C correct. Both Compute Engine and Kubernetes Engine use images but do not manage them. There is no service called Container Engine.",
            "\\item   . A. Images are managed by GCP, so the correct command will be a gcloud command, so option A is the correct answer. Option B is incorrect because the verb is placed before the resource. Options C and D are incorrect because kubectl is for managing Kubernetes resources, not GCP resources like container images.",
            "\\item   . B. The correct command is gcloud container images describe, which makes option B the right answer. describe is the gcloud verb or operation for showing the details of an object. All other options are invalid commands.",
            "\\item   . B. The kubectl expose deployment command makes a service accessible, so option B is the correct answer. IP addresses are assigned to VMs, not services. The command gcloud does not manage Kubernetes services, so option C is incorrect. Option D is incorrect because making a service accessible is not a cluster-level task.",
            "\\item   . B. Autoscaling is the most cost-effective and least burdensome way to respond to changes in demand for a service, so option B is the correct answer. Option A may run nodes even when they are not needed. Option C is manually intensive and requires human intervention. Option D reduces human intervention but does not account for unexpected spikes or lulls in demand.",
            "\\item   . B. Cloud engineers working with Kubernetes will need to be familiar with working with clusters, nodes, pods, and container images. They will also need to be familiar with deployment. Option B is the correct answer because the other options are all missing an important component of Kubernetes that cloud engineers will have to manage.",
            "\\item    B. Versions support migration. An app can have multiple versions, and by deploying with the --migrate parameter, you can migrate traffic to the new version, so option B is the correct answer. Services are a higher-level abstraction and represent the functionality of a microservice. An app may have multiple services, but they serve different purposes. Instances execute code in a version. Instances may be added and removed as needed, but they will run only one version of a service. Instance groups are part of Compute Engine and are not an App Engine component.",
            "\\item    A. Autoscaling enables setting a maximum and minimum number of instances, which makes option A correct. Basic scaling does not support maximum and minimum instances. Option C is not recommended because it is difficult to predict when load will peak and even if the schedule is predictable today, it may change over time. Option D is wrong; there is no instance detection option.",
            "\\item    B. Application is the top-level component, so option B is the correct answer. Applications have one or more services. Services have one or more versions. Versions are executed on one or more instances when the application is running.",
            "\\item    B. The correct command is gcloud app deploy, which is option B. Options A and C are incorrect because gcloud components commands are used to install gcloud commands for working with parts of App Engine, such as the Python runtime environment. Option D is incorrect; you do not need to specify instance in the command.",
            "\\item    B. The app.yaml file is used to configure an App Engine application, which makes option B correct. The other options are not files used to configure App Engine.",
            "\\item    A. A project can support only one App Engine app, so option A is the right answer. If you’d like to run other applications, they will need to be placed in their own projects.",
            "\\item    C. The correct answer is option C because the correct parameter is --no-promote. Option A uses no-traffic, which is not a valid parameter to the gcloud app deploy command. Option B does not get the code out and could release the code too early if there is a delay in getting the press release out. Option D does not meet the requirements of getting the code out as soon as possible.",
            "\\item    B. App Engine applications are accessible from URLs that consist of the project name followed by appspot.com, so option B is correct. Option A is incorrect because the domain is not appengine.com. Options C and D are incorrect because the names of services are not used to reference the application as a whole.",
            "\\item    A. max-concurrent-requests lets you specify the maximum number of concurrent requests before another instance is started, which makes option A correct. target throughput-utilization functions similarly but uses a 0.05 to 0.95 scale to specify maximum throughput utilization. max-instances specifies the maximum number of instances but not the criteria for adding instances. max-pending-latency is based on the time a request waits, not the number of requests.",
            "\\item   . C. Basic scaling only allows for idle time and maximum instances, so option C is the right answer. min-instances is not supported. target-throughput-utilization is an auto scaling parameter, not a basic scaling parameter.",
            "\\item   . C. The runtime parameter specifies the language environment to execute in, which makes option C correct. The script to execute is specified by the script parameter. The URL to access the application is based on the project name and the domain appspot.com. There is no parameter for specifying the maximum time an application can run.",
            "\\item   . A. Resident instances are used with manual scaling while dynamic instances are used with autoscaling and basic scaling, so option A is the correct answer. There are no persistent, stable, or nonresident types of App Engine instances.",
            "\\item   . A. Using dynamic instances by specifying autoscaling or basic scaling will automatically adjust the number of instances in use based on load, so option A is correct. Option B is incorrect because autoscaling and basic scaling only create dynamic instances. Options C and D are incorrect because manual scaling will not adjust instances automatically, so you may continue to run more instances than needed at some points.",
            "\\item   . A. The correct answer is gcloud app services set-traffic. Option B is incorrect because the term instances is not needed. Option C is incorrect because it does not specify the term services. Option D is incorrect because that would require changes on the client’s part.",
            "\\item   . A. --split-traffic is the parameter used to specify the method for splitting traffic, which makes option A correct. Valid options are cookie, ip, and random. All other options are not valid parameters to the gcloud app services set-traffic command.",
            "\\item   . B. --split is the parameter for specifying a list of instances and the percent of traffic they should receive, so option B is the right answer. The other options are not valid parameters for the gcloud app services set-traffic command.",
            "\\item   . C. --migrate is the parameter for specifying that traffic should be moved or migrated to the newer instance, which makes option C the correct answer. The other options are not valid parameters for the gcloud app services set-traffic command.",
            "\\item   . D. From the App Engine console you can view the list of services and versions as well as information about the utilization of each instance.",
            "\\item   . D. All three methods listed, IP address, HTTP cookie, and random splitting, are allowed methods for splitting traffic.",
            "\\item   . B. The cookie used for splitting in App Engine is called GOOGAPPUID, which makes option B the correct answer. Options A, C, and D are not valid names.",
            "\\item    C. App Engine is designed to support multiple tightly coupled services comprising an application, making option C the correct answer. This is unlike Cloud Functions, which is designed to support single-purpose functions that operate independently and in response to isolated events in the Google Cloud and complete within a specified period of time. Compute Engine is not a serverless option. Cloud Storage is not a computing product.",
            "\\item    C. A timeout period that is too low would explain why the smaller files are processed in time but the largest are not, which makes option C the right answer. If only 10 percent of the files are failing, then it is not a syntax error or the wrong runtime selected, as in options A and B. Those errors would affect all files, not just the largest ones. Similarly, if there was a permission problem with the Cloud Storage bucket, it would affect all files.",
            "\\item    B. Those actions are known as events in Google Cloud terminology; thus, option B is the correct answer. An incident may be a security or performance-related occurrence, but those are unrelated to the expected and standardized actions that constitute events. A trigger is a declaration that a certain function should execute when an event occurs. A log entry is related to applications recording data about significant events. Log entries are helpful for monitoring and compliance, but in themselves are not event-related actions.",
            "\\item    C. The correct answer is option C because SSL is a secure protocol for remotely accessing servers. It is used, for example, to access instances in Compute Engine. It does not have events that can be triggered using Cloud Functions. The three GCP products listed do generate events that can have triggers associated with them.",
            "\\item    C. Cloud Functions supports three runtimes: Node.js 6, Node.js 8, and Python. Go and Node.js 5 are not supported runtimes.",
            "\\item    C. HTTP requests using GET, POST, DELETE, PUT, and OPTIONS can invoke an HTTP trigger in Cloud Functions, so option C is the right answer.",
            "\\item    D. The correct answer, option D, shows the four events supported in Cloud Storage. google.storage.object.finalize google.storage.object.delete google.storage.object.archive google.storage.object.metadataUpdate",
            "\\item    C. There is no option to specify the file type to apply the function to, so option C is correct. You can, however, specify the bucket to which the function is applied. You could only save files or the types you want processed in that bucket, or you could have your function check file type and then execute the rest of the function or not, based on type. All the other options listed are parameters to a Cloud Storage function.",
            "\\item    D. Cloud Functions can have between 128MB and 2GB of memory allocated, which makes option D the correct answer. The default is 256MB.",
            "\\item   . B. By default Cloud Functions can run for up to 1 minute before timing out, so option B is correct. You can, however, set the timeout parameter for a cloud function for periods of up to 9 minutes before timing out.",
            "\\item   . B. Python Cloud Functions is currently in beta. The standard set of gcloud commands does not include commands for alpha or beta release features by default. You will need to explicitly install beta features using the gcloud components install beta command, so option B is the right answer. Option A will install standard gcloud commands. Options C and D are not valid gcloud commands.",
            "\\item   . A. The correct trigger in option A is google.storage.object.finalize, which occurs after a file is uploaded. Option B is not a valid trigger name. Option C triggers when a file   is archived, not uploaded. Option D is triggered when some metadata attribute changes, but not necessarily only after a file uploads.",
            "\\item   . C. The three parameters are runtime, trigger-resource, and trigger-event, as listed in option C. All must be set, so options A and B are incorrect. file-type is not a parameter to creating a cloud function on Cloud Storage, so option D is incorrect.",
            "\\item   . A. The correct answer is option A, gcloud functions delete. Option B references components, which is incorrect. You do need to reference components when installing or updating gcloud commands but not when deleting a cloud function, so options B and C are incorrect. Option D is incorrect because the GCP entity type, in this case functions, comes before the name of the operation, in this case delete, in a gcloud command.",
            "\\item   . B. Messages are stored in a text format, base64, so that binary data can be stored in the message in a text format, so option B is correct. Option A is incorrect; it is needed to map from a binary encoding to a standard text encoding. Option C is incorrect because the function does not pad with extra characters to make them the same length. Option D is incorrect; it does not change dictionary data types into list data types.",
            "\\item   . C. Option C is correct because it includes the name of the function, the runtime environment, and the name of the Pub/Sub topic. Option A is incorrect because it’s missing both the runtime and the topic. Option B is incorrect because it is missing the topic. Option D is incorrect because the runtime specification is incorrect; you have to specify python37 and not python as the runtime.",
            "\\item   . B. There is only one type of event that is triggered in Cloud Pub/Sub, and that is when a message is published, which is option B. Option A is incorrect; Cloud Pub/Sub has one event type that can have a trigger. Option C is incorrect; Cloud Pub/Sub does not analyze the code to determine when it should be run. Option D is incorrect; you do not have to specify an event type with Cloud Pub/Sub functions.",
            "\\item   . B. The correct answer is option B because it uses a Cloud Storage finalize event to trigger conversion if needed. There is minimal delay between the time the file is uploaded and when it is converted. Option A is a possibility but would require more coding than option B. Option C is not a good option because files are not converted until the batch job runs. Option D is incorrect because you cannot create a cloud function for Cloud Pub/Sub using a finalize event. That event is for Cloud Storage, not Cloud Pub/Sub.",
            "\\item   . D. All of the options are available along with zip from Cloud Storage.",
            "\\item   . A. The HTTP trigger allows for the use of POST, GET, and PUT calls, so option A is the correct answer. Webhook and Cloud HTTP are not valid trigger types. Option D is incorrect because option A is the correct answer.",
            "\\item    D. Once a bucket is created as either regional or multiregional, it cannot be changed to the other, so option D is correct. Nearline to coldline and regional to nearline are both allowed, as is multiregional to coldline.",
            "\\item    C. The goal is to reduce cost, so you would want to use the least costly storage option. Coldline has the lowest per-gigabyte charge at USD 0.07 per GB per month, so option C is correct. Nearline is the next lowest followed by regional. Multiregional has the highest per-gigabyte charge. Both nearline and coldline have access charges, but those are not considered in this question.",
            "\\item    B. Bigtable is a wide-column database that can ingest large volumes of data consistently, so option B is correct. It also supports low-millisecond latency, making it a good choice for supporting querying. Cloud Spanner is a global relational database that is not suitable for high-speed ingestion of large volumes of data. Datastore is an object data model and not a good fit for IoT or other time series data. BigQuery is an analytics database and not designed for ingestion of large volumes of data in short periods of time.",
            "\\item    A. Option A is correct because Memorystore is a managed Redis cache. The cache can  be used to store the results of queries. Follow-on queries that reference the data stored in the cache can read it from the cache, which is much faster than reading from persistent disks. SSDs have significantly lower latency than hard disk drives and should be used for performance-sensitive applications like databases. Options B and D are incorrect because HDD persistent disks do give the best performance with respect to IOPS. Options C and D are incorrect because Datastore is a managed NoSQL database and would not have any impact on SQL query performance.",
            "\\item    B. HDDs are the better choice for persistent disks for a local database when performance is not the primary concern and you are trying to keep costs down, so option B is correct. Option A is wrong because SSDs are more expensive and the users do not need the lowest latency available. Options C and D are wrong; both of those are other databases that would not be used to store data in a local relational database.",
            "\\item    B. Lifecycle configurations can change storage class from regional to nearline or coldline. Once a bucket is created as regional or multiregional, it cannot be changed to the other, so option B is the right answer. Option A is true; you can set retention periods when creating a bucket. Option C is true; Cloud Storage does not provide file system–like access to internal data blocks. Option D is true because Cloud Storage is highly durable.",
            "\\item    A. The most recent version of an object is called the live version, so option A is correct. Options B and C are incorrect; top and active are not terms used to refer to versions. Option D is incorrect because option A is correct.",
            "\\item    B. Both Cloud SQL and Spanner are relational databases and are well suited for transaction processing applications, so option B is right. Option A is incorrect because BigQuery is relational, but it is designed for data warehousing and analytics, not transaction processing. Options C and D are incorrect because Bigtable a wide-column NoSQL database, not a relational database.",
            "\\item    C. Both MySQL and PostgreSQL are Cloud SQL options so Option C is correct. Options A and B are incorrect, SQL Server is not a Cloud SQL option. Option D is incorrect because Oracle is not a Cloud SQL option. You could choose to run SQL Server or Oracle on your instances but you would have to manage them, unlike Cloud SQL managed databases.",
            "\\item   . D. The multiregional and multi-super-regional location of nam-eur-aisa1 is the most expensive, which makes option D the right answer. Option A is a region that costs less than the multi-super-regional nam-eur-asia1. Option C is incorrect; that is a zone, and Spanner is configured to regions or super regions. Option B is incorrect; it is only a single super region, which cost less than deploying to multiple super regions.",
            "\\item   . D. BigQuery, Datastore, and Firebase are all fully managed services that do not require you to specify configuration information for VMs, which makes option D correct. Cloud SQL and Bigtable require you to specify some configuration information for VMs.",
            "\\item   . B. Datastore is a document database, which makes option B correct. Cloud SQL and Spanner are relational databases. Bigtable is a wide-column database. Google does not offer a managed graph database.",
            "\\item   . A. BigQuery is a managed service designed for data warehouses and analytics. It uses standard SQL for querying, which makes option A the right answer. Bigtable can support the volume of data described, but it does not use SQL as a query language. Cloud SQL is not the best option to scale to tens of petabytes. SQL Server is a relational database from Microsoft; it is not a GCP-managed database service.",
            "\\item   . B. Firestore is a document database that has mobile supporting features, like data synchronization, so option B is the right answer. BigQuery is for analytics, not mobile or transactional applications. Spanner is a global relational database but does not have mobile-specific features. Bigtable could be used with mobile devices, but it does not have mobile-specific features like synchronization.",
            "\\item   . D. In addition to read and write patterns, cost, and consistency, you should consider transaction support and latency, which makes option D correct.",
            "\\item   . B. Option B is correct because Memorystore can be configured to use between 1GB and 300GB of memory.",
            "\\item   . D. Once a bucket is set to coldline, it cannot be changed to another storage class; thus, option D is correct. Regional and multiregional can change to nearline and coldline. Nearline buckets can change to coldline.",
            "\\item   . A. To use BigQuery to store data, you must have a data set to store it, which makes option A the right answer. Buckets are used by Cloud Storage, not BigQuery. You do not manage persistent disks when using BigQuery. An entity is a data structure in Datastore, not Big Query.",
            "\\item   . D. With a second-generation instance, you can configure the MySQL version, connectivity, machine type, automatic backups, failover replicas, database flags, maintenance windows, and labels, so option D is correct.",
            "\\item   . A. Access charges are used with nearline and coldline storage, which makes option A correct. There is no transfer charge involved. Options C and D do not refer to actual storage classes.",
            "\\item    C. Creating databases is the responsibility of database administrators or other users of Cloud SQL, so option C is correct. Google applies security patches and performs other maintenance, so option A is incorrect. GCP performs regularly scheduled backups, so option B is incorrect. Database administrators need to schedule backups, but GCP makes sure they are performed on schedule. Cloud SQL users can’t SSH into a Cloud SQL server, so they can’t tune the operating system. That’s not a problem; Google takes care of that.",
            "\\item    A. Cloud SQL is controlled using the gcloud command; the sequence of terms in gcloud commands is gcloud followed by the service, in this case SQL; followed by a resource, in this case backups, and a command or verb, in this case create. Option A is the correct answer. Option B is incorrect because gsutil is used to work with Cloud Storage, not Cloud SQL. Option C is wrong because the order of terms is incorrect; backups comes before create. Option D is incorrect because the command or verb should be create.",
            "\\item    A. Option A is the correct answer. The base command is gcloud sql instances patch, which is followed by the instance name and a start time passed to the –-backup-start-time parameter. Option B is incorrect because databases is not the correct resource to reference; instances is. Option C uses the cbt command, which is for use with Bigtable, so it is incorrect. Similarly, Option D is incorrect because it uses the bq command, which is used to manage BigQuery resources.",
            "\\item    C. Datastore uses a SQL-like query language called GQL, so option C is correct. Option  A is incorrect; SQL is not used with this database. Option B is incorrect; MDX is a query language for online analytic processing (OLAP) systems. Option D is incorrect because DataFrames is a data structure used in Spark.",
            "\\item    C. Option C is the correct command. It has the correct base command, gcloud datastore export, followed by the --namespaces parameter and the name of a Cloud Storage bucket to hold the export file. Option A is incorrect because the --namespaces parameter name is missing. Option B is incorrect because it is missing a namespace. Option D is incorrect because it uses the command or verb dump instead of export.",
            "\\item    C. Option C is correct; BigQuery displays an estimate of the amount of data scanned. This is important because BigQuery charges for data scanned in queries. Option A is incorrect; knowing how long it took you to enter a query is not helpful. Option B is incorrect; you need to use the scanned data estimate with the Pricing Calculator to get an estimate cost. Option D is incorrect; you do not create clusters in BigQuery as you do with Bigtable and Dataproc. Network I/O data is not displayed.",
            "\\item    B. Option B shows the correct bq command structure, which includes location and the ––dry-run option. This option calculates an estimate without actually running the query. Options A and C are incorrect because they use the wrong command; gcloud and gsutil are not used with BigQuery. Option D is also wrong. cbt is a tool for working with Big table, not BigQuery. Be careful not to confuse the two because their names are similar.",
            "\\item    A. Option A is correct; the menu option is Job History. Options B and C are incorrect; there is no Active Jobs or My Jobs option. Job History shows active jobs, completed jobs, and jobs that generated errors. Option D is incorrect; you can get job status in the console.",
            "\\item    C. BigQuery provides an estimate of the amount of data scanned, and the Pricing Calculator gives a cost estimate for scanning that volume of data. Options A, B, and C are incorrect; the Billing service tracks charges incurred. It is not used to estimate future or potential charges.",
            "\\item   . B. Option B is correct; the next step is to create a database within the instance. Once a database is created, tables can be created, and data can be loaded into tables. Option A is incorrect; Cloud Spanner is a managed database, so you do not need to apply security patches. Option C is incorrect because you can’t create tables without first having created a database. Option D is incorrect; no tables are created that you could import data into when an instance is created.",
            "\\item   . D. Option D is correct because there is no need to apply patches to the underlying compute resources when using Cloud Spanner. because Google manages resources used by Cloud Spanner. Updating packages is a good practice when using VMs, for example, with Compute Engine, but it is not necessary with a managed service.",
            "\\item   . C. This use case is well suited to Pub/Sub, so option C is correct. It involves sending messages to the topic, and the subscription model is a good fit. Pub/Sub has a retention period to support the three-day retention period. Option A is incorrect; Bigtable is designed for storing large volumes of data. Dataproc is for processing and analyzing data, not passing it between systems. Cloud Spanner is a global relational database. You could design an application to meet this use case, but it would require substantial development and be costly to run.",
            "\\item   . C. Pub/Sub works with topics, which receive and hold messages, and subscriptions, which make messages available to consuming applications; therefore, option C is correct. Option A is incorrect; tables are data structures in relational databases, not message queues. Similarly, option B is wrong because databases exist in instances of database management systems, not messaging systems. Option D is wrong because tables are not a resource in messaging systems.",
            "\\item   . C. The correct command is gcloud components install cbt to install the Bigtable command-line tool, so option C is correct. Options A and B are incorrect; apt-get is used to install packages on some Linux systems but is not specific to GCP. Option D is incorrect; there is no such command as bigtable-tools.",
            "\\item   . A. You would need to use a cbt command, which is the command-line tool for working with Bigtable, so option A is correct. All other options reference gcloud and are therefore incorrect.",
            "\\item   . B. Cloud Dataproc is a managed service for Spark and Hadoop, so option B is correct. Cassandra is a big data distributed database but is not offered as a managed service by Google, so options A and C are incorrect. Option D is incorrect because TensorFlow is a deep learning platform not included in Dataproc.",
            "\\item   . B. The correct command is gcloud dataproc clusters create followed by the name of the cluster and the a --zone parameter. Option B is correct. Option A is incorrect because bq is the command-line tool for BigQuery, not Dataproc. Option C is a gcloud command missing a verb or command, so it is incorrect. Option D is wrong because option B is the correct answer.",
            "\\item   . B. gsutil is the correct command, so option B is correct. Option A is incorrect because gcloud commands are not used to manage Cloud Storage. Similarly, options C and D are incorrect because they use commands for Bigtable and BigQuery, respectively.",
            "\\item   . B. The command in option B correctly renames an object from an old name to a new name. Option A is incorrect because it uses a cp command instead of mv. Option C does not include bucket names, so it is incorrect. Option D uses gcloud, but gsutil is the command-line tool for working with Cloud Storage.",
            "\\item   . A. Dataproc with Spark and its machine learning library are ideal for this use case, so option A is correct. Option B suggests Hadoop, but it is not a good choice for machine learning applications. Option C is incorrect because Spanner is designed as a global relational database with support for transaction processing systems, not analytic and machine learning systems. Option D is incorrect. SQL is a powerful query language, but it does not support the kinds of machine learning algorithms needed to solve the proposed problem.",
            "\\item    C. gsutil is the command-line utility for working with Cloud Storage. It is one of the few GCP services that does not use gcloud. (BigQuery and Bigtable are others.) Option C is the correct answer because mb, short for “make bucket,” is the verb that follows gsutil to create a bucket. Options A and D are wrong because they use gcloud instead of gsutil. Option B is wrong because it uses gsutil with a command syntax used by gcloud.",
            "\\item    B. The correct answer is option B; gsutil is the command to copy files to Cloud Storage. Option A is incorrect; the verb is cp, not copy. Options C and D are wrong because gsutil, not gcloud, is the command-line utility for working with Cloud Storage.",
            "\\item    C. From the console, you can upload both files and folders. Options A and B are incorrect because they are missing an operation that can be performed in the console. Option D is incorrect because there is no diff operation in Cloud Console.",
            "\\item    D. When exporting a database from Cloud SQL, the export file format options are CSV and SQL, which makes option D correct. Option A is incorrect because XML is not an option. Options B and C are incorrect because JSON is not an option.",
            "\\item    A. Option A, SQL format, exports a database as a series of SQL data definition commands. These commands can be executed in another relational database without having to first create a schema. Option B could be used, but that would require mapping columns to columns in a schema that was created before loading the CSV, and the database administrator would like to avoid that. Options C and D are incorrect because they are not export file format options.",
            "\\item    C. Option C is the correct command, gcloud sql export sql, indicating that the service is Cloud SQL, the operation is export, and the export file format is SQL. The filename and target bucket are correctly formed. Option A is incorrect because it references gcloud storage, not gcloud sql. Option B is incorrect because it is missing an export file format parameter. Option D is incorrect because the bucket name and filename are in the wrong order.",
            "\\item    A. Option A uses the correct command, which is gcloud datastore export followed by a namespace and a bucket name. Option B is incorrect because the bucket name is missing gs://. Options C and D are incorrect because they use the command dump instead of export. The bucket name in option D is missing gs://.",
            "\\item    C. The export process creates a metadata file with information about the data exported and a folder that has the data itself, so option C is correct. Option A is incorrect because export does not produce a single file; it produces a metadata file and a folder with the data. Option B is incorrect because it does not include the data folder. Option D is incorrect because the correct answer is option C.",
            "\\item    B. Option B is correct because XML is not an option in BigQuery’s export process. All other options are available.",
            "\\item   . D. Option D is correct because YAML is not a file storage format; it used for specifying configuration data. Options A, B, and C are all supported import file types.",
            "\\item   . A. The correct command is bq load in option A. The autodetect and source-format parameters and path to source are correctly specified in all options. Option B is incorrect because it uses the term import instead of load. Options C and D are incorrect because they use gcloud instead of bq.",
            "\\item   . B. The correct answer is B because Dataflow is a pipeline service for processing streaming and batch data that implements workflows used by Cloud Spanner. Option A is incorrect; Dataproc is a managed Hadoop and Spark service, which is used for data analysis. Option C is incorrect; Datastore is a NoSQL database. Option D is incorrect because bq is used with BigQuery only.",
            "\\item   . A. Bigtable data is exported using a compiled Java program, so option A is correct. Option B is incorrect; there is no gcloud Bigtable command. Option C is incorrect; bq is not used with Bigtable. Option D is incorrect because it does not export data from Bigtable.",
            "\\item   . C. Exporting from Dataproc exports data about the cluster configuration, which makes option C correct. Option A is incorrect; data in DataFrames is not exported. Option B is incorrect; Spark does not have tables for persistently storing data like relational databases. Option D is incorrect; no data from Hadoop is exported.",
            "\\item   . C.  The correct answer is option C; the service Dataproc supports Apache Spark, which has libraries for machine learning. Options A and B are incorrect, neither is an analysis or machine learning service. Option D, DataAnalyze, is not an actual service.",
            "\\item   . A. The correct command in option A uses gcloud followed by the service, in this case pubsub, followed by the resource, in this case topics; and finally the verb, in this case create. Option B is incorrect because the last two terms are out of order. Options C and D are incorrect because they do not use gcloud. bq is the command-line tool for BigQuery. cbt is the command-line tool for Bigtable.",
            "\\item   . C. The correct answer, option C, uses gcloud pubsub subscriptions create followed by the topic and the name of the subscription. Option A is incorrect because it is missing the term subscriptions. Option B is incorrect because it is missing the name of the subscription. Option D is incorrect because it uses gsutil instead of gcloud.",
            "\\item   . B. Using a message queue between services decouples the services, so if one lags it does not cause other services to lag, which makes option B correct. Option A is incorrect because adding a message queue does not directly mitigate any security risks that might exist in the distributed system, such as overly permissive permissions. Option C is incorrect; adding a queue is not directly related to programming languages. Option D is incorrect; by default, message queues have a retention period.",
            "\\item   . B. The correct answer is B, gcloud components followed by install and then beta. Option A is incorrect because beta and install are in the wrong order. Options C and D are wrong because commands is used instead of components.",
            "\\item   . A. The correct parameter name is autodetect, which is option A. Options B and C are not actually valid bq parameters. Option D is a valid parameter, but it returns the estimated size of data scanned to when executing a query.",
            "\\item   . A. Avro supports Deflate and Snappy compression. CSV supports Gzip and no compression. XML and Thrift are not export file type options.",
            "\\item    D. Virtual private clouds are global, so option D is correct. By default, they have subnets in all regions. Resources in any region can be accessed through the VPC. Options A, B, and C are all incorrect.",
            "\\item    B. IP ranges are assigned to subnets, so option B is correct. Each subnet is assigned an IP range for its exclusive use. IP ranges are assigned network structures, not zones and regions. VPCs can have multiple subnets but each subnet has its own address range.",
            "\\item    B. Option B is correct; dynamic routing is the parameter that specifies whether routes are learned regionally or globally. Option A is incorrect; DNS is a name resolution service and is not involved with routing. Option C is incorrect; there is no static routing policy parameter. Option D is incorrect because global routing is not an actual option.",
            "\\item    A. The correct answer is gcloud compute networks create, which is option A. Option B is incorrect; networks vpc is not a correct part of the command. Option C is incorrect because gsutil is the command used to work with Cloud Storage. Option D is incorrect because there is no such thing.",
            "\\item    A. The Flow Log option of the create vpc command determines whether logs are sent to Stackdriver, so option A is correct. Option B, Private IP Access, determines whether an external IP address is needed by a VM to use Google services. Option C is incorrect because Stackdriver Logging is the service, not a parameter used when creating a subnet. Option D is incorrect because variable-length subnet masking has to do with CIDR addresses, not logging.",
            "\\item    C. Shared VPCs can be created at the organization or folder level of the resource hierarchy, so option C is correct. Options A and B are incorrect; shared VPCs are not created at the resource or project levels. Option D is incorrect; shared VPCs are not applied at subnets, which are resources in the resource hierarchy.",
            "\\item    A. The correct answer is the Networking tab of the Management, Security, Disks, Networking, Sole Tenancy section of the form, which makes option A correct. The Management tab is not about subnet configurations. Option D is incorrect because it does not lead to Sole Tenancy options.",
            "\\item    A. VPC is used for interproject communications. Option B is incorrect; there is no inter project peering. Options C and D are incorrect; they have to do with linking on-premise networks with networks in GCP.",
            "\\item    B. The target can be all instances in a network, instances with particular network tags, or instances using a specific service account, so option B is correct. Option A is incorrect; action is either allow or deny. Option C is incorrect; priority determines which of all the matching rules is applied. Option D is incorrect; it specifies whether the rule is applied to incoming or outgoing traffic.",
            "\\item   . D. Direction specifies whether the rule is applied to incoming or outgoing traffic, which makes option D the right answer. Option A is incorrect; action is either allow or deny. Option B is incorrect; target specifies the set of instances that the rule applies to. Option C is incorrect; priority determines which of all matching rules is applied.",
            "\\item   . A. The 0.0.0.0/0 matches all IP addresses, so option A is correct. Option B represents a block of 16,777,214 addresses. Option C represents a block of 1,048,574 addresses. Option D represents a block of 65,534. You can experiment with CIDR block options using a  CIDR calculator such as the one at subnet-calculator.com/cidr.php.",
            "\\item   . B. The product you are working with is compute and the resource you are creating is a firewall rule, so option B is correct. Options A and C references network instead of compute. Option D references rules instead of firewall-rules.",
            "\\item   . B. The correct parameter is network, which makes option B correct. Option A is incorrect; subnet is not a parameter to gcloud to create a firewall. Option C is incorrect; destination is not a valid parameter. Option D is incorrect; source-ranges is for specifying sources of network traffic the rule applies to.",
            "\\item   . A. The rule in option A uses the correct gcloud command and specifies the allow and direction parameters. Option B is incorrect because it references gcloud network instead of gcloud compute. Option C is incorrect because it does not specify the port range. Option D is incorrect because it does not specify the protocol or port range.",
            "\\item   . D. Option D is correct because it is the largest number allowed in the range of values for priorities. The larger the number, the lower the priority. Having the lowest priority will ensure that other rules that match will apply.",
            "\\item   . C. The VPC create option is available in the Hybrid Connectivity section, so option C is correct. Compute Engine, App Engine, and IAM & Admin do not have features related to VPNs.",
            "\\item   . C. The Google Compute Engine VPN is where you specify information about the Google Cloud end of the VPN connection, so option C is correct. You specify name, description, network, region, and IP address. Option A is incorrect because tunnels are about the connections between the cloud and the remote network. Option B is incorrect; Routing Options is about how to configure routers. Option D is incorrect; IKE Version is about exchanging secret keys.",
            "\\item   . A. Option A is correct because global dynamic routing is used to learn all routes on a network. Option B is incorrect; regional routing would learn only routes in a region. Options C and D are incorrect because they are not used to configure routing options.",
            "\\item   . B. The autonomous system number (ASN) is a number used to identify a cloud router on a network, so option B is correct. IP addresses are not unique identifiers for the BGP protocol. Option C is incorrect; there is no dynamic load routing ID. Option D is incorrect because option B is correct.",
            "\\item   . D. When using gcloud to create a VPN, you need to create forwarding rules, tunnels, and gateways, so all the gcloud commands listed would be used.",
            "\\item    B. The A record is used to map a domain name to an IPv4 address, so option B is correct. Option A is incorrect because the AAAA record is used for IPv6 addresses. Option C is incorrect; NS is a name server record. Option D is incorrect; SOA is a start of authority record.",
            "\\item    A. DNSSEC is a secure protocol designed to prevent spoofing and cache poisoning, so option A is correct. Options B and C are incorrect because SOA and CNAME records contain data about the DNS record; they are not an additional security measure. Option D is incorrect because deleting a CNAME record does not improve security.",
            "\\item    A. The TTL parameters specify the time a record can be in a cache before the data should be queried again, so option A is correct. Option B is incorrect; this time period is not related to timeouts. Option C is incorrect; the TTLs are not related to time restriction on data change operations. Option D is not correct; there is no manual review required.",
            "\\item    B. The correct answer, Option B, is gcloud beta dns managed-zones create. Option A is incorrect, it uses the gsutil command which is used to work with Cloud Storage. Option C is incorrect, it is missing the term dns. Option D is incorrect, the ordering of terms is incorrect.",
            "\\item    B. The visibility parameter is the parameter that can be set to private, so option B is correct. Option A is not a valid parameter. Option C is incorrect; private is not a parameter. Similarly, option D is incorrect; status is not a valid parameter for making a DNS zone private.",
            "\\item    C.  The three global load balancers are HTTP(S), SSL Proxy, and TCP Proxy, so option C   is correct. Options A and B are missing at least one global load balancer. Option D is incorrect because Internal TCP/UD is a regional load balancer.",
            "\\item    D. Network TCP/UDP enables balancing based on IP protocol, address, and port, so option D is correct. Options A, B, and C are all global load balancers, not regional ones.",
            "\\item    A. In the console there is an option to select between From Internet To My VMs and Only Between My VMs. This is the option to indicate private or public, so option A is correct. Options B, C, and D are all fictitious parameters.",
            "\\item    B. TCP Proxy load balancers require you to configure both the frontend and backendthe , so option B is correct. Options A and D are incorrect because they are missing one component. Option C is incorrect; forwarding rules are the one component specified with network load balancing. There is no component known as a traffic rule.",
            "\\item   . B. Health checks monitor the health of VMs used with load balancers, so option B is correct. Option A is incorrect, nearline storage is a type of Cloud Storage. Option C and D are incorrect; storage devices or buckets are not health checked.",
            "\\item   . B. You specify ports to forward when configuring the frontend, so option B is correct. The backend is where you configure how traffic is routed to VMs. Option C is incorrect; Network Services is a high-level area of the console. Option D is incorrect; VPCs are not where you specify load balancer configurations.",
            "\\item   . A. The correct answer, option A, is gcloud compute forwarding-rules create. Option B is incorrect; the service should be compute, not network. Option C is incorrect; create comes after forwarding-rules. Option D is incorrect because it has the wrong service, and the verb is in the wrong position.",
            "\\item   . C. Static addresses are assigned until they are released, so option C is correct. Options A and B are incorrect because internal and external addresses determine whether traffic is routed into and out of the subnet. External addresses can have traffic reach them from the Internet; internal addresses cannot. Option D is incorrect; ephemeral addresses are released when a VM shuts down or is deleted.",
            "\\item   . A. An ephemeral address is sufficient, since resources outside the subnet will not need to reach the VM and you can SSH into the VM from the console, so option A is correct. Option B is incorrect because there is no need to assign a permanent address, which would then have to be released. Option C is incorrect; there is no Permanent type. Option D is incorrect; there is no IPv8 address.",
            "\\item   . D. You cannot reduce the number of addresses using any of the commands, so option D is correct. Option A is incorrect because the prefix length specified in the expand-ip-range command must be a number less than the current length. If there are 65,534 addresses, then the prefix length is 16. Option B is incorrect for the same reason, and the prefix length cannot be a negative number. Option C is incorrect; there is no ––size parameter.",
            "\\item   . B. The prefix length specifies the length in bits of the subnet mask. The remaining bits of the IP address are used for device addresses. Since there are 32 bits in an IP address, you subtract the length of the mask to get the number of bits used to represent the address. 16 is equal to 24, so you need 4 bits to represent 14 addresses. 32-4 is 28, so option B is the correct answer. Option A would leave 1 address, option C would provide 4,094 addresses, and option D would provide 65,534.",
            "\\item   . C. Premium is the network service level that routes all traffic over the Google network, so option C is correct. Option A is incorrect; the Standard tier may use the public Internet when routing traffic. Options B and D are incorrect; there are no service tiers called Google-only or non-Internet.",
            "\\item   . B. Stopping and starting a VM will release ephemeral IP addresses, so option B is correct. Use a static IP address to have the same IP address across reboots. Option A is incorrect; rebooting a VM does not change a DNS record. Option C is incorrect because if you had enough addresses to get an address when you first started the VM and you then released that IP address, there should be at least one IP address assuming no other devices are added to the subnet. Option D is incorrect because no other changes, including changes to the subnet, were made.",
            "\\item   . A. Internal TCP/UDP is a good option. It is a regional load balancer that supports UDP, so option A is correct. Options B, C, and D are all global load balancers. Option B supports TCP, not UDP. Option D supports HTTP and HTTPS, not UDP.",
            "\\item   . B. Network Services is the section of Cloud Console that has the Cloud DNS console, so option B is correct. Option A is incorrect; Compute Engine does not have DNS management forms. Neither does option C, Kubernetes Engine. Option D is related to networking, but the services in Hybrid Connectivity are for services such as VPNs.",
            "\\item    D. Categories of solutions include all of the categories mentioned, so option D is correct. Others include Kubernetes Apps, API & Services, and Databases.",
            "\\item    B. The Cloud Launcher is also known as Marketplace, so option B is correct. Option A is incorrect because the Cloud Deployment Manager is used to create deployment templates. Options C and D are fictional names of services.",
            "\\item    A. You launch a solution by clicking the Launch on Compute Engine link in the overview page, so option A is correct. Option B is incorrect; the main page has summary information about the products. Option C is incorrect; Network Services is unrelated to this topic. Option D is incorrect because option A is the correct answer.",
            "\\item    B. Cloud Launcher has a set of predefined filters, including filtering by operating system, so option B is correct. Option A may eventually lead to the correct information, but it is not efficient. Option D is incorrect because it is impractical for such a simple task.",
            "\\item    B. Multiple vendors may offer configurations for the same applications, so option B is correct. This gives users the opportunity to choose the one best suited to their requirements. Options A and C are incorrect; this is a feature of Cloud Launcher. Option D is incorrect because option B is the correct answer.",
            "\\item    C. Cloud Launcher will display configuration options appropriate for the application you are deploying, so option C is correct. For example, when deploying WordPress, you will have the option of deploying an administration tool for PHP. Option A is incorrect; this is a feature of Cloud Launcher. Option B is incorrect; you are not necessarily on the wrong form. Option D is incorrect; this is a feature of Cloud Launcher.",
            "\\item    D. You can change the configuration of any of the items listed, so option D is correct. You can also specify firewall rules to allow both HTTP and HTTPS traffic or change the zone in which the VM runs.",
            "\\item    B. Deployment Manager is the name of the service for creating application resources using a YAML configuration file, so option B is correct. Option A is incorrect, although you could use scripts with gcloud commands to deploy resources in Compute Engine. Options C and D are incorrect because those are fictitious names of products.",
            "\\item    D. Configuration files are defined in YAML syntax, so option D is correct. Options A, B, and C are all incorrect; configuration files are defined in YAML.",
            "\\item   . B. Configuration files define resources and start with the term resources, so option B is correct. Options A, B, and C are all incorrect. Those terms do not start the configuration file.",
            "\\item   . D. All three, type, properties, and name, are used when defining resources in a Cloud Deployment Manager configuration file, so option D is correct.",
            "\\item   . D. All three can be set; specifically, the keys are deviceName, boot, and autodelete. Option D is correct.",
            "\\item   . A. Option A is the correct command. Option B is incorrect; it is missing the term compute. Option C is incorrect; gsutil is the command for working with Cloud Storage. Option D is incorrect because the terms list and images are in the wrong order.",
            "\\item   . D. Google recommends using Python for complicated templates, so option D is correct. Option A is incorrect because Jinja2 is recommended only for simple templates. Options B and C are incorrect; neither language is supported for templates.",
            "\\item   . A. The correct answer is gcloud deployment-manager deployments create, so option A is correct. Options B and D are incorrect; the service is not called cloud-launcher in the command. Option C is incorrect; launch is not a valid verb for this command.",
            "\\item   . C. The correct answer is gcloud deployment-manager deployments describe, so option C is correct. Options A and D are incorrect; cloud-launcher is not the name of the service. Option B is incorrect; list displays a brief summary of each deployment. describe displays a detailed description.",
            "\\item   . A. You will be able to configure IP addresses, so option A is correct. You cannot configure billing or access controls in Deployment Manager, so options B and C are incorrect. You can configure the machine type, but that is not the More section of Networking.",
            "\\item   . D. The correct answer is option D because free, paid, and BYOL are all license options used in Cloud Launcher.",
            "\\item   . B. The paid license types include payment for the license in your GCP charges, so option B is correct. The free license type does not incur charges. The BYOL license type requires you to work with the software vendor to get and pay for a license. There is no such license type as chargeback, so option D is incorrect.",
            "\\item   . D. LAMP is short for Linux, Apache, MySQL, and PHP. All are included when installing LAMP solutions, so option D is correct.",
            "\\item    B. IAM stands for Identity and Access Management, so option B is correct. Option A is incorrect; the A does not stand for authorization, although that is related. Option C is incorrect; the A does not stand for auditing, although that is related. Option D is incorrect. IAM also works with groups, not just individuals.",
            "\\item    A. Members and their roles are listed, so option A is correct. Options B and C are incorrect because they are missing the other main piece of information provided in the listing. Option D is incorrect; permissions are not displayed on that page.",
            "\\item    B. Primitive roles were created before IAM and provided coarse-grained access controls, so option B is correct. Option A is incorrect; they are used for access control. Option C is incorrect; IAM is the newer form of access control. Option D is incorrect; they do provide access control functionality.",
            "\\item    B. Roles are used to group permissions that can then be assigned to identities, so option B is correct. Option A is incorrect; roles do not have identities, but identities can be granted roles. Option C is incorrect; roles do not use access control lists. Option D is incorrect; roles do not include audit logs. Logs are collected and managed by Stackdriver Logging.",
            "\\item    C. The correct answer is gcloud projects get-iam-policy ace-exam-project, so option C is correct. Option A is incorrect because the resource should be projects and not iam. Option B is incorrect; list does not provide detailed descriptions. Option D is incorrect because iam and list are incorrectly referenced.",
            "\\item    B. New members can be users, indicated by their email addresses, or groups, so option B is correct. Option A is incorrect; it does not include groups. Options C and D are incorrect because roles are not added there.",
            "\\item    D. Deployers can read application configurations and settings and write new application versions, so option D is correct. Option A is incorrect because it is missing the ability to read configurations and settings. Option B is incorrect because it is missing writing new versions. Option C is incorrect because it references writing new configurations.",
            "\\item    B. The correct steps are navigating to IAM & Admin, selecting Roles, and then checking the box next to a role, so option B is correct. Option A is incorrect; all roles are not displayed automatically. Option C is incorrect; audit logs do not display permissions. Option D is incorrect; there is no Roles option in Service Accounts.",
            "\\item    D. Predefined roles help implement both least privilege and separation of duties, so option D is correct. Predefined roles do not implement defense in depth by themselves but could be used with other security controls to implement defense in depth.",
            "\\item   . D. The four launch stages available are alpha, beta, general availability, and disabled, so option D is correct.",
            "\\item   . B. The correct answer, option B, is gcloud iam roles create. Option A is incorrect because it references project instead of iam. Option C is incorrect because it references project instead of iam, and the terms create and roles are out of order. Option D is incorrect because the terms create and roles are out of order.",
            "\\item   . B. Scopes are permissions granted to VM instances, so option B is correct. Scopes in combination with IAM roles assigned to service accounts assigned to the VM instance determine what operations the VM instance can perform. Options A and C are incorrect; scopes do not apply to storage resources. Option D is incorrect; scopes do not apply to subnets.",
            "\\item   . C. Scope identifiers start with https://www.googleapis.com/auth/ and are followed by a scope-specific name, such as devstorage.read-only or logging.write, so option C is correct. Option A is incorrect; scope IDs are not randomly generated. Option B is incorrect; the domain name is not googleserviceaccounts. Option D is incorrect; scopes are not linked directly to projects.",
            "\\item   . C. Both scopes and IAM roles assigned to service accounts must allow an operation for it to succeed, so option C is correct. Option A is incorrect; access controls do not affect the flow of control in applications unless explicitly coded for that. Option B is incorrect; the most permissive permission is not used. Option D is incorrect; the operation will not succeed.",
            "\\item   . B. The options for setting scopes are: Allow Default Access, Allow Full Access, and Set Access For Each API, so option B is correct. Option A is incorrect; it is missing Set Access For Each API. Option C is incorrect; it is missing Allow Default Access. Option D is incorrect; it is missing Allow Full Access.",
            "\\item   . B. The correct command is gcloud compute instances set-service-account, so option B is correct. Option A is incorrect; there is no set-scopes command verb. Option C is incorrect; the command verb is not set-scopes. Option D is incorrect; there is no command verb define-scopes.",
            "\\item   . A. You can assign a service account when creating a VM using the create command. Option B is incorrect; there is no create-service-account command verb. Option C is incorrect; there is no define-service-account command verb. Option D is incorrect; there is no instances-service-account command; also, create should come at the end of the command.",
            "\\item   . C. Stackdriver Logging collects, stores, and displays log messages, so option C is correct. Option A is incorrect; Compute Engine does not manage logs. Option B is incorrect; Cloud Storage is not used to view logs, although log files can be stored there. Option D is incorrect; custom logging solutions are not GCP services.",
            "\\item   . B. Logs can be filtered by resource, type of logs, log level, and period of time only, so option B is correct. Options A, C, and D are incorrect because they are missing at least one option.",
            "\\item   . B.  This is an example of assigning the least privilege required to perform a task, so option B is correct. Option A is incorrect; defense in depth combines multiple security controls. Option C is incorrect because it is having different people perform sensitive tasks. Option D is incorrect; vulnerability scanning is a security measure applied to applications that helps reveal potential vulnerabilities in an application that an attacker could exploit.",
            "\\item    B. The Monitoring service is used to set a threshold on metrics and generate alerts when a metric exceeds the threshold for a specified period of time, so option B is correct. Option A is incorrect; Logging is for collecting logged events. Option C is incorrect; Cloud Trace is for application tracing. Option D is incorrect; Debug is used to debug applications.",
            "\\item    B. You must install the monitoring agent on the VM. The agent will collect data and send it to Stackdriver, so option B is correct. Option A is incorrect because a Workspace is not installed on a VM; it is created in Stackdriver. Option C is incorrect; there is no Monitor With Stackdriver check box in the VM configuration form. Option D is incorrect because you set notification channels in Stackdriver, not on a VM.",
            "\\item    D. Stackdriver can monitor resources in GCP, AWS, and in on-premise data centers, so option D is correct. Options A through C are incorrect because they do not include two other correct options.",
            "\\item    B. Aligning is the process of separating data points into regular buckets, so option B is correct. Option A is incorrect; aggregation is used to combine data points using a statistic, such as mean. Options C and D are incorrect; they are not processes related to processing streams of metric data.",
            "\\item    D. All three options are valid notification channels in Stackdriver Monitoring, so option D is correct. PagerDuty and HipChat are popular DevOps tools.",
            "\\item    D. The documentation is useful for documenting the purpose of the policy and for providing guidance for solving the problem, so option D is correct. Option A is incorrect; where  a policy is stored is irrelevant to its usefulness. Options B and C alone are partially correct, but option D is a better answer.",
            "\\item    A. Alert fatigue is a state caused by too many alert notifications being sent for events that do not require human intervention, so option A is correct. This creates the risk that eventually DevOps engineers will begin to pay less attention to notifications. Option B is incorrect, although it is conceivable that too many alerts could adversely impact performance, but that is not likely. Option C is a potential problem, too, but that is not alert fatigue. Option D is incorrect because too many true alerts contribute to alert fatigue.",
            "\\item    C. Stackdriver Logging stores log entries for 30 days, so option C is correct.",
            "\\item    B. The best option is to use Stackdriver Logging’s export functionality to write log data to a log sink, so option B is correct. Option A is incorrect; there is a way to export data. Options C and D are incorrect because writing a custom script would take more time to develop and maintain than using Logging’s export functionality.",
            "\\item   . D. All three, Cloud Storage buckets, BigQuery data sets, and Cloud Pub/Sub topics, are available as sinks for logging exports, so option D is correct.",
            "\\item   . D. All of the options listed can be used to filter, so option D is correct. Log level is another option as well.",
            "\\item   . B. The correct answer, option B, is halted. There is no such standard log level status. Statuses include Critical, Error, Warning, Info, and Debug.",
            "\\item   . B.  The fastest way to see the details is to expand all levels of structured data in the entry, so option B is correct. Option A would show the details, but it is not the fastest way. Option C is more time-consuming than using the functionality built into Stackdriver Logging. Option D is incorrect; there is no such link.",
            "\\item   . C. Cloud Trace is a distributed tracing application that provides details on how long different parts of code run, so option C is correct. Option A is incorrect; monitoring is used to notify DevOps engineers when resources are not functioning as expected. Option B is incorrect; Logging is for collecting, storing, and viewing log data, and although log entries might help diagnose bottlenecks, it is not specifically designed for that. Option D is incorrect; Debug is used to generate snapshots and inject logpoints.",
            "\\item   . D. Debug is used to generate snapshots that provide a view of the status of an application at a particular point in its execution, so option D is correct. Option A is incorrect; monitoring is used to notify DevOps engineers when resources are not functioning as expected. Option B is incorrect; Logging is for collecting, storing, and viewing log data. Option C is incorrect because Cloud Trace is a distributed tracing application that provides details on how long different parts of code run.",
            "\\item   . B. The Google Cloud Status Dashboard at https://status.cloud.google.com/ has information on the status of GCP services, so option B is correct. Options A and B might lead to information, but they would take longer. Option C is not a link to a source of information on BigQuery.",
            "\\item   . B. Both Compute Engine and Kubernetes Engine will require details about the VMs’ configurations, so option B is correct. The other options are incorrect because BigQuery and Cloud Pub/Sub are serverless services.",
            "\\item   . C. Query pricing in BigQuery is based on the amount of data scanned, so option C is correct. Option A is incorrect; the amount of data storage is specified in the Storage Pricing section. Option B is incorrect; query pricing is not based on the volume of data returned. Option D is incorrect because this is not related to Cloud Storage. Option D is incorrect because option C is correct.",
            "\\item   . B.  Some operating systems, like Microsoft Windows Server, require a license, so option B is correct. Google sometimes has arrangements with vendors to collect fees for using proprietary software. Option A is incorrect; there is no fixed rate charge for operating systems. Option C is incorrect; the information is sometimes needed to compute charges. Option D is incorrect because if you Bring Your Own License, there is no additional license charge.",
            "\\item   . B. OpenCensus is a library for developing custom metrics that can be used with Stackdriver Logging, so option B is correct. Option A is incorrect; Prometheus is an open source monitoring tool, but it is not used to define custom metrics in Stackdriver Monitoring. Option C is incorrect; Grafana is a visualization tools for Prometheus. Option D is incorrect; Nagios is an open source monitoring and alerting service, but it is not used for defining custom metrics in Stackdriver Logging.",

    };
}
