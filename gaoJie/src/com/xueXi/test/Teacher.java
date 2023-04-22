package com.xueXi.test;

public class Teacher extends parent{
    public Teacher() {
    }

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }
    public void teach(){
        System.out.println(super.getName()+"老师在教书");
    }
}
