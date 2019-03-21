package com.itheima.test;
/*
    tips:
        for循环的标准死循环:
            for(;;){
                循环体语句;
            }


    10次for循环: 10.fori -->正序   10.forr -->倒序

    求1-100之间的偶数和
        分析:
            1. 1-100之间的数  --> for循环
            2. 求和变量  --> int sum = 0
           3.如何求偶数  能被2整除的是 偶数       i % 2 == 0 若满足条件就是偶数
           4.如何求奇数  不能被2整除的是 奇数       i % 2 == 1 或者 i % 2 != 0 若满足条件就是奇数
 */
public class ForTest1 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                //若满足条件再相加~
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
