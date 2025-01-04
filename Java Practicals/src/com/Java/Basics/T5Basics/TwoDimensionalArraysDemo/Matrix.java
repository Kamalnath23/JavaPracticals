package com.Java.Basics.T5Basics.TwoDimensionalArraysDemo;

public class Matrix {
    public static void main(String[] args) {
        //Create 2D arrays
        int[][] x = new int[2][3];
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;

        //Display array elements
        System.out.println(x.length);
        System.out.println();
        for(int i=0; i <x.length ;i++){
            for(int j=0; j<x[i].length; j++){
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }

        //Create 2 d array directly
        System.out.println("New array");
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // Accessing elements of 2-D array
        System.out.println("First element of first row: "
                + arr[0][0]);
        System.out.println("Third element of second row: "
                + arr[1][2]);
        System.out.println("Second element of third row: "
                + arr[2][1]);
    }
}
