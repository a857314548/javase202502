package com.zz.train;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());

        Date date1 = new Date(date.getTime());
        System.out.println(date1.getTime());
        System.out.println(date1.toString());

        System.out.println(sdf.format(date)); //日期转标准时间
        System.out.println(sdf.parse(sdf.format(date))); //日期转标准时间

        SimpleDateFormat formater2 = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
        System.out.println(formater2.format(date));

        Date date2 = formater2.parse("2008年08月08日 星期一 08:08:08");
        System.out.println(date2.toString());
    }
}
