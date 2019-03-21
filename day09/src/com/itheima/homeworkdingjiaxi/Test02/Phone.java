package com.itheima.homeworkdingjiaxi.Test02;
/*
1.定义一个Phone抽象类,包含如下方法:
		普通方法: call() 输出:"打电话"
		普通方法: sendMessage() 输出:"发短信"
		抽象方法: playGame();
 */
public abstract class Phone {
    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

    public abstract void playGame();
}
