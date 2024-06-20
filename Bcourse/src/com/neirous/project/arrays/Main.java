package com.neirous.project.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1,234,345,454,234,3,34,789,7};
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        //sort重载，也可以通过传入一个接口Comparator实现定制排序,匿名内部类

        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(integers));

        //Arrays.binarySearch使用二分查找，要求必须排序好,索引从0开始，没找到返回-(low+1),也就是这个数本该在的位置加一取反
        int index = Arrays.binarySearch(integers,1);
        System.out.println(index);

        //数组复制
        Integer[] i = Arrays.copyOf(integers,integers.length);

        //
        Arrays.fill(integers,900);
        System.out.println(Arrays.toString(integers));

        //
        boolean flag = Arrays.equals(integers,integers);

    }
}
