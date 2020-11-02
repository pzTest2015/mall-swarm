package com.pinkong.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.pinkong.auth")
public class PkAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(PkAuthApplication.class, args);
    }

}
