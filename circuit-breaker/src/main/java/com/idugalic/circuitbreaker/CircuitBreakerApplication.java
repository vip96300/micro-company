package com.idugalic.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CircuitBreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerApplication.class, args);
    }
}
