package com.cuit.day04.demo02;
/*求出1-100所有数*/
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum(){
        int i,sum=0;
        for (i=0;i<101;i++){
            sum+=i;
        }
        return sum;
    }
}
