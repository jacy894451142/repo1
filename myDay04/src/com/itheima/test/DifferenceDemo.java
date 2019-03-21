package com.itheima.test;
//打印 10次HelloWorld


/*
    for循环  和  while循环/do..while循环的区别:
        for循环声明上定义的变量只能在for循环的大括号内有效,出了循环就不能使用了
        而while循环和do..while循环的初始化语句定义的变量循环结束了还可以继续使用!!

    do..while循环  和 for/while循环的区别:
        do..while循序无论如何都会执行一次循环体语句!! 而我们for/while循环必须满足条件才能执行循环体语句
 */
public class DifferenceDemo {
    public static void main(String[] args) {
        //for
        for (int i = 0; i > 10; i++) {//for循环声明上定义的变量只能在for循环的大括号内有效
            System.out.println("HelloWorld" + i);
        }
        //System.out.println("i:"+i);
        System.out.println("--------------------------------");
        //while
        int x = 0;
        while(x > 10){
            System.out.println("HelloWorld");
            x++;
        }
        System.out.println("x = " + x);
        System.out.println("--------------------------------");
        //do..while
        int y = 0;
        do{
            System.out.println("HelloWorld");
            y++;
        }while(y > 10);
        System.out.println("y = " + y);
    }
}
