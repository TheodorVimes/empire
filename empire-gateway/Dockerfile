FROM amazoncorretto:8-alpine-jre
VOLUME /tmp
ARG JAR_FILE=target/*.jar
#ARG EUREKA_URI=http://localhost:8761
#ENV EUREKA_URI=${EUREKA_URI}
COPY ${JAR_FILE} gateway.jar
RUN mkdir /libs
COPY target/libs libs
EXPOSE 8090
#RUN java -jar /gateway.jar
