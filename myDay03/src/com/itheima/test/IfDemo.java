package com.itheima.test;

public class IfDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result;
        //if判断
        //IDEA蠢  有if就有false
        if(a > b){//false
            result = a;
        }
        if(a < b){//false
            result = b;
        }else{//false
            result = b;
        }
        //变量未赋值不能直接使用
        System.out.println("result = " + result);
    }
}
