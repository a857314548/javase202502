package com.zz.train;

import com.zz.train.entity.A;
import com.zz.train.entity.B;
import com.zz.train.entity.Base;
import com.zz.train.entity.Kids;
import com.zz.train.entity.Son;

public class FactObjCenterTest {
    public static void main(String[] args) {
/*        Kids kids = new Kids();
        kids.setYearsOld(123);
        kids.printAge();
        kids.setSalary(1);
        kids.employeed(kids.getSalary());
        kids.setSex(1);
        kids.manOrWoman(kids.getSex());*/
        //对象类型转换
        //objTranstion();

        //继承练习
        //ExtendTest();

        // ==和equals练习
        //equalTest();

        // 面试题
        //questionTest();

        // 面试题2
        //questionTest2();

        // 面试题3
        //questionTest3();

        //多态练习1
        polymorphic();
    }

    private static void polymorphic() {
        A a = new B();
        a.setA(4);
        System.out.println(a.getA());//0
    }

    private static void questionTest3() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false
    }

    private static void questionTest2() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0

        Object o2;
        if (true) {
            o2 = new Integer(1);
        }
        else {
            o2 = new Double(2.0);
        }
        System.out.println(o2);//1
    }

    private static void questionTest() {
        char[] arr = new char[] { 'a', 'b', 'c' };
        System.out.println(arr);//abc
        int[] arr1 = new int[] { 1, 2, 3 };
        System.out.println(arr1);//地址值
        double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
        System.out.println(arr2);//也是地址值

    }


    private static void equalTest() {
        int it = 65;

    }

    private static void ExtendTest() {
        Son s = new Son();
        System.out.println(s.count);
        s.display();
        Base b = s;
        System.out.println(b.count);
        System.out.println(b == s);
        b.display();
    }

    private static void objTranstion() {
        double d = 3.14;
        long l = (long)d;
        System.out.println(l);
        int i = 5;
        //boolean b = (boolean)i;
        Object obj = "hello";
        String str = (String) obj;
        System.out.println(str);
        Object obj2 = new Integer(12);
        String str2 = (String) obj2;
        System.out.println(str2);//类型转换异常

    }
}
