package com.neirous.project.calendar;

import java.util.Calendar;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */

//第二代日期类
public class Main {
    public static void main(String[] args) {
        //通过getInstance获取实例
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        //实例.get(Calendar.XXX)
        System.out.println(instance.get(Calendar.YEAR));
        //月份需要加一,因为是从0开始的
        System.out.println(instance.get(Calendar.MONTH)+1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.HOUR));//12小时制
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));//24小时制
        System.out.println(instance.get(Calendar.MINUTE));
        System.out.println(instance.get(Calendar.SECOND));
    }
}
