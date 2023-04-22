package com.xueXi.test;

public class Test1 {
    /*
        需求:
            老师类:
                属性: 姓名, 年龄, 性别
                行为: 吃饭, 睡觉, 教书
            学生类:
                属性: 姓名, 年龄, 性别
                行为: 吃饭, 睡觉, 学习
     */
    public static void main(String[] args) {
        Teacher t = new Teacher("张三", 30, "男");
        System.out.println(t.getName() + " " + t.getAge() + " " + t.getSex());
        t.teach();

        Student s = new Student("李四", 20, "女", 99.9);
      s.study();

    }
}

