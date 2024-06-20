package com.neirous.project.stringbuilder.sb01;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
/*
String:不可变字符序列，效率低，但是复用性高
StringBuffer：可变字符序列，效率较高（增删）、线程安全
StringBuilder：可变字符序列，效率最高、线程不安全

String的使用注意说明：
    String s = "a"; //创建了一个字符串
    s += "b"; //实际上原来的a已经丢弃，产生了一个新的字符串ab，如果多次执行会导致大量副本字符串留在内存中，降低效率->对String做大量修改时不要用String

使用原则：
    1.如果字符串中存在大量的修改操作，一般使用StringBuffer或StringBuilder
    2.如果字符串中存在大量的修改操作且是单线程，使用StringBuilder
    3.如果字符串中存在大量的修改操作且是多线程，使用StringBuffer
    4.如果字符串中存在很少的修改操，被多个对象引用，使用String，比如配置信息
    StringBuffer和StringBuilder的方法是一样的
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
    }
}
