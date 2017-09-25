package com.customEventListener;

import org.springframework.context.ApplicationListener;

/**
 * Created by lenovo on 2017/9/25.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}