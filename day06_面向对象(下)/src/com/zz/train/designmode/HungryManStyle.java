package com.zz.train.designmode;

public class HungryManStyle {
    private HungryManStyle() {
    }

    private static HungryManStyle Singleton = new HungryManStyle();

    public static HungryManStyle getInstanceOf() {
        return Singleton;
    }
}
