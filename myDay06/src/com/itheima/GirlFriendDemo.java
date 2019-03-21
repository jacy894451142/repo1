package com.itheima;
/*
    测试类写main方法
    十五字讲解面向对象:
		服务员点单
		万物皆对象
		对象调方法/对象调属性   调: .
 */
public class GirlFriendDemo {
    public static void main(String[] args) {
        //在测试类中的main方法里 创建对象
        //创建对象的格式 :  类名 对象名 = new 类名();
        /*
            1.创建了一个该类事物的对象
            2.new 是在堆内存中开辟空间
         */
        GirlFriend gf = new GirlFriend();
        //使用女朋友的 姓名属性  gf.name
        System.out.println(gf.name);
        System.out.println(gf.skin);
        System.out.println(gf.look);
        System.out.println(gf.leg);
        //对属性进行赋值
        gf.name = "哈尼";
        gf.skin = "白";
        gf.look = "极品";
        gf.leg = 130;
        System.out.println(gf.name);
        System.out.println(gf.skin);
        System.out.println(gf.look);
        System.out.println(gf.leg);

        GirlFriend gf1 = new GirlFriend();
        //使用女朋友的 姓名属性  gf.name
        System.out.println(gf1.name);//null
        System.out.println(gf1.skin);//null
        System.out.println(gf1.look);//null
        System.out.println(gf1.leg);//0
        //使用女朋友的 吃饭方法  gf.eat()
    }
}
