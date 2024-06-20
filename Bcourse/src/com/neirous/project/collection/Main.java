package com.neirous.project.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        //1.添加单个元素
        list.add("jack");
        list.add(134);
        list.add(new B());
        System.out.println("list = " + list);

        //2.删除指定元素
        list.remove(0);//删除第一个元素
        System.out.println("list = " + list);

        //3.判断元素是否存在
        if(list.contains(134))
            System.out.println(list.contains(134));
        else System.out.println(list.contains(134));

        //4.获得集合个数
        System.out.println(list.size());

        //5.判断是否为空
        System.out.println(list.isEmpty());

        //6.清空集合
        list.clear();
        System.out.println(list);

        //7.添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("adfa");
        arrayList.add(2345);
        list.addAll(arrayList);
        System.out.println("list = " + list);

        //8.判断多个元素是否存在
        if (list.containsAll(arrayList))
            System.out.println();

        //9.删除多个元素
        list.removeAll(arrayList);
        System.out.println("list = " + list);
    }
}
class B{

}
