package com.xueXi.gaoJie;

public class staticXueXi {
    private static String name;
    static int age;

    public static int setNum(int age) {
        staticXueXi.age = age;
        return age * 100;
    }
    private staticXueXi(){}
}
