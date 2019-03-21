package com.itheima.homeworkdingjiaxi.Test05;
/*
2.定义一个Person类,包含如下属性
			姓名name
			年龄age
		生成所有成员变量set/get方法,空参构造和有参构造
		定义一个玩手机行为 palyPhone(Phone p) 要求打印:"YYY岁的XXX正在玩手机,手机品牌是ZZZ,价格为QQQ

		PS：YYY是Person类中的 age属性值，XXX是Person 类中的 name属性值，ZZZ是Phone 类中的 brand属性值,QQQ是Phone 类中的 price属性值"
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

    public void palyPhone(Phone p){
        System.out.println(age+"的"+name+"正在玩手机,手机品牌是"+p.getBrand()+",价格为"+p.getPrice());
    }
}
