package com.neirous.project.collection.hashmap;

import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i,"jack");
        }

        System.out.println("entry遍历");
        long start = System.currentTimeMillis();
        Set set = hashMap.keySet();
        for (Object o : set) {
            System.out.println(set);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start));

        System.out.println("迭代器遍历");
        start = System.currentTimeMillis();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start));

    }
}
