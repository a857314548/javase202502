package com.zz.train.designmode;

public class SingleTion {

    private SingleTion() {

    }

    private static SingleTion singleTion = null;

    public synchronized SingleTion getInstance() {
        if (singleTion == null) {
            singleTion = new SingleTion();
        }
        return singleTion;
    }
}
