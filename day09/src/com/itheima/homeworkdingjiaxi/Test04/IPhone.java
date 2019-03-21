package com.itheima.homeworkdingjiaxi.Test04;
/*
	2.定义类IPhone，要求如下：
		继承抽象类 Phone
			构造方法包括：空参构造和满参构造方法
			重写抽象方法：
			void playMusic(String s)，要求：输出打印"XXX手机正在播放歌曲:s"
			PS：XXX是Phone类中的 brand属性值，s是传入的参数
 */
public class IPhone extends Phone {
    @Override
    public void playMusic(String s) {
        System.out.println(getBrand()+"手机正在播放歌曲:"+s+"");
    }

    public IPhone() {
    }

    public IPhone(String brand) {
        super(brand);
    }
}
