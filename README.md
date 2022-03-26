# docker-springboot
Devoir Docker springboot MQL M2

#### Prerequisite 

Installed:   
[Docker](https://www.docker.com/)   
[git](https://www.digitalocean.com/community/tutorials/how-to-contribute-to-open-source-getting-started-with-git)   

Optional:   
[Docker-Compose](https://docs.docker.com/compose/install/)   
[Java 1.8 or 11.1](https://www.oracle.com/technetwork/java/javase/overview/index.html)   
[Maven 3.x](https://maven.apache.org/install.html)

#### Steps

##### Clone source code from git
```
$  git clone https://github.com/kahlaouianouar/docker-springboot.git .
```

##### Build Docker image
```
$ docker build -t="devoir-springboot-kahlaoui" .
```
Maven build will be executes during creation of the docker image.

>Note:if you run this command for first time it will take some time in order to download base image from [DockerHub](https://hub.docker.com/)

##### Run Docker Container
```
$ docker run -p 8080:8080 -it --rm devoir-springboot-kahlaoui
```

##### Test application

```
$ curl localhost:8080
```

the respone should be:
```
Page width title "Devoir Springboot MQL M2"
```

#####  Stop Docker Container:
```
docker stop `docker container ls | grep "devoir-springboot-kahlaoui:*" | awk '{ print $1 }'`
```

## Run with docker-compose 

Build and start the container by running 

```
$ docker-compose up -d 
```

##### Test application with ***curl*** command

```
$ curl localhost:8080
```

the respone should be:
```
Hello World
```

##### Stop Docker Container:
```
docker-compose down
```
