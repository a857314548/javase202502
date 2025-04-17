package com.zz.train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ArrayTest {
    public static void main(String[] args) {
        // 数组拷贝
        //arrayCopy();

        // 二分法查找法
        //dichotomyArray();

        // 数组工具类
        //arraysUtil();

        //面试题创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
        //createArr();

        //数组规范
        //arrStandard();

        //创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。使用for循环访问所有元素并打印出来。
        saveCharArr();

    }

    private static void saveCharArr() {
        char[] chars = new char[36];

        char letter = 'A';
        char num = '0';
        for (int i = 0; i < chars.length; i++) {
            if (i < 26) {
                chars[i] = (char) (letter + i);
            } else if(i ==26) {
                chars[i] = num;
            } else {
                num += 1;
                chars[i] = num;
            }

        }
        System.out.println(Arrays.toString(chars));
    }

    private static void arrStandard() {

/*        //下面哪个数组定义是错误的
        //并对错误的答案加上单行注释，写出错误的原因。
        float[]=new float[3]; //无变量名
        float f2[] = new float[];//未定义长度
        float[] f1 = new float[3];// 正确
        boolean[] b = {"true", "false", "true"};//boolean不是字符串
        double f4[] = {1, 3, 5}; //正确
        int f5[] = new int[3] { 2, 3, 4 } ; //后面数组长度定义错误
        float f4[] = {1.2F, 3.0, 5.4};// //float要带F，不然默认是double*/

    }

    private static void createArr() {
/*        int[] arr = new int[6];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));*/
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() < 6) {

            int num = random.nextInt(30) + 1;
            set.add(num);
        }

        Iterator<Integer> iterator = set.iterator();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = iterator.next();
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void arraysUtil() {
        //判断两个数组是否相等
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));

        //输出数组信息
        System.out.println(Arrays.toString(arr1));

        //将指定值填充到数组之中
        Arrays.fill(arr1, 4);
        System.out.println(Arrays.toString(arr1));
        //对数组进行排序
        int[] arr3 = new int[]{1, 3, 2, 6, 7, 8};
        System.out.print("排序前：" + Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("排序后：" + Arrays.toString(arr3));
        // 对排序后的数组进行二分法检索指定的值,返回该值的索引
        System.out.println(Arrays.binarySearch(arr3, 3));
    }

    private static void dichotomyArray() {
        int[] arr = new int[]{-99, -54, -2, 0, 2, 33, 43, 256, 999};
        boolean flag = true;
        int num = 256;
        int head = 0;
        int end = arr.length - 1;
        while (head < end) {
            int index = (head + end) / 2;
            if (arr[index] == num) {
                System.out.println("该数据在数组中存在，其索引为：" + index);
                flag = false;
                break;
            } else if (arr[index] < num) {
                head = index + 1;
            } else {
                end = index - 1;
            }
        }
        if (flag) {
            System.out.println("未找到指定的元素");
        }
    }

    private static void arrayCopy() {
        int[] array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = array1;
        // 打印array1
        System.out.println(Arrays.toString(array1));
        // 赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
        //(如array[0]=0,array[2]=2)。打印出array1。
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
        // array1和array2是什么关系？地址引用的关系
        //修改题目，实现array2对array1数组的复制
        array1 = new int[]{3, 2, 4, 8, 12, 11, 15, 17};
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}
