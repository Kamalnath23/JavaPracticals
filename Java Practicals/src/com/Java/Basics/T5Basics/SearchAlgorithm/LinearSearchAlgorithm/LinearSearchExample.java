package com.Java.Basics.T5Basics.SearchAlgorithm.LinearSearchAlgorithm;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 21, 0, 27};
        LinearSearch(array, 4);
        System.out.println();
        LinearSearch(array, 21);
        System.out.println();
        LinearSearch(array, 40);
        System.out.println();
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Length of array is equal to 0");
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //check for everyelement at index if its equal to target
            int element = arr[index];
            if (element == target) {
                System.out.println(target + " is found at index " + index);
                return index;
            }
        }
        //this line will execute if target is not found in elements. hence this line will execute
        System.out.println("Target not found");
        return -1;

    }
}
