package com.neirous.project.wrapper.string_;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
//String实现了Serializable类，说明String可串行化，该对象可以在网络中传输
//String实现了Comparable类，说明其可以比较
//String类有很多构造器，实现构造器的重载
//String是final类，不能被继承
//String有属性private final char value[]; 用于存放字符串内容，虽然是一个final类型，但只是说明它不能指向新的地址，值是可以修改的。
public class Main {
    public static void main(String[] args) {
        //String创建方式两种
        // 方法一：先从常量池中查看是否有“jack”数据空间，如果有，直接指向，如果没有就重新创建，然后指向。name最终指向的是常量池中的空间地址
        String name = "jack";
        //方法二：先在堆中创建空间，里面维护了value属性，指向常量池的“jack”空间。如果常量池没有“jack”，重新创建，如果有，直接通过value指向。最终指向的是堆中的空间地址。
        String s = new String("jack");

        //比较
        String a = "jack";
        String b = "jack";
        System.out.println(a.equals(b));//true,
        System.out.println(a == b);     //true,
        System.out.println(a == s);     //false

        String i1 = "jack";
        String i2 = new String("jack");
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);
        System.out.println(i1 == i2.intern());//intern()返回的是常量池里面的地址，常量池中jack的地址也就是i1的地址，返回true
        System.out.println(i2 == i2.intern());//因为i2是new出来的，指向的是堆的value对象的地址，所以返回false

        String i3 = "hello" + "world";//优化等价于String i3 = ”helloworld“，所以只创建了一个对象

        String i4 = "hello";
        String i5 = "world";
        String i6 = i4 + i5;//一共创建了三个对象
        //1.先执行StringBuilder sb = StringBuilder();
        //2.执行sb.append("hello");
        //3.sb.append("world");
        //4.String s = sb.toString();
        //5.最后c指向堆中的对象(String)value->池中的"helloworld"
        //重要规则：常量相加，看的是池(String i6 = i4 + i5;)；变量相加，是在堆中(String i3 = "hello" + "world";)
    }
}
