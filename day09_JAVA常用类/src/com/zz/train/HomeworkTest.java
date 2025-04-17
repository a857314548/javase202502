package com.zz.train;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class HomeworkTest {

    String str = new String("Girl");
    char ch[] = {'d', 'b', 'c'};

    public static void main(String[] args) {

        //testString();

        //testMath();

        int x[] = new int[8];
        System.out.println(x[1]);
        String s = "abcdefg";
        System.out.println(s.substring(2, 5));//cde

        String s1 = "people";
        String s2 = "people";
        char[] strArr = new char[]{'p', 'e', 'o', 'p', 'l', 'e'};
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(strArr));//false
        System.out.println(s1 == s2);//true
        System.out.println(s2.equals(new String("people")));//true
        //System.out.println(s2 == strArr);报错

        String s3 = "abcdefg";
        System.out.println(s3.charAt(1));//b

        String s4 = "good";
        s += "student"; //✔
        //char c = s[1]; x
        String s5[] = new String[5];
        //for(int i=0;i<5;s5[i++]="");
        //String s6[ ]={"", "", "", "", ""};

        HomeworkTest x1 = new HomeworkTest();
        x1.change(x1.str, x1.ch);
        System.out.println(x1.str + " and " + x1.ch[0] + x1.ch[1] + x1.ch[2]); // Girl and abc

        StringBuffer sb = new StringBuffer("abcde");
        System.out.println(sb.reverse());//edcba
        StringBuffer delete = sb.delete(1, 2); //这个也是左闭右开
        System.out.println(delete.toString());//ecba

        //模拟一个trim方法，去除字符串两端的空格Scanner scanner = new Scanner(System.in).nextInt();
    }

    public void change(String str, char ch[]) {
        str = "Boy";
        ch[0] = 'a';
    }


    private static void testMath() {
        System.out.println(Math.round(11.5));//12
        System.out.println(Math.round(-11.5));//-11
    }

    public static void testString() {
        String str1 = "尚硅谷";
        String str2 = "尚硅谷";
        String str3 = new String("尚硅谷");
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str3));//true
        str1 = "尚硅谷atguigu.com";
        String str4 = "atguigu.com";
        String str5 = "尚硅谷" + "atguigu.com";
        System.out.println(str1 == str5);//true

        String str6 = (str2 + str4).intern();
        System.out.println(str1 == str6);//false  ---->true
    }

}
