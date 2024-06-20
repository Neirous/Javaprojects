package com.neirous.project.homework1;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class CellPhone implements Computer{
    @Override
    public double work(double n1, double n2) {
        return n1 + n2;
    }

    public void testWork(Computer computer,double n1,double n2){
        double reasult = computer.work(n1,n2);
    }
}
