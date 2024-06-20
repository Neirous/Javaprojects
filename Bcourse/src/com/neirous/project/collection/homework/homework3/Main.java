package com.neirous.project.collection.homework.homework3;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList方法集合
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("BMW",4000000));
        arrayList.add(new Car("Binly",50000000));
        System.out.println(arrayList);


        arrayList.remove(new Car("BMW",4000000));
        System.out.println(arrayList);

        System.out.println(arrayList.contains(new Car("Binly",50000000)));
        System.out.println(arrayList.contains(new Car("BMW",4000000)));;

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(23);
        arrayList1.add(23);
        arrayList1.add(23234);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);


    }
}
class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
