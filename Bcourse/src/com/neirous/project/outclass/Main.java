package com.neirous.project.outclass;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
//四种内部类：局部内部类、匿名内部类、成员内部类、静态内部类
//成员内部类和静态内部类是放在外部类的成员位置上，本质就是成员
//重点掌握匿名内部类，语法：new 类/接口(参数列表){};

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //方法一：用outer创建一个Inner类，然后使用方法
        //因为普通内部类必须创建一个外部类实例才能通过这个外部类创建内部类的对象
        Outer.Inner inner = outer.new Inner();
        inner.say();
        //方法二：在外部类中编写一个方法，返回Inner的对象
        Outer.Inner innerInstance = outer.getInnerInstance();
        innerInstance.say();

        //方法一：
        //外部其他类访问静态内部类，因为静态内部类可以通过类名直接访问
        Outer.Inner1 inner1 = new Outer.Inner1();
        inner1.say();
        //方法二：通过一个方法返回static类对象
        Outer.Inner1 inner1_ = outer.getInner1();
        //也可以这样
        Outer.Inner1 inner11 = Outer.getInner11();
    }
}

class Outer{
    private static int n1 = 10;
    public String name = "张三";

    private void hi(){
        System.out.println("hi");
    }
    //该方法返回一个Inner实例
    public Inner getInnerInstance(){
        return new Inner();
    }
    public class Inner{
        public void say(){
            System.out.println("say()");
        }
    }

    //静态内部类
    public static class Inner1{
        private static int n1 = 11;
        public void say(){
            System.out.println("static 的 say()");
        }

        public void hi(){
            System.out.println(Outer.n1);
        }
    }
    public static Inner1 getInner11(){
        return new Inner1();
    }
    public Inner1 getInner1(){
        return new Inner1();
    }
}
