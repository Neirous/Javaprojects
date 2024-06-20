package com.neirous.project.collection.homework.homework1;

import java.util.*;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employer[] employers = new Employer[3];
        employers[0] = new Employer(1, "jack", 8089);
        employers[1] = new Employer(2, "mary", 234526);
        employers[2] = new Employer(3, "smith", 200);
        hashMap.put(employers[0].getId(), employers[0]);
        hashMap.put(employers[1].getId(), employers[1]);
        hashMap.put(employers[2].getId(), employers[2]);

        Collection values = hashMap.values();
        for (Object o : values) {
            if (((Employer) o).getSalary() > 18000)
                System.out.println(o);
            else continue;
        }

        Set set = hashMap.keySet();
        System.out.println("set.getClass = " + set.getClass());
        for (Object o : set) {
            System.out.println("o.getClass = " +o.getClass());
        }


        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
            System.out.println("next.getClass = " +next.getClass());
        }
        System.out.println("set1.getClass = " +set1.getClass());

    }
}

class Employer {
    private int id;
    private String name;
    private double salary;

    public Employer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
