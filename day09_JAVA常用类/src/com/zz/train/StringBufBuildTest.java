package com.zz.train;

/**
 * String、StringBuffer、StringBuilder
 */
public class StringBufBuildTest {

    public static void main(String[] args) {
        //测试三者效率
        //testPerformance();

        //面试题
        //interviewQuestionTest();

        //面试题2
        interviewQuestionTest2();
    }

    private static void interviewQuestionTest2() {
        String a = "123";
        String b = "123";
        String c = new String("123");
        String d = new String("123");
        System.out.println(a.equals(b));//true
        System.out.println(a == b);//true
        System.out.println(c.equals(d));//true
        System.out.println(c == d);//false
        System.out.println(a.equals(c));//true
        System.out.println(a == c);//false
    }

    private static void interviewQuestionTest() {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//报错,源码super(str.length() + 16);会导致空指针
    }

    private static void testPerformance() {
        long startTime = 0L;
        long endTime = 0L;
        String str = "";
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            str += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("string用时:" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            stringBuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringBuffer用时:" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringBuilder用时:" + (endTime - startTime));
    }
}
