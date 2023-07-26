package com.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("open")
public class ConfigController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("getConfig")
    public String getConfig() {
        // url = http://服务提供者的应用名称/接口名称/参数
        return restTemplate.getForObject("http://nacos-config/getConfig" , String.class);
    }
}
