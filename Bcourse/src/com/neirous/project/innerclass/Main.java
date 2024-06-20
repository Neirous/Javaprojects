package com.neirous.project.innerclass;

public class Main {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("qichuangle");
            }
        });
    }
}

interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
