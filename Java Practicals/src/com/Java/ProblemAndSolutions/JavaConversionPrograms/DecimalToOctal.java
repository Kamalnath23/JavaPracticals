package com.Java.ProblemAndSolutions.JavaConversionPrograms;

public class DecimalToOctal {
    public static void main(String[] args) {
        int decimelnumber177 = 177;
        convertDecimalToOctal(decimelnumber177);
        System.out.println();
        convertDecimalToOctal2(decimelnumber177);
        int decimelnumber120 = 120;
        convertDecimalToOctal2(decimelnumber120);
    }
/*
    Approach 1:
    Store the remainder when the number is divided by 8 in an array.
    Divide the number by 8 now
    Repeat the above two steps until the number is not equal to 0.
    Print the array in reverse order now.
*/

    public static void convertDecimalToOctal(int DecimalNumber) {
        // Creating an Integer array of
        // array to store octal number
        int[] octalNumber = new int[100];

        // counter for octal number array
        int i = 0;
        while (DecimalNumber != 0) {
            octalNumber[i] = DecimalNumber % 8;
            DecimalNumber = DecimalNumber / 8;
            i++;
        }

        // Printing octal number array in reverse order
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(octalNumber[j]);
        }
    }

    /*
    Approach 2:

Initialize ocatalNum with 0 and countVal with 1 and the decimal number as n
Calculate the remainder when decimal number divided by 8
Update octal number with octalNum + (remainder * countval)
Increment the countval by countval*10
Divide the decimal number by 8
Repeat from step 2 until the decimal number is zero
     */
    public static void convertDecimalToOctal2(int DecimalNumber) {
        // Initially declaring and initializing the
        // octal number with zero
        int octalNumber = 0, countval = 1;
        //int dNo = DecimalNumber;
        while (DecimalNumber != 0) {
            // Decimals remainder is calculated
            int remainder = DecimalNumber % 8;

            // Storing the octalvalue
            octalNumber += remainder * countval;

            // Storing exponential value
            countval = countval * 10;
            DecimalNumber /= 8;
        }

        // Print and display the octal number
        System.out.println(octalNumber);
    }
}
