package com.lhfbalance.boot.context.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    public MySpringApplicationRunListener(SpringApplication application, String[]  args){
        System.out.println("------constructor");
    }

    @Override
    public void starting() {
        System.out.println("------SpringApplication starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("test properties eventsys.topic="+ environment.getProperty("eventsys.topic"));
        System.out.println("test properties albian.configPathc="+ environment.getProperty("albian.configPath"));
        System.out.println("test properties spring.application.name="+ environment.getProperty("spring.application.name"));
        System.out.println("------SpringApplication environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("test properties eventsys.topic="+ context.getEnvironment().getProperty("eventsys.topic"));
        System.out.println("test properties albian.configPathc="+ context.getEnvironment().getProperty("albian.configPath"));
        System.out.println("test properties spring.application.name="+ context.getEnvironment().getProperty("spring.application.name"));
        System.out.println("------SpringApplication contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("test properties eventsys.topic="+ context.getEnvironment().getProperty("eventsys.topic"));
        System.out.println("test properties albian.configPathc="+ context.getEnvironment().getProperty("albian.configPath"));
        System.out.println("test properties spring.application.name="+ context.getEnvironment().getProperty("spring.application.name"));
        System.out.println("------SpringApplication contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("test properties eventsys.topic="+ context.getEnvironment().getProperty("eventsys.topic"));
        System.out.println("test properties albian.configPathc="+ context.getEnvironment().getProperty("albian.configPath"));
        System.out.println("test properties spring.application.name="+ context.getEnvironment().getProperty("spring.application.name"));
        System.out.println("------SpringApplication started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("test properties eventsys.topic="+ context.getEnvironment().getProperty("eventsys.topic"));
        System.out.println("test properties albian.configPathc="+ context.getEnvironment().getProperty("albian.configPath"));
        System.out.println("test properties spring.application.name="+ context.getEnvironment().getProperty("spring.application.name"));
        System.out.println("------SpringApplication running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("------SpringApplication failed");
    }
}
