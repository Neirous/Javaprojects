package com.neirous.project.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */

//iterator迭代器用于便利集合元素

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book("三国演义","luoguanzhong",10.1));
        arrayList.add(new Book("hongloumeng","caoxueqing",10.1));
        arrayList.add(new Book("xiyouji","wuchengen",10.1));

        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();

        //快速生成while循环 快捷键itit，ctrl+j可以看到所有快捷键模板
        while(iterator.hasNext()){
            //动态绑定机制，编译类型是Obj，运行类型是Book
            Object next = iterator.next();
            System.out.println(next);
        }
        //while循环过后，iterator指向集合最后一个元素，若还要在使用，得重置
        iterator = arrayList.iterator();

        //遍历还可以使用增强for循环,增强for还可以使用在数组上，增强for底层仍然是迭代器，快捷方式是 I,或者arrayList.iter
        for(Object book:arrayList){
            System.out.println(book);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
