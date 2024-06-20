package com.neirous.project.homework1.homework4;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Car car = new Car(45);
        car.getAir().flow();
        Car car1 = new Car(-12);
        car1.getAir().flow();
        Car car2 = new Car(24);
        car2.getAir().flow();
    }
}
