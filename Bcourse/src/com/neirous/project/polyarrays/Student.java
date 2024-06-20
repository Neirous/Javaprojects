package com.neirous.project.polyarrays;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "\t" + "成绩：" + getScore();
    }

    //特有方法
    public void study() {
        System.out.println("学生：" + getName() + "正在考试");
    }
}
