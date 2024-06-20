package com.neirous.project.interface_;

public interface UsbInterface {
    public int n1 = 10;
    public void start();
    public void stop();
    //jdk8后，可以有默认实现方法，需要使用default关键字修饰
    default public void hi(){
        System.out.println("helloworld");
    }
    //jdk8后，可以有静态方法
    public static void cry(){
        System.out.println("cry");
    }
}