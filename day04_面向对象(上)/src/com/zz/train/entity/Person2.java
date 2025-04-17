package com.zz.train.entity;

public class Person2 {
    private int age;

    private String name;

    public Person2(int i,String j) {
        this.age = i;
        this.name = j;
    }

    public void setAge(int i) {
        if (i > 0 && i < 130) {
            this.age = i;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
