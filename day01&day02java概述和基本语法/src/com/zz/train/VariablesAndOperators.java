package com.zz.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * java基础和变量与运算符练习
 */
public class VariablesAndOperators{
    public static void main(String[] something_to_do) {
        //System.out.println(3%4);
        // 三元运算
        int i1 = 10;
        int i2 = 20;
        int ii = i1++;
        System.out.println("ii=" + ii); //10
        System.out.println("i1=" + i1);//11
        ii = ++i1;
        System.out.println("ii=" + ii);//12
        System.out.println("i1=" + i1);//12
        ii = i2--;
        System.out.println("ii=" + ii);//20
        System.out.println("i2=" + i2);//19
        ii = --i2;
        System.out.println("ii=" + ii);//18
        System.out.println("i2=" + i2);//18
        System.out.println("5+5=" + 5 + 5);
        int a = 3510;
        System.out.println(a / 1000 * 1000);
        short s = 5;
        s = (short) (s - 2);
        System.out.println(s);
        char c = 'a';
        int ih = 5;
        float d = .314F;
        System.out.println(c + ih);
        System.out.println(c + d);
        double result = c + ih + d;
        System.out.println(result);
        String str2 = 3.5f + "";
        System.out.println(str2);
        Boolean flag = new Boolean("12");
        System.out.println(flag);
        System.out.println("123\r1222");
        char chr = '1';
        System.out.println(chr);
        // 获取个位十位百位
        int num = 135;
        int i3 = num / 100;
        int i4 = num % 100 / 10;
        int i5 = num % 100 % 10;
        System.out.println("百位数=" + i3);
        System.out.println("十位数=" + i4);
        System.out.println("个位数=" + i5);
        // 三元运算
        short az = 2;
        //az = az +2; 编译会报错
        int i6 = 1;
        double i7 = 1 * 0.6;
        int zzz = (int) i7;
        System.out.println(zzz); //double转int为向下取整 0.6 -> 0
        System.out.println(i6 *= 0.1);// *=等符号不会改变数据类型
        System.out.println(1 * 0.1);
        //
        int m = 2;
        int n = 3;
        n *= m++;//先运算再赋值
        System.out.println("n=" + n);//6
        System.out.println("m=" + m);//3
        //
        int n1 = 10;
        n1 += (n1++) + (++n1); //10 + 10 + 12
        System.out.println(n1);//32
        //
        boolean b1 = false;
        if (b1 == true) {
            System.out.println("结果为真");
        } else {
            System.out.println("结果为假");
        }
        //
        int x = 1;
        int y = 1;
        System.out.println(x++ == 2); //false
        System.out.println(++y == 2); //true
        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y); //x=2 y=2
        //
        int x1 = 1;
        int y1 = 1;
        if (x1++ == 2 && ++y1 == 2) {
            x1 = 7;
        }
        System.out.println("x1=" + x1 + ",y1=" + y1);//x1=2 y1=1(短路与后面的==y1没有执行，y1还是=1)
        //
        int x2 = 1;
        int y2 = 1;
        if (x2++ == 1 | ++y2 == 1) {
            x2 = 7;
        }
        System.out.println("x2=" + x2 + ",y2=" + y2);//x2=7 y2=2
        //
        int x3 = 1;
        int y3 = 1;
        if (x3++ == 1 || ++y3 == 1) {
            x3 = 7;
        }
        System.out.println("x3=" + x3 + ",y3=" + y3);//x3=7 y3=1
        //
        boolean x4 = true;
        boolean y4 = false;
        System.out.println(y4 = true);
        short z4 = 42;
        //if(y4==true)
        if ((z4++ == 42 && (y4 = true))) {
            z4++;
        }
        if (x4 = false || (++z4 == 45)) {
            z4++;
        }
        System.out.println("z4=" + z4);//46
        //
        int x5 = 3;
        int y5 = 4;
        int z5 = 5;
        int xy5 = x5 > y5 ? x5 : y5;
        int xyz5 = x5 > y5 ? x5 > z5 ? x5 : z5 : y5 > z5 ? y5 : z5;
        System.out.println("x5 y5中的较大数是：" + xy5); //4
        System.out.println("x5 y5 z5中的较大数是：" + xyz5);//5
        //
        int age = 75;
        if (age < 0) {
            System.out.println("不可能！");
        } else if (age > 250) {
            System.out.println("是个妖怪！");
        } else {
            System.out.println("人家芳龄 " + age + " ,马马乎乎啦！");
        }
        //根据考试成绩输出奖励
        //getTestScope();
        //输入三个数,从小到大打印出来
        //buildNumMax();
        //
        int x6 = 4;
        int y6 = 1;
        if (x6 > 2) {
            if (y6 > 2) {
                System.out.println(x + y);
            } else {
                System.out.println("atguigu");
            }
        } else {
            System.out.println("x is " + x);
        } //atguigu
        //
        boolean b = true;
        // 如果写成if(b=false)能编译通过吗？如果能，结果是？能 c
        if (b == false) {
            System.out.println("a");
        } else if (b) {
            System.out.println("b");
        } else if (!b) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }//b
        //
        int x7 = 10;
        int y7 = 20;
        if (x7 + y7 >= 50) {
            System.out.println("hello world!");
        }
        //
        double x8 = 10.123;
        double y8 = 12.123;
        if (x8 > 10 & y8 < 20) {
            System.out.println(x8 + y8);
        } else {
            System.out.println(x8 * y8);
        }
        // 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每
        //一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
        //相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
        System.out.println(10.5 * 2 + 4 * 3);
        //编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人
        //类的年龄。如果用户输入负数，请显示一个提示信息。
        //buildDogAge();

        //彩票奖金
        //bulidLotteryPrize();


        // 高：180cm以上；富：财富1千万以上；帅：是
        // 同时满足，则：“我一定要嫁给他!!!”
        // 三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。
        // 如果三个条件都不满足，则：“不嫁！”
        //checkMarryInfo();


        // 使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”
        //outputCharAt();

        // 输入m和n求最大公约数和最小公倍数
        //getGcdAndLcm();

        //打印1~100之间所有奇数的和
        //getOddSum();

        //打印1~100之间所有是7的倍数的整数的个数及总和
        //getOddSumAndNum();

        //输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
        //getDaffodils();

        // 统计输入的非固定整数中正数和负数的数量
        // getJustAndLoseNum();

        // 99乘法表
        //multTable();

        // 求100以内的质数 质数:大于1企且只能被1和自身除掉的自然数
        // getPrimeNumber();

        // 各种算数
        //suanShu();

        //变量兑换
        //variableInterconvert();

        //求一个0~255范围内的整数的十六进制值
        String str1 = Integer.toBinaryString(60);
        String str3 = Integer.toHexString(60);

        //华氏摄氏度和摄氏度互相转换
        //coverDegreeCentigrade();

        // 练习前++,后++,三元运算符
        //practiceOperator();

        // short s1 = 1;
        // s1 = s1 + 1;有什么错? 后面计算是int,要强转
        //short s1 = 1; s1 += 1;有什么错 +=固定类型.没有错


    }

    private static void practiceOperator() {
        int a = 3, b = 8;

        int c = (a > b) ? a++ : b++;
        System.out.println("a=" + a + "b=" + b + "c=" + c);  //a=3 b=9 c=8

        int d = (a > b) ? ++a : ++b;
        System.out.println("a=" + a + "b=" + b + "d=" + d);  //a=3 b=10 c=10

        int e = (a < b) ? a++ : b++;
        System.out.println("a=" + a + "b=" + b + "e=" + e);  //a=4 b=10 e=3

        int f = (a < b) ? ++a : ++b;
        System.out.println("a=" + a + "b=" + b + "f=" + f);  //a=5 b=10 f=5

    }

    private static void coverDegreeCentigrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入华氏摄氏度:");
        int nextInt = scanner.nextInt();
        double ck = (double) (nextInt - 32) / 1.8;
        System.out.println("华氏摄氏度为:" + nextInt + "摄氏度为:" + ck);
    }

    private static void variableInterconvert() {
        int m = 3;
        int n = 4;
        System.out.println("互换前m=" + m);
        System.out.println("互换前n=" + n);
        int temp = n;
        n = m;
        m = temp;
        System.out.println("互换后m=" + m);
        System.out.println("互换后n=" + n);
    }

    private static void suanShu() {
        int a = 23;
        int b = 12;
        System.out.println(a + "+" + b + "=" + (a + b));//23+12=35
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);//23+12=35
        int sub = a - b;
        //System.out.println(a + "-" + b + "=" + a)- b);错误,字符串不能进行减法把 - b去掉就行
        System.out.println(a + "-" + b + "=" + (a - b));//a-b = 11;
        int mul = a * b;
        System.out.println(a + "*" + b + "=" + a * b);// 12 * 23 = 276
        int div = a / b;
        System.out.println(a + "/" + b + "=" + a / b); // 23 / 12 = 1

        double d = (double) a / b;
        System.out.println(a + "/" + b + "=" + d); //23/12=1.9166666666666667
        int yu = a % b;
        System.out.println(a + "%" + b + "=" + yu);

        int i = 0;
        System.out.println("自增前:" + i);
        i++;
        System.out.println("自增第一次后i=" + i);
        ++i;
        System.out.println("自增第二次后i=" + i);
        int j = ++i;
        System.out.println("自增第二次后i=" + i);
        System.out.println("j=" + j);
        int n = 1;
        n = n++;
        System.out.println(n);//1 先赋值，把i原来的值重新赋值给i，不变，然后i自增，但是这个自增后的值没有在放回变量i的位置

        int x = 0;
        int y = 1;
        if (++x == y-- & x++ == 1 || --y == 0) {
            System.out.println("x=" + x + ",y=" + y);// x=2 y=0 短路或没有执行
        }//x = 2,y = 0;
        else {
            System.out.println("y=" + y + ",x=" + x);
        }


    }

    private static void getPrimeNumber() {
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true;

        }
        System.out.println(list);
    }

    private static void multTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + " ");
            }
            System.out.println();
        }
    }

    private static void getJustAndLoseNum() {
        Scanner scanner = new Scanner(System.in);
        int justNum = 0;
        int loseNum = 0;
        for (; ; ) {
            System.out.print("请输入随机整数:");
            int nextInt = scanner.nextInt();
            if (nextInt == 0) {
                break;
            } else if (nextInt / 2 > 0) {
                justNum++;
            } else {
                loseNum++;
            }
        }
        System.out.println("输入正数个数为：" + justNum);
        System.out.println("输入负数个数为：" + loseNum);
    }

    private static void getDaffodils() {
        for (int i = 100; i < 1000; i++) {
            // 获取个十百位
            int hundRand = i / 100;
            int deca = i % 100 / 10;
            int a = i % 100 % 10;
            if (i == hundRand * hundRand * hundRand + deca * deca * deca + a * a * a) {
                System.out.println("水仙花数为:" + i);
            }
        }
    }

    private static void getOddSumAndNum() {
        int num = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                num += 1;
                sum += i;
            }
        }

        System.out.println("1-100所有是7的倍数的个数是:" + num + "个");
        System.out.println("1-100所有是7的倍数的总是:" + sum + "个");
    }

    private static void getOddSum() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }
        System.out.println("1-100间奇数和为:" + result);
    }

    private static void getGcdAndLcm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入正整数m:");
        int nextInt = scanner.nextInt();
        System.out.print("请输入正整数n:");
        int nextMInt = scanner.nextInt();
        int gcd = getGcd(nextInt, nextMInt);
        System.out.println("最大公倍数是:" + gcd);
        System.out.println("最小公倍数是:" + Math.abs(nextInt * nextMInt) / gcd);

    }

    //                            3      4
    //                            4      3
    //                            3      1
    //                            1      0
    private static int getGcd(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    private static void outputCharAt() {
        System.out.print("请输入字符串:");
        String next = new Scanner(System.in).next();
        char[] chars = next.toCharArray();
        for (char aChar : chars) {

            switch (aChar) {
                case 'a':
                    System.out.print("A");
                    break;
                case 'b':
                    System.out.print("B");
                    break;
                case 'c':
                    System.out.print("C");
                    break;
                case 'd':
                    System.out.print("D");
                    break;
                case 'e':
                    System.out.print("E");
                    break;
                default:
                    System.out.print("other");
                    break;
            }
        }
    }

    private static void checkMarryInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入身高:");
        int heightInt = scanner.nextInt();
        System.out.print("请输入财富:");
        double wealthDouble = scanner.nextDouble();
        System.out.print("请输入帅否:");
        boolean handsomeFlag = scanner.nextBoolean();
        if (heightInt >= 180 && wealthDouble >= 10000000 && handsomeFlag) {
            System.out.println("“我一定要嫁给他!!!");
        } else if (heightInt >= 180 || wealthDouble >= 10000000 || handsomeFlag) {
            System.out.println("嫁吧，比上不足，比下有余。");
        } else {
            System.out.println("不嫁");
        }
    }

    private static void buildDogAge() {
        System.out.print("请输入狗的年龄:");
        double nextInt = new Scanner(System.in).nextDouble();
        if (nextInt < 0) {
            System.out.println("不能输出负数哦!");
        } else if (nextInt <= 2) {
            System.out.println("狗的年龄为:" + nextInt * 10.5);
        } else {
            double dogAge = 2 * 10.5 + ((nextInt - 2) * 4);
            System.out.println("狗的年龄为:" + dogAge);
        }
    }

    private static void bulidLotteryPrize() {
        int random = (int) (Math.random() * 90 + 10);
        System.out.println("彩票数值为:" + random);
        System.out.print("请输入两位数的数字:");
        int nextInt1 = new Scanner(System.in).nextInt();
        if (nextInt1 < 9 || nextInt1 >= 100) {
            System.out.println("输入数字非法,请重新输入");
        } else {
            if (random == nextInt1) {
                System.out.println("奖金10 000美元");
            } else {
                // 获取随机数十位数
                int tenNum = random / 10;
                // 获取随机数个位数
                int individualNum = random % 10;
                //获取用户个位数
                int userTenNum = nextInt1 / 10;
                int userindividualNum = nextInt1 % 10;
                if (tenNum == userindividualNum && individualNum == userTenNum) {
                    System.out.println("奖金 3 000美元");
                } else if (tenNum == userTenNum || individualNum == userindividualNum) {
                    System.out.println("奖金1 000美元");
                } else if (tenNum == userindividualNum || individualNum == userTenNum) {
                    System.out.println("奖金500美元");
                } else {
                    System.out.println("彩票作废");
                }
            }
        }
    }

    private static void getTestScope() {
        System.out.print("请输入考试成绩:");
        int nextInt = new Scanner(System.in).nextInt();
        if (nextInt == 100) {
            System.out.println("奖励一台BMW");
        } else if (nextInt > 80 & nextInt <= 99) {
            System.out.println("奖励一台iphone xs max");
        } else if (nextInt >= 60 & nextInt <= 80) {
            System.out.println("奖励一个 iPad");
        } else {
            System.out.println("什么奖励都没有");
        }
    }

    private static void buildNumMax() {
        System.out.println("请输入第一个数:");
        int nextNum1 = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数:");
        int nextNum2 = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个数:");
        int nextNum3 = new Scanner(System.in).nextInt();
        if (nextNum1 >= nextNum2) {
            if (nextNum1 >= nextNum3) {
                if (nextNum2 > nextNum3) {
                    System.out.println(nextNum3 + "," + nextNum2 + "," + nextNum1);
                } else {
                    System.out.println(nextNum2 + "," + nextNum3 + "," + nextNum1);
                }
            } else {
                System.out.println(nextNum2 + "," + nextNum1 + "," + nextNum3);
            }
        } else {
            if (nextNum2 >= nextNum3) {
                if (nextNum3 >= nextNum1) {
                    System.out.println(nextNum1 + "," + nextNum3 + "," + nextNum2);
                } else {
                    System.out.println(nextNum3 + "," + nextNum1 + "," + nextNum2);
                }
            } else {
                System.out.println(nextNum1 + "," + nextNum2 + "," + nextNum3);
            }
        }
    }

    //---------------------------------------------
            /*System.out.println("Do something ...");
            System.out.println(String.valueOf(true)=="true");
            System.out.println("1".equals(1));
            int x;
                    int a=2;
                    int b=5;
                    int c=-2;
           x=++a + b++ + c++;
            System.out.println(x);
            System.out.println(Math.round(-11.5));*/

        /*long ac = 12L;
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }*/
}

