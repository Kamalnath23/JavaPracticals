package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_16_Sort {
    public static void main(String[] args) {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To sort the array using normal sort-
        Arrays.sort(intArr);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));

        int[] intArr2 = { 10, 20, 15, 22, 35,-7,0,0,3,11,17 };
        // To sort the array using normal sort-
        Arrays.sort(intArr2);
        System.out.println("Integer Array: "
                + Arrays.toString(intArr2));
    }
}
