package com.itheima.test;

/*
    根据月份输出相应的季节

        显示控制台: alt+4
        显示模块区域: alt+1

       case穿透的问题:  有弊有利!  绝大多数情况 弊大于利!!
            当执行case中的语句体时,没有遇见break,那么会出现 case穿透, 穿透到下一个case中去执行下一个case中的语句体
                直到遇见了break,结束switch的反括号就结束switch语句;

 */
public class SwitchDemo {
    public static void main(String[] args) {
        //定义一个月份
        int month = 3;
        //month.switch
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("您输入的月份" + month + "是冬季!");
                break;
            case 3://3
            case 4:
            case 5:
                System.out.println("您输入的月份" + month + "是春季!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("您输入的月份" + month + "是夏季!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("您输入的月份" + month + "是秋季!");
                break;
            default:
                System.out.println("您怕是石乐志~");
                break;
        }



    }
}
