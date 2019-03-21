package com.itheima;
/*
    tips:
        1.当一个类中没有任何构造方法的时候,系统默认提供一个无参构造供你使用
        2.当你定义了任意一个构造方法,默认赠送的无参构造方法就没有了
        3.每new一次就是创建一个对象,创建对象必然会调用相应的构造方法
        4.构造方法也是有方法的重载的!!
            方法重载:
                同一个类中
                方法名相同
                形参不同 个数,顺序,类型
                与返回值无关
        5.构造方法的作用是给成员变量赋值

      构造方法的作用:
        1.提供多种创建对象的方式(一个类中有多少个构造方法,那么这个类
        就有多少种创建对象的方式)
        2.在创建对象的同时给成员变量赋值
        3.在创建对象的同时完成某些功能 --> 明天见

    constructor: 构造方法
    field:成员变量
    method: 成员方法
 */
public class Car {//事物描述类  Car 汽车
    private String brand;
    private String color;

    //alt+insert + constructor

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    //生成get和set方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
