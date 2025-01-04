package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_11_Equals {
    public static void main(String[] args) {
        // Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };

        // Get the second Arrays
        int intArr1[] = { 10, 15, 22 };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.equals(intArr, intArr1));

        int intArr2[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Arrays on comparison: "
                + Arrays.equals(intArr, intArr2));
        int intArr3[] = new int[5];
        intArr3[0] =  10;
        intArr3[1] = 20;
        intArr3[2] = 15;
        intArr3[3] = 22;
        intArr3[4] = 35;
        System.out.println("Integer Arrays on comparison: "
                + Arrays.equals(intArr, intArr3));
    }
}
