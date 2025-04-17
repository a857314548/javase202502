package com.zz.train.abstraction;

public class Somothing {

    public void test(final int a) {
        //a++;
    }

    public static void main(String[] args) {
        Other o = new Other();
        new Somothing().addOne(o);
    }

    public void addOne(final Other o) {
// o = new Other();
        o.i++;
    }
}

class Other {
    public int i;
}
