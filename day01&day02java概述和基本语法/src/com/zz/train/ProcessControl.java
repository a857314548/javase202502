package com.zz.train;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

/**
 * 流程控制练习
 */
public class ProcessControl {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //写出结果
        //buildResult(); //无结果输出

        //三个整数进行排序，输出时按照从小到大的顺序输出
        //buildIntSort();

        // 编写程序，从键盘接收整数参数。如果该数为1-7，打印对应的星期值，否则打印“非法参数”。
        //printWeek();

        // 从键盘分别输入年、月、日，判断这一天是当年的第几天
        //printCurrentYearDay();

        //编写程序，判断给定的某个年份是否是闰年
        //checkIsLeapYear();

        //要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b
        //outputAorB();

        //使用条件结构实现，如果用户名等于字符‘青’，密码等于数字‘123’，就输出“欢迎你，青”，否则就输出“对不起，你不是青
        //checkQing();

        //提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
        //如果三个骰子点数和，小于或等于9，则为“小”。
        //如果三个骰子点数和，大于9，则为“大”。
        //用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确
        //checkDice();

        //打印1-100之间13的倍数，使用for循环
        //printThirteenMult();

        //使用双重循环打印20 * 8的矩形，使用for循环实现
        //printTwoAndNight();

        //用for循环计算1000以内偶数的和
        //sumThousand();

        //输入长和宽，输出长方形，如：输入4和3, 将输出如下图形
        //printGraph();

        //输入高度，输出直角三角形
        //printRightTriangle();

        //输入高度，输出倒直角三角形
        //printFallTriangle();

        //打印99乘法表
        //print99MultTable();

        //3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数
        //checkRopeLength();

        //打印1-100之间非13的倍数，使用continue语句
        //printNot13Mult();

        //用循环控制语句打印输出：1+3+5+...+99=?的结果
        //printOneHundredOdd();

        //输出从1到100之间所有不能被3整除的数;并输出这些整数的和
        //outputNot3Exact();

        //随机生成一个100以内的数，猜数字游戏：
        //从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次
        //numberGuessingGame();

        //打印1-100之间数，其中3、5、7的倍数不打印（continue）
        //printNot357Mult();

        //一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
        //例如6=1＋2＋3.编程 找出1000以内的所有完数
        //outputPerfect();

        //输入两个正整数m和n，求其最大公约数和最小公倍数
        //getGcdAndLom();

        //求调和级数中从第多少项开始值大于10
        //调和级数的第n项形式为：1+1/2+1/3+…+1/n
        //getTargetHarmonicSeries();

        //打印如下三角形 自己研究出来的,只适合奇数
        //   *                      0   1
        //   * * *                  1   3
        //   * * * * *              2   5
        //   * * * * * * *          3   7
        //   * * * * * * * *        4   8
        //   * * * * * * *          5   18-10 -1 7
        //   * * * * *              6   18-12 -1 5
        //   * * *                  7   18-14 -1 3
        //   *                      8   18-16 -1 1
        //printEquilateralTriangle();

        //打印如下的图形：菱形1 只能是奇数? 9
        //    *              0 4 1
        //   * *             1 3 2
        //  * * *            2 2 3
        // * * * *           3 1 4
        //* * * * *          4 0 5
        // * * * *           5 4 9-i
        //  * * *            6 3 9
        //   * *             7 2 9
        //    *              8 1
        //printPrismatic();

        //编写程序，打印100-200之间的质数
        //print100To200Prime();

        //一个数如果恰好等于它的因子之和，这个数就称为"完数"
        //（因子：除去这个数本身正的约数）
        //例如6=1＋2＋3.编程 找出1000以内的所有完数
        //find1000PerFect();

        //山上有一口缸可以装50升水，现在有15升水。
        // 老和尚叫小和尚下山挑水，每次可以挑5升。
        // 问：小和尚要挑几次水才可以把水缸挑满？通过编程解决这个问题。
        //liteMonkAndOldMonk();

        //生成13位条形码
        //generateBarcode();

        //实现判断一个4位整数，统计出此整数里面包含多少个偶数，多少个奇数的功能
        //checkOdevityNum();

        //开发一款软件，根据公式（身高-108）*2=体重，可以有10斤左右的浮动。来观察测试者体重是否合适。
        checkWeight();


    }

    private static void checkWeight() {
        System.out.print("请输入身高(cm):");
        int nextInt = scanner.nextInt();
        System.out.print("请输入体重(斤):");
        int nextInt2 = scanner.nextInt();

        // 计算指数
        if (nextInt<0 || nextInt >350) {
            System.out.println("请输入正确的体重");
        }
        int num = (nextInt -108) * 2;
        boolean flag = true;
        if (nextInt2 < num -10 || nextInt2 > num + 10) {
            flag = false;
        }
        if (flag) {
            System.out.println("您的身高合适");
        } else {
            System.out.println("您的身高不合适");
        }
    }

    private static void checkOdevityNum() {
        System.out.print("请输入一个4位数:");
        int nextInt = scanner.nextInt();
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 1; i <= nextInt; i++) {
            if (i % 2 == 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }

        System.out.println("奇数个数有:"+oddCount +"个,偶数个数有:" + evenCount + "个");
    }

    private static void generateBarcode() {
        System.out.print("请输入前12位数字字符串:");
        long num = scanner.nextLong();
        // 前十二位奇数和
        int oddSum = 0;
        // 前12位偶数和
        int evenSum = 0;
        String numStr = String.valueOf(num);
        String[] split = numStr.split("");
        for (String s : split) {
            int i = Integer.parseInt(s);
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        //将奇数和与偶数和的三倍相加
        int evenOddSum = evenSum + oddSum * 3;
        // 取结果的个位数
        int unitDigit = evenOddSum % 10;
        // 如果取结果的个位数为0，那么校验码不是为10（10-0=10），而是0
        // 结果
        long result;
        if (unitDigit == 0) {
            result = Integer.parseInt(String.valueOf(num) + 0);
        } else {
            result = Long.valueOf(String.valueOf(num) + unitDigit);
        }
        System.out.println("最后的12位字符码为:" +result);

    }

    private static void liteMonkAndOldMonk() {
        // 水缸还需35L打满
        int numberStrokes = 35;
        int currentRain = 0;
        int count = 0;
        while (true) {
            currentRain += 5;
            count++;
            if (currentRain == 35) {
                break;
            }
        }
        System.out.println("还需要打:" + count + "次水才能打满");
    }

    private static void find1000PerFect() {
        for (int i = 1; i <= 1000; i++) {

        }
    }

    private static void print100To200Prime() {
        for (int i = 100; i <= 200; i++) {
            boolean flag = true;
            for (int i1 = 2; i1 < i; i1++) {
                if (i % i1 == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(i + ", ");
            }
            flag = true;
        }
    }

    private static void printPrismatic() {
        System.out.print("请输入棱形总长度():");
        int nextInt = scanner.nextInt();
        for (int i = 0; i < nextInt; i++) {
            int n = nextInt / 2;
            // 上半部分
            if (i <= n) {
                for (int i1 = 0; i1 < nextInt / 2 - i; i1++) {
                    System.out.print(" ");
                }
                for (int i2 = 0; i2 < i + 1; i2++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int i3 = 0; i3 < i - nextInt / 2; i3++) {
                    System.out.print(" ");
                }
                for (int i4 = 0; i4 < nextInt - i; i4++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    private static void printEquilateralTriangle() {
        System.out.print("请输入总长度():");
        int nextInt = scanner.nextInt();
        for (int i = 0; i < nextInt; i++) {
            if (i > nextInt / 2) {
                for (int i1 = 0; i1 < 2 * nextInt - 2 * i - 1; i1++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (i <= nextInt / 2) {
                for (int i1 = 1; i1 <= 2 * i + 1; i1++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    private static void getTargetHarmonicSeries() {
        double num = 0.0;
        int a = 1;
        while (true) {
            num += 1.0 / a;
            if (num > 10) {
                break;
            }
            a++;
        }

        System.out.println("调和级数第" + a + "次开始值超过10了");

    }

    private static void getGcdAndLom() {
        System.out.print("请输入正整数a:");
        int nextInt = scanner.nextInt();
        System.out.print("请输入正整数b:");
        int nextInt2 = scanner.nextInt();
        // 获取最小公倍数
        int gcd = getGcd(nextInt, nextInt2);
        System.out.println("最小公倍数是:" + gcd);
        System.out.println("最大公约数是:" + nextInt * nextInt2 / gcd);

    }

    private static int getGcd(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    private static void outputPerfect() {
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + ",");
            }
        }

    }

    private static void printNot357Mult() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                continue;
            } else {
                System.out.print(i + ",");
            }
        }
    }

    private static void numberGuessingGame() {
        // 随机生成一个100以内的数
        Random random = new Random();
        int nextInt = random.nextInt(100);
        System.out.println("程序生成的随机数为:" + nextInt);
        int i = 0;
        while (true) {
            System.out.print("请输入一个随机整数:");
            int nextInt1 = scanner.nextInt();
            i++;
            if (nextInt == nextInt1) {
                System.out.println("猜对了");
                break;
            } else if (nextInt1 < nextInt) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜大了");
            }
        }
        System.out.println("一共猜了" + i + "次");
    }

    private static void outputNot3Exact() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 != 0) {
                sum += i;
                System.out.print(i + ",");
            }
        }
        System.out.println(sum);
    }


    private static void printOneHundredOdd() {
        // 方法1
        int sum = 0;
/*        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }*/

        // 方法2
        for (int i = 100; i > 0; i--) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("1+3+5+...+99的结果为:" + sum);
    }

    private static void printNot13Mult() {
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) {
                continue;
            } else {
                System.out.print(i + ",");
            }
        }
    }

    private static void checkRopeLength() {
        int ropeLength = 3000;
        int day = 0;
        // 方法1
        /*while (true) {
            if (ropeLength < 5) {
                break;
            } else {
                ropeLength /= 2;
                day++;
            }
        }*/
        // 方法2
        /*for (int i = ropeLength; i >= 5; i /= 2) {
            day++;
        }*/
        System.out.println("减去" + day + "次后绳子小于5米");

    }

    private static void print99MultTable() {
        for (int i = 1; i < 10; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1 + "*" + i + " ");
            }
            System.out.println();
        }
    }

    private static void printFallTriangle() {
        System.out.print("请输入图形高度:");
        int nextInt = scanner.nextInt();
        for (int i = nextInt; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printRightTriangle() {
        System.out.print("请输入图形高度:");
        int nextInt = scanner.nextInt();
        for (int i = 0; i < nextInt; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printGraph() {
        System.out.print("请输入图形长:");
        int nextInt = scanner.nextInt();
        System.out.print("请输入图形宽:");
        int nextInt1 = scanner.nextInt();
        for (int i = 0; i < nextInt; i++) {
            for (int j = 0; j < nextInt1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void sumThousand() {
        int num = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                num += i;
            }
        }
        System.out.println("1000以内偶数的和为:" + num);
    }

    private static void printTwoAndNight() {
        for (int i = 0; i < 20; i++) {
            for (int i1 = 0; i1 < 8; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printThirteenMult() {
        for (int i = 0; i < 100; i++) {
            if (i % 13 == 0) {
                System.out.print(i + ",");
            }
        }
    }

    private static void checkDice() {
        int a = (int) (Math.random() * 6) + 1;
        System.out.println("第一个点数a为:" + a);
        int b = (int) (Math.random() * 6) + 1;
        System.out.println("第一个点数b为:" + b);
        int c = (int) (Math.random() * 6) + 1;
        System.out.println("第一个点数c为:" + c);
        String diceFlag = null;
        if (a == b && b == c) {
            diceFlag = "豹子";
        } else if (a + b + c <= 9) {
            diceFlag = "小";
        } else {
            diceFlag = "大";
        }

        System.out.print("请输入选定参数:");
        String next = scanner.next();
        if (next.equals(diceFlag)) {
            System.out.println("买的正确,您中奖为:" + diceFlag);
        } else {
            System.out.println("未中奖");
        }
    }

    private static void checkQing() {
        char c = '青';
        int password = 123;
        if (c == '青' && password == 123) {
            System.out.println("你是青");
        } else {
            System.out.println("你不是青");
        }
    }

    private static void outputAorB() {
        System.out.print("请输入参数a:");
        int a = scanner.nextInt();
        System.out.print("请输入参数b:");
        int b = scanner.nextInt();
        if (a % b == 0 || a + b > 1000) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    private static void checkIsLeapYear() {
        System.out.print("请输入年份:");
        int nextInt = scanner.nextInt();
        if (nextInt <= 0) {
            System.out.println("参数非法");
        }

        if (nextInt % 400 == 0 || (nextInt % 4 == 0 && nextInt % 100 != 0)) {
            System.out.println(nextInt + "年是闰年");
        } else {
            System.out.println(nextInt + "年不是闰年");
        }

    }

    private static void printCurrentYearDay() {
        System.out.print("请输入年份:");
        int nextInt = scanner.nextInt();
        System.out.print("请输入月份:");
        int nextInt1 = scanner.nextInt();
        System.out.print("请输入日期:");
        int nextInt2 = scanner.nextInt();
        LocalDate localDate = LocalDate.of(nextInt, nextInt1, nextInt2);
        System.out.println("输入参数为" + nextInt + "年的第" + localDate.getDayOfYear() + "天");
    }

    private static void printWeek() {

        while (true) {
            System.out.print("请输入星期参数:");
            int nextInt = scanner.nextInt();
            if (nextInt <= 0 || nextInt > 7) {
                System.out.println("参数非法!!");
                break;
            } else {
                switch (nextInt) {
                    case 1:
                        System.out.println("星期一");
                        break;
                    case 2:
                        System.out.println("星期二");
                        break;
                    case 3:
                        System.out.println("星期三");
                        break;
                    case 4:
                        System.out.println("星期四");
                        break;
                    case 5:
                        System.out.println("星期五");
                        break;
                    case 6:
                        System.out.println("星期六");
                        break;
                    case 7:
                        System.out.println("星期天");
                        break;
                }
            }
        }
    }

    private static void buildIntSort() {
        int a = 6;
        int b = 5;
        int c = 9;

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("从小到大顺序为:" + c + "," + b + "," + a);
                } else {
                    System.out.println("从小到大顺序为:" + b + "," + c + "," + a);
                }
            } else {
                System.out.println("从小到大顺序为:" + b + "," + a + "," + c);
            }
        } else {
            if (a < c) {
                if (b < c) {
                    System.out.println("从小到大顺序为:" + a + "," + b + "," + c);
                } else {
                    System.out.println("从小到大顺序为:" + a + "," + c + "," + b);
                }
            } else {
                System.out.println("从小到大顺序为:" + c + "," + a + "," + b);
            }
        }

    }

    private static void buildResult() {
        int m = 0, n = 3;
        if (m > 0) {
            if (n > 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}


