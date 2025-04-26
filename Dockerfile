FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ARG AWS_ACCESS_KEY_ID
ARG AWS_SECRET_ACCESS_KEY
ARG AWS_SESSION_TOKEN

ENV AWS_REGION=us-west-2
ENV AWS_S3_BUCKET=your-s3-bucket

ENTRYPOINT ["java", "-jar", "app.jar"]