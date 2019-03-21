package com.itheima.homeworkdingjiaxi.Test06;
/*
	1.定义抽象类Animal，要求如下：
		成员变量:
			种类 kind
			名称 name
		成员方法:
			定义抽象方法：void info();
		包含空参、满参构造和set/get方法

 */
public abstract class Animal {
    private String kind;
    private String name;

    public abstract void info();

    public Animal() {
    }

    public Animal(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
