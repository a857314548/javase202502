package com.zz.train;

public enum monthEnum {
    one("January"),
    two("January"),
    three("January"),
    four("January"),
    five("January"),
    sex("January"),
    seven("January"),
    engit("January"),
    night("January"),
    ten("January"),
    eleven("January"),
    twelve("January");


    private String month;

    private monthEnum(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

}
