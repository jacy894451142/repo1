package com.itheima.homeworkdingjiaxi.Test05;
/*
1.定义一个Phone类.包含如下属性
			品牌brand
			价格price
		生成所有成员变量set/get方法,空参构造和有参构造
 */
public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
