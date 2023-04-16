package com.test01.guanLi;

import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        luRu();
    }

    private static void luRu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入学生学号：");
            int id = sc.nextInt();
            System.out.println("请输入学生生日：");
            String shengRi = sc.next();
            xueShengClass info = new xueShengClass(name, age, id, shengRi);
        }
    }
}
