package com.itheima.homeworkdingjiaxi.Test02;
/*
	3.定义测试类IPhoneTest, 创建IPhone的对象,调用方法,打印出如下语句
			打电话
			发彩信
			打王者农药
			人工智障
 */
public class IPhoneTest {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.call();
        iPhone.sendMessage();
        iPhone.playGame();
        iPhone.siri();
    }
}
