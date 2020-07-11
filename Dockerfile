FROM maven:3.6.0-jdk-11 AS build
COPY src /usr/app/src
COPY pom.xml /usr/app
RUN mvn -f /usr/app/pom.xml clean install

FROM openjdk:11-jdk
VOLUME /tmp
COPY --from=build /usr/app/target/cloud-architectural-challenge-0.0.1-SNAPSHOT.jar cloud-architectural-challenge-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","cloud-architectural-challenge-0.0.1-SNAPSHOT.jar"]