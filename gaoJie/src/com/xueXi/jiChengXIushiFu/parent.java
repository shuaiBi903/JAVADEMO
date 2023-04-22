package com.xueXi.jiChengXIushiFu;

import sun.security.provider.Sun;

public class parent {
    public static void main(String[] args) {
        System.out.println("parent");
        Zi zi = new Zi();
        System.out.println("------------");
        Zi zi1 = new Zi(10);
    }
}
class Fu {
    public Fu (){
        System.out.println("Fu的空参构造");
    }
    public Fu (int i){
        System.out.println("Fu的有参构造");
    }
}

class Zi extends Fu{

    public Zi(){
        System.out.println("Zi的空参构造");
    }
    public Zi(int i){
        System.out.println("Zi的有参构造");
    }
}


