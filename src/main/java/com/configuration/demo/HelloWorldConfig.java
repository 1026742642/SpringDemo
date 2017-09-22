package com.configuration.demo;
import org.springframework.context.annotation.*;
/**
 * Created by lenovo on 2017/9/19.
 */
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
