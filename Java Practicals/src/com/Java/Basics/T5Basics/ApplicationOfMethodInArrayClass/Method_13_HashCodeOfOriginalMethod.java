package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;
import java.util.Arrays;
public class Method_13_HashCodeOfOriginalMethod {
    public static void main(String[] args) {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To get the hashCode of the arrays
        System.out.println("Integer Array: "
                + Arrays.hashCode(intArr));
    }
}
