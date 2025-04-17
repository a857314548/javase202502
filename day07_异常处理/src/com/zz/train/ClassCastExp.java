package com.zz.train;

import java.util.Date;

public class ClassCastExp {

    public static void main(String[] args) {
        Object obj = new Date();

        ClassCastExp classCastExp;
        classCastExp = (ClassCastExp) obj;
        System.out.println(classCastExp); //类型转换异常 java.lang.ClassCastException: java.util.Date cannot be cast to com.zz.train.ClassCastExp
    }
}
