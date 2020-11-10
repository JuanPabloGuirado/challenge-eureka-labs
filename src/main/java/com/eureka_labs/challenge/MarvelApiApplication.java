package com.eureka_labs.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MarvelApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarvelApiApplication.class, args);
    }

}
