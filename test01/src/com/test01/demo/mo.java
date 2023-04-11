package com.test01.demo;

import java.util.Scanner;

public class mo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数值");
        int num = sc.nextInt();
        //求千位
        int qian = num / 1000 % 10;
        //求百位
        int bai = num % 1000 / 100;
        //求十位
        int shi = num % 100 / 10;
        //求个位
        int ge = num % 10;
        System.out.println("千位：" + qian);
        System.out.println("百位：" + bai);
        System.out.println("十位：" + shi);
        System.out.println("个位：" + ge);
        String str = "千位：" + qian + "百位：" + bai + "十位：" + shi + "个位：" + ge;
        System.out.println(str);
    }
}
