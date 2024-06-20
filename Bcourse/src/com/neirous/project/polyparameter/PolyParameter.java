package com.neirous.project.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Manager tom = new Manager("tom", 2500,250);
        PolyParameter polyParameter = new PolyParameter();
        System.out.println(polyParameter.showEmpAnnual(tom));
        System.out.println(polyParameter.showSpecial(tom));
    }

    public double showEmpAnnual(Employee e) {
        return e.getAnnual();
    }

    public String showSpecial(Employee e) {
        if (e instanceof Manager) {
            return ((Manager) e).manage();
        } else if (e instanceof Worker) {
            return ((Worker) e).work();
        } else {
            return "类型有误，请自行检查！！！";
        }
    }
}





