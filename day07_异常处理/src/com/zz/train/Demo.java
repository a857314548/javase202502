package com.zz.train;

public class Demo {
    public static void func() {
        try {
            throw new Exception();
        } catch (Exception e) {
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }

}
