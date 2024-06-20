package com.neirous.project.wrapper.string_;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
//String类是保存字符串常量的，每次更新都需要开辟新的空间，效率很低，比如以下代码就会一直开辟空间，此时就需要StringBuilder和StringBuffer
        //String s = new String("");
        //        for (int i = 0; i < 1000; i++) {
        //s += "hello";
        //        }
public class SB {
    public static void main(String[] args) {
        //String常用方法

        //1.equals
        String i = "jack";
        String j = "jack";
        System.out.println(i.equals(j));

        //2.equalsIgnoreCase()，忽略大小写的判断内容是否相等
        String k = "JACK";
        System.out.println(i.equalsIgnoreCase(k));

        //3.length,返回字符串长度

        //4.indexOf 获取字符或字符串在字符串中第一次出现的索引，索引从0开始，找不到就返回-1
        System.out.println(i.indexOf("ja"));
        System.out.println(i.indexOf("e"));

        //5.lastIndexOf获取字符或者字符串在字符串中最后一次出现的索引，索引从0开始，找不到返回-1
        System.out.println(j.lastIndexOf("ja"));
        System.out.println(j.lastIndexOf("e"));

        //6.substring截取指定范围的子串，索引从0开始
        String name = "hello,张三";
        System.out.println(name.substring(6));//从下标为6一直取到最后一个字符包括6
        System.out.println(name.substring(0,5));//取0-5的字符，不包括5

        //7.toUpperCase转换成大写
        System.out.println(i.toUpperCase());

        //8.toLowerCase转换成小写
        System.out.println(i.toLowerCase());

        //9.concat拼接字符串
        System.out.println(i.concat(k));
        String l = "".concat(i).concat(j).concat(k);
        System.out.println(l);

        //10.replace替换字符串中的字符
        l = l.replace("jack","hello");//将字符串l中的所有jack替换成hello
        System.out.println(l);

        //11.split分割字符串，对于某些字符串，需要转义
        String i3 = "asdf\\asdf\\asdf\\ffff\\asd";
        String[] i4 = i3.split("\\\\");
        for (int m = 0; m < i4.length; m++) {
            System.out.println(i4[m]);
        }

        //12.toCharArray转换成字符串数组
        char[] chr = i.toCharArray();
        for (int m = 0; m < chr.length; m++) {
            System.out.println(chr[m]);
        }

        //13.compareTo比较两个字符串的大小，前者大返回正数，后者大返回负数，相等返回0(都相等就返回前者的length减去后者的length，其他情况通过字典序比较)
        String i5 = "bacadsfa";
        String i6 = "bc";
        System.out.println(i5.compareTo(i6));
        System.out.println(i.compareTo(k));

        //14.format格式字符串
        //%s字符串 %c字符 %d整型 %.2f浮点型(这些都是占位符)
        String i7 = "john";
        int age = 10;
        double score = 98.3/6;
        char gender = '男';
        String info = String.format("我的名字是%s，年龄是%d，成绩是%.2f,性别是%c",i7,age,score,gender);
        System.out.println(info);
        //或者这样操作可以提高复用性
        String formatStr = "我的名字是%s，年龄是%d，成绩是%.2f,性别是%c";
        String info1 = String.format(formatStr,i7,age,score,gender);
        System.out.println(info1);

    }
}
