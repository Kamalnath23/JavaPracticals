package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_7_CopyOfRange {
    public static void main(String[] args) {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To print the elements in one line
        System.out.println("Integer Array: "
                + Arrays.toString(intArr));

        System.out.println("\nNew Arrays by copyOfRange:\n");

        // To copy the array into an array of new length
        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOfRange(intArr, 1, 3)));
        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOfRange(intArr, 0, 3)));
    }
}
