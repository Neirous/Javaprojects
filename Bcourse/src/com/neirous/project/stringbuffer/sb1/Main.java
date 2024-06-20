package com.neirous.project.stringbuffer.sb1;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")

//1.StringBuffer实现了Serializable，是可串行化的
//2.直接父类是AbstractStringBuilder
//3.父类中有属性char[]，不是final，该value数组存放字符串内容，引出存放在堆中；区别于String是放在常量池
//4.StringBuffer是一个final类
//String vs StringBuffer
//String保存的是字符串常量，里面的值不能修改，每次String类的更新实际上就是更改地址，效率低
//StringBuffer保存的是字符串变量，里面的值可以修改，每次更新是更新内容，不用更新地址，效率更高
public class Main {
    public static void main(String[] args) {
        //构造器的使用
        //1.初始容量为16个字符
        StringBuffer stringBuffer = new StringBuffer();

        //2.通过构造器指定char[]的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3.给一个String，char[]的大小为String.length+16
        StringBuffer stringBuffer2 = new StringBuffer("hello");

        //======================================================================
        //String和StringBuffer之间的转换

        //String -> StringBuffer
        StringBuffer stringBuffer3 = new StringBuffer();
        String str = "hello";
        stringBuffer3 = stringBuffer3.append(str);

        //StringBuffer -> String
        StringBuffer stringBuffer4 = new StringBuffer();
        String str1 = stringBuffer4.toString();
        //或者将StringBuffer放入String的构造器
        String str2 = new String(stringBuffer4);
    }
}
