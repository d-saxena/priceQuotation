#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER deepankar

# Add the application's jar to the container
COPY ../target/PriceQuatation-1.0-SNAPSHOT.jar PriceQuatation-1.0-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/PriceQuatation-1.0-SNAPSHOT.jar"]