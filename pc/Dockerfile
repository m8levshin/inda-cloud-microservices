FROM openjdk:8-jre-slim
WORKDIR /app/
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=cloud", "-Xmx256m", "app.jar"]