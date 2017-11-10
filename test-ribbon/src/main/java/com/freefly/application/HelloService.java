package com.freefly.application;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jiangrushe on 17/11/3.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "errorMsg" )
    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String errorMsg(String name){
        return "hi " +  name + ", sorry ,error";
    }
}
