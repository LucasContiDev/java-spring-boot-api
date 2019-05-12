package com.lucas.kairos.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lucas.kairos.application.controllers.UserContactsController;

@SpringBootApplication
public class KairosRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KairosRestApiApplication.class, args);
    }

}
