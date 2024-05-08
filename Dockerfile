FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} crud-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/crud-demo-0.0.1-SNAPSHOT.jar"]


# FROM maven:3.8.3-openjdk-17 AS build
# COPY src /home/app/src
# COPY pom.xml /home/app
# RUN mvn -f /home/app/pom.xml clean package
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","/home/app/target/spring_rest_docker.jar"]