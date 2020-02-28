package com.cuit.day04.demo03;

public class Demo02Overload {
    public static void main(String[] args) {
        System.out.println(isSame((short)10,(short)20));
    }
    public static boolean isSame(int a,int b){
        return a==b;
    }
    public static boolean isSame(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean isSame(long a,long b){
        return a==b;
    }
}
