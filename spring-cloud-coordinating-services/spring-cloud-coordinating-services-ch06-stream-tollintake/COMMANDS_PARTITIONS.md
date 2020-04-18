1. mvn package


#goto to target forlder and run 3 terminals in maven target folder
2. cd /home/osboxes/eclipse-workspace/spring-cloud-coordinating-services-ch06-stream-tollintake/target

#run jar files
3.
java -jar spring-cloud-coordinating-services-ch06-stream-tollintake-0.0.1-SNAPSHOT.jar --spring.cloud.stream.instanceIndex=0

java -jar spring-cloud-coordinating-services-ch06-stream-tollintake-0.0.1-SNAPSHOT.jar --spring.cloud.stream.instanceIndex=1

java -jar spring-cloud-coordinating-services-ch06-stream-tollintake-0.0.1-SNAPSHOT.jar --spring.cloud.stream.instanceIndex=2

http://localhost:15672/#/queues
should be created
fastpasstoll.tollProcessingGroup-0
D	idle	0	0	0			
fastpasstoll.tollProcessingGroup-1
D	idle	0	0	0			
fastpasstoll.tollProcessingGroup-2

4. Send multiple POST request to

POST http://localhost:8082/toll
{"stationId":10, "customerId":100, "timestamp": "2020-04-17T12:04:0"}

POST http://localhost:8082/toll
{"stationId":20, "customerId":100, "timestamp": "2020-04-17T12:04:0"}


POST http://localhost:8082/toll
{"stationId":30, "customerId":100, "timestamp": "2020-04-17T12:04:0"}


