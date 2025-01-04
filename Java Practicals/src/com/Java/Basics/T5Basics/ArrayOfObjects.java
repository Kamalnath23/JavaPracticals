package com.Java.Basics.T5Basics;

public class ArrayOfObjects {
    public static void main(String[] args) {
        int [] arr=new int [4];
        // 4 is the size of arr
        System.out.println("Array Size:"+arr.length);
        arr[0]=1;
        arr[1]=45;
        arr[2]=18;
        arr[3]=7;
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        arr[0]=3;
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
