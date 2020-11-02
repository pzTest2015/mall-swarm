package com.pinkong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PkGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PkGatewayApplication.class, args);
    }

}
