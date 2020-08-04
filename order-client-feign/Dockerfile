FROM hub.c.163.com/library/java:8
VOLUME /tmp
ADD target/order-client-feign-0.0.1-SNAPSHOT.jar order-client-feign.jar
RUN bash -c 'touch /order-client-feign.jar'
ENTRYPOINT ["java","-jar","/order-client-feign.jar"]