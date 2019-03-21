package com.itheima.homeworkdingjiaxi.Test05;
/*
	3.在测试类TestDemo中
		3.1创建Phone对象p,品牌为小米,价格为2999
		3.2创建Person对象ren,调用ren的 palyPhone(Phone p) 方法将p传入,打印出
			"40岁的罗永浩正在玩手机,手机品牌是小米,价格为2999"
 */
public class TestDemo {
    public static void main(String[] args) {
        Phone p = new Phone("小米",2999);

        Person ren = new Person("罗永浩",40);
        ren.palyPhone(p);
    }
}
