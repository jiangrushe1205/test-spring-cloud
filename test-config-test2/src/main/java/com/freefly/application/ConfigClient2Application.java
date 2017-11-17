package com.freefly.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangrushe on 17/11/7.
 */

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableEurekaClient
public class ConfigClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2Application.class, args);
    }

    @Value("${democonfigclient.message}")
    private String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
