package com.itheima;
/*
    要求:
        大家在定义一个事物描述类的时候,要把所有的成员变量(属性)全部使用 private 修饰

    this:
        this的作用强制访问成员位置上的元素(成员方法,成员变量)
        格式:
            this.属性名 -->强制访问成员位置上的变量
         this可以打破局部约束,强制访问成员位置上的变量!!

     this:本类对象的引用
        本类: 当前类 this在那个类就代表那个类的对象引用
        对象: new Student()
        引用: 对象名

     哪个对象调用方法 那个就是this


 */
public class Student {
    //属性
    private String name;
    private int age;
    //公共访问的方式  --> get 和 set方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        //没有被使用的变量是灰色表示
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    //行为
    public void study(){
        System.out.println("叫:"+name+"的学生在学习!");
    }
}
