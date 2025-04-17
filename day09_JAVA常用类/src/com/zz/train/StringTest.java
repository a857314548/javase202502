package com.zz.train;

import com.zz.train.entity.Person;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public static void main(String[] args) {
        // 字符串构造方法
        //strConsction();

        //字符串比较练习1
        //strTest1();

        //字符串比较练习2
        //strTest2();

        //字符串比较练习3
        //strTest3();

        //字符串比较练习4
        //strTest4();

        //面试题
        //strTest5();

        //字符串常用方法
        //strCommonMethod();

        //字符串转换
        //strCover();

        //模拟一个trim方法，去除字符串两端的空格
        //trimTest();

        //将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
        //strCover2();

        // 获取一个字符串在另一个字符串中出现的次数。比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
        //strCover3();

        //5.对字符串中字符进行自然顺序排序。
        //提示：
        //1）字符串变成字符数组。
        //2）对数组排序，选择，冒泡，Arrays.sort();
        //3）将排序后的数组变成字符串。
        strSort();


    }

    private static void strSort() {
        String str = "abkkcadkabkebfkabkskab";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(String.valueOf(chars));
    }

    private static void strCover3() {
        String str = "abkkcadkabkebfkabkskab";
        String[] split = str.split("ab");
        System.out.println(split.length);
    }

    private static void strCover2() {
        String str = "abcdefg";
        int c = str.indexOf("c");
        int d = str.indexOf("f");
        char[] chars = str.toCharArray();
        for (int i = c, j = d; i < j; i++, j--) {
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
        }
        System.out.println(String.valueOf(chars));
    }

    private static void trimTest() {
        String str = " hello world ";
        String replace = str.replaceAll("^ | $", "");
        System.out.println(replace);

    }

    private static void strCover() {
        try {
            String str = "中";
            System.out.println(str.getBytes("ISO8859-1").length);// -128~127 1
            System.out.println(str.getBytes("GBK").length);//2
            System.out.println(str.getBytes("UTF-8").length); //3
            System.out.println(new String(str.getBytes("ISO8859-1"),
                    "ISO8859-1"));// 乱码，表示不了中文 ?
            System.out.println(new String(str.getBytes("GBK"), "GBK"));//中
            System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));//中
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    private static void strCommonMethod() {
        //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
        String str = "12hello34world5java7891mysql456";
        String s = str.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(s);//hello,world,java,mysql

        //判断str字符串中是否全部有数字组成，即有1-n个数字组成
        String str1 = "12345";
        boolean matches = str1.matches("\\d+");
        System.out.println(matches);

        //判断这是否是一个杭州的固定电话
        String tel = "0571-4534289";
        boolean matches1 = tel.matches("0571-\\d{7,8}");
        System.out.println(matches1);

        String str2 = "hello|world|java";
        String[] strs = str2.split("\\|");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        System.out.println();
        String str3 = "hello.world.java";
        String[] strs3 = str3.split("\\.");
        for (int i = 0; i < strs3.length; i++) {
            System.out.println(strs3[i]);
        }


    }

    private static void strTest5() {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//good and best 注意这里没有换行
        System.out.println(ex.ch);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    private static void strTest4() {
        String s = "0";
        for (int i = 1; i <= 5; i++) {
            s += i;
        }
        System.out.println(s);
    }

    private static void strTest3() {
        String s1 = "hello";

        String s2 = "world";

        String s3 = "hello" + "world";

        String s4 = s1 + "world";

        String s5 = s1 + s2;

        String s6 = (s1 + s2).intern();

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false
        System.out.println(s3 == s6);//true
    }

    private static void strTest2() {
        Person p1 = new Person();
        p1.name = "zz";

        Person p2 = new Person();
        p2.name = "zz";

        System.out.println(p1.name.equals(p2.name)); //true
        System.out.println(p1.name == p2.name); //true
        System.out.println(p1.name == "zz"); //true
        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2); //false

    }

    private static void strTest1() {
        // 字符串比较
        String s1 = "javaEE";
        String s2 = "javaEE";
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
        System.out.println(s1 == s2);//ture
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false
    }

    private static void strConsction() {
        String str = "hello";

        String s1 = new String();

        String s2 = new String(str);

        char[] arr = new char[0];
        String s3 = new String(arr);

        //String s4 = new String(char[] a,int startIndex,int count); 构造方法,不深究

    }
}
