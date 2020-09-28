package com.lhfbalance.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestService {

    @Value("${eventsys.topic}")
    String topic;

    @PostConstruct
    public void init() {
        System.out.println("i am init");
        System.out.println("i am init, my properties is " + topic);
    }

    public void foo() {
        System.out.println("foo foo foo");
    }
}
