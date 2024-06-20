package com.neirous.project.collection.treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return ((String)o1).length()- ((String)o2).length();
            }
        });
        treeMap.put("jack",200);
        treeMap.put("mary",12300);
        treeMap.put("smith",2040);
        treeMap.put("tom",20034);
        treeMap.put("jakdsfj",205670);
        System.out.println(treeMap);
        //自定义compare

    }
}
