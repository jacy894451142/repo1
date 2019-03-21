package com.itheima.homeworkdingjiaxi.Test04;
/*
	1.定义抽象类Phone，要求如下：
		包含空参、满参构造和以下成员变量
			品牌 brand（ String 型）
        生成所有成员变量set/get方法
        定义抽象方法：void playMusic(String s)
 */
public abstract class Phone {
    private String brand;

    public Phone() {
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void playMusic(String s);
}
