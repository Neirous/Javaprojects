package com.neirous.project.homework1.homework9;

import java.util.Scanner;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */

//将输入格式为 Han shun ping转变为 Ping,han.S

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = new String();
        string = scanner.nextLine();
        printName(string);
    }
    public static void printName(String str){
        if(str == null){
            System.out.println("String不为空");
            return;
        }
        //根据空格来分割
        String[] name = str.split(" ");
        if (name.length != 3){
            System.out.println("format is wrong");
            return;
        }
        String format = String.format("%s,%s.%c",name[2],name[0],name[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
