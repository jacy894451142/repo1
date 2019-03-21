package com.itheima;

public class Father {
    //为了不让 四葱发现 把钱藏起来
    private double money = 1000000;//10

    //找妈妈
    public double getMoney(){
        return money;
    }

    public void setMoney(int m){//10
        money = m;
    }

    public void show(){
        System.out.println(money);//10
    }
}
