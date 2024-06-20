package com.neirous.project.generic.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings1 = new ArrayList<>();
        ArrayList<Integer> strings2 = new ArrayList<>();
        ArrayList<Double> strings3 = new ArrayList<>();

        printCollection(strings1);
    }
    public static void printCollection(List<?> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }
    //表示支持A类及其子类
    public static void printCollection1(List<? extends A> c ){
        for (A o :c) {
            System.out.println(o);
        }
    }
    //表示支持B类及其B的父类，不限于直接父类
    public static void printCollection2(List<? super B> c ){
        for (Object o :c) {
            System.out.println(o);
        }
    }
}

class A{

}
class B extends A{

}


