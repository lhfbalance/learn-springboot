package com.lhfbalance.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource({"taf:eventsys.conf", "taf:eventsys.properties"})
@PropertySource("classpath:eventsys.properties")
public class App {

    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication();
//        springApplication.addListeners();
        SpringApplication.run(App.class, args);
    }
}
