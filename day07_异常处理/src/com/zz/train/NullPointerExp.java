package com.zz.train;


import com.zz.train.entity.Test;

public class NullPointerExp {
    public static void main(String[] args) {
        Test test = new Test();
        test = null;
        System.out.println(test.j);//空指针异常 java.lang.NullPointerException
    }
}
