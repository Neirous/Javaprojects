package com.neirous.project.generic.homework.homework1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("b", 100, new MyDate(12, 4, 2004)));
        employees.add(new Employee("c", 12340, new MyDate(4, 23, 2006)));
        employees.add(new Employee("b", 1231231, new MyDate(4, 23, 1998)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1.getName().equals(o2.getName()))) return o1.getName().compareTo(o2.getName());
                else return o1.getMyDate().compareTo(o2.getMyDate());
            }
        });
        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate myDate;

    public Employee(String name, double sal, MyDate myDate) {
        this.name = name;
        this.sal = sal;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(MyDate o) {
        if (year > o.getYear()) {
            return 1;
        } else if (year == o.getYear()) {
            if (month > o.getMonth()) {
                return 1;
            } else if (month == o.getMonth()) {
                if (day > o.getDay()) {
                    return 1;
                } else if (day == o.getDay()) {
                    return 0;
                } else {
                    return -1;
                }
            } else return -1;
        } else return -1;
    }
}



















