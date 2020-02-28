package com.cuit.day04.demo03;
/* 重载方法名可相同，参数名不同*/
public class Demo01Overload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
    public  static  int  sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static  int sum (int a,int b,int c){
        int sum= a+b+c;
        return sum;
    }
}
