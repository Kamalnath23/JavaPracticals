package com.Java.Basics.T5Basics.ApplicationOfMethodInArrayClass;

import java.util.Arrays;

public class Method_1_AsList {
    public static void main(String[] args) {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To convert the elements as List
        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr));
    }
}
