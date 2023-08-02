# Maven

1. Version 3.9.3
1. Java Version 17.0.7

## Installation

1. wget https://dlcdn.apache.org/maven/maven-3/3.9.3/binaries/apache-maven-3.9.3-bin.tar.gz --no-check-certificate
1. sudo tar xvf apache-maven-3.9.3-bin.tar.gz -C /opt
1. vi ~/.bash_profile

   ```bash
   export M2_HOME=/opt/apache-maven-3.9.3
   export MAVEN_HOME=/opt/apache-maven-3.9.3
   PATH=${M2_HOME}/bin:$PATH
   export PATH
   ```

1. mvn -version

   ```bash
   [hadn@publish opt]$ mvn -version
   Apache Maven 3.9.3 (21122926829f1ead511c958d89bd2f672198ae9f)
   Maven home: /opt/maven
   Java version: 17.0.7, vendor: Oracle Corporation, runtime: /usr/lib/jvm/jdk-17-oracle-x64
   Default locale: en_US, platform encoding: UTF-8
   OS name: "linux", version: "3.10.0-1160.88.1.el7.x86_64", arch: "amd64", family: "unix"
   ```
   
## Create Project

1. Command line

   ```bash
   mvn archetype:generate 
	-DgroupId={project-packaging}
	-DartifactId={project-name}
	-DarchetypeArtifactId={maven-template} 
	-DinteractiveMode=false
   ```

1. `mvn archetype:generate -DgroupId=com.alochym -DartifactId=java-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

## Project Structure

```bash
[hadn@publish maven-project]$ tree
.
└── java-project
    ├── pom.xml                          # describes the entire project information.
    └── src
        ├── main
        │   └── java
        │       └── com
        │           └── alochym
        │               └── App.java     # Main entry point to start Java App.
        └── test
            └── java
                └── com
                    └── alochym
                        └── AppTest.java # JUnit test.
```
## Running Test

1. Test all - `mvn test`
1. To run a single test method in Maven - `mvn test -Dtest=AppTest#testApp test`
   1. `AppTest` is the test class name 
   1. `testApp` is the test method.
1. Testing in a multi-module project - `mvn test -pl <module-name> -Dtest=AppTest#testApp test`

## Clean and Build package

1. mvn clean - clean every thing of old package
1. mvn package - create Java package jar file

## Running Java Jar file

1. cd into Java Project root folder.
1. `[hadn@publish java-project]$ java -cp target/java-project-1.0-SNAPSHOT.jar com.alochym.App`

## Links

1. https://linuxize.com/post/how-to-install-apache-maven-on-centos-7/
1. https://mkyong.com/maven/how-to-create-a-java-project-with-maven/