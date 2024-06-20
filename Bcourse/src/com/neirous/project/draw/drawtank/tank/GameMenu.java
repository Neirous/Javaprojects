package com.neirous.project.draw.drawtank.tank;

import javax.swing.*;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class GameMenu extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        GameMenu gameMenu = new GameMenu();
    }
    public GameMenu(){
        mp = new MyPanel();
        this.add(mp);//把画板添加到绘图区域
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
