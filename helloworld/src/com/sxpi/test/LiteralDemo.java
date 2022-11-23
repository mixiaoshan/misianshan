package com.sxpi.test;

public class LiteralDemo {
    public static void main(String[] args) {
        //目标：理解字面量的使用
        //1.整数
        System.out.println(666);
        //2.小数
        System.out.println(3.14);
        //3.字符：必须用单引号围起来，有且只有一个字符
        System.out.println('a');
        System.out.println(' ');//空字符
        //4.字符串：必须要用双引号围起来，里面内容可以随意输出
        System.out.println("您好，欢迎登录本设备");
        //5.布尔值：只有两个值true,false
        System.out.println(true);
        System.out.println(false);
        //特殊字符：\n 代表换行；  表的是一\t代个tab缩进
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');
    }
}
