package com.Java.Basics.T5Basics.SearchAlgorithm.LinearSearchAlgorithm;

public class LinearSearchMaximumNumber {
    public static void main(String[] args) {
        int[] a= {23,45,-1,-9,34,56,0 , -9, -8,-7,8, 22, -91, 34,67,89,12,34,-9};
        int ans= SearchMaximumNumber(a);
        System.out.println(ans);
    }

    static int SearchMaximumNumber(int array[]){
        if(array.length ==0){
            System.out.println("Search is impossible as minimum number is zero!");
            return -1;
        }
        int max=array[0];
        for(int i=0; i < array.length; i++){
            if(array[i]> max){
                max= array[i];
            }
        }
        return max;
    }
}
