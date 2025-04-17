package com.zz.train;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomGenericityTest {
    public static void main(String[] args) {
        // 1、使用时：类似于Object，不等同于Object
        ArrayList list = new ArrayList();

        //list.add(new Date()); 有风险,且编译器不会检测出来
        list.add("123");

        test(list); // 泛型擦除，编译不会类型检查

        List<Object> list1 = new ArrayList<>();
        list1.add("321");
        //test(list1); 这里就会在编译器检测出错误

    }

    private static void test(ArrayList<String> arrayList) {
        for (String s : arrayList) {
            System.out.println("str = " + s);
        }
    }


}
