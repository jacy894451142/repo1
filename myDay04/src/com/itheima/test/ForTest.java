package com.itheima.test;
/*
    求1到5之间的和
        分析:
           1.必须有  1  2  3  4  5 之间的数
           2. 依次加起来    算数运算符  +
           3. 逻辑  求和需要求和变量 int sum = 0;

     断点调试: debug调试   bug:虫子
        步骤:
            1.打断点
                怎么打:对着你要打断点的行号位置点一下 (方法内的有效语句)
                在哪打:哪里不会点哪里
            2. debug程序
 */
//main方法是你启动的,但是真正调用它的是 JVM
public class ForTest {
    public static void main(String[] args) {
        System.out.println("1");
        //定义一个求和变量
        int sum = 0;
        System.out.println("2");
        //循环
        for (int x = 1;x <= 5;x++){
           // sum = sum + x;
            /*
                第一次循环:  x = 1  sum = 0 + 1 = 1;
                第二次循环:  x = 2  sum = 1 + 2 = 3;
                第三次循环:  x = 3  sum = 3 + 3 = 6;
                第四次循环:  x = 4  sum = 6 + 4 = 10;
                第五次循环:  x = 5  sum = 10 + 5 = 15;
                第六次循环:  x = 6  但是  6 > 5  关系表达式是false  所以结束循环!
             */
            sum += x;
        }

        System.out.println("sum = " + sum);
    }

}
