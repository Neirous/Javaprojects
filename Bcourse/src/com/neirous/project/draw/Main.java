package com.neirous.project.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main extends JFrame{//JFrame对应一个窗口，可以理解为程序框
    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new Main();

    }

    public Main(){ //构造器完成
        mp = new MyPanel();
        this.add(mp);
        this.setSize(2560,1660);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击小×后退出程序
    }
}
//需要定义一个画板，用于在之上画图
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//Graphics-画图，可理解为画笔
        super.paint(g);//必须保留，用父类的方法完成初始化
        System.out.println("被调用");
        //画出一个圆
        //g.drawOval(10,10,100,100);

        //画一条直线
        //g.drawLine(10,10,100,100);

        //画一个矩形
        //g.drawRect(35,35,35,35);

        //设置颜色
        //g.setColor(Color.blue);

        //填充椭圆
        //g.fillOval(10,10,10,10);

        //使用图片
        //1.获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage("E:\\WStation\\Java\\Bcourse\\src\\com\\neirous\\project\\屏幕截图 2024-05-08 213128.png");
//        g.drawImage(image,0,0,2560,1660,this);

        //给画笔设置字体


        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("Hello World",100,100);
    }
}
