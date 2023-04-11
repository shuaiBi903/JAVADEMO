package com.test01.demo2;

import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            default:
                System.out.println("a=other");
                break;
        }
    }
}
