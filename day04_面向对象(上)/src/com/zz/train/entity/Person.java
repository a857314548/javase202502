package com.zz.train.entity;

public class Person {
    private String name;

    private int age;

    private int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age值为：" + age);
    }


    public void addAge(int i) {
        age = i;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
