package com.test01.clas;

public class fnclassTest {
    public static void main(String[] args) {
        //new 一个 fnclass
        fnclass fn = new fnclass();
        fn.username = "张三";
        fn.age = 18;
        //调用 fnclass 的 eat 方法
        fn.eat(10);

    }
}
