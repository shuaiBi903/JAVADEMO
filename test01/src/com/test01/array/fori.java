package com.test01.array;

import java.util.Scanner;

public class fori {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        revers(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("玛卡巴卡");
    }

    private static void revers(int[] arr) {
        for (int sta = 0, end = arr.length - 1; sta<end; sta++,end--){
            int temp = arr[sta];
            arr[sta] = arr[end];
            arr[end] = temp;
        }
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }
}
