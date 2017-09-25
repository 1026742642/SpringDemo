package com.customEventListener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by lenovo on 2017/9/25.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }
}