package com.zz.train;

import com.zz.train.entity.Test;

public class ArithmeticExp {
    int x;

    public static void main(String[] args) {
        try {
            int y;
            ArithmeticExp arithmeticExp = new ArithmeticExp();
            y = 3 /arithmeticExp.x;
            System.out.println(y);//算数异常 java.lang.ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            System.out.println("denominator is zero");
        }
        System.out.println("end");
    }
}
