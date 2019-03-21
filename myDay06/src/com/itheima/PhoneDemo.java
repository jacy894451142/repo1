package com.itheima;

public class PhoneDemo {
    //并使用
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //输出对象名
        System.out.println("p = " + p);
        //对象调属性
        System.out.println("品牌:"+p.brand+", 价格:"+p.price+", 颜色:"+p.color);
        //给属性赋值
        p.brand = "锤子";
        p.price = 1999;
        p.color = "棕色";
        //p.size = "01";
        //对象调属性
        System.out.println("品牌:"+p.brand+", 价格:"+p.price+", 颜色:"+p.color);
        //对象调方法
        p.call("迪丽热巴");
        p.sendMessage();
       // p.playGame();
        System.out.println("-----------------------------");
        Phone p1 = new Phone();
        System.out.println("p1 = " + p1);
        //对象调属性
        System.out.println("品牌:"+p1.brand+", 价格:"+p1.price+", 颜色:"+p1.color);
        //给属性赋值
        p1.brand = "OPPO";
        p1.price = 2999;
        p1.color = "粉色";
        //对象调属性
        System.out.println("品牌:"+p1.brand+", 价格:"+p1.price+", 颜色:"+p1.color);
        //对象调方法
        p1.call("古力娜扎");
        p1.sendMessage();
        System.out.println("-------------------------");
        Phone p2 = p1;//把p1的地址值赋值给了p2
        //对象调属性
        System.out.println("品牌:"+p2.brand+", 价格:"+p2.price+", 颜色:"+p2.color);
    }
}
