package com.neirous.project.wrapper;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */

//装箱：基本类型->包装类型    拆箱：包装类型->基本类型
//自动装箱底层调用的是valueOf方法，比如integer.valueOf()
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        //演示装箱拆箱

        //手动装箱：
        int n1 = 1000;
        Integer i = new Integer(n1);
        //或者
        Integer i1 = Integer.valueOf(n1);

        //手动拆箱
        int i2 = i.intValue();

        //jdk5以后的自动拆装箱
        int n2 = 200;
        //自动装箱
        Integer i3 = n2;//底层使用的是Integer.valueOf(n2)
        //自动拆箱
        int n3 = i3; //底层使用intValue()方法

        //===================================================================

        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);//会输出1.0，因为三元运算符需要看作一个整体，输出结果会转换成精度高的

        Object obj2;
        if (true)
            obj2 = new Integer(1);
        else
            obj2 = new Double(2.0);
        System.out.println(obj2);

        //===================================================================

        //包装类->String
        Integer i5 = 89;
        //方式一：
        String str1 = i + "";
        //方式二：
        String str2 = i.toString();
        //方式三：
        String str3 = String.valueOf(i5);

        //String->包装类
        String str4 = "123456";
        //方法一：
        int i4 = Integer.parseInt(str4);//使用到自动装箱
        //方法二：
        Integer i6 = new Integer(str4);//使用Integer的其中一个构造器

        //======================================================

        //面试常考
        Integer i7 = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i7 == j);//false,等号判断的两者是否为同一个对象，由于都是new出来的，所以不是同一个对象

        Integer i8 = -128;
        Integer i9 = -128;
        System.out.println(i8 == i9);//true，因为是直接赋值，底层使用的是Integer.valueOf(1),只要在-128-127范围内，就不会真正去new

        Integer x = 128;
        Integer y = 128;
        System.out.println(x==y);//false，超出范围，直接new

        Integer i10 = 128;
        int i11 = 128;
        System.out.println(i10 == i11);//true,因为只要有基本数据类型，就只会对比值

        String name = "jcak";
    }
}
