package com.itheima.test;
/*
    do..while循环  --> 基本不用!
        格式:
            初始化语句;
            do{
                循环体语句;
                控制条件语句;
            }while(判断条件语句);
        执行流程:
            1.执行初始化语句
            2.执行循环体语句
            3.执行控制条件语句
            4.执行判断条件语句
                   若结果是true 从第二步开始重复执行
                   若结果是false 结束循环

           do..while能做的, for和while是一定能做的!!

        循环的优先级:
          for >  while > do..while
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        //求1-100之间的和
        int x = 1;//初始化语句
        //求和变量
        int sum = 0;
        do {
            //循环体语句
            sum += x;
            //控制条件语句
            x++;
        }while (x <= 100);//判断条件语句

        System.out.println("sum = " + sum);
    }
}
