package com.zz.train;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    private final ReentrantLock lock = new ReentrantLock();

    public void test() {
        lock.lock();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
