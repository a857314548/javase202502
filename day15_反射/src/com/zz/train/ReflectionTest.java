package com.zz.train;

import com.zz.train.entity.Person;
import com.zz.train.entity.Son;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

    public static void main(String[] args) throws Exception {
        //反射前
        //reflectionBefore();

        //反射后
        //reflectionAfter();

        //获取反射的4种方式
        //getReflectionWay();

        //获取类和类的父类的属性
        //getClassProperty();

        //获取类的修饰符,数据类型 变量名
        //getClassProperty2();

        //获取类的方法
        //getClassMethod();

        //获取指定方法
        getAssignClassMethod();

    }

    private static void getAssignClassMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class clazz = Person.class;
        Method method = clazz.getDeclaredMethod("showLation", String.class);
        method.setAccessible(true);
        Object p = clazz.newInstance();
        Object obj = method.invoke(p, "中国");
        System.out.println(obj);

        System.out.println("调用静态方法");
        Method staticMethod = clazz.getDeclaredMethod("showQue");
        staticMethod.setAccessible(true);
        //方法没有返回值,这里是null
        Object invoke = staticMethod.invoke(p);
        System.out.println(invoke);
    }

    private static void getClassMethod() {
        Class clazz = Son.class;
        //获取类和父类中被public修饰的方法
        Method[] fields = clazz.getMethods();
        for (Method method : fields) {
            System.out.println(method);
        }

        System.out.println("======================");

        //获取类中所有修饰符修饰的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }


    //获取类的修饰符,数据类型 变量名
    private static void getClassProperty2() {
        Class clazz = Son.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //获取修饰符
            int modifier = declaredField.getModifiers();
            System.out.println("修饰符为:" + Modifier.toString(modifier));

            //获取数据类型
            Class<?> type = declaredField.getType();
            System.out.println("数据类型为:" + type.getName());

            //获取变量名
            String name = declaredField.getName();
            System.out.println("变量名为:" + name);
        }

    }

    //获取类和类的父类的属性
    private static void getClassProperty() throws IllegalAccessException, InstantiationException {
        Class<Son> clazz = Son.class;
        // 只能获取到类和父类中修饰符为public的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.toString());
        }

        // 获取当前类中任意修饰符的属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.toString());
        }
    }

    //获取反射的4种方式 前三种掌握,第三种用的最多,第四种了解
    private static void getReflectionWay() throws ClassNotFoundException {
        //方法1 类名.class
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        //方法2 对象.getClass;
        Person person = new Person();
        Class<? extends Person> clazz2 = person.getClass();
        System.out.println(clazz2);

        //方法3 Class.forname 全路径
        Class<?> clazz3 = Class.forName("com.zz.train.entity.Person");
        System.out.println(clazz3);

        //方法4 类的加载器 了解
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("com.zz.train.entity.Person");
        Class<?> clazzStr = classLoader.loadClass("java.lang.String");
        System.out.println(clazz4);
        System.out.println(clazzStr);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz3 == clazz4);
    }

    private static void reflectionAfter() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //创建对象
        Class clazz = Person.class;
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("张小凡", 28);
        Person p = (Person) obj;
        System.out.println(p.toString());
        //调属性
        Field field = clazz.getDeclaredField("name");
        //设置私有成员变量可访问
        field.setAccessible(true);
        field.set(p, "我是张大凡");
        System.out.println(p.toString());
        //调方法
        Method method = clazz.getDeclaredMethod("showLation", String.class);
        //设置私有方法可访问
        method.setAccessible(true);
        method.invoke(p, "中国");

        //调私有构造器
        Constructor constructor1 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person p1 = (Person) constructor1.newInstance("嘻嘻哈哈");
        System.out.println(p1.toString());

    }

    private static void reflectionBefore() {
        // 创建对象
        Person p = new Person();
        // 调属性
        p.age = 13;
        // 调方法
        p.show();
        System.out.println(p.toString());
    }


}
