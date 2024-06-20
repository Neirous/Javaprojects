package com.neirous.project.interface_;

public class Computer {
    public void work(UsbInterface usbinterface){
        usbinterface.start();
        usbinterface.stop();
    }
}