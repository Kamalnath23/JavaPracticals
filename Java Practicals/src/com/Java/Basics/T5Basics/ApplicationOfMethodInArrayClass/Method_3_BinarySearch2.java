package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_3_BinarySearch2 {
    public static void main(String[] args) {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr);
        int intKey = 22;
        System.out.println(
                intKey
                        + " found at index "
                        + Arrays.binarySearch(intArr, 1, 3, intKey));
    }
}
