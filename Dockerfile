FROM openjdk:8
WORKDIR /app
COPY target/cr7ImportsConfigserver.jar /app/cr7ImportsConfigserver.jar
EXPOSE 8889
ENTRYPOINT ["java", "-jar", "cr7ImportsConfigserver.jar"]