FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/service-b.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]