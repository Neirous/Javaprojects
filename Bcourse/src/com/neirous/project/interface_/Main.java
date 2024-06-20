package com.neirous.project.interface_;

public class Main {
    public static void main(String[] args) {
        Camema camema = new Camema();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camema);
        phone.hi();
        UsbInterface[] usbInterfaces = new UsbInterface[30];
        usbInterfaces[0] = new Camema();
        usbInterfaces[1] = new Phone();
    }
}