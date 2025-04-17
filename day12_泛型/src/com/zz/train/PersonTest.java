package com.zz.train;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class Creature {
}

class Person extends Creature {
}

class Man extends Person {
}

public class PersonTest {

    public static <E extends Person> void getInfo(E e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        //getInfo(new Creature()); 报错,是父类
        getInfo(new Person());
        getInfo(new Man());

        Collection list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        printCollection(list);
        printCollection1(list);

        Collection<?> collection = new ArrayList<String>();
        //collection.add(new Object());报错

        //通配符的使用 读取可以不能插入
        List<?> list1 = new ArrayList<>();
        list1 = new ArrayList<String>();
        list1 = new ArrayList<Double>();
        //list1.add("3");报错

        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list2.add("123");
        list2.add("321");

        list3.add(1);
        list3.add(2);
        System.out.println(list2);
        System.out.println(list3);
        
        //test1();
        //test2();

        //泛型嵌套


    }

    private static void test2(List<? super Person> list) {
        //list.add(new Object());
    }

    private static void test1(List<? extends Person> list) {
//        list.add(123);
//        list.add(123);
//        list.add(new Man()); 不能插入数据
    }



    public static void printCollection(Collection c) {
        Iterator i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            System.out.println(i.next());
        }
    }


    public static void printCollection1(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

}
