package com.test01.demo;

public class info {
    public static void main(String[] args){
        String user = "张三";
        byte age = 18;
        int stature = 180;
        char sex = '男';
        String address = "北京市";
        long phone = 12345678901L;
        boolean isMarried = false;
        System.out.println("姓名：" + user);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + stature);
        System.out.println("性别: "+sex);
        System.out.println("地址：" + address);
        System.out.println("电话：" + phone);
        System.out.println("婚否：" + isMarried);
        System.out.print("姓名：%T" + user );
    }
}
