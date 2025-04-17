package com.zz.train.entity;

public class TriAngle {

    private int base;

    private int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public TriAngle() {
    }

    public int getArea() {
        return base * height;
    }
}
