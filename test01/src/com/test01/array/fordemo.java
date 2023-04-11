package com.test01.array;

import java.util.Scanner;

public class fordemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = getArr(sc);
        int sun = getSum(arr);
        System.out.println("和为" + sun);
        System.out.println("平均数" + sun / 6);
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    private static int[] getArr(Scanner sc) {
        int[] arr = new int[6];
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+i+"位评分:");
            int num = sc.nextInt();
            if (num > 0 && num <= 100) {
                arr[i] = num;
                i++;
            } else {
                System.out.println("输入不正确");
            }
        }
        return arr;
    }
}
