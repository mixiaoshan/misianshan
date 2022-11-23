package com.sxpi.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //学会使用逻辑运算符，并能够选择合适的逻辑运算符解决问题。
        double size=9.5;
        double storage=6;
        // 需求：尺寸大于等于6.95 内存要大于等于8GB
        // 注意：必须前后都是true结果才是true
        System.out.println(size >= 6.8 & storage >= 8);

        // 需求：要么内存大于等于8 要么尺寸大于等于6.95
        // 注意：只要有一个是true 结果就一定是true
        System.out.println(size >= 8 | storage >= 8);

        //逻辑非，你真我假，你假我真
        System.out.println(!true);
        System.out.println(!false);

        // 逻辑异或：必须两个不同结果才是true
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);

        System.out.println("-----------&&  &  || |的区别-------------------");
        int a = 10;
        int b = 20;
        System.out.println(a > 100 && ++b > 10); //&& 左边为false,右边不执行
        System.out.println("---------------");
        System.out.println(a > 100 & ++b > 10);  //&  左边为false，右边依然执行
        System.out.println(b);

        System.out.println("--------------------------");

        int i = 10;
        int j = 20;
        System.out.println(i > 2 || ++j > 10);  // ||   左边为true，右边不执行
        System.out.println("----------------");
        System.out.println(i > 2 | ++j > 10);   //  |   左边为true，右边依然执行
        System.out.println(j);
    }
}
