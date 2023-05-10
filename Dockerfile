FROM amazoncorretto:11-alpine-jdk
MAINTAINER AntoCastagna
COPY target/proyecto-0.0.1-SNAPSHOT.jar  proyecto.jar
ENTRYPOINT ["java","-jar","/proyecto.jar"] 