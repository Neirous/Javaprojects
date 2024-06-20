package com.neirous.project.localdatetime;

import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
//第三代日期类
public class Main {
    public static void main(String[] args) {
        //时间戳类似于Date
        LocalDateTime now = LocalDateTime.now();//使用now返回当前日期时间的对象
        System.out.println(now);
        System.out.println("年="+now.getYear());
        System.out.println("月="+now.getMonth());
        System.out.println("月="+now.getMonthValue());
        System.out.println("日="+now.getDayOfMonth());
        System.out.println("时="+now.getHour());
        System.out.println("分="+now.getMinute());
        System.out.println("秒="+now.getSecond());

        LocalDate now1 = LocalDate.now();
        System.out.println(now1);//返回的是年月日

        LocalTime now2 = LocalTime.now();
        System.out.println(now2);//返回的是时分秒

        //格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dtf.format(now);//格式化后的需要一个字符串来接收
        System.out.println(format);

        //时间戳
        //通过静态方法now获取当前时间戳对象
        Instant now3 = Instant.now();
        System.out.println(now3);

        //通过from可以把Instance转换成now
        Date date = Date.from(now3);

        //通过toInstance重新转回Instance
        Instant now4 = date.toInstant();

        //通过plus和minus方法可以对当前时间进行或者减
        //比如求890天后的现在的时间
        LocalDateTime localDateTime = now.plusDays(890);
        System.out.println("890天后的时间：" + dtf.format(localDateTime));

        //看看3490分钟前的时间
        LocalDateTime localDateTime1 = now.minusMinutes(3490);
        System.out.println("3490分钟前的时间：" + dtf.format(localDateTime1));
    }
}
