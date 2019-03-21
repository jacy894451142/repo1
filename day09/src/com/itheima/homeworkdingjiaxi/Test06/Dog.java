package com.itheima.homeworkdingjiaxi.Test06;
/*
	2.定义类Dog,继承Animal类，要求如下：
		包含空参、满参构造
		实现抽象方法:
			void info(), 打印出"动物名称为xxx,属于yyy类的动物"  xxx代表动物的名称  yyy代表动物种类
        定义私有方法：
			void sleep(), 打印出"xxx晚上很有精神,绝不睡觉,专心拆家!"  xxx代表动物的名称
		定义私有方法：
			void cry(), 打印出"嘴炮我最强,吵架没输过,打架没赢过"
		定义方法:
			void hobby(), 在方法内依次调用 sleep()方法 和 cry()方法
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String kind, String name) {
        super(kind, name);
    }

    @Override
    public void info() {
        System.out.println("动物名称为"+getName()+",属于"+getKind()+"类的动物");
    }

    private void sleep(){
        System.out.println(getName()+"晚上很有精神,绝不睡觉,专心拆家!");
    }

    private void cry(){
        System.out.println("嘴炮我最强,吵架没输过,打架没赢过");
    }

    public void hobby(){
        sleep();
        cry();
    }
}
