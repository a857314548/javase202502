package com.zz.train;

public class PrintNumberTest implements Runnable {

    int num = 1;

    @Override
    public void run() {
        while (num <= 100) {
            synchronized (this) {
                this.notify();
                System.out.println("当前线程" + Thread.currentThread().getName() + "打印数字为:" + num++);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintNumberTest printNumberTest = new PrintNumberTest();
        Thread thread1 = new Thread(printNumberTest);
        Thread thread2 = new Thread(printNumberTest);
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}
