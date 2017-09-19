package com.annotationRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by lenovo on 2017/9/14.
 */
public class Student {
    private Integer age;
    private String name;

    @Autowired(required = false)
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
