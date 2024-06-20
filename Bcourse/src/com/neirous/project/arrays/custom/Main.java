package com.neirous.project.arrays.custom;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        int[] arr = {234,456,3,45723,5,456,456};
        bubbleSort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;//自动拆箱
                int i2 = (Integer)o2;
                return i1-i2;
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int arr[], Comparator c ){
        int temp = 0;
        for(int i = 0;i< arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if(c.compare(arr[i],arr[j])>0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
