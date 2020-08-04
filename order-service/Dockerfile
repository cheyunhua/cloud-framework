FROM hub.c.163.com/library/java:8
VOLUME /tmp-server
ADD target/order-service-0.0.1-SNAPSHOT.jar order-service.jar
RUN bash -c 'touch /order-service.jar'
ENTRYPOINT ["java","-jar","/order-service.jar"]