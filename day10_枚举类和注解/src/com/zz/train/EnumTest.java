package com.zz.train;

import java.util.Arrays;

/**
 * @author
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(111);
        SeasonEnum spring = SeasonEnum.valueOf("SPRING");
        System.out.println(spring);
        System.out.println(Arrays.toString(SeasonEnum.values()));
        SeasonEnum.AUTUMN.getLevel();
    }
}
