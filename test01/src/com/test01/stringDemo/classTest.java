package com.test01.stringDemo;

import java.util.Scanner;

public class classTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sqlUsername = "admin";
        String sqlPassword = "123456";
        inDemo(sc);
    }

    private static void inDemo(Scanner sc) {
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (username.equals("admin") && password.equals("123456")) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败！");
                if (i < 2) {
                    System.out.println("你还有" + (3 - i) + "次机会！");
                } else {
                    System.out.println("你的机会已用完！");
                }
            }
        }
    }
}
