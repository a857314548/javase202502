package com.zz.train;

public class Ticket implements Runnable {

    private int num = 100;

    @Override
    public void run() {
        while (true) {
            if (num > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "售出:" + num-- + "号票");
            }
        }

    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        Thread thread3 = new Thread(ticket);
        thread1.setName("售票口1");
        thread2.setName("售票口2");
        thread3.setName("售票口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
