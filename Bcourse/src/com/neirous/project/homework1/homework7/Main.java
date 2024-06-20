package com.neirous.project.homework1.homework7;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        String name = "ahsdasdadsfadfg";
        try {
            System.out.println("交换前============");
            System.out.println(name);
            name = stringReverse(name, 1, name.length() - 1);
            System.out.println("交换后============");
            System.out.println(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    public static String stringReverse(String str, int start, int end) {
        char[] chars = str.toCharArray();
        char temp = ' ';
        if (end <= str.length() - 1 && start < end && str != null){
            for (int i = start, j = end; i <= j; i++, j--) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }else {
            throw new RuntimeException("参数不正确");
        }

        return new String(chars);
    }
}
