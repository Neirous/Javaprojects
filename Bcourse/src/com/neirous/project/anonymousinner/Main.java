package com.neirous.project.anonymousinner;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.fun1();
    }
}

class A {

    private int n1 = 100;

    public void fun1() {
        System.out.println("一下测试内部类");
        System.out.println("类：");
        Father father = new Father("jack") {
            private int n1 = 90;
            @Override
            public void cry() {
                int n1 = 90;
                System.out.println("fun1中重写Father的方法");
                System.out.println("匿名内部类的n1：" + n1 + "\nA中的n1：" + A.this.n1);
            }
        };
        father.cry();

        new Father("jack") {
            @Override
            public void cry() {
                super.cry();
            }
        }.cry();

        System.out.println("接口：");
        IA ia = new IA() {
            @Override
            public void cry() {
                System.out.println("fun1中实现IA的方法");
            }
        };
        ia.cry();
    }

}

class Father {
    String name;

    public Father(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("Father方法");
    }
}

interface IA {
    public void cry();
}