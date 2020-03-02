FROM openjdk:8-jre-slim
WORKDIR /app/
COPY target/*.jar app.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "-Xmx256m", "app.jar"]