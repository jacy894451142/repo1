package com.itheima.homeworkdingjiaxi.Test06;
/*
	3. 定义测试类,提供main方法
		1.创建一个Dog类对象,名字为二哈,种类为狗子
		2.要求依次调用 info()方法 和 hobby()方法。打印输出如下:
			动物名称为二哈,属于狗子类的动物
			二哈晚上很有精神,绝不睡觉,专心拆家!
			嘴炮我最强,吵架没输过,打架没赢过
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("狗子","二哈");
        dog.info();
        dog.hobby();
    }
}
