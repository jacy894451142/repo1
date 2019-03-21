package com.itcast;
/*
    学习异常的方法:
	        1.知道是什么异常?
	        2.知道如何产生?
	        3.知道如何解决?

    全类名: 包名.类名
        java.lang.ArrayIndexOutOfBoundsException
        com.itcast.ExceptionDemo

    在操作数组的时候出现的小问题:
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	        at com.itcast.ExceptionDemo.main(ExceptionDemo.java:10)
        Exception in thread "main": 异常出现在了主线程
	   ArrayIndexOutOfBoundsException:数组索引超出范围异常   --> 索引越界异常!
	    知道是什么异常? 索引越界异常!
	    产生的原因: 访问了不存在的索引元素
	    如何解决呢： 1.不访问  2.访问正确的索引元素

       5:哪一个索引不存在!! -->异常的信息
        at com.itcast.ExceptionDemo.main(ExceptionDemo.java:10)  --> 定位异常出现的位置


        Exception in thread "main" java.lang.NullPointerException
	            at com.itcast.ExceptionDemo.main(ExceptionDemo.java:34)

        java.lang.NullPointerException: 空指针异常!!   -->新手最容易出的问题
            如何产生的呢?  使用了值为空的引用数据类型的元素访问了内部空间或者调用了方法或调用了属性
            如何解决:
                1.不妨问   2.修改引用数据类型数据的值

         如何说明你精通掌握一个异常??  你能主动的让他报错!!
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //动态初始化数组: 计算机会根据数组的类型给予相应的默认值   String 是 引用数据类型   引用数据类型的元素默认值都是 null
        String[] strArr = new String[5];
        //在String类中有一个方法  把小写字母变成大写字母   up   low
        String str = strArr[1]; //null
        //小写字母变成大写字母
        // 使用了值为空的引用数据类型的元素访问了内部空间或者调用了方法或调用了属性
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
    }
}
