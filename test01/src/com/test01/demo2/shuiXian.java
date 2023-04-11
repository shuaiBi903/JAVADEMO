package com.test01.demo2;

public class shuiXian {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            shuiXianHua(i);
        }
    }

    public static void shuiXianHua(int a) {
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        if (a == b * b * b + c * c * c + d * d * d) {
            System.out.println(a);
        }
    }
}
