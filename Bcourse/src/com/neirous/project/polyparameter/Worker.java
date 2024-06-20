package com.neirous.project.polyparameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public String work(){
        return "普通员工：" + getName() + "is working";
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
