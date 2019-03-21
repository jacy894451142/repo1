package com.itheima.homeworkdingjiaxi.Test03;
/*
	2.定义Student继承于Person类,新增如下属性
			学校 school
		生成空参、满参构造和set/get方法
		定义方法:void printStudent(),先输出"我叫XXX,我今年YYY岁,我现在的学校是:ZZZ" 再调用printPerson()方法
 */
public class Student extends Person{
    private String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void printStudent(){
        System.out.println("我叫"+getName()+",我今年"+getAge()+"岁,我现在的学校是:"+school+"");
        printPerson();
    }
}
