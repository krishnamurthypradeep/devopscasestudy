FROM alpine-java8
LABEL maintainer="pradeep@gmail.com"
COPY /target/devopscasestudy-0.4.0-SNAPSHOT.war /home/devopscasestudy-0.4.0-SNAPSHOT.war
CMD ["java","-jar","home/devopscasestudy-0.4.0-SNAPSHOT.war"]