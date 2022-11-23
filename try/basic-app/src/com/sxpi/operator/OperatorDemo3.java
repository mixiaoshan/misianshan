package com.sxpi.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //+符号做连接符的识别
        int a = 5 ;
        System.out.println("abc" + 'a'); // abca                   结果为字符串
        System.out.println("abc" + a);   // abc5                   abc字符串加字符串5
        System.out.println(5 + a); // 10                           数字
        System.out.println("abc" + 5 + 'a'); // abc5a              前面加为字符串，后面a看做字符串
        System.out.println(15 + "abc" + 15); // 15abc15            前面加为字符串，后面15看做字符串
        System.out.println(a + 'a'); // 102                        前面位数字，后面a看做数字
        System.out.println(a + "" +'a'); // 5a                     5为字符串
        System.out.println(a + 'a'+" itheima "); // 102 itheima    前面加位数字，后面是字符串
        System.out.println("itheima"+ a + 'a'); // itheima5a       前面加是字符串，后面a看做字符串
        System.out.println("itheima"+ ( a + 'a' ));// itheima102   前面是字符串，括号中为数字
        //先算前面，先看算出来是字符串还是数字
    }
}
