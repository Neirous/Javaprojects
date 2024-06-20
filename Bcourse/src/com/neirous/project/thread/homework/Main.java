package com.neirous.project.thread.homework;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        for(int i = 0;i < 10;i++){
            if(i == 5){
                Thread thread = new Thread(a);
                thread.setDaemon(true);
                thread.start();
                thread.join();
            }

            System.out.println("hi" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class A implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}