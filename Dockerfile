FROM openjdk:8
ADD build/libs/ec2-springboot-demo.jar docker-springboot-demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-springboot-demo.jar"]
