package com.neirous.project.Obj;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A a1 = new A();
        a.a = 10;
        b.a = 20;
        System.out.println(a.equals(b));
        "hello".equals("hello");
        Integer i = new Integer(236);
    }
}

class A
{
    public int a;
}
