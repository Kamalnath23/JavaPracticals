package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_14_Mismatch {
    public static void main(String[] args) {
        // Get the Arrays
        int[] intArr = { 10, 20, 15, 22, 35 };

        // Get the second Arrays
        int[] intArr1 = { 10, 15, 22 };

        // To compare both arrays
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArr, intArr1));

        int[] intArr2 = { 10, 15, 22 , 4};
        // To compare both arrays
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArr2, intArr1));
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArr1, intArr2));
    }
}
