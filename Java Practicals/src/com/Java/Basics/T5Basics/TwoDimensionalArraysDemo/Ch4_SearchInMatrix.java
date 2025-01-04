package com.Java.Basics.T5Basics.TwoDimensionalArraysDemo;

public class Ch4_SearchInMatrix {
    public static void main(String[] args) {
        int x = 8;
        int[][] arr = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };

        if (SearchInMatrix(arr, x)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean SearchInMatrix(int[][] array, int x){
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt == x) {
                    return true;
                }
            }
        }
        return false;
    }
}

