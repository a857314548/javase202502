package com.zz.train;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式
 */
public class LambdaTest {
    public static void main(String[] args) {
        //基础测试
        //baseTest1();

        //各种有参无参的写法
        baseTest2();
    }

    private static void baseTest2() {
        //无参无返回值正常写法
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(123);
            }
        };
        runnable1.run();

        //无参无返回值lambda写法
        Runnable runnable2 = () -> System.out.println(321);
        runnable2.run();

        System.out.println("---------------------------");
        //有参数无返回值正常写法
        Consumer consumer = new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o);
            }
        };
        consumer.accept("321");
        //有参数无返回值lambda写法
        Consumer<String> consumer1 = (String s) -> System.out.println(s);
        consumer1.accept("123");
        //类型推断写法
        Consumer<String> consumer2 = (s) -> System.out.println(s);
        ArrayList<String> list = new ArrayList<>();//这种也是类型推断
        consumer2.accept("123");

        //有多个入参,有多条语句,有返回值
        //正常
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(1, 2));
        //lambda
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1, o2);
        };
        System.out.println(com2.compare(3, 1));

        //当只有一条语句的时候,return与大括号都有,都可以省略
        Comparator<Integer> com3 = (o1,o2) ->o1.compareTo(o2);
        System.out.println(com3);
    }

    private static void baseTest1() {
        //普通方法创建线程
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我是一个人");
            }
        };
        runnable.run();

        //lambda表达式创建线程
        Runnable runnable1 = () -> System.out.println("lambda线程");
        runnable1.run();

        System.out.println("===============");

        //普通方法创建Comparator
        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(12, 21));

        //lambda表达式创建Comparator
        Comparator<Integer> comparator1 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator1.compare(31, 12));

        //方法引用创建Comparator
        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println(comparator2.compare(12, 21));
    }
}
