package com.zz.train.abstraction;

public final class Test {
    public static int a = 3;

    public final int c;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Test.a = a;
    }

    public int getC() {
        return c;
    }

    public Test() {
        c = ++a;
    }

    public final void testA() {
        System.out.println("aaaccc");
    }
}
