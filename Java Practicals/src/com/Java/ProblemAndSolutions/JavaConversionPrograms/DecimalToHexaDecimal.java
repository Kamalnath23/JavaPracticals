package com.Java.ProblemAndSolutions.JavaConversionPrograms;

public class DecimalToHexaDecimal {
    public static void main(String[] args) {
        System.out.println("Method 1");
        int DecimalNumber10 = 10;
        int DecimalNumber2545 = 2545;
        convertDecimalToHexaDecimal(DecimalNumber10);
        //System.out.println();
        convertDecimalToHexaDecimal(DecimalNumber2545);
    }

            /*
       Algorithm
        1. Store the remainder when the number is divided by 16 in an array.
        2. Divide the number by 16 now
        3. Repeat the above two steps until the number is not equal to 0.
        4. Print the array in reverse order now.
         */

    // Method 1
    // To convert decimal to hexadecimal
    public static void convertDecimalToHexaDecimal(int DecimalNumber){
        // Creating an array to store octal number
        int[] HexaDecimalNumber= new int[100];
        // counter for hexadecimal number array
        int i = 0;
        while(DecimalNumber!=0){
            HexaDecimalNumber[i]= DecimalNumber%16;
            DecimalNumber= DecimalNumber/16;
            i++;
        }

        // Printing hexadecimal number array in reverse order
        for(int j=i-1; j>=0 ;j--){
            if (HexaDecimalNumber[j] > 9)
                System.out.print((char)(55 + HexaDecimalNumber[j]));
            else
                System.out.print(HexaDecimalNumber[j]);
        }
        System.out.println();
    }
}
