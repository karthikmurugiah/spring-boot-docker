FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY target/*.jar app.jar

#To run this container as a non-root user 
RUN addgroup -S demo && adduser -S demo -G demo
USER demo

ENTRYPOINT ["java","-jar","/app.jar"]