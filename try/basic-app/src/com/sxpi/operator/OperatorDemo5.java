package com.sxpi.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
    //学会使用赋值运算符：= += -= *= /= %=
        int a=10;
        int b=20;
        a+=b;
        System.out.println(a);

        byte i=10;
        byte j=20;
        i+=j;      //或写成  i=（byte）i+j   i+j为int类型，要强制转换为byte类型
        System.out.println(i);

        int m=10;
        int n=9;
        m-=n;       //或 m=（int)m-n
        System.out.println(m);

        int c=12;
        int d=2;
        c*=d;       //或 c=(int)c*d
        System.out.println(c);

        int x=40;
        int y=20;
        x/=y;     //或  x=(int)x/y
        System.out.println(x);
    }
}
