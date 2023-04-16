package com.test01.listDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        provideInfo(sc, list);
        for (int i = 0; i < 2; i++) {
            provideInfo(sc, list);
        }
        System.out.println(list);
        ArrayList<Student> stu2 = filterArr(list);
        System.out.println(stu2);
    }

    private static ArrayList filterArr(ArrayList<Student> list) {
        ArrayList<Student> dfliter = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (18 == list.get(i).getAge()) {
                dfliter.add(list.get(i));
            }
        }
        return dfliter;

    }

    private static void provideInfo(Scanner sc, ArrayList<Student> list) {
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        Student stu = new Student(name, age);
        list.add(stu);
    }
}
