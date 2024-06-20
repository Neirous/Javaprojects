package com.neirous.project.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        //获取当前系统时间
        Date date = new Date();
        System.out.println(date);

        //指定date格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println("当前日期：" + format);

        //可以把一个格式化的String转换成对应的 Date
        String i1= "2024年04月27日 10:12:40 星期六";
        Date i2 = simpleDateFormat.parse(i1);//alt+enter抛出异常
        System.out.println(simpleDateFormat.format(i2));//转换成format后的格式
        System.out.println(i2);//原本的格式
    }
}
