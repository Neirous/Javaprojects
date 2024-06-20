package project01;

import java.util.Scanner;

public class Dac01 {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.inputInfo();
    }
}

class Menu {
    Scanner scanner = new Scanner(System.in);

    //创建一个能容纳50个学生的表
    Student student[] = new Student[10000000];
    Tools tools = new Tools();

    public void inputInfo() {
        //记录用户选择
        int choice = -1;
        //记录此时学生序号
        int pre = 0;
        //临时记录该专业学生人数
        int temp = 0;
        int nums = 0;
        //临时记录专业
        String maj = "";
        //临时记录树数目
        int treenums = 0;
        do {

            System.out.println("请选择要进行的操作：(1.输入，2.降序后打印3.根据种树数目输出该学生信息)");
            choice = scanner.nextInt();
            if (choice == 0) break;
            else if (choice != 1 && choice != 2 && choice != 3) {
                System.out.println("输入有误，请重新输入！！！");
                continue;
            } else {
                switch (choice) {
                    case 1:
                        //录入信息
                        System.out.println("专业：");
                        maj = scanner.next();
                        System.out.println("人数：");
                        temp = scanner.nextInt();
                        for (int i = pre; i < pre + temp; i++) {
                            student[i] = new Student();
                            student[i].major = maj;
                            System.out.println("输入学生学号：");
                            student[i].id = scanner.nextInt();
                            System.out.println("输入学生姓名：");
                            student[i].name = scanner.next();
                            System.out.println("输入种树数量：");
                            student[i].tree = scanner.nextInt();
                        }
                        //更新学生总数和当前记录位置
                        nums += temp;
                        pre += temp;
                        break;
                    case 2:
                        tools.quickSort(0, nums - 1, student);
                        System.out.println("排序后输出:专业\t\t学号\t\t姓名\t\t植树数");

                        for (int i = 0; i < nums; i++) {
                            System.out.println("\t\t " + student[i].major + "\t\t" + student[i].id + "\t" + student[i].name + "\t\t" + student[i].tree);
                        }
                        break;
                    case 3:
                        System.out.println("要查找的植树数目：");
                        treenums = scanner.nextInt();
                        System.out.println(tools.binSort(nums - 1, student, treenums));
                        break;
                }
            }
        } while (true);
    }
}

class Student {
    //学生姓名
    String name;
    //专业
    String major;
    //学号
    int id;
    //种树数量
    int tree;

}

class Tools {
    public void swap(Student[] arr, int a, int b) {
        Student temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void quickSort(int l, int r, Student arr[]) {
        if (l >= r) return;

        int i = l - 1, j = r + 1;
        int k = arr[l + r >> 1].tree;

        while (i < j) {
            do i++; while (arr[i].tree < k);
            do j--; while (arr[j].tree > k);
            if (i < j) swap(arr, i, j);
        }
        quickSort(l, j, arr);
        quickSort(j + 1, r, arr);
    }

    public String binSort(int r, Student[] arr, int value) {
        int l = 0;
        int mid = 0;
        int count = 0;
        while (l < r) {
            mid = l + r + 1 >> 1;
            if (arr[mid].tree < value)
                l = mid;
            else if (arr[mid].tree > value)
                r = mid - 1;
            else
                break;
            count++;
        }
        if (arr[mid].tree == value)
            return "该生排名在第" + (mid + 1) + "位" + "，查找" + (count + 1) + "次成功，" + arr[mid].major + "\t" + arr[mid].id + "\t" + arr[mid].name + "\t" + arr[mid].tree;
        else
            return "未找到该生";
    }
}


