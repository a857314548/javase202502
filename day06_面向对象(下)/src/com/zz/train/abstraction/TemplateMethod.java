package com.zz.train.abstraction;

public abstract class TemplateMethod {
    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("总共用时：" + (end - start) + "毫秒");
    }

    public abstract void code();
}
