package com.sxpi.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //理解自动类型转换
        //小的变量赋值给大的变量
        byte a=20;
        int b=a;  //发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        int age=18;
        double b1=age;  //自动类型转换
        System.out.println(b1);

        char ch='a';    //00000000  01100001
        int code=ch;    //00000000  00000000  00000000  01100001
        System.out.println(code);

    }
}
