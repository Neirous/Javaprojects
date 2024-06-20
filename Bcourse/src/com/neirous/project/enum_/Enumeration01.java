package com.neirous.project.enum_;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */

    //把具体的对象一个个枚举出来就是枚举类
    //两种实现方式：自定义枚举类，使用enum关键字实现
@SuppressWarnings("all")
public class Enumeration01 {
    public static void main(String[] args) {
    }
}

//方法二：enum
enum Season{
    //1.用enum代替class
    //2.常量名(实参列表)
    //3.如果有多个对象，使用逗号间隔就好
    //4.要求定义的常量对象写在最前面
    SPRING("Spring","Warm"),WINTER("Winter","cold"),SUMMER("Summer","hot"),AUTUMN("Autumn","cool"),OTHER;
    private String name;
    private String desc;//描述

    //方法一：自定义枚举类

//    public static final Season SPRING = new Season("Spring","warm");
//    public static final Season SUMMER = new Season("Summer","hot");
//    public static final Season AUTUMN = new Season("Autumn","cool");
//    public static final Season WINTER = new Season("Winter","cold");
//    //1.将构造器私有化，防止直接new
//    //2.去掉set方法，防止修改
//    //3.在Season内部直接创建固定对象,使用static final/static，static final比较好

    Season() {
    }

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
