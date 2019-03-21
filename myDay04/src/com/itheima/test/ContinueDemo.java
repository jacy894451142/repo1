package com.itheima.test;
/*
    Continue:继续
        what:继续
        where/when: 只能用在循环内  --> 不可以单独使用!!
        why:  跳过某次循环的时候使用
        how: 写在哪里

 */
public class ContinueDemo {
    public static void main(String[] args) {
       // continue;

        for (int i = 0; i < 10; i++) {

            if(i % 3 == 0){ //能被3整除的  0 3 6 9
                continue;//作用: 跳过某次循环,从下一次循环的控制条件语句开始执行
            }

            System.out.println("HelloWorld"+i);
        }
    }
}
