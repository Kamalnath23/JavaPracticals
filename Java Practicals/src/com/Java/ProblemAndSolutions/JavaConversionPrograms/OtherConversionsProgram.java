package com.Java.ProblemAndSolutions.JavaConversionPrograms;

import java.text.DecimalFormat;

public class OtherConversionsProgram {
    public static void main(String[] args) {
        //1. Boolean to String
        System.out.println("I. Boolean to String!");
        System.out.println("Method 1");
        // boolean type value
        boolean value = true;

        // static toString() method of Boolean class
        String output = Boolean.toString(value);

        // printing the value
        System.out.println(output);
        System.out.println("Method 2: Depreciated");
        // creating a Boolean object
        // Boolean b = new Boolean(false); Depreciated

        // toString method of Boolean class
        //String output1 = b..toString();

        // printing the output
        //System.out.println(output1);

        //2. String to Double
        System.out.println("II. String to Double");
        System.out.println("Method 1");
        // Create and initializing a string
        String str = "2033.12244";

        // Converting the above string into Double
        // using parseDouble() Method
        double str1 = Double.parseDouble(str);

        // Printing string as Double type
        System.out.println(str1);

        System.out.println("Method 2");
        // Creating and initializing a string
        String str2 = "2033.12244";

        // Converting the above string to Double type
        double str3 = Double.valueOf(str2);

        // Printing above string as double type
        System.out.println(str3);

        System.out.println("Method 3: Depreciated:");
        // Creating and initializing a string
//        String str4 = "2033.12244";

        // Converting above string into double type
//        Double str5 = new Double(str4);

        // print above string as Double type
//        System.out.println(str5);

        System.out.println("III. Double to String");
        System.out.println("Method 1:");
        // Double declared
        double num = 12.345;

        // Converting Double to String
        String string = num + "";

        System.out.println(string);

        // Type of num
        System.out.println(
                "Type of num : "
                        + ((Object)num).getClass().getSimpleName());

        // Converted element to string
        System.out.println(
                "Type of str : "
                        + ((Object)string).getClass().getSimpleName());

        System.out.println("Method 2 to 6:");
        // Declaring and initializing double number
        double number = 123.456;

        // Converting Double data to String data
        String method1 = String.valueOf(number);
        System.out.println("Using valueOf method "
                + method1);

        // Conversion using format()
        String method2 = String.format("%f", number);
        System.out.println("Using format method "
                + method2);

        // Conversion using append()
        String method3
                = new StringBuilder().append(number).toString();
        System.out.println("Using append method "
                + method3);

        // Converting Double data to String data
        String method4 = Double.toString(number);
        System.out.println("Using toString method "
                + method4);

        // Converting using DecimalFormat
        String method5
                = DecimalFormat.getNumberInstance().format(
                number);
        System.out.println("Using Decimalformat method "
                + method5);

        System.out.println("III. String to Long");
        // Creating a custom string
        String stri = "999999999999";
        System.out.println("String - " + stri);

        // Converting into Long
        long varLong = Long.parseLong(stri);

        // Printing String as Long
        System.out.println("Long - " + varLong);


        System.out.println("Method 2:");
        // Creating custom string
        String sstr = "999999999999";

        // Printing the above string
        System.out.println("String - " + sstr);

        // Converting into Long data type
        long varLong2 = Long.valueOf(sstr);

        // Printing String as Long
        System.out.println("Long - " + varLong2);

        System.out.println("IV. Long to String");
        // create a Long
        Long varLong3 = 999999999999L;

        // convert into String
        String strr = varLong + " ";

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + strr.getClass().getName());

        // print Long as String
        System.out.println(strr);

        // create a Long
        Long varLong1 = 999999999999L;

        System.out.println("Method 1: String.valueOf()");

        // convert into String
        String sttr = String.valueOf(varLong1);

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + sttr.getClass().getName()
                + "\n");
        System.out.println(String.valueOf(varLong1));

        // *************************************************************************
        // //

        System.out.println("Method 2: Long.toString()");
        sttr = Long.toString(varLong);

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + sttr.getClass().getName()
                + "\n");
        System.out.println(Long.toString(varLong));

        // *************************************************************************
        // //

        System.out.println("Method 3: new Long(long l)");
        System.out.println("Depreciated!");
        //sttr = new Long(varLong).toString();

        // printing the type of str to
        // show that long has been converted to string
//        System.out.println("Converted type : "
//                + str.getClass().getName()
//                + "\n");

        // *************************************************************************
        // //

        System.out.println("Method 4: String.format()");
        sttr = String.format("%d", varLong);

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + sttr.getClass().getName());
        System.out.println(String.format("%d", varLong));

        // *************************************************************************
        // //

        System.out.println(
                "Method 5: StringBuilder, StringBuffer object");
        sttr = new StringBuilder()
                .append(varLong)
                .toString();

        // printing the type of str to
        // show that long has been converted to string
        System.out.println("Converted type : "
                + sttr.getClass().getName());

        System.out.println("Output: " + sttr);

        ///////////////////////////////////////////////////
        System.out.println("V. Int to Char conversion!");
        System.out.println("Method 1: Using the concept of Type-casting");
        // Custom integer input
        int i = 97;

        // Type casting character to integer
        char ch = (char)i;

        // Print statement
        System.out.println(ch);


        int k = 64;
        char ch1 = (char)(k + '0');
        System.out.println(ch1);

        System.out.println("Method 2. Using Character.forDigit() for Converting Int to Char");
        int base = 10;
        int a = 5;

        char ans = Character.forDigit(a, base);
        System.out.println(ans);

        int z=8;
        char ans2 = Character.forDigit(z, base);
        System.out.println(ans2);

        int base1 = 16;
        int a1 = 1;

        while (a1 < 16) {
            char ans3 = Character.forDigit(a1, base1);
            System.out.print(ans3+" ");
            a1++;
        }

        System.out.println("VI. Convert char to int");
        System.out.println("Method 1: Using ASCII values for Char to Int Conversion ");
        // Initializing a character
        char chare = '3';

        // Printing the character value
        System.out.println("char value: " + chare);

        // Converting character to its integer value
        int aa = chare - '0';

        // Printing the integer value
        System.out.println("int value: " + aa);

        System.out.println("Method 2: Using String.valueOf() ");
        // Converting the character to it's integer value
        // using valueOf() method
        int ab = Integer.parseInt(String.valueOf(chare));

        // Printing the integral value
        // corresponding to its character value
        System.out.println("int value: " + ab);

        System.out.println("Method 3: "+" Using getNumericValue() method of Character Class");
        // Converting the Character to it's int value
        // using getNumericValue() method of Character Class
        int ac = Character.getNumericValue(chare);

        // Printing the corresponding integral value
        System.out.println("int value: " + ac);

    }
}
