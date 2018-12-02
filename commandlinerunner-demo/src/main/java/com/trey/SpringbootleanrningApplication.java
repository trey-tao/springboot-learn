package com.trey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootleanrningApplication {

    public static void main(String[] args) {
        System.out.println("This service begin to start");
        SpringApplication.run(SpringbootleanrningApplication.class, args);
        System.out.println("This service is started");
    }
}
