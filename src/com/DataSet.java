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
                    "  You have been asked to set up network security in a virtual private cloud. Your company wants to have multiple subnetworks and limit traffic between the subnetworks. Which net- work security control would you use to control the flow of traffic between subnets?\n"+
                    "\\begin{parts}\n"+
                    " \\part Identity access management\n"+
                    " \\part Router\n"+
                    " \\part Firewall\n"+
                    " \\part IP address table\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  When you create a machine learning service to identify text in an image, what type of serv- ers should you choose to manage compute resources?\n"+
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
                    "  Your company is based in X and will be running a virtual server for Y. What factor deter- mines the unit per minute cost?\n"+
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
                    "  You have an application that uses a Pub/Sub message queue to maintain a list of tasks that are to be processed by another application. The application that consumes messages from the Pub/Sub queue removes the message only after completing the task. It takes approxi- mately 10 seconds to complete a task. It is not a problem if two or more VMs perform the same task. What is a cost-effective configuration for processing this workload?\n"+
                    "\\begin{parts}\n"+
                    " \\part Use preemptible VMs\n"+
                    " \\part Use standard VMs\n"+
                    " \\part Use DataProc\n"+
                    " \\part Use Spanner\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your department is deploying an application that has a database backend. You are con- cerned about the read load on the database server and want to have data available in mem- ory to reduce the time to respond to queries and to reduce the load on the database server. Which GCP service would you use to keep data in memory?\n"+
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
                    " . Your company has deployed 100,000 Internet of Things (IoT) sensors to collect data on the state of equipment in several factories. Each sensor will collect and send data to a data\n"+
                    "\\begin{parts}\n"+
                    "e every 5 seconds. Sensors will run continuously. Daily reports will produce data on the maximum, minimum, and average value for each metric collected on each sensor. There\n"+
                    "o need to support transactions in this application. Which database product would you recommend?\n"+
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
                    " . A software engineer comes to you for a recommendation. She has implemented a machine learning algorithm to identify cancerous cells in medical images. The algorithm is compu- tationally intensive, makes many mathematical calculations, requires immediate access to large amounts of data, and cannot be easily distributed over multiple servers. What kind of Compute Engine configuration would you recommend?\n"+
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
                    "\\begin{parts}\n"+
                    " to support ANSI 2011 and global transactions. Which database service would you recommend?\n"+
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
                    "  You are designing cloud applications for a healthcare provider. The records management application will manage medical information for patients. Access to this data is limited to a small number of employees. The billing department application will have insurance and payment information. Another group of employees will have access billing information. In addition, the billing system will have two components: a private insurance billing system and a government payer billing system. Government regulations require that software used to bill the government must be isolated from other software systems. Which of the follow- ing resource hierarchies would meet these requirements and provide the most flexibility to adapt to changing requirements?\n"+
                    "\\begin{parts}\n"+
                    " \\part One organization, with folders for records management and billing. The billing folder would have private insurer and government payer folders within it. Common constraints would be specified in organization-level policies. Other policies would be defined at the appropriate folder.\n"+
                    " \\part One folder for records management, one for billing, and no organization. Policies defined at the folder level.\n"+
                    " \\part One organization, with folders for records management, private insurer, and govern- ment payer below the organization. All constraints would be specified in organization- level policies. All folders would have the same policy constraints.\n"+
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
                    "  You are designing an application that uses a series of services to transform data from its original form into a format suitable for use in a data warehouse. Your transformation appli- cation will write to the message queue as it processes each input file. You don’t want to give users permission to write to the message queue. You could allow the application to write to the message queue by using which of the following?\n"+
                    "\\begin{parts}\n"+
                    " \\part Billing account\n"+
                    " \\part Service account\n"+
                    " \\part Messaging account\n"+
                    " \\part Folder\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  Your company has a number of policies that need to be enforced for all projects. You  decide to apply policies to the resource hierarchy. Not long after you apply the policies, an engineer finds that an application that had worked prior to implementing policies is no lon- ger working. The engineer would like you to create an exception for the application. How can you override a policy inherited from another entity in the resource hierarchy?\n"+
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
                    "  You are deploying a new custom application and want to delegate some administration tasks to DevOps engineers. They do not need all the privileges of a full application admin- istrator, but they do need a subset of those privileges. What kind of role should you use to grant those privileges?\n"+
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
                    " . You are contacted by the finance department of your company for advice on how to auto- mate payments for GCP services. What kind of account would you recommend setting up?\n"+
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
                    "  You have just opened the GCP console at console.google.com. You have authenticated with the user you want to use. What is one of the first things you should do before perform- ing tasks on VMs?\n"+
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
                    "  You lead a team of cloud engineers who maintain cloud resources for several departments in your company. You’ve noticed a problem with configuration drift. Some machine config- urations are no longer in the same state as they were when created. You can’t find notes or documentation on how the changes were made or why. What practice would you implement to solve this problem?\n"+
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
                    " . The Network tab of the create VM form is where you would perform which of the follow- ing operations?\n"+
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
                    " . Which of the following commands will create a VM with four CPUs that is named web- server-1?\n"+
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
                    "  You are deploying a high availability application in Kubernetes Engine. You want to main- tain availability even if there is a major network outage in a data center. What feature of Kubernetes Engine would you employ?\n"+
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
                    " . What command would you use to have 10 replicas of a deployment named\n"+
                    "\\begin{parts}\n"+
                    "-app-deploy?\n"+
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
                    "  You receive a page in the middle of the night informing you that several services running on a Kubernetes cluster have high latency when responding to API requests. You review moni- toring data and determine that there are not enough resources in the cluster to keep up with the load. You decide to add six more VMs to the cluster. What parameters will you need to specify when you issue the cluster resize command?\n"+
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
                    " . You are supporting machine learning engineers who are testing a series of classifiers. They have five classifiers, called ml-classifier-1, ml-classifier-2, etc. They have found that ml- classifier-3 is not functioning as expected and they would like it removed from the cluster. What would you do to delete a service called ml-classifier-3?\n"+
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
                    "\\begin{parts}\n"+
                    "ing to handle the load, but you want to keep your costs down. How should you config- ure your Kubernetes cluster?\n"+
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
                    "  You have designed a microservice that you want to deploy to production. Before it can be deployed, you have to review how you will manage the service lifecycle. The architect is particularly concerned about how you will deploy updates to the service with minimal dis- ruption. What aspect of App Engine components would you use to minimize disruptions during updates to the service?\n"+
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
                    " \\part Configure your app for instance detection and do not specify a max or minimum num- ber of instances.\n"+
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
                    " \\part max_concurrent_requests\n"+
                    " \\part target_throughput_utilization\n"+
                    " \\part max_instances\n"+
                    " \\part max_pending_latency\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . What parameters can be configured with basic scaling?\n"+
                    "\\begin{parts}\n"+
                    " \\part max_instances and min_instances\n"+
                    " \\part idle_timeout and min_instances\n"+
                    " \\part idle_timeout and max_instances\n"+
                    " \\part idle_timeout and target_throughput_utilization\n"+
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
                    " . You work for a startup, and costs are a major concern. You are willing to take a slight per- formance hit if it will save you money. How should you configure the scaling for your apps running in App Engine?\n"+
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
                    " . You have released a new version of a service. You have been waiting for approval from the product manager to start sending traffic to the new version. You get approval to route traf- fic to the new version. What parameter to gcloud app services set-traffic is used to specify that traffic should be moved to a newer version of the app?\n"+
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
                    "  A product manager is proposing a new application that will require several backend ser- vices, three business logic services, and access to relational databases. Each service will provide a single function, and it will require several of these services to complete a business task. Service execution time is dependent on the size of input and is expected to take up to 30 minutes in some cases. Which GCP product is a good serverless option for running this related service?\n"+
                    "\\begin{parts}\n"+
                    " \\part Cloud Functions\n"+
                    " \\part Compute Engine\n"+
                    " \\part App Engine\n"+
                    " \\part Cloud Storage\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You have been asked to deploy a cloud function to reformat image files as soon as they are uploaded to Cloud Storage. You notice after a few hours that about 10 percent of the files are not processed correctly. After reviewing the files that failed, you realize they are all sub- stantially larger than average. What could be the cause of the failures?\n"+
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
                    "  You are tasked with designing a function to execute in Cloud Functions. The function will need more than the default amount of memory and should be applied only when a finalize event occurs after a file is uploaded to Cloud Storage. The function should only apply its logic to files with a standard image file type. Which of the following required features can- not be specified in a parameter and must be implemented in the function code?\n"+
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
                    " . You want to use the command line to manage Cloud Functions that will be written in Python. In addition to running the gcloud components update command, what com- mand should you run to ensure you can work with Python functions?\n"+
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
                    " . You are defining a cloud function to write a record to a database when a file in Cloud Stor- age is archived. What parameters will you have to set when creating that function?\n"+
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
                    " . Which of these commands will deploy a Python cloud function called\n"+
                    "\\begin{parts}\n"+
                    "sub_function_test?\n"+
                    " \\part gcloud functions deploy pub_sub_function_test\n"+
                    " \\part gcloud functions deploy pub_sub_function_test --runtime python37\n"+
                    " \\part gcloud functions deploy pub_sub_function_test --runtime python37\n"+
                    "igger-topic gcp-ace-exam-test-topic\n"+
                    " \\part gcloud functions deploy pub_sub_function_test --runtime python\n"+
                    "igger-topic gcp-ace-exam-test-topic\n"+
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
                    " \\part gcloud datastore export '[NAMESPACE]' gs://[BUCKET_NAME]\n"+
                    " \\part gcloud datastore export gs://[BUCKET_NAME]\n"+
                    " \\part gcloud datastore export --namespaces='[NAMESPACE]' gs://[BUCKET_NAME]\n"+
                    " \\part gcloud datastore dump --namespaces='[NAMESPACE]' gs://[BUCKET_NAME]\n"+
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
                    " \\part gcloud BigQuery query estimate [SQL_QUERY]\n"+
                    " \\part bq ––location=[LOCATION] query --use_legacy_sql=false ––dry_run [SQL_QUERY]\n"+
                    " \\part gsutil ––location=[LOCATION] query --use_legacy_sql=false ––dry_run [SQL_QUERY]\n"+
                    " \\part cbt BigQuery query estimate [SQL_QUERY]\n"+
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
                    " . Your manager asks you to set up a bare-bones Pub/Sub system as a sandbox for new devel- opers to learn about messaging systems. What are the two resources within Pub/Sub you will need to create?\n"+
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
                    " \\part gcloud rewrite -s [STORAGE_CLASS] gs://[PATH_TO_OBJECT]\n"+
                    " \\part gsutil rewrite -s [STORAGE_CLASS] gs://[PATH_TO_OBJECT]\n"+
                    " \\part cbt rewrite -s [STORAGE_CLASS] gs://[PATH_TO_OBJECT]\n"+
                    " \\part bq rewrite -s [STORAGE_CLASS] gs://[PATH_TO_OBJECT]\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    " . You want to rename an object stored in a bucket. What command structure would you use?\n"+
                    "\\begin{parts}\n"+
                    " \\part gsutil cp gs://[BUCKET_NAME]/[OLD_OBJECT_NAME] gs://[BUCKET_NAME]/ [NEW_OBJECT_NAME]\n"+
                    " \\part gsutil mv gs://[BUCKET_NAME]/[OLD_OBJECT_NAME] gs://[BUCKET_NAME]/ [NEW_OBJECT_NAME]\n"+
                    " \\part gsutil mv gs://[OLD_OBJECT_NAME] gs://[NEW_OBJECT_NAME]\n"+
                    " \\part gcloud mv gs://[OLD_OBJECT_NAME] gs://[NEW_OBJECT_NAME]\n"+
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
                    "  A database administrator has asked for an export of a MySQL database in Cloud SQL. The database administrator will load the data into another relational database and would to do it with the least amount of work. Specifically, the loading method should not require the data- base administrator to define a schema. What file format would you recommend for this task?\n"+
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
                    " \\part bq load ––autodetect ––source_format=[FORMAT] [DATASET].[TABLE] [PATH_TO_SOURCE]\n"+
                    " \\part bq import ––autodetect ––source_format=[FORMAT] [DATASET].[TABLE] [PATH_TO_SOURCE]\n"+
                    " \\part gloud BigQuery load ––autodetect ––source_format=[FORMAT] [DATASET]. [TABLE] [PATH_TO_SOURCE]\n"+
                    " \\part gcloud BigQuery load ––autodetect ––source_format=[FORMAT] [DATASET]. [TABLE] [PATH_TO_SOURCE]\n"+
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
                    " \\part ––dry_run\n"+
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
                    "  You have been asked by your manager to deploy a WordPress site. You expect heavy traf- fic, and your manager wants to make sure the VM hosting the WordPress site has enough resources. Which resources can you configure when launching a WordPress site using Cloud Launcher?\n"+
                    "\\begin{parts}\n"+
                    " \\part Machine type\n"+
                    " \\part Disk type\n"+
                    " \\part Disk size\n"+
                    " \\part All of the above\n"+
                    "\\end{parts}\n",
            "\\question\n"+
                    "  You would like to define as code the configuration of a set of application resources. The GCP service for creating resources using a configuration file made up of resource specifica- tions defined in YAML syntax is called what?\n"+
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
                    " . Which of the following are used to define a resource in a Cloud Deployment Manager con- figuration file?\n"+
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
                    " . You are deploying a Cloud Launcher application that includes a LAMP stack. What soft- ware will this deploy?\n"+
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
                    " \\part A URL beginning with https://www.googleapis.com/auth/PROJECT_ID]\n"+
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
                    " \\part gcloud compute instances create [INSTANCE_NAME] --service-account [SERVICE_ACCOUNT_EMAIL]\n"+
                    " \\part gcloud compute instances create-service-account [INSTANCE_NAME][SERVICE_ACCOUNT_EMAIL]\n"+
                    " \\part gcloud compute instances define-service-account [INSTANCE_NAME][SERVICE_ACCOUNT_EMAIL]\n"+
                    " \\part gcloud compute create instances-service-account [INSTANCE_NAME][SERVICE_ACCOUNT_EMAIL]\n"+
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
            "\\item B. The basic unit for purchasing computing resources is the virtual machine (VM). A\n" +
                    "physical server underlies VMs, but the resources of a physical server are allocated to VMs.\n" +
                    "Blocks and subnets are not relevant to the fundamental unit of computing.\n",
            "\\item D. When using managed clusters, the cloud provider will monitor the health of nodes in the\n" +
                    "cluster, set up networking between nodes in the cluster, and configure firewall and other\n" +
                    "security controls",
            "\\item B. App Engine is a serverless platform for running applications, while Cloud Functions is a\n" +
                    "service for executing short-running functions in response to events. Kubernetes Engine is a\n" +
                    "managed cluster service, and both Kubernetes Engine and Compute Engine require you to\n" +
                    "configure servers."
    };
}
