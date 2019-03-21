package com.itcast;
/*
    String name = "谈斌";
    数组:其实就是一个容器!!!  相当于一个盒子可以放很多元素进来
        定义一个  学生的数组  把学生都装进去!!

    学习容器方法  ->数组,集合,数据库
        第一步: 如何创建这个容器
        第二步: crud  -->增删改查四类方法
        第三步: 遍历容器  --> 遍历:拿到容器中每一个元素!

    数组的特点:
        1.数组一旦被定义长度不能发生改变!   -->缺点   数组被取代的原因!! --> 集合
        2.数组中的元素类型必须一致!!
        3.数组可以存储基本数据类型的元素也可以存储引用数据类型的元素!!  --> 什么都能存!!  -->优点
    数组分为:
        一维数组   一包烟
        二维数组  二维数组如何定义  一条烟

     第一步: 如何创建这个容器
        格式:
            动态初始化: 由我们决定数组的长度(元素的个数),由计算机根据数组的类型给予数组元素相应的默认值
                数据类型[] 数组名 = new 数据类型[m];  m:代表是数组中元素的个数或者说 数组的长度
                数据类型 数组名[] = new 数据类型[m];  --> 不要用

                int[] arr = new int[10];
                int arr[] = new int[10];
        格式解释:
            数据类型: 代表的是数组中存储的元素的数据类型
            []:代表的是一维数组  [][]:代表的是二维数组
            数组名: 帮助我们使用,找到数组  -->跟变量的命名规范一致
            =: 赋值运算符
            new: 创建对象/在内存中开辟空间的
            m:代表是数组中元素的个数   或者说 数组的长度

       [I@7c30a502:
         [:代表的是这个数据是一个一维数组
         I:代表的是int类型的数组
         @:没意思  --> 分隔符
        7c30a502:16进制的地址值(在内存中的地址值) --> 引用数据类型的数据在内存中是有地址!

      如何访问到数组中的元素呢??  ---> 数组元素有索引!! 索引从0开始,最大索引数是m-1

     第二步:
        增:没有增的方法,若要对数组元素个数+1 必须创建新的数组
        删:没有删的方法, 数组一旦被定义长度不能发生改变!
        改:
            修改数组中的元素:  数组名[索引] = 初始化值;
        查:
            获取数组中的元素:    数组名[索引]


    动态初始化: 由我们决定数组的长度(元素的个数),由计算机根据数组的类型给予数组元素相应的默认值
        整数: 0
        浮点数: 0.0
        字符: '\u0000' -->空字符
        布尔: false
        所有的引用数据类型的数组默认值都是  --> null
 */
public class ArrayDemo {
    //成员变量/全局变量
    //int num = 10;

    public static void main(String[] args) {
        //定义一个int类型的数组
        int[] arr = new int[5];
        //输出数组名
        System.out.println("arr = " + arr);//arr = [I@50cbc42f
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0
        System.out.println(arr[3]);//0
        System.out.println(arr[4]);//0

        //数组名[索引] = 初始化值;
        arr[0] = 10;
        arr[3] = 20;
        arr[4] = 30;
        System.out.println("arr = " + arr);//arr = [I@50cbc42f
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0
        System.out.println(arr[3]);//0
        System.out.println(arr[4]);//0
    }
}
