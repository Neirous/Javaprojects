package com.neirous.project.anonymousinner;

public class Main2 {
    public static void main(String[] args) {
        f1(new IB() {
            @Override
            public void show() {
                System.out.println("匿名内部类作为实参");
            }
        });
        /*
        传统方式：
        f1(new B());
         */
    }
    public static void f1(IB ib){
        ib.show();
    }
}
interface IB{
    void show();
}
class B implements IB{
    @Override
    public void show() {
        System.out.println("传统方法");
    }
}
