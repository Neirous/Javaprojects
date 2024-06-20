package com.neirous.project.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main extends JFrame{
    private MyPanel mp = null;

    public static void main(String[] args) {
        Main main = new Main();
    }
    public Main(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//KeyListener监听器，监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }
    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //当某个键按下，该方法触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char) e.getKeyCode() + "被按下");

        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }
        this.repaint();
    }
    //某个键释放时，该方法触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
