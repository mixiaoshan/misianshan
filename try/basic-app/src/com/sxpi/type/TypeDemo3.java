package com.sxpi.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        //理解强制类型转换
        int a=20;
        byte b=(byte)a;
        System.out.println(b);

        //强制类型转换会造成数据的溢出或丢失
        int i=1500;
        byte j= (byte) i;
        System.out.println(j);

        //浮点型强制转换成整型，直接丢掉小数部分，保留整数部分返回
        double score=3.14;
        int score1= (int) score;
        System.out.println(score1);
    }
}
