FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/aws_console.jar /aws_console/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/aws_console/app.jar"]
