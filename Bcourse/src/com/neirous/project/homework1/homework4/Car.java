package com.neirous.project.homework1.homework4;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("flow hot");
            } else if(temperature < 0){
                System.out.println("flow cold");
            } else {
                System.out.println("turn off");
            }
        }
    }

    public Air getAir(){
        return new Air();
    }
}
