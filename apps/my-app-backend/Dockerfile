FROM adoptopenjdk:8u282-b08-jre-openj9-0.24.0

WORKDIR /opt/app

COPY /target/my-app-backend-0.0.1-SNAPSHOT.jar /opt/app/app.jar

EXPOSE 8080
EXPOSE 5005

CMD ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005",  "-jar", "/opt/app/app.jar"]