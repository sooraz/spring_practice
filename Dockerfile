FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} spractice.jar

ENTRYPOINT ["java","-jar","spractice.jar"]

EXPOSE 9022