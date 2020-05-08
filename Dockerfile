FROM openjdk:8-jdk-alpine
ADD target/pizza-0.0.1-SNAPSHOT.jar docker-pizza.jar
EXPOSE 9090
EXPOSE 27017
ENTRYPOINT ["java","-jar","docker-pizza.jar"]
