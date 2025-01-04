package com.Java.ProblemAndSolutions.JavaConversionPrograms;

public class BinaryToOctal {
    public static void main(String[] args) {
        long b1=100100;
        long b2= 1100001;
        System.out.println("Method 1");;
        System.out.println(ConvertBinaryToOctal(b1));
        System.out.println(ConvertBinaryToOctal(b2));
        System.out.println("Method 2");
        System.out.println(ConvertBinaryToOctal2(b1));
        System.out.println(ConvertBinaryToOctal2(b2));
    }

    //Algorithm
    //1. Convert the binary number into a decimal number.
    //2. Convert this decimal number to a string of octal numbers using the toOctalString() method.
    //3. Convert this string again to an Integer.

    //// method to convert binary to decimal
    public static int ConvertBinaryToDecimal(long BinaryNumber){
        int DecimalNumber=0;
            int i=0;
        while(BinaryNumber > 0){
            //multiplying each digit of binary with increasing powers of 2 towards left
            DecimalNumber += (int) (Math.pow(2, i) * (BinaryNumber % 10));
            // dividing the binary by 10 to remove the last digit
            BinaryNumber /= 10;
            //incrementation
            i++;
        }
        return DecimalNumber;
    }

    // // function to convert decimal to octal
    public static int ConvertDecimalToOctal(long BinaryNumber){
        int OctalNumber;
        // variable to store the decimal number
        // returned by the binaryToDecimal()
        int DecimalNumber=ConvertBinaryToDecimal(BinaryNumber);
        // using the toOctalString() to convert Integer to String of Octal Number
        String OctalString = Integer.toOctalString(DecimalNumber);
        //converting the String of octal number to an Integer
        OctalNumber = Integer.parseInt(OctalString);
        return OctalNumber;
    }
    public static int ConvertBinaryToOctal(long BinaryNumber){
            return ConvertDecimalToOctal(BinaryNumber);
    }


    //METHOD 2 User Defined Function to Convert Binary to Octal
//    Using this approach, we first convert the binary number to a decimal number. We then convert this decimal number to an octal number by continuously extracting the remainder and dividing by 8.
//
//    Algorithm:
//    Convert the binary number to a decimal number.
//    Now, for this converted decimal number, run a while loop till this number becomes 0.
//    In every iteration of the loop, get the remainder by dividing the number by 8.
//    Multiply this remainder with increasing powers of 10.
//    Finally divide the original number by 8.
    public static int ConvertDecimalToOctal2(long BinaryNumber){
        int OctalNumber = 0;
        int i=0;
        // variable to store the decimal number
        // returned by the binaryToDecimal()
        int DecimalNumber=ConvertBinaryToDecimal(BinaryNumber);
        //Loop to convert decimal to octal
        while(DecimalNumber !=0){
            //extracting the remainder on multiplying by 8 and dividing that with increasing powers of 10
            OctalNumber += (int) ((DecimalNumber%8) * Math.pow(10, i));
            i++;
            DecimalNumber/=8;

        }
        return OctalNumber;
    }
    public static int ConvertBinaryToOctal2(long BinaryNumber){
        return ConvertDecimalToOctal2(BinaryNumber);
    }

}
