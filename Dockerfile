FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} target/crud_demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","target/crud_demo.jar"]


# FROM maven:3.8.3-openjdk-17 AS build
# COPY src /home/app/src
# COPY pom.xml /home/app
# RUN mvn -f /home/app/pom.xml clean package
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","/home/app/target/spring_rest_docker.jar"]