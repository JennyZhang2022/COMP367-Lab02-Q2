
FROM openjdk:17-jdk

WORKDIR /app

COPY target/*.war app.war

CMD ["java", "-jar", "app.war"]