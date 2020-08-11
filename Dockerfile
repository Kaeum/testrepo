FROM openjdk:8-jdk

LABEL maintainer="oror1024@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/sayhello-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} sayhello.jar

ENTRYPOINT ["java","-jar","/sayhello.jar"]