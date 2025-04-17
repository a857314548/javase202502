package com.zz.train;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class jdk8NewDateTimeTest {
    public static void main(String[] args) {
        // ZoneId:类中包含了所有的时区信息
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.toString());

        // ZoneId的of():获取指定时区的时间
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(localDateTime);

        // ZonedDateTime:带时区的日期时间
        // ZonedDateTime的now():获取本时区的ZonedDateTime对象
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        // ZonedDateTime的now(ZoneId id):获取指定时区的ZonedDateTime对象
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("America/Marigot"));
        System.out.println(zonedDateTime1);

        ////Duration:用于计算两个“时间”间隔，以秒和纳秒为基准
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(23, 11, 7);

        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println(duration);

        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());

        LocalDateTime localDateTime1 = LocalDateTime.of(2016, 10, 13, 22, 13, 11);
        LocalDateTime localDateTime2 = LocalDateTime.of(2017, 10, 13, 22, 13, 11);
        Duration duration1 = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration1.getSeconds());

        //Period:用于计算两个“日期”间隔，以年、月、日衡量
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2028, 6, 11);
        Period period = Period.between(localDate, localDate1);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        // TemporalAdjuster:时间校正器
        // 获取当前日期的下一个周日是哪天？
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDateTime localDateTime3 = LocalDateTime.now().with(temporalAdjuster);
        System.out.println(localDateTime3);

        // 获取下一个工作日是哪天？
        LocalDate localDate2 = LocalDate.now().with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                LocalDate localDate3 = (LocalDate) temporal;
                if (localDate3.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                    System.out.println("下一个工作日是:" + localDate3.plusDays(3));
                    return localDate3.plusDays(3);
                } else if (localDate3.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                    System.out.println("下一个工作日是:" + localDate3.plusDays(2));
                    return localDate3.plusDays(2);
                } else {
                    System.out.println("下一个工作日是:" + localDate3.plusDays(1));
                    return localDate3.plusDays(1);
                }
            }
        });

        System.out.println(localDate2);

    }
}
