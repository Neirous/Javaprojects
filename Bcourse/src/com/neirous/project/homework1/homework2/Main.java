package com.neirous.project.homework1.homework2;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        new A().say();
    }
}

class A{
    private String name ="java";
    public void say(){
        class B{
            public final int NUMBER= 10;
            public void show(){
                System.out.println(NUMBER  + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
