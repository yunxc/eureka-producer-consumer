package com.neo.controller.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yunlong.zhang
 * @date 2019/8/21 0:05
 */
@FeignClient(name= "spring-cloud-consumer")
public interface Test1 {

    @RequestMapping(value = "/test1")
    public String test1();

}
