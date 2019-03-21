package com.itcast;

public class ArrayDemo2 {
    public static void main(String[] args) {

         int[] arr = new int[3];

        //输出数组名
        System.out.println("arr = " + arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0] = 100;
        arr[2] = 200;
        System.out.println("arr = " + arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int[] arr1 = new int[2];
        //输出数组名
        System.out.println("arr1 = " + arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        arr1[1] = 333;
        System.out.println("arr1 = " + arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
    }
}
