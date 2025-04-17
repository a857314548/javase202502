package com.zz.train;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 泛型
 */
public class GenericityTest {
    public static void main(String[] args) {
        // 在集合中使用泛型
        test1();
    }

    private static void test1() {
        // 在集合中使用泛型
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // 遍历方式1 不需要强转
        for (Integer integer : list) {
            System.out.println(integer);
        }

        // 遍历方式2
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Map<String, Integer> map = new HashMap<>();
        map.put("tom1", 1);
        map.put("tom2", 2);
        map.put("tom3", 3);
        map.put("tom4", 4);
        //添加失败
        //map.put(1,"32");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> next = iterator1.next();
            System.out.println("key = " + next.getKey() + ",value =" + next.getValue());
        }

        // 自定义泛型结构
        Comparable c = new Date();
        System.out.println(c.compareTo("red"));

        Comparable<Date> c1 = new Date();
        //System.out.println(c1.compareTo("red")); 这里编译不通过,因为限定了date类型,这体现了泛型在编译期检测不通过



    }
}
