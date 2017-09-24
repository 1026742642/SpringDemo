package com.dependencyInjection.setterBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/10.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SetterBeans.xml");

        TextEditor te = (TextEditor) context.getBean("textEditorId");
        te.spellCheck();
    }
}
