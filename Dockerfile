FROM openjdk:8u171-alpine3.7

WORKDIR /app
ADD . /app

EXPOSE 8090

CMD ["/bin/sh", "./grailsw", "run-app"]
