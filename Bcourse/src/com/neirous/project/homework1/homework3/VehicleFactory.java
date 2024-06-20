package com.neirous.project.homework1.homework3;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class VehicleFactory {
    public static Horse horse = new Horse();//饿汉式
    public static Horse getHorse() {
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
