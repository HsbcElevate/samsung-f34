FROM openjdk:11
COPY target/samsung-f34-0.0.1.jar samsung-0.0.1.jar 
ENTRYPOINT ["java","-jar","/samsung-0.0.1.jar"]
EXPOSE 9001