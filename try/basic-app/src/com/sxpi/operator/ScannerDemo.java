package com.sxpi.operator;

//导包：告诉程序去JDK的那个包中找扫描器技术
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //写一行代码代表得到键盘扫描器对象
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        //等待接收用户输入数据
        int age=sc.nextInt();
        System.out.println("年龄是:"+age);

        System.out.println("请输入您的名称:");
        //等待接收用户输入数据
        String name=sc.next();
        System.out.println("欢迎您："+name);
    }
}
