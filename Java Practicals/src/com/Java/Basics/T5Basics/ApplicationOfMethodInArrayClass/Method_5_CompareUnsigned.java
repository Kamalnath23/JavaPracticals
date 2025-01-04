package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_5_CompareUnsigned {
    public static void main(String[] args) {
        // Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };

        // Get the second Arrays
        int intArr1[] = { 10, 15, 22  };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compareUnsigned(intArr, intArr1));

        int intArr2[] = { 10, 20, 15, 22, 35 };
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compareUnsigned(intArr, intArr2));
    }
}
