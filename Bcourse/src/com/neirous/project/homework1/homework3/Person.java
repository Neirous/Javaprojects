package com.neirous.project.homework1.homework3;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void common(){
        if(!(vehicles instanceof Boat)){
            vehicles = VehicleFactory.getBoat();
        }
        vehicles.work();
    }
    public void river(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehicleFactory.getHorse();
        }
        vehicles.work();
    }

    public void mountain(){
        if(!(vehicles instanceof Plane)){
            vehicles = VehicleFactory.getHorse();
        }
        vehicles.work();
    }
}
