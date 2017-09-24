package com.lifeCycle;

/**
 * Created by Administrator on 2017/9/9.
 */
public class XmlDemo {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void myInit(){
        System.out.println("Bean is going through init by xml");
    }
    public void myDestroy(){
        System.out.println("Bean will destroy by xml");
    }
}
