package com.itheima;

public class AnimalsDemo {
    public static void main(String[] args) {
        //创建对象
        Animals a = new Animals();
        a.setName("老虎");
        a.setAge(20);
        System.out.println(a.getName() + "---" + a.getAge());
        a.eat("肉");

        Animals a1 = new Animals("老鼠",5);
        System.out.println(a1.getName() + "---" + a1.getAge());
        a1.eat("垃圾~");
    }
}
