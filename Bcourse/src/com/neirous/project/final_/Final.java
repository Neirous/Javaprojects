package com.neirous.project.final_;

public class Final {
    public static void main(String[] args) {
        System.out.println(BB.num1);
        System.out.println(BB.num2);
        CC cc = new CC();
        cc.hi();
    }
}

class AA {
    /*
    final可以修饰类，属性，方法
    类->不能被继承
    属性->不能被修改
    方法->不能被重写

    final修饰的属性一般命名规范：XX_XX_XX （常量）
    1.定义时可以赋初值
    2.构造器中
    3.代码块中

    如果final修饰的属性是静态的，则初始化的位置只能是定义时或者静态代码块
    为什么不能用构造器呢？
    因为静态属性的初始化工作和静态代码块的调用是在类加载时进行的，而只有创建了对象才会调用构造器，这导致了可能这个静态属性不被赋初值

    包装类Integer，Double，Float，Boolean等都是final，String也是final类，不能被继承
     */
    public final double TAX_RATE1 = 0.1;
    public final double TAX_RATE2;

    public AA(double TAX_RATE2) {
        this.TAX_RATE2 = TAX_RATE2;
    }

    public final double TAX_RATE3;

    {
        TAX_RATE3 = 0.03;
    }

    public static final double TAX_RATE4 = 0.3;
    public static final double TAX_RATE5;


    static {
        TAX_RATE5 = 0.3445;
    }
}

class BB{
    //final和static往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
    public final static int num1 = 10000;
    public static int num2 = 100000;
    static {
        System.out.println("BB的静态代码块被调用");
    }

    public static void hi(){
        System.out.println(2);
    }
}

class CC extends BB{
    public static void hi(){
        System.out.println("6");
    }

}
