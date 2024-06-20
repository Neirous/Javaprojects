package com.neirous.project.collection.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(456);
        linkedHashSet.add(456);
        linkedHashSet.add(new Customer("jack",132));
        System.out.println(linkedHashSet);
    }
}

class Customer{
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
