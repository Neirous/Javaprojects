package com.neirous.project.customerexception;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        int age = 1243;
        if(!(age >= 18 && age <=120)){
            throw new AgeException("年龄需要在10-120之间");
        }
        System.out.println("年龄范围正常");
    }
}
//一般情况下自定义异常都是继承RuntimeException，好处是可以使用默认的处理机制
//
//自定义的异常
class AgeException extends RuntimeException{
    //构造器
    public AgeException(String message) {
        super(message);
    }
}
