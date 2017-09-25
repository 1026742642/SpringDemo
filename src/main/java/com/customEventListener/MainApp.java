package com.customEventListener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/9/25.
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/main/java/com/customEventListener/Beans.xml");

        CustomEventPublisher cvp =
                (CustomEventPublisher) context.getBean("customEventPublisher");

        cvp.publish();
        cvp.publish();
    }
}