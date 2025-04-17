package com.zz.train;

import com.zz.train.entity.Person;
import com.zz.train.entity.Person2;
import com.zz.train.entity.Student;
import com.zz.train.entity.TestA;
import com.zz.train.entity.TriAngle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FactObjUpTest {
    public static void main(String[] args) {
        // 测试创建类
        //tesrPerson();

        // 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
        //printRectangle();

        // 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再 计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法， 接收返回的面积值并打印。
        //System.out.println("该矩形的面积为：" + printRectangle());
        // 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法
        //中调用该方法，接收返回的面积值并打印。略

        //定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
        //score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
        //问题一：打印出3年级(state值为3）的学生信息。
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        //bubbleStundent();

        //方法重载1
        //methodOverload();

        //编写程序，定义三个重载方法并调用。方法名为mOL。
        //三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
        //执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
        //在主类的main ()方法中分别用参数区别调用三个方法。
/*        System.out.println(mOL(2));
        System.out.println(mOL(2, 3));
        System.out.println(mOL("嘻嘻"));*/

        //定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
        //法求两个double值中的最大值，第三个方法求三个double值中的最大值，
        //并分别调用三个方法。
        /*System.out.println(max(1, 2));
        System.out.println(max(2.2, 3.3));
        System.out.println(max(1.33, 1.1, 1.9));*/

        // 方法的参数传递
        /*int a = 3;
        int b = 4;
        Student.coverParam(a, b);
        System.out.println("a=" + a + ", b = " + b);*/

        // 方法被调用后，仅打印出a=100 b =200
/*        int a = 10;
        int b = 10;
        method(a,b);*/

        //定义一个int型的数组：int[] arr = new int[]{12,3,3,34,56,77,432};
        //让数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上的
        //新值。遍历新的数组。
        //divideNewArr();

        //arr打印
        //arrPrint();

        //递归计算1-100之间所有自然数的和
        //System.out.println(recursionOneHundred(100));

        //递归写出阶乘
        //System.out.println(recursionFactorial(10));

        //已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
        //System.out.println(recursionFn(10));

        //已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n), 其中n是大于0的整数，求f(10)的值。
        //System.out.println(recursionFn2(10));

        //输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值1 1 2 3 5 8 13 21 34 55规律：一个数等于前两个数之和
        // 要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
        //System.out.println(recursionFBNQ(10));

        //类的封装
        //classPackage();

        //类的封装2
        //TriAngleTest();

        //写出输出结果
        //show(0);//6?15没太懂，估计是switch没有brank，所以一直往下走了
        //show(1);//6?14

        //练习1
/*        int x = 1;
        for(show('a'); show('b') && x<3; show('c')){
            show('d');
            x++;
        }*/

        // 练习2
/*        int i = 4, j = 2;
        leftshift(i, j);
        System.out.println(i);//4*/

        //练习3
/*        TestA ta = new TestA();
        System.out.println(ta.i); //0
        ta.change(ta.i);
        System.out.println(ta.i); //0
        ta.change1(ta);  //1
        System.out.println(ta.i);//1*/

        //冒泡排序从大到小
        //sortArr();

        //练习4
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i); //1


    }

    public static void change(int i){
        i++;
    }


    private static void sortArr() {
        int[] array = {3, 2, 5, 1, 7};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void leftshift(int i, int j) {
        i += j;
    }


    public static boolean show(char ch) {
        System.out.print(ch);
        return true;
    }


    private static void show(int i) {
        switch (i) {
            default:
                i += 2;
            case 1:
                i += 1;
            case 4:
                i += 8;
            case 2:
                i += 4;
        }
        System.out.println("i=" + i);
    }

    private static void TriAngleTest() {
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(12);
        triAngle.setHeight(13);
        System.out.println("面积为：" + triAngle.getArea());
    }

    private static void classPackage() {
        Person2 person2 = new Person2(18, "zz");
        System.out.println(person2.getAge());
    }

    private static int recursionFBNQ(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursionFBNQ(n - 1) + recursionFBNQ(n - 2);
        }
    }

    private static long recursionFn2(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return recursionFn2(n + 2) - 2 * recursionFn2(n + 1);
        }
    }

    private static long recursionFn(int fn) {
        if (fn == 0) {
            return 1;
        } else if (fn == 1) {
            return 4;
        } else {
            return 2 * recursionFn(fn - 1) + recursionFn(fn - 2);
        }
    }

    private static long recursionFactorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recursionFactorial(num - 1);
        }

    }

    private static int recursionOneHundred(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + recursionOneHundred(num - 1);
        }
    }

    private static void arrPrint() {
        int[] arr = new int[10];
        System.out.println(arr);//地址值?
        char[] arr1 = new char[10];
        System.out.println(arr1); //地址值?
    }

    private static void divideNewArr() {
        // 方法1
        int[] arr = new int[]{12, 3, 3, 34, 56, 77, 432};
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / temp;
        }
        System.out.println(Arrays.toString(arr));
        // 方法2
        int[] arr2 = new int[]{12, 3, 3, 34, 56, 77, 432};
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = arr2[i] / temp;
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void method(int a, int b) {
        a = a * 10;
        b = b * 20;
        System.out.println(a);
        System.out.println(b);

    }


    private static Object max(int a, int b) {
        return a > b ? a : b;
    }

    private static Object max(double a, double b) {
        return a > b ? a : b;
    }

    private static Object max(double a, double b, double c) {
        return a > b ? a > c ? a : c : b;
    }

    private static int mOL(int a) {
        return a * a;
    }

    private static int mOL(int a, int b) {
        return a * b;
    }

    private static int mOL(String str) {
        System.out.println("字符串信息为：" + str);
        return 0;
    }

    private static void methodOverload() {
        //1.判断：与void show(int a,char b,double c){}构成重载的有：
        //void show(int x,char y,double z){} // no
        //int show(int a,double c,char b){} // yes
        //void show(int a,double c,char b){} // yes
        //boolean show(int c,char b){} // yes
        //void show(double c){} // yes
        //double show(int x,char y,double z){} // no
        //void shows(){double c} // no

    }

    private static void bubbleStundent() {
        Student[] studentArr = new Student[20];
        for (int i = 0; i < studentArr.length; i++) {
            Student student = new Student();
            student.setNumber(i + 1);
            int score = (int) (Math.random() * 3) + 1;
            int state = (int) (Math.random() * 100) + 1;
            student.setScore(score);
            student.setState(state);
            if (score == 3) {
                System.out.println(student);
            }
            studentArr[i] = student;
        }
        // 使用冒泡排序按学生成绩排序
        for (int i = 0; i < studentArr.length - 1; i++) {
            for (int j = 0; j < studentArr.length - 1 - i; j++) {
                if (studentArr[j].getState() > studentArr[j + 1].getState()) {
                    Student temp = studentArr[j];
                    studentArr[j] = studentArr[j + 1];
                    studentArr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.asList(studentArr));
    }

    private static int printRectangle() {
        int length = 10;
        int width = 8;
        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1 < width; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return length * width;
    }

    private static void tesrPerson() {
        Person p1 = new Person();
        p1.study();
        p1.showAge();
        p1.addAge(123);
        System.out.println(p1);

        Person p2 = new Person();
        p2.study();
        p2.showAge();
        p2.addAge(321);
        System.out.println(p2);
    }
}
