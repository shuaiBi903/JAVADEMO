package com.test01.array;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        int[] arr = getArr();
        avgF(arr);
    }

    private static void avgF(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (sum * 1.0) / arr.length;
        System.out.println("sum=" + sum + "avg=" + avg);
    }

    private static int[] getArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
