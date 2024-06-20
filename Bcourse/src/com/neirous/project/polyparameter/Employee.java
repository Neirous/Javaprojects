package com.neirous.project.polyparameter;

public class Employee {
    //多态参数：方法定义形参为父类类型，实参类型允许为子类类型
    private String name;
    private double salary;

    public Employee(String name, double salary) {
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

    //得到年工资的方法
    public double getAnnual() {
        return 12 * salary;
    }
}
