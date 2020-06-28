package com.example.myproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.example.myproject.*")
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy=true)
@Configuration

public class MyprojectApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyprojectApplication.class);
    public static void main(String[] args) {
        try {
            SpringApplication.run(MyprojectApplication.class, args);
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
