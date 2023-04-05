package com.example.test;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(TestApplication.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
}
