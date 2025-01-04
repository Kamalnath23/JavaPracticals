package com.Java.Basics.T5Basics.TwoDimensionalArraysDemo;

import java.util.Scanner;

public class Ch3_InputInMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Taking Number of Rows and Columns from User
        System.out.print("Enter number of rows: ");
        int row = s.nextInt();

        System.out.print("Enter number of columns: ");
        int col = s.nextInt();

        int[][] arr= new int[row][col];

        // Operating on Two Dimensional Array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= (i + 1) * (j + 1);
            }
        }

        // Printing Elements of Arrays
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }

            System.out.println();
        }
    }
}
