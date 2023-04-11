package com.test01.demo;

import java.util.Scanner;
public class scannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入二狗的身高");
        double height = sc.nextDouble();
        System.out.println("请输入年龄");
        byte age = sc.nextByte();
        System.out.println("请输入性别");
        String sex = sc.next();
        System.out.println("身高：" + height+"年龄"+age+"性别"+sex);

    }
}
