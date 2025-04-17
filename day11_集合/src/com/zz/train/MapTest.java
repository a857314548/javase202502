package com.zz.train;

import com.sun.javafx.collections.MappingChange;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapTest {
    public static void main(String[] args) {
        //Maptest
        mapBaseTest();
    }

    private static void mapBaseTest() {
        Map map = new HashMap();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        Set set = map.keySet();
        System.out.println("map的所有key:" + Arrays.toString(set.toArray()));
        Collection values = map.values();
        System.out.println("map的所有key:" + Arrays.toString(values.toArray()));
        System.out.println("map所有的映射关系：");
        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("key is " + entry.getKey() + "value is " + entry.getValue());
        }
    }
}
