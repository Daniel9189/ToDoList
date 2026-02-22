FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-21-jdk maven -y

WORKDIR /app

COPY . .

RUN mvn clean install -DskipTests

FROM eclipse-temurin:21-jdk-alpine

EXPOSE 8080

WORKDIR /app

COPY --from=build /app/target/todolist-0.0.1.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]