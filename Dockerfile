FROM openjdk:17
EXPOSE 8080
ADD target/githubactions.jar githubactions.jar
ENTRYPOINT ["java", "-jar", "/demo88.jar"]