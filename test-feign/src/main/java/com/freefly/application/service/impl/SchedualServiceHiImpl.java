package com.freefly.application.service.impl;

import com.freefly.application.service.SchedualServiceHi;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiangrushe on 17/11/3.
 */
public class SchedualServiceHiImpl{

    public String sayHiFromClientOne(String name) {
        return " i am " + name;
    }
}
