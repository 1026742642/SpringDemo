package com.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/9.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeBeans.xml");
        XmlDemo xmlDemo = (XmlDemo) context.getBean("ByXml") ;
        xmlDemo.getMessage();
        Thread.sleep(1000);
        ImpDemo impDemo = (ImpDemo) context.getBean("ByImp");
        impDemo.getMessage();
        Thread.sleep(1000);
        context.registerShutdownHook();
    }
}
