package com.zz.train;

public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() ->{
            try {
                Thread.sleep(2000);
                System.out.println("thread1 run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() ->{
            try {
                Thread.sleep(3000);
                System.out.println("thread2 run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        //thread1.join();
        System.out.println("thread 1 joined");
        thread2.start();
        //thread2.join();
        System.out.println("thread 2 joined");
    }


}


