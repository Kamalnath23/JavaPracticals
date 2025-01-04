package com.Java.Basics.T5Basics.ThreeDimensionalArrayDemo;

public class CH1_3D_Array_Introduction {
    public static void main(String[] args) {
        // 3D-Array is a complex form of a multidimensional array. A 3D-array can be seen as an array of 2D array for easier understanding.

        //Representation of 3D Array in Tabular Format
        //A three-dimensional array can be seen as a table of arrays with ‘x’ rows and ‘y’ columns where the row number ranges from 0 to (x-1) and column number ranges from 0 to (y-1).

        // Array Created and Initialized
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        // Defining the x,y,z in Multi
        // Dimensional Array
        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;

        // Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                for(int k=0; k < o; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
