package com.zz.train;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int a = 10/ 0;
        } catch (ArithmeticException e) {
            System.out.println("denominator is zero");
        } finally {
            System.out.println("this is finally");
        }
    }

}
