FROM openjdk:8
EXPOSE 9090
ADD target/devops-audit-demo.jar devops-audit-demo.jar
ENTRYPOINT ["java","-jar","/devops-audit-demo.jar"]