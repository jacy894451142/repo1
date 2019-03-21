package com.itheima.homeworkdingjiaxi.Test01;
/*
2.定义一个Dog类,继承Animal类,重写eat(),run()方法
		定义自己特有的行为 :
			cry() 打印"狗会汪汪叫"
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗要吃那啥");
    }

    @Override
    public void run() {
        System.out.println("狗跑的如脱缰的野狗");
    }

    public void cry(){
        System.out.println("狗会汪汪叫");
    }
}
