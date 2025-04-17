package com.zz.train;

public class Test {

    static int x, y, z;

    static {
        int x = 5;//这里的x不是静态变量，上面的x是静态变量
        x--;
    }

    static {
        x--;
    }


    public static void main(String[] args) {
/*        String foo = args[1];
        String bar = args[2];
        String baz = args[3];
        //System.out.println(baz);//*/

        Other o = new Other();
        new Test().addOne(o);

        System.out.println("x=" + x);
        z--;
        method();
        System.out.println("result:" + (z + y + ++z));


    }

    public static void method() {
        y = z++ + ++z;
    }//3


    public void addOne(final Other o) {
        o.i++;
    }


}

class Other {
    public int i;
}
