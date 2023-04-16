package com.test01.stringbuild;

import java.util.Scanner;

public class build {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        if (str.contentEquals(str1)) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }
    }
}
