package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_8_DeepEquals {
    public static void main(String[] args) {
        // Get the Arrays
        int intArr[][] = { { 10, 20, 15, 22, 35 } };

        // Get the second Arrays
        int intArr1[][] = { { 10, 15, 22 } };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.deepEquals(intArr, intArr1));

        int[][] x={{1,2,3}};
        int[][] y= {{1,2,3}};
        int[][] z= {{3,2,1}};
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.deepEquals(x, y));

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.deepEquals(x, z));
    }
}
