package com.lopez.rafael.webjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class WebJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebJokesAppApplication.class, args);
    }

}
