package com.cuit.day04.demo02;
/*判断两数相等*/
public class Demo01MethodSame {
    public static void main(String[] args) {
        Boolean flag=isSame(1,3);
        if (flag==true){
            System.out.println("a等于b");
        }else {
            System.out.println("a不等于b");
        }
    }

    public static boolean isSame(int a,int b){
       boolean same = a==b;
       return same;
    }
}
