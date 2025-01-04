package com.Java.Basics.T4Basics;

public class ExplicitConversion {
    public static void main(String[] args) {
        //ExplicitConversion ALSO CALLED AS NARROW CASTING
        //double --> float --> long --> int  --> short --> byte
        double d = 100.04;
        long l =(long) d; //explicit type casting required
        int i=(int)l;
        System.out.println("Double value: "+d);
        System.out.println("Long value: "+l);
        System.out.println("Int value: "+i);
    }
}
