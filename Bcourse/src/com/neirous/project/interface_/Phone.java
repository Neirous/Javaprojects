package com.neirous.project.interface_;

public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机启动");
    }

    @Override
    public void stop() {
        System.out.println("手机关闭");
    }
}