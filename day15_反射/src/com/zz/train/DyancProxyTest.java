package com.zz.train;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface HuMan {
    String belive();

    void eat(String food);
}

class SuperMan implements HuMan {

    @Override
    public String belive() {
        return "i belive i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("i like eat " + food);
    }
}


public class DyancProxyTest {

    public static Object getProxyInstance(Object obj) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.send(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
    }
}

class HuManUtil {
    public void method1() {
        System.out.println("调用了方法1");
    }

    public void method2() {
        System.out.println("调用了方法2");
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object obj;

    public void send(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HuManUtil huManUtil = new HuManUtil();
        huManUtil.method1();
        Object invoke = method.invoke(obj, args);
        huManUtil.method2();
        return invoke;
    }

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        HuMan proxyInstance = (HuMan) DyancProxyTest.getProxyInstance(superMan);
        String belive = proxyInstance.belive();
        System.out.println(belive);
        proxyInstance.eat("banana");

        System.out.println("*****************************");

        //用静态代理试试
        RealClothFactory realClothFactory = new RealClothFactory();
        ClothFactory proxyInstance1 = (ClothFactory) DyancProxyTest.getProxyInstance(realClothFactory);
        proxyInstance1.showClothColor();
    }
}
