package com.zz.train;

public class Father<T1, T2> {
}

// 子类不保留父类的泛型
// 1)没有类型 擦除
class Son1 extends Father {// 等价于class Son extends Father<Object,Object>{
}

// 2)具体类型
class Son2 extends Father<Integer, String> {
}


// 子类保留父类的泛型
// 1)全部保留
class Son3<T1, T2> extends Father {
}

// 部分保留
class Son4<T1> extends Father<T1, String> {
}

// 子类不保留父类的泛型
// 1)没有类型 擦除
class Son5<A, B> extends Father {//等价于class Son extends Father<Object,Object>{
}

// 2)具体类型
class Son6<A, B> extends Father<Integer, String> {
}

// 子类保留父类的泛型
// 1)全部保留
class Son7<A,B,T1,T2> extends Father<T1,T2>{
}

// 2)部分保留
class Son8<T2,A,B> extends Father<T2,Integer>{
}