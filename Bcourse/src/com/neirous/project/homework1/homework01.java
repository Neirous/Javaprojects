package com.neirous.project.homework1;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
@SuppressWarnings("all")
public class homework01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);
    }

}


