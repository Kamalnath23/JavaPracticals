package com.Java.Basics.T3Basics;

public class IntegerLiterals {
    public static void main(String[] args) {
        //Binary - base 2
        //Decimal - base 10 - Literals appears as ordinary numbers with no special edition
        //Hexadecimal - base 16 - Literals appears with a leading 0x or OX
        //Octal - base 8 - Literals appears with a leading 0 in front of digits.

        //Octal literal examples
        int nine = 011; //equal to decimal 9
        int ten = 012; //equal to decimal 10
        int eleven = 013; //equal to decimal 11
        int twelve = 014; //equal to decimal 12

        System.out.println("Octal 011 = "+nine);
        System.out.println("Octal 012 = "+ten);
        System.out.println("Octal 013 = "+eleven);
        System.out.println("Octal 014 = "+twelve);



        //Work shop
        // Binary literal (base 2) with prefix 0b
        int binaryNum = 0b1010; // 10 in decimal
        System.out.println("binaryNum: "+binaryNum);
        //I. Decimal to Binary  (base 8 to base 2)
        //1) 68 --> 100 0100
        int b1 = 0b1000100;
        System.out.println(b1);
        //2) 0.68 --> 0.1010
        //double b2 = 0b0.1010e+0;
        //System.out.println(b2);
        //3) 70.68 -> 100 0110.1010

        //II. Octal to Decimal
        //1) 632-? (Ans: 410)
        int D410 = 0632; //Octal value is feeded to a int data type And int data type converts to decimal
        System.out.println("Octal 0632 = "+D410);


        //III. Decimal to Octal
        // 1) 177 --> ? (261)
        int D177 = 0261; //Octal value is feeded to a int data type And int data type converts to decimal
        System.out.println("Octal 0261 = "+D177);

        //IV. Decimal fraction to Octal fraction
        //1) 0.532 -> ? (0.413)
        //int F0Point413 = 0.532;
        //double d = 0x0.0000000000001P-1022;
        double F0Point413 = 00.413e+0;
        System.out.println("Octal 0.532 = "+F0Point413); //not working in float

        //V. Decimal to Binary (Using Octal)
        //1) 177
        // => 177 -->  (Octal) --> (Binary)
        // ==> 177-> 261 --> 010 110 001 (refer III for code)

        //VI. Decimal fraction to Binary fraction(Using Octal)
        //1) (177.523)
        //==> (177.523) --> (Octal) --> (Binary)
        double octfract = 0261.413e+0;
        double octfract2 = 0261.413e+0;
        System.out.println("177.523: 0"+octfract);
        //==> (177.523) --> (261.413) --> (010 110 001.100 001 011)

        //VII. Binary --> Decimal (Using Octal)
        //1) (11 100 111)
        // ==> (11 100 111) --> Octal --> Decimal
        //==> (11 100 111) --> 347 --> 231
        int D_231 = 0347; //Octal value is feeded to a int data type And int data type converts to decimal
        System.out.println("Octal 0347 = "+D_231);

        // VIII. Decimal to Hexadecimal
        //1) 4768 --> ?
        // 4768 = 12A0
        int D_4768 = 0X12A0;
        System.out.println("Hexadecimal 0X12A0 = "+D_4768);

        //VIII. Hexadecimal to Decimal
        //1) F4C16
        int ans = 0XF4C;
        System.out.println("Hexadecimal 0XF4C16 = "+ans);
        double v = 0x4;;
        int ans2 = 0XF4C;
        System.out.println("Hexadecimal 0XF4C16 = "+ans2);
        // ==> 3916

        //IX.
        double dd = 0x0.987P+0;
        System.out.println(dd);




    }
}
