package com.zz.train;

/**
 * 函数式接口 Lambda表达式就是一个函数式接口的实例
 */

//只有一个抽象类的接口,被称为函数式接口
@FunctionalInterface
interface funcFactory {
    String getInfo();
    //String getInfo1();两个抽象类则报红
}

public class FunctionalTest {
}
