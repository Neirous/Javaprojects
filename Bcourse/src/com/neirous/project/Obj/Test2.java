package com.neirous.project.Obj;

import sun.misc.Cleaner;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1 = null;
        System.gc(); //主动调用垃圾回收器
        int[] arr = {1,3,43632,543};
        Arrays.sort(arr);
    }
}

class A1
{
    private String name;


    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车");
    }
}