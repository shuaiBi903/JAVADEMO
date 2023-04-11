package com.test01.array;

import java.util.Random;

public class svg {
    public static void main(String[] args) {
        int[] arr = getArr();
        int maxArr = getMax(arr);
        System.out.println("maxArr=" + maxArr);
        //玛卡巴卡
        System.out.println("玛卡巴卡");
    }

    private static int getMax(int[] arr) {
        int max = 0;
        for (int item : arr) {
            System.out.println("item=" + item);
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private static int[] getArr() {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }
}
