package com.lhfbalance.boot.controller;

import com.lhfbalance.boot.context.aware.MyApplicationContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("restController")
public class TestController {

    @Autowired
    MyApplicationContextAware myApplicationContextAware;

    @RequestMapping("/")
    String home() {
        Map<String, Object> map = myApplicationContextAware.getApplicationContext().getBeansWithAnnotation(RestController.class);
        System.out.println(map);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("===" + ((RestController)entry.getValue().getClass().getAnnotation(RestController.class)).value());
        }
        return "hello world!";
    }

}
