FROM maven:3.9.9-eclipse-temurin-22 AS build
WORKDIR /app

COPY pom.xml ./
COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:22-jdk
WORKDIR /app

COPY --from=build /app/target/devops-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
