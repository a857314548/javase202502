package com.zz.train;

public class Sample {

    public void method1(String str) {
        System.out.println(str);
    }

    public void method2(String str) {
        method1(str);

    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.method2("嘻嘻");
    }
}
