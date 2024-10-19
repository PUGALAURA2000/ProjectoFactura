FROM openjdk:11-jre-slim 

COPY target/spring-boot-data-jpa-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "*jar", "/app.jar"]