package com.zz.train;

public class DeadLockTest {
    public static void main(String[] args) {
        final StringBuffer sb1 = new StringBuffer();
        final StringBuffer sb2 = new StringBuffer();

        new Thread() {
            @Override
            public void run() {
                synchronized (sb1) {
                    sb2.append(3);
                    synchronized (sb2) {
                        sb1.append(2);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (sb2) {
                    sb2.append(5);
                    synchronized (sb1) {
                        sb1.append(4);
                    }

                }
            }
        }.start();
    }
}
