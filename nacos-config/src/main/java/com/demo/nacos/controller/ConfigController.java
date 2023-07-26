package com.demo.nacos.controller;


import com.demo.nacos.config.DataBaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Autowired
    private DataBaseConfig dataBaseConfig;

//    @Value注解可以获取到配置中心的值，但是无法动态感知修改后的值，需要利用@RefreshScope注解
    @Value("${www.name}")
    private String name;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return dataBaseConfig.getName();
    }

    @RequestMapping("/getName")
    public String getName() {
        return name;
    }
}
