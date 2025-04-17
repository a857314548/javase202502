package com.zz.train.designmode;

public class ProxyServer implements NetWork {
    private NetWork netWork;

    @Override
    public void browe() {
        System.out.println("这是代理服务器的地址");
        check();
        netWork.browe();
    }

    private void check() {
        System.out.println("检查各种信息：");
    }

    public ProxyServer(NetWork netWork) {
        this.netWork = netWork;
    }
}
