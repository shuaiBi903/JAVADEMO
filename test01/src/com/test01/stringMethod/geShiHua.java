package com.test01.stringMethod;

public class geShiHua {
    public static void main(String[] args) {
        String str = "Hello World12312";
        getNum(str);
    }

    private static void getNum(String str) {
        char[] chars = str.toCharArray();
        int xiaoXie = 0;
        int daXie = 0;
        int shuZi = 0;
        for (char aChar : chars) {
            if (aChar >= 'a' && aChar <= 'z') {
                xiaoXie++;
            } else if (aChar >= 'A' && aChar <= 'Z') {
                daXie++;
            } else if (aChar >= '0' && aChar <= '9') {
                shuZi++;
            } else {
                System.out.println("其他字符");
            }
        }
        System.out.println("小写字母有" + xiaoXie + "个");
        System.out.println("大写字母有" + daXie + "个");
        System.out.println("数字有" + shuZi + "个");
    }
}
