package com.zz.train;

public class AcceptTest {
    public static void main(String[] args) {
        Depositor depositor = new Depositor(new Accept(0));
        Thread thread1 = new Thread(depositor);
        Thread thread2 = new Thread(depositor);
        thread1.start();
        thread2.start();
    }
}
