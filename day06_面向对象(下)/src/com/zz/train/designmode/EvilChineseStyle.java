package com.zz.train.designmode;

public class EvilChineseStyle {

    private EvilChineseStyle() {

    }

    private static EvilChineseStyle Singleton;

    public static EvilChineseStyle getInstance() {
        if (Singleton == null) {
            return new EvilChineseStyle();
        }
        return Singleton;
    }
}
