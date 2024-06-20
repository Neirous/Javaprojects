package com.neirous.project.collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        //List集合中元素有序且可以重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("tom");
        System.out.println(list);

        //List常用方法
        //1.指定位置插入元素
        list.add(3,"hello");
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("adsfjkas");
        list1.add("kas");
        //在指定位置插入集合元素
        list.addAll(2,list1);
        System.out.println(list);

        //2.查找某元素在集合中首次出现的位置
        System.out.println(list.indexOf("mary"));
        //3.查找某元素在集合中最后一次出现的位置
        System.out.println(list.lastIndexOf("mary"));

        //4.设置指定位置的元素为xx元素，相当于替换
        list.set(1,"dsafadf");
        System.out.println(list);

        //5.返回指定子集合
        List returnList = list.subList(4,6);//左闭右开
        System.out.println(returnList);
    }
}
