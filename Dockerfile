FROM openjdk:8-jdk-alpine
COPY /target/spring-boot-keycloak-0.0.1.jar /apps/spring_app/
WORKDIR /apps/spring_app
EXPOSE 8080
CMD ["java","-jar","spring-boot-keycloak-0.0.1.jar"]


