package com.xueXi.test;

public class Student extends parent{
    public Student() {
    }

    public Student(String name, int age, String sex, double score) {
        super(name, age, sex);
        this.score = score;
    }
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void study(){
        System.out.println(super.getName()+"学生在学习"+"成绩"+this.score);
    }
}
