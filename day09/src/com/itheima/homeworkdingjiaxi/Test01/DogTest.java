package com.itheima.homeworkdingjiaxi.Test01;
/*
3.定义测试类DogTest, 创建Dog的对象,依次调用eat(),run(),sleep(),cry()方法,打印出如下语句
			狗要吃那啥
			狗跑的如脱缰的野狗
			要睡觉
			狗会汪汪叫
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
        dog.sleep();
        dog.cry();
    }
}
