package com.itheima;
/*
        1.确定方法名  --> usePhone
        2.确定方法的形式参数
            个数,类型,顺序
        3.选择适当的调用方式
            有返回值方法 --> 直接,赋值,输出
            无返回值方法 --> 直接
 */
public class PhoneDemo2 {
    public static void main(String[] args) {
        //见名知意
        //调用方法
        Phone phone = getPhone();//0x001
        //Phone phone =
        System.out.println("phone = " + phone);
        System.out.println(phone.brand + phone.color + phone.price);
        Phone phone1 = getPhone();//
        System.out.println("phone1 = " + phone1);
        System.out.println(phone1.brand + phone1.color + phone1.price);




    }

    //把引用数据类型作为方法的返回值类型  --> 返回值类型决定了方法的结果的数据类型,也决定了方法的调用方式!!
    public static Phone getPhone(){ //Phone 接收 p
        //创建一个具体的手机对象
        Phone p = new Phone();//0x001
        //可以给phone 属性赋值嘛?
        p.brand = "1plus";
        p.color = "黑色";
        p.price = 2000;


      // p.call("玛尔扎哈");
//        p.sendMessage();
        return p;//0x001
    }

    public static int sum(){
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum +=i;
        }
        return sum;
    }
}
