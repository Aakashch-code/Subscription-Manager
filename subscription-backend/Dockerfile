FROM ubuntu:latest
LABEL authors="aakas"

ENTRYPOINT ["top", "-b"]

# ---- Stage 1: Build ----
# Use a Java 17 image that includes Maven
FROM eclipse-temurin:17-jdk-jammy as builder

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper and pom.xml
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Download dependencies (this speeds up future builds)
RUN ./mvnw dependency:go-offline

# Copy the rest of your source code
COPY src src

# Build the application and create the .jar file
RUN ./mvnw clean package -DskipTests

# ---- Stage 2: Run ----
# Use a minimal Java 17 runtime-only image
FROM eclipse-temurin:17-jre-jammy

# Set a new working directory
WORKDIR /app

# !! IMPORTANT !!

COPY --from=builder /app/target/subscription-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (the default for Spring Boot)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]