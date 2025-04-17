package com.zz.train;

public class Accept {

    private double balance;

    public Accept(double balance) {
        this.balance = balance;
    }

    public synchronized void saveMoney(double money) {
        if (money > 0) {
            balance += money;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("存钱成功,余额为:" + balance);
    }
}
