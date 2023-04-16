package com.test01.stringMethod;

public class subString {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = str.substring(0, 5);
        System.out.println(str1);
        String str2 = str.substring(8);
        System.out.println(str2);

        phoneNum phoneNum = new phoneNum();
        phoneNum.setPhoneNum("17631220086");
        System.out.println(phoneNum.getPhoneNum());
        String str3 = "192,168,1,1";
        String[] split = str3.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        String str4 = "1234";
        int i = Integer.parseInt(str4);
        String str5 = "3.14";
        double v1 = 3.14;
        String v2 = String.valueOf(v1);
        double v = Double.parseDouble(str5);
        System.out.println(i);
        System.out.println(v);
        System.out.println(v2.equals(str5));
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        sb.append("Java");
        System.out.println(sb);
        sb.insert(5, "insert");
        System.out.println(sb);
        sb.delete(5, 11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        sb.replace(0, 1, "H");
        System.out.println(sb);
        String str6 = sb.toString();
        System.out.println(str6);
        System.out.println(str6.equals(sb));//false
        System.out.println(str6.equals(sb.toString()));//true
    }
}
