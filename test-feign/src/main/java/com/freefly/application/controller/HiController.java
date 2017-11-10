package com.freefly.application.controller;

import com.freefly.application.service.SchedualServiceHi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangrushe on 17/11/3.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

//    @HystrixCommand(fallbackMethod = "errorMsg" )
    @RequestMapping(value = "/hi")
    public String sayHo(@RequestParam String name){

        return schedualServiceHi.sayHiFromClientOne(name);
    }

    public String errorMsg(String name){
        return "hi " +  name + ", sorry ,error";
    }
}
