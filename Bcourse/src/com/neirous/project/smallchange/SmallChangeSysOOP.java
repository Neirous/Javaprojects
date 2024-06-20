package com.neirous.project.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//用于完成各项功能
public class SmallChangeSysOOP {
    //定义相关变量
    boolean loop = true;
    String key = "";

    //完成零钱通明细
    String details = "------------零钱通明细------------";

    //完成收益入账
    double money = 0;
    double balance = 0;
    Date date = null;  //date是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //用于日期的格式化

    //4.消费
    //定义新变量，保存消费原因
    String note = "";

    Scanner scanner = new Scanner(System.in);

    //完成显示菜单
    public void mainMenu() {
        do {
            System.out.println("\n============零钱通菜单============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消   费");
            System.out.println("\t\t\t4.退   出");
            System.out.println("请选择(1-4):");

            key = scanner.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //money的值需要校验
        if (money <= 0) {
            System.out.println("金额范围应该大于0");
            return;  //将break改成return
        }

        balance += money;
        //拼接收益入账信息
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay() {
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        //money的值的校验
        if (money <= 0 || money > balance) {
            if (money <= 0)
                System.out.println("金额范围应该大于0");
            else System.out.println("余额不足");
            return;
        }

        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接收益入账信息
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        return;
    }

    //退出
    public void exit(){
        String choice = "";
        while (true) {
            System.out.println("你确定要退出码？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice))
                break;
            else System.out.println("输入有误，请重新输入！");
        }
        if (choice.equals("y")) {
            loop = false;
        }
        return;
    }
}
