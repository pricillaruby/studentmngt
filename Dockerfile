FROM openjdk:21-ea-1-jdk-oracle
ADD target/StudentManagementApplication.jar StudentManagementApplication.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","StudentManagementApplication.jar"]