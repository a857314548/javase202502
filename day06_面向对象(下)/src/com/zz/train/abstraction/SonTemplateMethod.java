package com.zz.train.abstraction;

public class SonTemplateMethod extends TemplateMethod {
    @Override
    public void code() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i);
        }
    }
}
