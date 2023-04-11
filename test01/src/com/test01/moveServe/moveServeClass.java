package com.test01.moveServe;

import com.test01.demotest.moveClass;

import java.util.Scanner;

public class moveServeClass {
    private final moveClass[] moves;

    public moveServeClass(moveClass[] moves) {
        this.moves = moves;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        out:
        while (true) {
            System.out.println("请输入您的选择");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("全部信息");
                    queryMoveSAll();
                    break;
                case 2:
                    System.out.println("请输入id");
                    int id = sc.nextInt();
                    selIdMove(id);
                    break;
                case 3:
                    System.out.println("退出成功");
                    break out;
                default:
                    System.out.println("输入有误");
            }
        }

    }

    /*
     *   根据id查询电影信息
     */
    private void selIdMove(int option) {
        for (moveClass item : moves) {
            if (item.getId() == option) {
                System.out.println("id:" + item.getId() + "\t" + "title:" + item.getTitle() + "\t" + "time:" + item.getTime() + "\t" + "area:" + item.getArea() + "\t" + "type:" + item.getType() + "\t" + "director:" + item.getDirector() + "\t" + "starring:" + item.getStarring() + "\t");
                return;
            }
        }
        System.out.println("没有该电影");
    }

    /*
     *  查询全部电影信息
     */
    private void queryMoveSAll() {
        for (moveClass item : moves) {
            System.out.println("id:" + item.getId() + "\t" + "title:" + item.getTitle() + "\t" + "time:" + item.getTime() + "\t" + "area:" + item.getArea() + "\t" + "type:" + item.getType() + "\t" + "director:" + item.getDirector() + "\t" + "starring:" + item.getStarring() + "\t");
        }

    }
}
