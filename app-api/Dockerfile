FROM java:openjdk-8-jdk-alpine

ADD build/libs/*.jar /app.jar

RUN sh -c 'touch /app.jar'

VOLUME /tmp

CMD ["java", "-jar", "/app.jar"]

EXPOSE 8085