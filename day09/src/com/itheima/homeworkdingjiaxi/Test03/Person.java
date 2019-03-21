package com.itheima.homeworkdingjiaxi.Test03;
/*
	1.定义Person类,包含空参、满参构造和以下成员变量:
			姓名name
			年龄age
		生成所有成员变量set/get方法
		定义方法：void printPerson(),打印出"我是山顶洞人"
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public void printPerson(){
        System.out.println("我是山顶洞人");
    }
}
