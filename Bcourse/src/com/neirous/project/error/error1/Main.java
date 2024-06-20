package com.neirous.project.error.error1;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        int a = 19;
        int b = 0 ;
        String d = "asdf";
        try {
            System.out.println(a/b);
        } catch (Exception e) {

        }
        try {
            int c = Integer.parseInt(d);
        } catch (NumberFormatException e) {

        }
        System.out.println(3);
    }
}
