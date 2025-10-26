# ---- Stage 1: Build ----
# Use a Maven builder image that has Java 25
FROM maven:3.9.6-eclipse-temurin-25 as builder

# Set the working directory
WORKDIR /app

# Copy the pom.xml file first
COPY pom.xml .

# Download all dependencies
RUN mvn dependency:go-offline

# Copy all your source code
COPY src src

# Build the application and create the .jar
RUN mvn clean package -DskipTests

# ---- Stage 2: Run ----
# Use a Java 25 runtime image (your suggestion is correct here)
FROM eclipse-temurin:25-jre-jammy
WORKDIR /app

# Copy the .jar file from the 'builder' stage
COPY --from=builder /app/target/subscription-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (default for Spring Boot)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]