package com.itheima;

public class Computer {//类名随便取   见名知意
    //属性
    String brand;//品牌
    String color;//颜色
    int price;//价格
    String size;//型号
    //行为
    public void playGame(String game){
        System.out.println("正在玩"+game);
    }

    public String code(){
        return "用电脑敲代码";
    }
}
