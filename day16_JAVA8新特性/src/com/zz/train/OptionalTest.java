package com.zz.train;

import com.zz.train.entity.Girl;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Girl girl = new Girl();
        //girl = null;
        //创建Optional入参不能为空
        Optional optional = Optional.of(girl);//为null时项目运行报错
        System.out.println(optional);

        //创建Optional入参可为空可不为空
        girl = null;
        Optional optional1 = Optional.ofNullable(girl);//这里不报错
        System.out.println(optional1);

    }
}
