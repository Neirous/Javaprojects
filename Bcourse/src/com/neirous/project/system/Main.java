package com.neirous.project.system;

import java.util.Arrays;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        //
        int[] ints1 = {345,453,4,346};
        int[] ints = new int[10];
        //srcPos表示从原数组的哪个索引开始拷贝
        //desPos表示从目的数组的哪个索引开始粘贴
        //length表示拷贝多少个数据
        System.arraycopy(ints1,0,ints,5,4);
        System.out.println(Arrays.toString(ints));

        //currentTimeMillis，返回当前时间距离1970-1-1的毫秒数
        System.currentTimeMillis();

        //退出当前程序,0表示退出状态且时正常状态
        System.exit(0);
    }
}
