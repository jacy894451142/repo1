package com.itheima;
/*
    自己去描述一个事物 (Car)  这个事物属性 要求有 10个  全部私有修饰  一键生成 getter 和 setter
 */
public class Teacher {//Javabean
    //属性
    private String name;
    private int age;
    private String gender;
    private String habit;
    private int height;
    private int weight;
    //快捷键!!!  一键生成!! get 和  set方法
    //alt + insert + getter and setter

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
