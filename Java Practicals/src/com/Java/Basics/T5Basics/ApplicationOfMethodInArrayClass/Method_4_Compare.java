package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_4_Compare {

    public static void main(String[] args) {
        // Get the Array
        int[] intArr = { 10, 20, 15, 22, 35 };

        // Get the second Array
        int[] intArr1 = { 10, 15, 22 };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(intArr, intArr1));

        int[] intArr2 = { 10, 20, 15, 22, 35 };
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(intArr, intArr2));
    }
}
