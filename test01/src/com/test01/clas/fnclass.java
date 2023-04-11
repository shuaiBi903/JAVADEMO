package com.test01.clas;

public class fnclass {
    String username;
    int age;

    public void eat(int age) {
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(this.username);
        age++;
        if (age < 20) {
            eat(age);
        }
    }
}
