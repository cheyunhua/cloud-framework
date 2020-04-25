package org.triumphxx.orderclientribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class OrderClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderClientRibbonApplication.class, args);
    }

}
