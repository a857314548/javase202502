package com.zz.train.entity;

public class Kids extends ManKind {
    private int yearsOld;


    public void printAge() {
        System.out.println(this.yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void employeed(int salary) {
        System.out.println("Kids should study and no job.");
    }
}
