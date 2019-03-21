package com.itcast;
/*
    int num = 100;
    int a
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int num = Integer.valueOf(100);
        int a = num;


        int[] arr = new int[3];
       //给数组中的元素赋值
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println("arr = " + arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //????
        int[] arr1 = arr;
        //输出数组名
        System.out.println("arr = " + arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("arr1 = " + arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
