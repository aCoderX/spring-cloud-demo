FROM java:8

#需要放在jar包同目录下
ADD eureka-1.0-SNAPSHOT.jar /app.jar

EXPOSE 8000

ENTRYPOINT ["java","-jar","/app.jar"]