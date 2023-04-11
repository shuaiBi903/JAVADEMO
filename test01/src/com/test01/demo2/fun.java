package com.test01.demo2;

public class fun {
    public static void main(String[] args) {
        int sum = getSum(1, 2);
        System.out.println(sum);
        double sum2 = getSum(1.1, 2.2);
        System.out.println(sum2);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
    public static double getSum(double a, double b) {
        return (a*1000 + b*1000)/1000;
    }

}
