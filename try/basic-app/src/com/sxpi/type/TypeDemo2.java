package com.sxpi.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //掌握表达式的自动类型转换规则
        byte a=10;
        int b=20;
        double c=1.0;
//        int z=a+b+c;   （报错，应该用最高类型double来接收）
        double  z=a+b+c;
        System.out.println(z);

        //面试题
        byte i=10;
        byte j=20;
//        byt k=i+j;     (报错，应该用int来接收）在表达式中，byte，short，char是直接转换成int类型运算的
        int k=i+j;
        System.out.println(k);
    }
}
