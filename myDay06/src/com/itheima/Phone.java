package com.itheima;
//描述一类事物
public class Phone { //事物描述类  -->  JavaBean
    //品牌
    String brand;
    //价格
    int price;
    //颜色
    String color;
    //行为
    public void call(String name){
        System.out.println("给"+name+"打电话~");
    }
    public void sendMessage(){
        System.out.println("群发短信~");
    }
}
