package com.itheima;
/*
    调用方法的步骤:
        1.确定方法名  --> usePhone
        2.确定方法的形式参数
            个数,类型,顺序
        3.选择适当的调用方式
            有返回值方法 --> 直接,赋值,输出
            无返回值方法 --> 直接

        当方法的形参是一个引用数据类型时,调用方法传入的实参传递的其实是实参的地址值!!
 */
public class PhoneDemo1 {
    public static void main(String[] args) {
        //创建一个Phone对象
        Phone pp = new Phone();
        System.out.println("pp = " + pp);//地址值
        //调用方法
        usePhone(pp);//缺什么 给什么
    }
    //使用对象类型作为方法的参数
    public static void usePhone(Phone p){//Phone p = pp;
        System.out.println("p = " + p); //地址值
        //对象调属性
        System.out.println("品牌:"+p.brand+", 价格:"+p.price+", 颜色:"+p.color);
        //给属性赋值
        p.brand = "锤子";
        p.price = 1999;
        p.color = "棕色";
        //p.size = "01";
        //对象调属性
        System.out.println("品牌:"+p.brand+", 价格:"+p.price+", 颜色:"+p.color);
        //对象调方法
        p.call("迪丽热巴");
        p.sendMessage();
    }
}
