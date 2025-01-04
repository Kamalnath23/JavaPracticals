package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_10_DeepToString {
    public static void main(String[] args) {
        // Get the Array
        int intArr[][] = { { 10, 20, 15, 22, 35 } };

        // To get the deep String of the arrays
        System.out.println("Integer Array: "
                + Arrays.deepToString(intArr));
    }
}
