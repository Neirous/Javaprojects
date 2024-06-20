package com.neirous.project.homework1.homework8;

import java.util.Scanner;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("name = ");
            String name = scanner.next();
            if (name.length() > 4 || name.length() < 2) {
                throw new RuntimeException();
            }
            System.out.print("password = ");
            String password = scanner.next();
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isDigit(password.charAt(i))) {
                    throw new RuntimeException();
                }
            }
            System.out.println("Email = ");
            String email = scanner.next();
            int i = email.indexOf("@");
            int j = email.indexOf(".");
            if(!(i > 0 && j > i)){
                throw new RuntimeException("format error");
            }
        } catch (Exception e) {
            System.out.println("error");
            ;
        }

    }
}
