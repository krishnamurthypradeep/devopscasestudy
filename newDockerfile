



FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:8-jdk-alpine

#maintainer 
MAINTAINER pradeep@gmail.com
#expose port 8080
EXPOSE 8888

#default command
CMD java -jar /home/devopscasestudy-0.4.0-SNAPSHOT.war

#copy hello world to docker image from builder image

COPY --from=maven_build /tmp/target/devopscasestudy-0.4.0-SNAPSHOT.war /home/devopscasestudy-0.4.0-SNAPSHOT.war