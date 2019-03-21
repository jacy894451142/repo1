package com.itheima.test;
/*
    while循环的格式
        初始化语句;
        while(判断条件语句){
            循环体语句;
            控制条件语句;
        }
    执行流程: 和for循环的执行流程一模一样
            1.执行初始化语句
            2.执行判断条件语句
                若判断条件语句的结果是 false, 直接结束循环!
                若判断条件语句的结果是 true, 执行循环体语句!
            3.执行控制条件语句
            4.从第2步骤开始 循环执行


        while循环能做的  for都能做!

        while循环在哪里用的多呢?
            1.死循环
                while(true){循环体语句}
            2. 迭代器  Iterator  /ListIterator  ->使用迭代器遍历集合的时候使用while循环
            3. IO流  读写使用while循环

 */
public class WhileDemo {
    public static void main(String[] args) {
        //求1-100之间的和
        int x = 1;  //初始化语句
        //定义求和变量
        int sum = 0;
        while(x <= 100){//判断条件语句
            //循环体语句
            sum += x;
            //控制条件语句
            x++;
        }
        System.out.println("sum = " + sum);
        System.out.println("-----------------------------");
        while (true){
            System.out.println("Hello");
        }

       // System.out.println("World");
    }
}
