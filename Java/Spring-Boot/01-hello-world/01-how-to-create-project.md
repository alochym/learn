# Quick Start

1. <https://start.spring.io/>
1. Dependanced package
    1. `Spring Web`.
    1. `Development Tools`

## Build JAR File

1. [pom.xml](/Java/basic/java-maven-test.md) to update de Class-Path entry point to Manifest.
1. .\mvnw clean package

## Build Native Docker Image

1. mvn -Pnative spring-boot:build-image

## Compile Native Image

1. ***Take a lot of RAM to compile***.
1. Install JAVA GRAALVM - <https://www.graalvm.org/downloads/>.
1. Create a profile to use JAVA GRAALVM folder as JAVA_HOME default.
1. ./mvnw -Pnative native:compile.
1. Update [pom.xml](/Java/alochym/pom.xml) with ***GraalVM Native Support***.
