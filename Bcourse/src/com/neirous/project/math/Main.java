package com.neirous.project.math;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        double a = Math.sqrt(-9);
        System.out.println(a);

        for (int i = 0; i < 10; i++) {
            //System.out.println(Math.random());//输出[0,1)之间的数
            System.out.println((int)(2+Math.random()*6  )); //输出[2,7)之间的数
        }
    }
}
