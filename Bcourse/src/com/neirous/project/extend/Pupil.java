package com.neirous.project.extend;

//子类和父类必须满足is-a逻辑关系
//当子类对象创建好后，建立查找的关系
public class Pupil extends Student{
    public void testing(){
        System.out.println();
    }

    public Pupil() {
        //子类使用构造器时，必须指定调用父类的一个构造器，默认是调用父类的无参构造器,且父类的构造器调用不限于直接父类，可一直向上追溯

        super();
    }
}
