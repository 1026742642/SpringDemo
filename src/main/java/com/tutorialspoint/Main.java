package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/6.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/tutorialspoint/Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("id");
        objA.getMessage();

    }
}
