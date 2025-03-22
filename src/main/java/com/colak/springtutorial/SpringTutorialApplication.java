package com.colak.springtutorial;


import com.colak.springtutorial.admin.DemoAdminServer;
import com.colak.springtutorial.client.DemoClient;
import org.springframework.boot.SpringApplication;

public class SpringTutorialApplication {

    public static void main(String[] args) {
        SpringApplication admin = new SpringApplication(DemoAdminServer.class);
        admin.setAdditionalProfiles("admin");
        admin.run(args);

        SpringApplication client = new SpringApplication(DemoClient.class);
        client.setAdditionalProfiles("client");
        client.run(args);
    }
}


