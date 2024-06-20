package com.neirous.project.stringbuffer.method;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        //StringBuffer常用方法
        StringBuffer stringBuffer = new StringBuffer("hello");
        //1.增
        stringBuffer.append(",");
        stringBuffer.append("dsf").append("adsfa");
        System.out.println(stringBuffer);

        //2.删
        stringBuffer.delete(3,5); //删除索引[3,5)的字符
        System.out.println(stringBuffer);

        //3.改
        stringBuffer.replace(3,5,"hello");//将[3,9)的删除并改成hello
        System.out.println(stringBuffer);

        //4.查
        int indexOf = stringBuffer.indexOf("hello");//查找指定字符串第一次出现的索引，找不到返回-1
        System.out.println(stringBuffer);

        //5.插
        stringBuffer.insert(5,"world");//在索引为9的位置插入world
        System.out.println(stringBuffer);

        //6.长度
        System.out.println(stringBuffer.length());
    }
}
