package project01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Dac04 {
    public static void main(String[] args) {
        List list1 = new List();
        list1.getInfo();
        List list2 = new List();
        list2.getInfo();
        Tools01 tools01 = new Tools01();
        System.out.println(tools01.sortList(list1, list2));
    }
}

class List {

    int N = 0;
    int arr[] = new int[50];

    public void getInfo() {
        //用于读取数组信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组个数：");
        this.N = scanner.nextInt();
        for (int i = 0; i < this.N; i++) {
            arr[i] = scanner.nextInt();
        }
    }

}

class Tools01 {
    public String sortList(List l1, List l2) {
        //组合
        for (int i = 0, j = 0; j < l2.N; j++) {
            if (l1.arr[i] + l2.arr[j] > 10000)
                continue;
            else if (l1.arr[j] + l2.arr[i] < 10000 && j < l2.N)
                i++;
            else if (j == l2.N || i == l1.N)
                return "NO";
            else
                return "YES";
        }
        return "NO";
    }
}
