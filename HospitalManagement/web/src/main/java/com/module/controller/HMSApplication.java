package com.module.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.module.*"})
@EntityScan(basePackages = {"com.module.*"})
@EnableJpaRepositories(basePackages = {"com.module.*"})
public class HMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(HMSApplication.class);
    }
}
