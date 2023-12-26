From openjdk:17
EXPOSE 8080
ADD target/springboot-jenkins-docker-1.jar springboot-jenkins-docker-1.jar
ENTRYPOINT [ "java", "-jar", "springboot-jenkins-docker-1.jar" ]
