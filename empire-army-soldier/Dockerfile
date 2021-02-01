FROM amazoncorretto:8-alpine-jre
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} soldier.jar
RUN mkdir /libs
COPY target/libs libs
EXPOSE 8080
#RUN java -jar /soldier.jar
