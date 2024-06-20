package com.neirous.project.houserent.view;

import com.neirous.project.houserent.utils.Utility;

public class HouseView {

    private boolean loop = true;  //控制显示菜单
    private char key = ' ';//接受用户选择
    //显示主菜单
    public void mainMenu(){
        do {
            System.out.println("============房屋出租信息============");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房屋");
            System.out.println("\t\t\t3.删除房屋信息");
            System.out.println("\t\t\t4.修改房屋信息");
            System.out.println("\t\t\t5.房屋列表");
            System.out.println("\t\t\t6.退出");
            System.out.println("请输入你的选择（1-6）");

            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新增");
            }
        }while(true);
    }
}
