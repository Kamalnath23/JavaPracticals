package com.Java.Basics.T5Basics.SearchAlgorithm.LinearSearchAlgorithm;

import java.util.Arrays;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr= {17,21,18,96,48,2,31,23,45,7,10};
        int ans= LinearSearch(arr, 23,0,7);
        System.out.println(ans);
        int ans2= LinearSearch(arr, 7,7,10);
        System.out.println(ans2);
        int ans3= LinearSearch(arr, 7,10,7);
        System.out.println(ans3);
        int ans4= LinearSearch(arr, 48,0,5);
        System.out.println(ans4);

        int[] a= {};
        int ans5= LinearSearch(a, 48,0,5);
        System.out.println(ans5);

    }

    static int LinearSearch(int[] arr, int target, int startIndex, int endIndex){
        if(arr.length == 0){
            System.out.println("Lengtth of Array is Zero!");
            return -1;
        }

        if(startIndex>endIndex){
            System.out.println("End index " +endIndex+ " should not be less than start index: "+startIndex+".");
            return -1;
        }
        for(int i=startIndex; i<=endIndex; i++){
            int data = arr[i];
            if(target==data){
                System.out.println(target+" is found at the index:"+i +" in the array "+ Arrays.toString(arr) +" between the start index: "+startIndex+" and end index: 0"+endIndex);
                return data;
            }
        }
        System.out.println("Target Data("+target+") is not found in the array "+Arrays.toString(arr) +" between the start index: "+startIndex+" and end index: 0"+endIndex);
        return -1;

    }
}
