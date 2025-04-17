package com.zz.train.interfaces;

public interface A {
    double p1 = 3.14;

    public default void getInfo() {
        System.out.println("123321");
    }


    public static void getMethod1() {
        System.out.println("静态12331");
    }
}
