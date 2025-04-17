package com.zz.train;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnnotation(value = "尚硅谷")
public class AnnotationTest {


    public static void main(String[] args) throws NoSuchMethodException {
        @SuppressWarnings("unused")
        int a = 10;

        Class aClass = AnnotationTest.class;
        Annotation annotations = aClass.getAnnotation(MyAnnotation.class);
        MyAnnotation myAnnotation = (MyAnnotation) annotations;
        System.out.println(myAnnotation.value());

        Person p = new Person();
        p.setAge(1);
        p.setName("zz");

        Method toString = Person.class.getMethod("toString");
        if (toString.isAnnotationPresent(MyTiger.class)) {
            MyTiger annotation = toString.getAnnotation(MyTiger.class);
            System.out.println(annotation.value());
        } else {
            System.out.println("注解失效");
        }
        System.out.println(p.toString());

    }

    @Override
    public String toString() {
        return "123";
    }

    @Deprecated
    public void testDe() {
        System.out.println(111);
    }
}
