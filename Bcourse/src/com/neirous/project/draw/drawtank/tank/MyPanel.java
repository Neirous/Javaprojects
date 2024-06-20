package com.neirous.project.draw.drawtank.tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class MyPanel extends JPanel implements KeyListener {

    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemySize = 3;

    public MyPanel() {
        hero = new Hero(100, 100);//初始化一个坦克
        hero.setSpeed(5);
        //初始化敌人坦克
        for (int i = 0; i < enemySize; i++) {
            enemyTanks.add(new EnemyTank(i * 100, 0));
//            EnemyTank temp = enemyTanks.get(i);
//            temp.setDirect(2);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色

        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
    }

    //编写方法，画出坦克

    /**
     * @param x         坦克横坐标
     * @param y         纵坐标
     * @param g         画笔
     * @param direction 朝向
     * @param type      坦克类型（我方敌方）
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        //根据不同坦克，设置不同颜色
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direction) {
            case 0://0表示向上
                g.fill3DRect(x, y, 10, 60, false);//坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克身子
                g.fillOval(x + 9, y + 20, 20, 20);//画出圆盖
                g.fill3DRect(x + 18, y - 7, 3, 40, false);//画出圆盖
                break;
            case 1://1表示向右
                g.fill3DRect(x, y, 60, 10, false);//坦克左边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克身子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆盖
                g.fill3DRect(x + 30, y + 20, 40, 3, false);//画出圆盖
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);//坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克身子
                g.fillOval(x + 9, y + 20, 20, 20);//画出圆盖
                g.fill3DRect(x + 18, y + 30, 3, 40, false);//画出圆盖
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);//坦克左边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克身子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆盖
                g.fill3DRect(x - 7, y + 20, 40, 3, false);//画出圆盖
                break;
            default:
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}





















