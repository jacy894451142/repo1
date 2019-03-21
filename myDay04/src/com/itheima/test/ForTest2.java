package com.itheima.test;
//折纸问题
//初始化语句:是在定义变量
//判断条件语句: 关系表达式
//控制条件语句: 变量的变化
public class ForTest2 {
    public static void main(String[] args) {
        //定义统计变量
        int count = 0;
        for (double x = 0.0001;x <= 8848;x *= 2){
            //统计循环的次数
            count++;
        }
        System.out.println("count = " + count);
    }
}
