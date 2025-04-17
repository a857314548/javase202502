package com.zz.train;

public class Depositor implements Runnable {

    private Accept accept;

    public Depositor(Accept accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            accept.saveMoney(1000);
        }
    }
}
