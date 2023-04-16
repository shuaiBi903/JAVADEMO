package com.test01.guanLi;

public class xueShengClass {
   private String name;
   private int age;
   private int id;
   private String shengRi;

    public xueShengClass() {
    }

    public xueShengClass(String name, int age, int id, String shengRi) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.shengRi = shengRi;
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
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return shengRi
     */
    public String getShengRi() {
        return shengRi;
    }

    /**
     * 设置
     * @param shengRi
     */
    public void setShengRi(String shengRi) {
        this.shengRi = shengRi;
    }

    public String toString() {
        return "xueShengClass{name = " + name + ", age = " + age + ", id = " + id + ", shengRi = " + shengRi + "}";
    }
}
