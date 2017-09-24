package com.tutorialspoint;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Administrator on 2017/9/6.
 */
public class HelloWorld implements InitializingBean{
    private String message;

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going through init.");
    }
}
