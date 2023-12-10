FROM openjdk:11
EXPOSE 8083

ADD target/CandidatAPI-0.0.1-SNAPSHOT.jar CandidatAPI.jar
ENTRYPOINT ["java","-jar","CandidatAPI.jar"]