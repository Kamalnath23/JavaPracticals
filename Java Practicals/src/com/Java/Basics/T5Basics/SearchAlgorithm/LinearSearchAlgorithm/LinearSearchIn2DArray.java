package com.Java.Basics.T5Basics.SearchAlgorithm.LinearSearchAlgorithm;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int a[][] = {
                {23,45,77},
                {18,17,3,71},
                {56,78,90,34, 56}
        };
        int target =34;
        int ans= linearSearchIn2DArray(a,target);
        System.out.println(ans);

        int[] ans2=Search2(a, target);
        System.out.println(Arrays.toString(ans2));

    }

    static int linearSearchIn2DArray(int[][] array, int target){
        for(int row=0; row<array.length; row++){
            for(int col=0; col < array[row].length;col++){
                if(array[row][col] == target){
                    System.out.println("Target "+target+" is found at the row "+row+" and column "+col);
                    return array[row][col];
                }
            }
        }
        System.out.println("Target "+target+" is not found.");
        return -1;
    }

    //return row and col numbers
    static  int[] Search2(int[][] array, int target){
        for(int row=0; row<array.length; row++){
            for(int col=0; col< array[row].length; col++){
                if(array[row][col] == target){
                    System.out.println("Target "+target+" is found at the row "+row+" and column "+col);
                    return new int[] {row, col};
                }
            }
        }
        System.out.println("Target "+target+" is not found.");
        return new int[]{-1};
    }

}
