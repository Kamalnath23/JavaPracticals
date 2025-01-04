package com.Java.Basics.T3Basics;

public class JavaDataTypes2 {
    public static void main(String[] args) {
        //Floating point data type
        //1. Float - 32 bits - 4 bytes
        //1.4E-45 to 3.4028235E38
        // number and 7 digit

        float f1= 23.0987654321f;
        System.out.println(f1);

        float fp1, fp2, fn1,fn2;
        fp1= Float.MAX_VALUE;
        fp2= Float.MIN_VALUE;
        System.out.println(fp1);
        System.out.println(fp2);

        //1. Double - 64 bits - 8 Bytes
        // 4.9E-324 to 1.7976931348623157E308
        double d1,d2;
        d1= Double.MAX_VALUE;
        d2 = Double.MIN_VALUE;
        System.out.println("Double Max value : "+d1);
        System.out.println("Double Min value : "+d2);

    }
}
