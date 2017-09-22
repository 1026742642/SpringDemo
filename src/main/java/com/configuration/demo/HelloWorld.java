package com.configuration.demo;

/**
 * Created by lenovo on 2017/9/19.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
