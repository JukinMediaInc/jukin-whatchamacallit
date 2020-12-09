
# These the instructions to run this test application.

1. Clone the WhatChaMaCallIt project from Github to your machine. (See email for more detail.)
2. Ensure that Java is installed on your machine and that JAVA_HOME environment variable is set correctly.
3. Ensure that no application is already running on port 8090.
4. Goto the project folder and run command './grailsw run-app'
5. This will run the test application and make it available at: http://localhost:8090/WhatChaMaCallIt
6. Now, goto 'http://localhost:8090/WhatChaMaCallIt/login' to start the work flow.
7. Credentials which work for the application are: username: quality@jukinmedia.com, password: Test1ng
8. Follow the instructions in the email you received from us.

# Setting Up a Docker Container and Deploying it to ECS
THIS IS NOT NEEDED FOR TESTING CANDIDATES
Build the docker image 
```
docker build -t jukin/whatchamacallit .
```

Tag the image
```
docker tag jukin/whatchamacallit:latest 838069323424.dkr.ecr.us-west-2.amazonaws.com/jukin/whatchamacallit:latest
```

Login to Amazon ECR:
```
$(aws ecr get-login --no-include-email  --region us-west-2)
```

Push the image
```
docker push 838069323424.dkr.ecr.us-west-2.amazonaws.com/jukin/whatchamacallit:latest
```

Deploy the image
```
aws ecs update-service --region us-west-2 --cluster jukin-nonprod --service whatchamacallit --force-new-deployment
```

