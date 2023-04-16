package com.test01.stringMethod;

public class stringMethod {
    public static void main(String[] args) {
        print1();
    }

    private static void print1() {
        String str = "Hello World";
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

