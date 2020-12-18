FROM amazoncorretto:8-alpine-jre
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} discovery.jar
RUN mkdir /libs
COPY target/libs libs
EXPOSE 8761
#RUN java -jar /discovery.jar
