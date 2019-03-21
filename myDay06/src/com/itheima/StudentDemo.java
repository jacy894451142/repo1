package com.itheima;
/*
    取值 用 getXxxx方法
    设置 用 setXxxx方法
 */
public class StudentDemo {
    public static void main(String[] args) {

        //创建对象
        Student stu = new Student();
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        //给学生姓名赋值
        //stu.name = "张拉拉";
        stu.setName("张拉拉");
        //给学生年龄赋值
        //stu.age = 18;
        stu.setAge(18);
        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        Student stu1 = new Student();
        stu1.setName("张浩瀚");

    }
}
