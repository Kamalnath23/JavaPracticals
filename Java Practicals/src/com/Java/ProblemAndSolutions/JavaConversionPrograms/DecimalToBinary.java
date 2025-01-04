package com.Java.ProblemAndSolutions.JavaConversionPrograms;

public class DecimalToBinary {
    public static void main(String[] args) {
        int Decima7=7;
        int Decimal33= 33;
        System.out.println("Method 1");
        DecimalToBinaryConversion(Decima7);
        DecimalToBinaryConversion(Decimal33);
        System.out.println("Method 2");
        DecimalToBinaryConversion2(Decima7);
        DecimalToBinaryConversion2(Decimal33);
        System.out.println("Method 3");
        System.out.println(DecimalToBinaryConversion3(Decima7));
        System.out.println(DecimalToBinaryConversion3(Decimal33));
        System.out.println("Method 4");
        System.out.println(DecimalToBinaryConversion4(Decima7));
        System.out.println(DecimalToBinaryConversion4(Decimal33));
        String DecimalS1="7", DecimalS2="33";

    }

    //Decimal to binary conversion
    //Method 1 - Using arrays
    /*
    Store the remainder when the number is divided by 2 in an array.
    Divide the number by 2
    Repeat the above two steps until the number is greater than zero.
    Print the array in reverse order now.
     */
    public static void DecimalToBinaryConversion(int DecimalNumber){
        int BinaryNumber[] = new int[100];
        int i=0;
        while(DecimalNumber !=0){
            BinaryNumber[i]= DecimalNumber%2;
            i++;
            DecimalNumber= DecimalNumber/2;
        }

        for(int j=i-1; j>=0 ;j--){
            System.out.print(BinaryNumber[j]);
        }
        System.out.println();
    }

    //Method 2 - Using bitwise operator
    // Note – Bitwise operators work faster than arithmetic operators used above.

    public static void DecimalToBinaryConversion2(int DecimalNumber){
        // Initially declaring and initializing the
        // binary number with zero
        // Size of an integer is assumed to be 32 bits
        for (int i = 31; i >= 0; i--) {
            int k = DecimalNumber >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
    }

    //Method 3. Using Math.pow() method (Without using Arrays)
    public static int DecimalToBinaryConversion3(int DecimalNumber){
        // To store the binary number
        int BinaryNumber = 0;
        int count = 0;
        while(DecimalNumber!=0){
            int remainder = DecimalNumber%2;
            double c = Math.pow(10, count);
            BinaryNumber += (int) (remainder*c);
            DecimalNumber=DecimalNumber/2;
            count++;
        }
        return BinaryNumber;

    }

    //Method 4
    /*
    Steps for Conversion:
    1. Initialize a decimal number to 10.
    2. Call the decimalToBinary() method with the decimal number as the argument.
    3. Inside the decimalToBinary() method, initialize variables remainder, quotient, and binaryNum.
    4. While the quotient is greater than 0, do the following:
        a. Compute the remainder by taking the modulus of the quotient with 2.
        b. Append the remainder to the beginning of the binaryNum string.
        c. Update the quotient by dividing it by 2.
    5. Return the binaryNum string.
    6. Print the decimal number and the binary representation of the number.
    */
    public static String DecimalToBinaryConversion4(int DecimalNumber){
        int remainder;
        String BinaryNumber="";
        while(DecimalNumber >0){
            remainder= DecimalNumber%2;
            BinaryNumber = Integer.toString(remainder)+BinaryNumber;
            DecimalNumber=DecimalNumber/2;
        }
        return BinaryNumber;
    }
}
