FROM openjdk:8
RUN mkdir -p /app/
ADD build/libs/docker-springboot-demo.jar /app/docker-springboot-demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/app/docker-springboot-demo.jar"]