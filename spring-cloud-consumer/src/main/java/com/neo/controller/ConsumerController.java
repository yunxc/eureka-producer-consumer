package com.neo.controller;


import com.neo.remote.Hello;
import com.neo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;

    @Autowired
    Hello hello;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }

    @RequestMapping("/hello1")
    public String index() {
        return hello.hellocloud();
    }

    @RequestMapping("/test1")
    public String test1() {
        return "qqqqqqq";
    }

}