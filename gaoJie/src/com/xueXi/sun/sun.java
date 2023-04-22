package com.xueXi.sun;

import com.xueXi.jiChengXIushiFu.parent;

/*
    不同包的子类
 */
class Sun extends parent {

    public void Zi(){
        System.out.println("Sun的空参构造");
    }
    public void Zi(int i){
        System.out.println("Sun的有参构造");
    }
}
