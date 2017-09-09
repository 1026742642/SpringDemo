package com.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Administrator on 2017/9/9.
 */
public class ImpDemo implements InitializingBean, DisposableBean {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void destroy() throws Exception {
        System.out.println("Bean will destroy by implement");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going through init by implement");
    }
}
