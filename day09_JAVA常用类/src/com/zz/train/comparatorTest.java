package com.zz.train;

import com.zz.train.entity.Goods;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 比较器
 */
public class comparatorTest {
    public static void main(String[] args) {
        // 自然排序
        comparableSort();

        // 定制排序
        comparatorSort();
    }

    private static void comparatorSort() {
        Goods goods1 = new Goods("jack", 10);
        Goods goods2 = new Goods("tom", 50);
        Goods goods3 = new Goods("andy", 20);
        Goods goods4 = new Goods("yaml", 15);
        Goods[] goodArr = new Goods[4];
        goodArr[0] = goods1;
        goodArr[1] = goods2;
        goodArr[2] = goods3;
        goodArr[3] = goods4;
        Arrays.sort(goodArr, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(goodArr));
    }

    private static void comparableSort() {
        Goods goods1 = new Goods("张晓发", 10);
        Goods goods2 = new Goods("张小凡", 50);
        Goods goods3 = new Goods("张大炮", 20);
        Goods goods4 = new Goods("张器灵", 15);
        Goods[] goodArr = new Goods[4];
        goodArr[0] = goods1;
        goodArr[1] = goods2;
        goodArr[2] = goods3;
        goodArr[3] = goods4;
        Arrays.sort(goodArr);
        System.out.println(Arrays.toString(goodArr));
    }
}
