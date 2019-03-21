package com.itheima.test;
/*
    3w1h  --> 教学法
        what
        where/when
        why
        how
    控制执行流程的关键字:
        break  -->  中断意思
        在哪用:1. switch中  2.循环中  -->  脱离了循环和switch break是不能使用的
        break:用于结束switch语句和提前结束循环
        how: 写在哪里就可以


        break一般情况都是和if语句一起用的,当满足什么条件的时候,就结束循环!

        tips:
            当遇到循环的嵌套的时候,break只用于结束在所在那层循环!!不能控制外层循环!!

         手表:
               1分钟  ==   60秒
               1小时  ==   60分钟
 */
public class BreakDemo {
    public static void main(String[] args) {

       // break;

        for (int j = 1; j <= 60; j++) {
            for (int i = 1; i <= 60; i++) {
                System.out.println("过了"+i+"秒钟");
            }
            System.out.println("过了"+j+"分钟");
            break;
        }

    }
}
