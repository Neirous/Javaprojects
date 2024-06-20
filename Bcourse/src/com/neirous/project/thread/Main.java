package com.neirous.project.thread;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        int i = 100;
        cat.start();

    }
}

//通过继承thread类创建线程
//当一个类继承了thread类，就可以当作一个线程
class Cat extends Thread {
    int time = 0;

    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        while (true) {
            //每隔一秒，在控制台中输出一段话
            System.out.println("hello" + time);
            //1000毫秒是1秒，ctrl+alt+t快捷键输出try-catch
            if(time == 80) break;
            try {
                Thread.sleep(1);
                time++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
