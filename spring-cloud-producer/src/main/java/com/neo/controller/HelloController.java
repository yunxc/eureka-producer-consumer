package com.neo.controller;

import com.neo.controller.remote.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Test1 test1;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }

    /*@RequestMapping("/hello")
    public String hello() {
        return "hello consul";
    }*/

    @RequestMapping("/test1")
    public String test1(){
        return "ProducerApplication" + test1.test1();
    }
}