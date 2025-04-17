package com.zz.train;

public class IndexOutExp {
    public static void main(String[] args) {
        try {
            String[] strArr = new String[] {"tom","jack","mary"};
            for (int i = 0; i < 4; i++) {
                System.out.println(strArr[i]);//出现数组下标越界异常 java.lang.ArrayIndexOutOfBoundsException: 3
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index err");
        }
        System.out.println("procedure end");

    }
}
