FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/spring-restapi.jar spring-restapi.jar
ENTRYPOINT ["java","-jar","/spring-restapi.jar"]