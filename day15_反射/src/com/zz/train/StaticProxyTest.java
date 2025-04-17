package com.zz.train;

interface ClothFactory {
    void showClothColor();
}

/**
 * 静态代理 代理类固定,不易于扩展
 */
class ClothProxyFactory implements ClothFactory {

    private ClothFactory clothFactory;

    public ClothProxyFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void showClothColor() {
        System.out.println("这是代理类的衣服颜色:红色");
        clothFactory.showClothColor();
        System.out.println("这是代理类的衣服颜色:绿色");
    }
}

class RealClothFactory implements ClothFactory {

    @Override
    public void showClothColor() {
        System.out.println("这是真实的衣服代理工厂颜色:黑色");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        ClothFactory realClothFactory = new RealClothFactory();
        ClothFactory clothFactory = new ClothProxyFactory(realClothFactory);
        clothFactory.showClothColor();
    }
}
