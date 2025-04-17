package com.zz.train;

public class BankTest implements Runnable {
    //银行有一个账户。有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
    //问题：该程序是否有安全问题，如果有，如何解决？ 有,加入同步机制

    private int number;


    @Override
    public void run() {
        number += 1000;
        System.out.println("储户" + Thread.currentThread().getName() + "存入了1000元,账户额度为:" + number);
    }

    public static void main(String[] args) {
        BankTest bankTest =new BankTest();
        Thread thread1 = new Thread(bankTest);
        Thread thread2 = new Thread(bankTest);

        thread1.start();
        thread2.start();


    }
}
