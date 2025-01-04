package com.Java.ProblemAndSolutions.JavaConversionPrograms;

public class OctalToDecimal {
    public static void main(String[] args) {
        String OctalNumber1 = "157";
        String OctalNumber2 = "11";
        System.out.println("Method 1");
        System.out.println(convertOctalToDecimal(OctalNumber1));
        System.out.println(convertOctalToDecimal(OctalNumber2));

        int octalNum1 = 157, octalNum2= 11;
        System.out.println("Method 2");
        System.out.println(convertOctalToDecimal2(octalNum1));
        System.out.println(convertOctalToDecimal2(octalNum2));
    }

    //Method 1:  Using Integer.parseInt() method
    // To convert any string form to decimal, we can use type.parseType() method. For example, here we need to convert from octal to decimal, and the octal form is an integer, so we can use Integer.parseInt() to convert it.
    // Time complexity : O(1)
    //Auxiliary space : O(1)
    public static int convertOctalToDecimal(String OctalNumber) {
        // octal to decimal using Integer.parseInt()
        int DecimalNumber = Integer.parseInt(OctalNumber, 8);
        System.out.println(
                "Decimal equivalent of Octal value " + OctalNumber + " is: "+ DecimalNumber);
        return DecimalNumber;
    }


    //Method 2 - Custom method to convert Octal to decimal
    //Algorithm
//    1. Start and take the octal input from the user.
//    2. Create a result variable with an initial value of 0 to store the resultant Decimal number.
//    3. Create a loop for getting every digit in the Input.
//    4. Multiply each digit in the number with 8n-1, where n is the digit’s position.
//    5. Then add it to the result.
//    6. Store the value in Step(5) to the result variable.
//    7. Print the result variable.
    public static int convertOctalToDecimal2(int OctalNumber) {  //    1. Start and take the octal input from the user.
        //  2. Create a result(DecimalNumber) variable with an initial value of 0 to store the resultant Decimal number.
        int DecimalNumber = 0;

        //3. Create a loop for getting every digit in the Input.
        // Take a copy of input
        int copy_OctalNumber = OctalNumber;
        for (int i = 0; copy_OctalNumber > 0; i++) {
            // Take the last digit
            int temp = copy_OctalNumber % 10;
            //    4. Multiply each digit in the number with 8n-1, where n is the digit’s position.
            double p = Math.pow(8, i);

            //    5. Then add it to the result.
            //    6. Store the value in Step(5) to the result variable.

            // Multiply the digits to the  into the Input
            // and
            //  then add it to result
            DecimalNumber += (int) (temp * p);
            copy_OctalNumber = copy_OctalNumber / 10;

        }
        //    7. Print the result variable.
        System.out.println("Decimal of Octal Number (" + OctalNumber
                + ") : " + DecimalNumber);
        return DecimalNumber;
    }
}
