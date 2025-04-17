package com.zz.train.entity;

public class CustomPerson<T> {
    private T info;
    //静态方法不能声明泛型
/*    private static void show(T t) {
        System.out.println(111);
    }*/

    //不能在trycatch中使用泛型定义
/*    public void testExp() {
        try {
            int c = 10 / 0;
        } catch (Exception<T> e) {
            e.printStackTrace();
        }
    }*/


    public T getInfo() {
        return info;
    }

    public void setInfo(T t) {
        this.info = t;
    }

    public CustomPerson() {

    }

    public CustomPerson(T info) {
        this.info = info;
    }
}
