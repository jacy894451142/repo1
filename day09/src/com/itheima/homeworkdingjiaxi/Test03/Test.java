package com.itheima.homeworkdingjiaxi.Test03;
/*
	3.在测试类中,创建并初始化一个Student 对象 s, 调用printStudent()方法,打印出如下语句:
		我叫卡特琳娜,我今年19岁,我现在的学校是:战争学院
		我是山顶洞人
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student("卡特琳娜",19,"战争学院");
        s.printStudent();
    }
}
