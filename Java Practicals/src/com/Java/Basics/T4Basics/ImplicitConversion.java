package com.Java.Basics.T4Basics;

public class ImplicitConversion {
    public static void main(String[] args) {
        //ImplicitConversion ALSO CALLED AS WIDENING CASTING AND AUTOMATION TYPE CONVERSION
        //byte --> short --> int --> long --> float --> double
        int i=100;
        long l=i; //No explicit type casting required
        float f=l; //No explicit type casting required
        System.out.println("int val: "+i);
        System.out.println("long value: "+l);
        System.out.println("float value: "+f);
    }
}
