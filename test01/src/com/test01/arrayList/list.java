package com.test01.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");
        for (int i = 0; i < 3; i++) {
            stringArrayList.add(("" + i));
        }
        stringArrayList.add(0,"World");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());
        stringArrayList.remove("0");
        stringArrayList.remove(1);
        System.out.println(stringArrayList);
        String hello = stringArrayList.set(0, "Hello");
        System.out.println(hello);
        System.out.println(stringArrayList);
    }
}
