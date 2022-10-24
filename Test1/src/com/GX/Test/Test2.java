package com.GX.Test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //随机验证码
        String code = createCode();
        System.out.println(code);

    }

    public static String createCode(){
        Random random=new Random();
        String msg="";
        for (int i = 0; i < 5; i++) {
            int nextInt = random.nextInt(3);
            switch (nextInt){
                case 0:
                    char c1 = (char) (random.nextInt(26)+65);
                    msg +=c1;
                    break;
                case 1:
                    char c2 = (char) (random.nextInt(26)+97);
                    msg +=c2;
                    break;
                case 2:
                    int num = random.nextInt(10);
                    msg +=num;
                    break;
                default:
                    System.out.println("操作错误！");
            }
        }

        return msg;


    }
}
