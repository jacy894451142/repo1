package com.itcast;
/*
    求数组元素最值 *
    求数组元素和 *
    反转数组元素  ***
    漂亮的打印数组   --> [1, 2, 3, 4, 5] **
 */
public class ArrayTest {
    public static void main(String[] args) {
        //求数组元素和  --> sum 求和变量
        //有一个数组
        int[] arr = {1,2,3,4,5};
        //求和变量
        int sum = 0;
        //获取数组中所有的元素  --> 遍历数组  -->快捷键 数组名.fori
        for (int i = 0; i < arr.length; i++) {//i是索引
            //拿到元素
            //求和
            sum += arr[i];
        }
        //输出结果
        System.out.println("sum = " + sum);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
