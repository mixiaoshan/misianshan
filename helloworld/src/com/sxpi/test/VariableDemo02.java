package com.sxpi.test;

public class VariableDemo02 {
    public static void main(String[] args) {
        //目标掌握使用基本数据类型定义不同变量
        //1.byte字节型 占1个字节  -128~127
        byte num=98;
        System.out.println(num);
        //byte num01=128;  报错，超过byte定义的范围

        //2.short短整型 占2个字节
        short money=30000;
        System.out.println(money);

        //3.int整形 占4个字节  默认类型
        int i1=123456;
        System.out.println(i1);

        //4.long长整形 占8个字节
        long i2=123456789;
        System.out.println(i2);
        //注意：随便写一个整数字面量默认是int类型的，虽然没有超过long的范围，但它超过了int类型的范围
        //如果希望随便写一个整数字面量当成long类型，需要在其后加L/l
        long i3=123456789101112L;
        System.out.println(i3);

        //5.float浮点型 占4个字节 单精度
        //float score01=98.6;   报错，计算机认为98.6是double类型的
        float score=98.6F;
        System.out.println(score);
        //注意：随便写一个小数字面量默认是double类型的，如果希望随便写一个小数字面量当成float类型，需要在其后加F/f

        //6.double双精度 占8个字节
        double score02=98.6;
        System.out.println(score02);

        //7.char字符类型 占2个字节
        char ch='a';
        char ch01='中';
        //char ch02='中国'   报错，有且只能有一个字符

        //8.boolean布尔类型 占1个字符
        boolean rs=true;
        System.out.println(rs);
        boolean rs01=false;
        System.out.println(rs01);

        System.out.println("------数据引用类型------");
        String name="米小山";
        System.out.println(name);
    }
}
