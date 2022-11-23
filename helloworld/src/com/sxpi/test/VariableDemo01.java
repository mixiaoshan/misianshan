package com.sxpi.test;

public class VariableDemo01 {
    public static void main(String[] args) {
        //目标：理解变量使用的注意事项
        System.out.println("--------变量使用的注意事项--------");
        //1.变量必须先声明再使用
        int a=23;
        System.out.println(a);
        //2.变量声明后，不能存储其他类型的数据
        //a=2.5;  （报错，因为变量已经被声明为整数）
        //3.变量的有效范围是从定义开始到“}"截止，且在同一个范围内不能定义两个同名的变量
        {
            int b=25;
            System.out.println(b);
            // int b=100;   (报错，因为b已经被定义)
        }
        //System.out.println(b);  (报错，b只在{}内有效)
        //4.变量定义的时候，可以没有初始值，但是使用的时候必须给初始值
        int c;
        //System.out.println(c);   (报错，因为使用时要给c初始值）

        System.out.println("--------变量在计算机中使用的底层逻辑--------");
        char ch='a';
        System.out.println(ch + 1);

        System.out.println("--------计算机中的进制--------");
        int i0=0b01100001;    //97对应的二进制数
        System.out.println(i0);

        int i1=0141;        //97对应的八进制数
        System.out.println(i1);

        int i2=0x61;        //97对应的十六进制数
        System.out.println(i2);
    }
}
