package com.Java.ProblemAndSolutions.JavaConversionPrograms;

public class HexaDecimalToDecimal {
    public static void main(String[] args) {
        String hex1 = "1AB";
        String hex2 = "1A";
        System.out.println("METHOD 1");
        System.out.println(ConvertHexaDecimalToDecimal1(hex1));
        System.out.println(ConvertHexaDecimalToDecimal1(hex2));
        System.out.println("METHOD 2");
        System.out.println(ConvertHexaDecimalToDecimal(hex1));
        System.out.println(ConvertHexaDecimalToDecimal(hex2));
    }

    /*
    METHOD 1
        1. The idea is to extract the digits of a given hexadecimal number starting from the rightmost digit.
        2. Keep a variable ‘dec_value’.
        3. At the time of extracting digits from the hexadecimal number, multiply the digit with the proper base (Power of 16) and add it to the above variable taken that is ‘dec_value’.
        4. In the end, the variable ‘dec_value’ will store the required decimal number.
     */
    public static int ConvertHexaDecimalToDecimal1(String HexadecimalNumber) {
        // Storing the length of the
        int len = HexadecimalNumber.length();

        // Initializing base value to 1, i.e 16^0
        int base = 1;

        // Initially declaring and initializing
        // decimal value to zero
        int DecimalNumber = 0;
        // Extracting characters as digits from last character

        for (int i = len - 1; i >= 0; i--) {
            // Condition check
            // Case 1
            // If character lies in '0'-'9', converting
            // it to integral 0-9 by subtracting 48 from
            // ASCII value
            if (HexadecimalNumber.charAt(i) >= '0' && HexadecimalNumber.charAt(i) <= '9') {
                DecimalNumber += (HexadecimalNumber.charAt(i) - 48) * base;

                // Incrementing base by power
                base = base * 16;
            }
            // Case 2
            // if case 1 is bypassed

            // Now, if character lies in 'A'-'F' ,
            // converting it to integral 10 - 15 by
            // subtracting 55 from ASCII value
            else if (HexadecimalNumber.charAt(i) >= 'A'
                    && HexadecimalNumber.charAt(i) <= 'F') {
                DecimalNumber += (HexadecimalNumber.charAt(i) - 55) * base;

                // Incrementing base by power
                base = base * 16;
            }
        }
        // Returning the decimal value
        return DecimalNumber;
    }

    //Method 2
    public static int ConvertHexaDecimalToDecimal(String HexadecimalNumber) {
        int DecimalNumber = 0;
        int lengthOfHexaDecimalNumber = HexadecimalNumber.length();
        for (int i = 0; i < lengthOfHexaDecimalNumber; i++) {
            char c = HexadecimalNumber.charAt(i);
            int digit = Character.digit(c, 16);
            //System.out.println("digit @ i:" + i + ": " + digit);
            DecimalNumber = (DecimalNumber * 16) + digit;

        }

        return DecimalNumber;
    }


}
