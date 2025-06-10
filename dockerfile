FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/*.jar api.jar

EXPOSE 8080:8080

CMD ["java", "-jar", "api.jar"]