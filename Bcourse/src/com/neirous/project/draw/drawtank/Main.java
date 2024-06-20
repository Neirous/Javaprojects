package com.neirous.project.draw.drawtank;

import javax.swing.*;
import java.awt.*;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(2560,1660);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyPanel extends Panel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(50,50,10,40);
        g.fillRect(80,50,10,40);
        g.fillRect(60,55,30,30);
        g.setColor(Color.white);
        g.fillOval(58,58,20,20);
        g.setColor(Color.BLACK);
        g.drawLine(57,57,57,48);
    }
}
