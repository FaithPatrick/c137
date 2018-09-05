package com.morty.c137;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableScheduling
@ImportResource({"classpath:spring-context.xml"})
public class C137Application {

    public static void main(String[] args) {
        SpringApplication.run(C137Application.class, args);

    }
}