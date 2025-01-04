package com.Java.Basics.T5Basics.TwoDimensionalArraysDemo;

public class Ch2_TransversalOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println("Print arr value using enhanced for loop!");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
