package com.colak.springtutorial.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Profile("client")
public class DemoClient {

    @GetMapping
    public String hello(){
        return "Hello world!";
    }

}