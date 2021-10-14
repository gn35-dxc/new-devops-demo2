FROM openjdk:8
EXPOSE 9090
ADD target/devops-second-audit-demo.jar devops-second-audit-demo.jar
ENTRYPOINT ["java","-jar","/devops-second-audit-demo.jar"]