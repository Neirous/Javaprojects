package com.neirous.project.interface_;

public class Camema implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机启动");
    }

    @Override
    public void stop() {
        System.out.println("相机关闭");
    }
}