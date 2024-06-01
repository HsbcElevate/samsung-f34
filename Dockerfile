FROM openjdk:17-alpine
COPY target/samsung-0.0.1.jar samsung.jar 
ENTRYPOINT ["java","-jar","/samsung.jar"]
EXPOSE 9001