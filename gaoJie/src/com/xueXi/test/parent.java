package com.xueXi.test;

public class parent {
    private String name;
    private int age;
    private String sex;

    public parent() {
    }

    public parent(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "parent{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
