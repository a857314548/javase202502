package com.zz.train;

import com.zz.train.abstraction.A;
import com.zz.train.abstraction.B;
import com.zz.train.abstraction.SonTemplateMethod;
import com.zz.train.abstraction.TemplateMethod;
import com.zz.train.designmode.EvilChineseStyle;
import com.zz.train.designmode.HungryManStyle;
import com.zz.train.abstraction.Test;
import com.zz.train.designmode.NetWork;
import com.zz.train.designmode.ProxyServer;
import com.zz.train.designmode.RealServer;

public class FactObjDownTest {

    private final String STT_STR = "INFO";

    public void abc() {
        //STT_STR = "INFO";只能定义一次
    }

    public static void main(String[] args) {
        //设计模式-单例模式饿汉式
        HungryManStyle hungryManStyle = HungryManStyle.getInstanceOf();

        //设计模式-单例模式懒汉式
        EvilChineseStyle instance = EvilChineseStyle.getInstance();

        //final练习
        Test test = new Test();
        System.out.println(test.c);
        //test.c = 31;
        Test test1 = new Test();
        System.out.println(test1.c);

        //抽象方法练习
        A a = new B();
        a.A1();
        a.A2();

        //抽象方法练习2
        TemplateMethod sonTemplateMethod = new SonTemplateMethod();
        sonTemplateMethod.getTime();

        //接口代理模式
        NetWork netWork = new ProxyServer(new RealServer());
        netWork.browe();
    }
}
