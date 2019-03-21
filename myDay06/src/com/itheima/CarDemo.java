package com.itheima;
/*
    new 的本质:
        1.创建了对象
        2.在堆内存中开辟了空间
        3.调用了相应的构造方法!! --> 提供给创建对象的方法叫构造方法
     构造方法的格式:
        public 类名(){}  --> 无参构造方法
 */
public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getBrand() + "---"+c.getColor());

        Car c1 = new Car("英菲尼迪","赛道灰");
        System.out.println(c1.getBrand() + "---"+c1.getColor());

        //万一我要对c1对象某个属性进行修改呢????
//        Car c2 = new Car("英菲尼迪","法拉利红");
//        System.out.println(c2.getBrand() + "---"+c2.getColor());
        c1.setBrand("破鞋儿");
        System.out.println(c1.getBrand() + "---"+c1.getColor());

    }
}
