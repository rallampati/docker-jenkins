FROM openjdk:8
MAINTAINER ram
VOLUME /tmp
ADD target/*.jar /
#RUN bash -c 'touch /docker-jenkins.jar'
ENTRYPOINT ["java","-Xms512m", "-Xmx2048m", "-jar", "/docker-jenkins.jar"]