package com.zz.train;

import java.lang.annotation.Annotation;

public class Person {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    @MyTiger(value = "zz")
    public String toString() {
        Class pClass = Person.class;
        return "name = " + name + ", age =" + age + "MyTiger  = ";
    }
}
