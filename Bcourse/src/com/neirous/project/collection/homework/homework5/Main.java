package com.neirous.project.collection.homework.homework5;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person(1001, "aa");
        Person p2 = new Person(1002, "bb");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.name = "cc";
        System.out.println(hashSet);

        hashSet.remove(p1);
        System.out.println(hashSet);

        hashSet.add(new Person(1001,"cc"));
        System.out.println(hashSet);

        hashSet.add(new Person(1001,"aa"));
        System.out.println(hashSet);
    }
}

class Person {
    public String name;
    public int age;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
