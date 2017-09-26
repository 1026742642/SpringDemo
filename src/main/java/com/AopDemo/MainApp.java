package com.AopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/9/25.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/AopDemo/Beans.xml");

        Student student = (Student) context.getBean("student");
//        Student student = new Student();
//        student.setAge(12);
//        student.setName("zerofire");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}