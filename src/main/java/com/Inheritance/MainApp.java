package com.Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/9.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ExtendBeans.xml");

        Parent parent = (Parent) context.getBean("parentId");
        parent.getMessage1();
        parent.getMessage2();

        Son objB = (Son) context.getBean("sonId");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
