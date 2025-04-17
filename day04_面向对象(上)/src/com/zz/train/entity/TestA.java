package com.zz.train.entity;

public class TestA {
    public int i;

    public void change(int i) {
        i++;
        System.out.println(i);
    }

    public void change1(TestA t) {
        t.i++;
        System.out.println(t.i);

    }
}
