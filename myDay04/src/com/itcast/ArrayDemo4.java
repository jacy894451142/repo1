package com.itcast;
/*
    数组的初始化:
        动态初始化: 由我们决定数组的长度,由计算机根据数组的类型决定数组元素的默认值;
            格式:  数据类型[] 数组名 = new 数据类型[m];  m:数组的元素个数和数组的长度
        静态初始化: 由我们决定数组的元素值,由计算机自动计算数组的元素个数和数组的长度
            格式:
                数据类型[] 数组名 = {元素1,元素2,元素3.....};

        数组的遍历:
            获取:  数组名[索引]
            循环: for循环
            长度属性: 数组名.length
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        //数据类型[] 数组名 = new 数据类型[m];
        int[] arr = new int[10];
        //数据类型[] 数组名 = {元素1,元素2,元素3.....};
        int[] arr1 = {1,2,3,4,5};

        //数组的遍历:  数组的遍历就是拿到数组中所有的元素值
        //查:  数组名[索引]
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        System.out.println("--------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("--------------------------");
        //数组的属性 属性  属性!!!  长度属性!!    数组名.length
        System.out.println(arr.length);
        System.out.println(arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
