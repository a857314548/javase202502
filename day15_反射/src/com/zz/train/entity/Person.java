package com.zz.train.entity;

public class Person {
    private String name;

    public int age;

    public Person() {
    }

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {
        System.out.println("我是一个人!");
    }

    private String showLation(String lation) {
        System.out.println("我的国籍是:" + lation);
        return lation;
    }

    public static void showQue() {
        System.out.println("我是一个可爱的人");
    }
}
