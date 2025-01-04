package com.Java.Basics.T5Basics.ThreeDimensionalArrayDemo;

import java.util.Scanner;

public class Ch3_InsertingInMultiDimensionalArray {
    public static void main(String[] args) {
        // Scanner class to take
        // values from console
        Scanner scn = new Scanner(System.in);

        int n, m;

        // takes total number of
        // TestCases as integer number
        System.out.println("Enter row count: ");
        n = scn.nextInt();

        // An array is formed as row
        int[][] arr = new int[n][];

        // for loop to take input of
        // values in each TestCase
        for (int i = 0; i < arr.length; i++) {

            // Accepting number of columns
            System.out.println("No.of.cols");
            m = scn.nextInt();
            arr[i] = new int[m]; //important

            // Dimensional Array
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter array val");
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {

            int odd = 0, even = 0;

            System.out.println("Rows " + i + " with " + arr[i].length + " Columns");
            System.out.println("Elements of Array:");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                // Checking Odd and even numbers
                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
            System.out.println();

            // Printing even and odd number
            System.out.println("Even: " + even + ", Odd: " + odd);

        }
    }
}
