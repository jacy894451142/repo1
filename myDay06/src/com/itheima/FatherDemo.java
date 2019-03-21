package com.itheima;

public class FatherDemo {
    public static void main(String[] args) {
        Father 建林 = new Father();
        //看一个对象的属性值 建林.money
        //System.out.println(建林.money);
        //四葱  偷他爹的钱用  -->  重新给money赋值
        //建林.money = 400000;//花了600000
        //System.out.println(建林.money);

        //四葱想到 告状 找妈妈!!
        double money = 建林.getMoney();
        System.out.println(money);
        //用钱
        建林.setMoney(10);
        double lastMoney = 建林.getMoney();
        System.out.println(lastMoney);

        建林.show();

        Father f = new Father();
        f.show();
    }
}
