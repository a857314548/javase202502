package com.zz.train;

public class MyExceptionTest {

    public void regist(int num) throws MyException {
        if (num < 0) {
            throw new MyException("num is igo", 3);
        } else {
            System.out.println("登记人数" + num);
        }
    }

    public void manager() {
        try {
            regist(-1);
        } catch (MyException e) {
            System.out.println("登记失败,出错种类:" + e.getNumberId() + ",出错信息是:" + e.getMessage());
        } finally {
            System.out.println("程序结束");
        }
    }

    public static void main(String[] args) {
        MyExceptionTest myExceptionTest = new MyExceptionTest();
        myExceptionTest.manager();
    }
}
