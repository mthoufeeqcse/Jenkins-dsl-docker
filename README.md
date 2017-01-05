# MyAssignment
All Files for my assignment

For Linux
$ docker pull mthoufeeq/jenkins-dsl:0.1
$ docker run -d -v /var/run/docker.sock:/var/run/docker.sock \
                -v $(which docker):/usr/bin/docker -v /var/jenkins_home -p 8484:8080 mthoufeeq/jenkins-dsl:0.1
