package com.pinkong.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.pinkong")
public class PkPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PkPortalApplication.class, args);
    }

}
