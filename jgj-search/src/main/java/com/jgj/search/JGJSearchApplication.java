package com.jgj.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JGJSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(JGJSearchApplication.class, args);
    }
}
