package com.GX.Test;

public class copyArr {
    public static void main(String[] args) {
        int[] arr=new int[]{23,55,77,88,3,78,90,28};
        int[] ints = copyArr(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"\t");
        }

    }

    public static int[] copyArr(int[] arr){
        int[] newArr =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
}
