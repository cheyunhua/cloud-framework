FROM hub.c.163.com/library/java:8
VOLUME /tmp
ADD target/eureka-server-0.0.1-SNAPSHOT.jar eureka.jar
RUN bash -c 'touch /eureka.jar'
ENTRYPOINT ["java","-jar","/eureka.jar"]
