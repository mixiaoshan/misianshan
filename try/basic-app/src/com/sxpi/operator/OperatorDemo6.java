package com.sxpi.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //学会使用关系运算符
        int a=10;
        int b=10;
        boolean rs = a==b;
        System.out.println(rs);    //true

        System.out.println(a == b);//true
        System.out.println(a != b);//false
        System.out.println(a > b); //false
        System.out.println(a >= b);//true
        System.out.println(a < b); //false
        System.out.println(a <= b);//true

        System.out.println("----------------------");

        int i = 10;
        int j = 5;
        System.out.println(i == j); // false
        System.out.println(i != j); // true
        System.out.println(i > j); // true
        System.out.println(i >= j); // true
        System.out.println(i < j); // false
        System.out.println(i <= j); // false

        System.out.println(i = j); // 5 相等判断必须是== 如果使用=是在进行赋值操作！
    }
}
