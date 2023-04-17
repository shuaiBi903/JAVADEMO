package com.test01.guanLi;

import java.util.ArrayList;
import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        ArrayList<xueShengClass> infoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        out:
        while (true) {
            System.out.println("选择你的操作:1查询,2删除,3修改,4增加,5查看所有,6退出");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    chaXun(infoList);
                    break;
                case 2:
                    del(infoList);
                    break;
                case 3:
                    xiugai(infoList);
                    break;
                case 4:
                    infoList.add(luRu(infoList));
                    break;
                case 5:
                    chaKanAll(infoList);
                    break;
                case 6:
                    System.out.println("感谢使用");
                    break out;
                default:
                    System.out.println("输入有误请重新输入");
                    break;
            }
        }
    }

    private static void del(ArrayList<xueShengClass> infoList) {
        if (infoList.size()==0){
            System.out.println("暂无信息");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = sc.next();
       int index = idIndex(id,infoList);
       if (index==-1){
           System.out.println("不存在");
       }else {
           infoList.remove(index);
           System.out.println("删除成功");
       }



    }

    private static void chaKanAll(ArrayList<xueShengClass> infoList) {
        if (infoList.size()==0){
            System.out.println("暂无信息");
            return;
        }
        for (xueShengClass item : infoList){
            System.out.println(item);
        }
    }

    private static void xiugai(ArrayList<xueShengClass> infoList) {
        if (infoList.size() == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的的学生学号：");
        String id = sc.next();
        int index = idIndex(id, infoList);
        if (index == -1) {
            System.out.println("学生信息不存在");
        } else {
            infoList.set(index, luRu(infoList));
        }

    }

    private static void chaXun(ArrayList<xueShengClass> infoList) {
        if (infoList.size()==0){
            System.out.println("无信息");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请要查询学生的学生学号：");
        String id = sc.next();
        int index = idIndex(id, infoList);
        if (index == -1) {
            System.out.println("学生信息不存在");
        } else {
            System.out.println(infoList.get(index));
        }
    }

    private static xueShengClass luRu(ArrayList<xueShengClass> infoList) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号：");
            id = sc.next();
            if (idIndex(id, infoList) != -1) {
                System.out.println("学生信息已存在,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生生日：");
        String shengRi = sc.next();
        return new xueShengClass(name, age, id, shengRi);
    }

   //获取index
    private static int idIndex(String id, ArrayList<xueShengClass> infoList) {
        for (int index = 0; index < infoList.size(); index++) {
            xueShengClass item = infoList.get(index);
            if (id.equals(item.getId())) {
                return index;
            }
        }
        return -1;
    }
}
