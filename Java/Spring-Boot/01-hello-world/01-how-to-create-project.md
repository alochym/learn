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

1. ./mvnw -Pnative native:compile
