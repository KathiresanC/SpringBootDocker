# Use an OpenJDK base image with Java 11
FROM openjdk:11-jre

# Set the working directory inside the container
WORKDIR /app

# Add the Java application JAR file to the container
ADD student-info-0.0.1-SNAPSHOT.jar /app/student-info-0.0.1-SNAPSHOT.jar

# Expose the port your Java application is listening on (the same port you use in your Java program)
EXPOSE 8081

# Command to run the Java application when the container starts
CMD ["java", "-jar", "student-info-0.0.1-SNAPSHOT.jar"]
