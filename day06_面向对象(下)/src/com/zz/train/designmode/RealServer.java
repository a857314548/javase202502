package com.zz.train.designmode;

public class RealServer implements NetWork {
    @Override
    public void browe() {
        System.out.println("真实服务器的地址信息");
    }
}
