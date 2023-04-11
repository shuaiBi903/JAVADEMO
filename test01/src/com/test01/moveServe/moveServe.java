package com.test01.moveServe;

import com.test01.demotest.moveClass;

public class moveServe {
    public static void main(String[] args) {
        moveClass move1 = new moveClass(1, "战狼", "2022", 2.1, "国产", "吴京", "吴晶晶");
        moveClass move2 = new moveClass(2, "回家的诱惑", "2023", 6.0, "日韩", "剥夺野结衣", "野结衣");
        moveClass move3 = new moveClass(3, "色戒", "2001", 9.9, "国产", "梁朝伟", "小泽");
        moveClass[] moves = {move1, move2, move3};
        moveServeClass move = new moveServeClass(moves);
        move.start();
    }
}
