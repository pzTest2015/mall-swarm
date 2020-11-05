package com.jgj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JGJGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JGJGatewayApplication.class, args);
    }

}
