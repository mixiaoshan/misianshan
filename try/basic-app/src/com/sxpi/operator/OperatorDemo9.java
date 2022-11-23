package com.sxpi.operator;

public class OperatorDemo9 {
    public static void main(String[] args) {
        // 目标：看看Java是否存在优先级，大家以后需要注意优先级问题
        //  &&  优先级高于  ||
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);  //true
        //  （） 优先级高于  &&
        System.out.println( (10 > 3 || 10 > 3 ) && 10 < 3); // false

    }
}
