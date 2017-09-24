package com.injectingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/10.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBeans.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollectionId");

        jc.getList();
        jc.getSet();
        jc.getMap();
        jc.getProperties();
    }
}
