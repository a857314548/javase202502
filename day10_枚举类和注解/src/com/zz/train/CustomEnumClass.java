package com.zz.train;

public class CustomEnumClass {

    private final String name;
    private final String sex;

    private CustomEnumClass(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public static final CustomEnumClass customEnumClass1 = new CustomEnumClass("张小凡", "男");
    public static final CustomEnumClass customEnumClass2 = new CustomEnumClass("碧瑶", "女");
    public static final CustomEnumClass customEnumClass3 = new CustomEnumClass("鬼厉", "男");
    public static final CustomEnumClass customEnumClass4 = new CustomEnumClass("陆雪琪", "女");
}
