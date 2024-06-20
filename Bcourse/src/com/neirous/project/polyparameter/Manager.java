package com.neirous.project.polyparameter;

public class Manager extends Employee{
    private double Bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        Bonus = bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }
    public String manage(){
        return "经理：" + getName() + "is managing";
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }
}
