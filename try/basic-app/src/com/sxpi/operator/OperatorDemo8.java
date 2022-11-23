package com.sxpi.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        // 目标：学会使用三元运算符，理解其流程
        double score=98;
        String result=score >=60? "考试通过" : "挂科";
        System.out.println(result);

        // 需求：需要从2个整数中找出较大值
        int a=2000;
        int b=200;
        int c=a>=b?  a:b;
        System.out.println(c);

        System.out.println("-------------------------");
        int x=90;
        int y=70;
        int z=120;
        int l=x>y?  x:y;
        System.out.println(l);
        int h=l>z? l:z;
        System.out.println(h);

        System.out.println("-------------拓展知识-------------");
        /*
        x和y作比较，如果x>y,x>z 输出x
        x和y作比较，如果y<x<z   输出z
        x和y作比较，如果x<y,y>z 输出y
        x和y作比较，如果x<y,y<z 输出z
         */
        int m=x>y?(x>z? x:z):(y>z? y:z);
        System.out.println(m);
    }
}
