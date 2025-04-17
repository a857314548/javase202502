package com.zz.train;

import java.util.ArrayList;
import java.util.Collection;

public class GenericityMethodTest {

    public static <E> String getDao(E e) {
        System.out.println(e);
        return null;
    }

    public static void main(String[] args) {
        //String dao = getDao(3);

        //泛型方法测试
        Object[] oa = new Object[100];
        Collection<Object> oc = new ArrayList<>();
        fromArrayToCollection(oa, oc);//成功

        String[] os = new String[100];
        Collection<String> os1 = new ArrayList<>();
        fromArrayToCollection(os, os1);// 成功

        Collection<Double> cd = new ArrayList<>();
        // 下面代码中T是Double类，但sa是String类型，编译错误。
        // fromArrayToCollection(sa, cd);
        // 下面代码中T是Object类型，sa是String类型，可以赋值成功。
        fromArrayToCollection(os,oc);

    }


    public static <T> void fromArrayToCollection(T[] a, Collection<T> o) {
        for (T t : a) {
            o.add(t);
        }
    }
}
