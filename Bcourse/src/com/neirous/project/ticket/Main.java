package com.neirous.project.ticket;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        Sell01 sell01 = new Sell01();
        Sell01 sell02 = new Sell01();
        Sell01 sell03 = new Sell01();
        new Thread(sell01).start();
        new Thread(sell02).start();
        new Thread(sell03).start();
        Sell02 sell021 = new Sell02();
        sell021.start();
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sell021.setLoop(false);
        //主线程来控制线程的终止，修改loop变量
    }
}
class Sell01 implements Runnable{
    private static int number = 100;//总票数为100张

    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(true){
            if(number <= 0){
                System.out.println("售票结束！");
                break;
            }
            else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("该窗口售出一张票" + Thread.currentThread() +",剩余票数为" + (--number));
            }
        }
    }

}
class Sell02 extends Thread{
    private static int number = 100;//总票数为100张

    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(true){
            if(number <= 0){
                System.out.println("售票结束！");
                break;
            }
            else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println((--number));
            }
        }
    }

}