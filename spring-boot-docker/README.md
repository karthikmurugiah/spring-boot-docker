This is a simple spring boot project to demo spring boot as docker image

1. Install docker and make sure that it is running
2. Build using -> docker build -t [tagname] .
3. Run using ->  docker run -d -p 8080:8080 spring-boot-docker-app
4. List the available containers to find the status using -> docker ps -a
5. Stop the container using -> docker stop [container id]
