package com.neirous.project.encapsulation;

public class Encap01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackafdhaaws");
        person.setAge(3000);
        person.setSalary(30000);
        System.out.println(person.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6)
            this.name = name;
        else {
            System.out.println("名字不合法，给默认名字jack");
            this.name = "jack";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100)
            this.age = age;
        else {
            System.out.println("年龄需要在1-100之间，给默认年龄18");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name = " + name + " age = " + age + " salary = " + salary;
    }

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }
}
