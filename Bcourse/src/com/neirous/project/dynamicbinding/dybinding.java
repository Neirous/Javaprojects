package com.neirous.project.dynamicbinding;

public class dybinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());

    }
}

class C {
    public int i = 100;

    public int sum() {
        return i;
    }
}

class A extends C {
    public int i = 10;

    public int sum() {
        return getI();
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 10000000;

    //    public int sum(){
//        return i+20;
//    }
    public int sum1() {
        return getI() + 40;
    }

    public int getI() {
        return i;
    }
}

