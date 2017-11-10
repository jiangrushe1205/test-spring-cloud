package com.freefly.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ClientApplication {

	@Value("${server.port}")
	String port;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}


	@RequestMapping("/hi")
	public @ResponseBody String home(@RequestParam(value="name",required=false) String name) {
		return "{name:"+name+"}" + port;
	}

}
