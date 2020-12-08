FROM openjdk:8u171-alpine3.7

WORKDIR /app
ADD . /app

EXPOSE 8080

CMD ["sh", "./grailsw", "run-app"]
