package com.Java.Basics.T5Basics.SearchAlgorithm.LinearSearchAlgorithm;

public class LinearSearchMinimumNumber {
    public static void main(String[] args) {
        int[] a= {23,45,-1,-9,34,56,0 , -9, -8,-7,8, 22, -91, 34,67,89,12,34,-9};
        int ans= SearchMinimumNumber(a);
        System.out.println(ans);
    }

    static int SearchMinimumNumber(int array[]){
        if(array.length ==0){
            System.out.println("Search is impossible as minimum number is zero!");
            return -1;
        }
        int min=array[0];
        for(int i=0; i < array.length; i++){
            if(array[i]< min){
                min= array[i];
            }
        }
        return min;
    }
}
