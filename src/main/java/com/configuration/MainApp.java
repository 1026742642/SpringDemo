package com.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lenovo on 2017/9/19.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld1 helloWorld = ctx.getBean(HelloWorld1.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }
}
