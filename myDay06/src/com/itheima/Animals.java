package com.itheima;
/*
    写一个标准的JAVABEAN 事物描述类
        步骤
            1.私有成员变量
            2.提供无参构造方法
            3.提供全参构造方法
            4.提供getters and setters 方法
            //行为是选择性的提供
 */
public class Animals {
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food){
        String name = "张三";
        //this的作用:打破局部位置的约束,强制去访问成员位置上的变量
        //this照镜子原则 谁调用 this就是谁!!
        System.out.println(this.name+"正在吃:"+food);
    }
}
