package com.GX.Test;

public class Test1 {
    public static void main(String[] args) {
        //找素数
        for (int i = 101; i < 200; i++) {

            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }

            if (flag==true){
                System.out.println(i);
            }
        }


    }
}
