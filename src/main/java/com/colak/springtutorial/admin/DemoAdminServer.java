package com.colak.springtutorial.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableAdminServer
@Configuration
@EnableAutoConfiguration
@Profile("admin")
public class DemoAdminServer {

}
