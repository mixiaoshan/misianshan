package com.sxpi.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //掌握基本的算术运算符的使用：+  -  *  /  %
        int a=10;
        int b=3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);       //默认类型为int类型，此处结果会转为整数   不准确
        System.out.println(10 *1.0/ 3);  //3.333335
        System.out.println(10 / 3*1.0);  //3.0  前面会看做int（整形）算，后面才看做double算
        System.out.println(a % b);       //
    }
}
