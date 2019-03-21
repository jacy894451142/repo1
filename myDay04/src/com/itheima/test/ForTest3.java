package com.itheima.test;
/*
    打印所有的水仙花数,并统计水仙花数的个数,并求所有水仙花数的和

    水仙花数:这是一个三位数,三位数的个十百位的立方和等于这个数本身
        153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3  =1+125+27 = 153

         分析:
            三位数  -->  告诉了我们数的范围   [100,999]
            求一个数的个十百位   %
            个位  123 % 10 = 3
            十位  123 / 10 % 10 = 2
            百位  123 / 10 / 10 % 10 = 1
 */
public class ForTest3 {
    public static void main(String[] args) {
        //定义一个统计变量
        int count = 0;
        //定义求和变量
        int sum = 0;
        //获取所有的三位数
        for (int i = 100; i < 1000; i++) {
            //个十百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            //判断满足条件才是水仙花数
            if((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i){
                //打印水仙花数
                System.out.println("水仙花数有:"+i);
                count++;
                sum += i;
            }
        }
        System.out.println("水仙花数一共有:"+count+"个~");
        System.out.println("水仙花数的和是:"+sum);
    }
}
