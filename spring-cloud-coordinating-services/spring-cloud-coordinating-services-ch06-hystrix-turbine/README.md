#Docker commands

sudo docker run -d --hostname local-rabbit-mq --name plural-spring-cloud-rabbitmq -p 15672:15672 -p 5672:5672 rabbitmq:3.7.25-management
sudo docker images – see all images
sudo docker ps   - see all running containers

sudo docker stop plural-spring-cloud-rabbitmq  - stop image plural-spring-cloud-rabbitmq  
sudo docker ps -all      - see all containers including stopped
sudo docker start  plural-spring-cloud-rabbitmq

#RabbitMQ credentials
http://localhost:15672 – RabbitMQ Docker console
username: guest
password: guest