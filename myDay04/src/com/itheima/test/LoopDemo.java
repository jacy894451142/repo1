package com.itheima.test;
/*
    如何快速的进行单行注释:  ctrl+/  取消单行注释: ctrl+/
    如何快速的进行多行注释:  ctrl+shift+/  取消多行注释:  ctrl+shift+/
    文本注释
 */
public class LoopDemo {
    /**
     * 文本注释  --> 后期帮我们自动生成 API文档
     * @param args  -->方法的参数
     * @since 1998
     * @version 1.0
     * @author 作者
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0){//3 6 9
                //在这里填写代码   2次 7次 13次
                //break;
                //continue;
                System.out.println("Hello");
            }
            System.out.println("Hello");
        }
        System.out.println("================================");
        //for循环的死法
//        for (;;){
//
//        }

        //while循环的死法  --> 死循环标准格式
        while(true){

        }
    }
}
