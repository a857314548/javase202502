package com.zz.train;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * lambda和函数式接口互相使用
 */
public class LambdaTest2 {


    public static void main(String[] args) {
        // 正常模式
        happyHome(2.13, new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

        //lambda模式
        happyHome(2.63, a -> System.out.println());


        // 正常模式
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("东京");
        list.add("南京");
        list.add("西京");
        list.add("普京");
        list.add("武警");
        List<String> list1 = preDice(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(list1);

        // lambda
        List<String> list2 = preDice(list, str -> str.contains("京"));
        System.out.println(list2);

    }

    public static List<String> preDice(List<String> list, Predicate<String> predicate) {
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                list1.add(s);
            }
        }
        return list1;
    }

    ;

    public static void happyHome(Double money, Consumer consumer) {
        consumer.accept(money);

    }
}
