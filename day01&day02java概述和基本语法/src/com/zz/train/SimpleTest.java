package com.zz.train;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 一些简单的基础训练
 */
public class SimpleTest {
    public static void main(String[] args) {
        char x = 'x';
        int i123 = 10;
        System.out.println(true? x : i123);// 'x'
        System.out.println(true? 'x' : 10);//'x'
        //getYearRealDay();
        //checkNum();
        //getScopeLevel();
        //for
        int result = 0;
        for (int i = 0; i < 150; i++) {
            if (i % 3 == 0) {
                System.out.println("foo");
            } else if (i % 5 == 0) {
                System.out.println("biz");
            } else if (i % 7 == 0) {
                System.out.println("baz");
            } else {
                System.out.println(i);
            }
        }

        //
        int result1 = 0;
        int i1 = 1;
        while (i1 < 100) {
            result1 += i1;
            i1++;
        }
        System.out.println(result1);

        int result2 = 0;
        int i2 = 1;
        do {
            result2 += i2;
            i2++;

        } while (i2 < 100);

        // 测试break
        // testBreak();

        // 测试break
        //testContinue();

        // 为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时
        //sumFloodTime();

        // 今天是周二，100天以后是周几
        //sum100Day();

        int n=10;
        for (int i = 0; -i < n; i--) {
            System.out.print("=");
        }

    }

    private static void sum100Day() {
        int week = 2;
        int timeDay=week +100;
        System.out.println("100天后是周" + timeDay%7);

    }

    private static void sumFloodTime() {
        int time = 89;
        int day = time / 24;
        int time1 = time % 24;
        System.out.println("抗击洪水用了:" + day + "天");
        System.out.println("抗击洪水用了:" + time1 + "小时");
    }

    private static void testContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println(333);
                continue;
            }
            System.out.println(i);
        }
    }

    private static void testBreak() {
        for (int i = 0; i < 100; i++) {
            System.out.println(123);
            for (int i1 = 0; i1 < 10; i1++) {
                if (i1 == 3) {
                    System.out.println("i1=" + i1);
                    break;
                }
            }

        }
        System.out.println("Game over!!");
    }

    private static void checkNum() {
        int a = 3;
        int x = 100;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            default:
                x += 34;
                break;
        }
        System.out.println(34);
    }

    private static void getScopeLevel() {
        Scanner scanner = new Scanner(System.in);
        int nextInt;
        while (true) {
            System.out.print("请输入成绩:");
            nextInt = scanner.nextInt();
            if (nextInt > 100 || nextInt < 0) {
                System.out.println("输入成绩非法,请重新输入!");
            } else {
                break;
            }
        }
        nextInt /= 10;
        switch (nextInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("等级D");
                break;
            case 6:
                System.out.println("等级C");
                break;
            case 7:
            case 8:
                System.out.println("等级B");
                break;
            case 9:
            case 10:
                System.out.println("等级A");
                break;
        }
    }

    private static void getYearRealDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年份:");
        int year = scanner.nextInt();
        while (true) {
            if (year > 0) {
                break;
            } else {
                System.out.println("您输入的年份非法");
            }
        }

        System.out.print("请输入月份:");
        int month = scanner.nextInt();
        while (true) {
            if (month < 0 || month > 12) {
                System.out.println("您输入的月份非法");
            } else {
                break;
            }
        }

        System.out.print("请输入日期:");
        int day = scanner.nextInt();
        while (true) {
            if (day > 31 || day < 0) {
                System.out.println("您输入的日期非法");
            } else {
                break;
            }
        }
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println("该日起属于" + year + "年的第:" + localDate.getDayOfYear() + "天");
        scanner.close();
    }


}
