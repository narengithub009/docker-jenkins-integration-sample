FROM openjdk:11
EXPOSE 8081
ADD target/spring-boot-jenkins-docker-integration.jar spring-boot-jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkins-docker-integration.jar"]