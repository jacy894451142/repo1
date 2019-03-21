package com.itheima;

public class ComputerDemo {
    public static void main(String[] args) {
        //若要使用另一个类的内容 必须要创建另一个类的对象
        //格式  类名 对象名 = new 类名();
        Computer com = new Computer();
        System.out.println("com = " + com);//地址值
        //给属性赋值   对象调属性
        com.brand = "联想";
        com.color = "黑色";
        com.price = 6000;
        com.size = "T450";
        System.out.println("品牌:"+com.brand+",颜色:"+com.color+",价格:"+com.price+",型号:"+com.size);
        //对象.方法
        String code = com.code();
        System.out.println(code);
        com.playGame("PUBG");

        Computer com1 = new Computer();
        System.out.println("品牌:"+com1.brand+",颜色:"+com1.color+",价格:"+com1.price+",型号:"+com1.size);

    }
}
