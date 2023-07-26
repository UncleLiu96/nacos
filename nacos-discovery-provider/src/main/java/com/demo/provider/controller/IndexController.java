package com.demo.provider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {

    @RequestMapping("hello/{content}")
    public String hello(@PathVariable("content") String content){
        return "hello,"+content;
    }
}
