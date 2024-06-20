package com.neirous.project.collection.homework.homework4;

import java.util.*;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Person[] people = new Person[3];
        people[0] = new Person("jack",650);
        people[1] = new Person("tom",1200);
        people[2] = new Person("smith",2900);

        for(int i = 0;i < people.length;i++){
            hashMap.put(people[i].getName(),people[i].getSalary());
        }
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if(((String)next).equals("jack")){
                hashMap.replace(next,2600);
            }
        }
        System.out.println(hashMap);

        Set set1 = hashMap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry next = (Map.Entry)iterator1.next();
            System.out.println(next);
        }

        Collection values = hashMap.values();
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println(next);
        }

        iterator1 = set1.iterator();
        for (int i = 0; i < people.length; i++) {
            people[i].setSalary( people[i].getSalary()+100);
            System.out.println(people[i].getSalary());
        }
        while (iterator1.hasNext()) {
            Map.Entry next = (Map.Entry)iterator1.next();
            System.out.println(next);
        }
    }
}
class Person{
    private String name;
    private double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
