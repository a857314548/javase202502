package com.zz.train;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntDecimalTest {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("12433241123");
        BigDecimal b2 = new BigDecimal("12435.351");
        BigDecimal b3 = new BigDecimal(11);
        System.out.println(b1);
        //System.out.println(b1 / b2); 报错
        System.out.println(b3.divide(b2,BigDecimal.ROUND_HALF_UP));
        System.out.println(b3.divide(b2,15,BigDecimal.ROUND_HALF_UP));

    }
}
