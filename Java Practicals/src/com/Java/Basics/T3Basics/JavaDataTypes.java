package com.Java.Basics.T3Basics;

public class JavaDataTypes {
    public static void main(String[] args) {
        //1. Byte - 8 bits - 1 byte
        //-128 to 127
        Byte a,b,c,e,f;
        b=125;
        c=-98;
        System.out.println(b);
        System.out.println(c);
        System.out.println(b-c);
        a= (byte) (b-c);
        System.out.println(a);
        e=Byte.MAX_VALUE;
        f=Byte.MIN_VALUE;
        System.out.println("Byte Max value : "+e);
        System.out.println("Byte Min value : "+f);
        System.out.println(e+1);

        byte z=127; byte y =127, x;
        x= (byte) (y+z);
        System.out.println(x);

        //2. Short - 16 bits - 2 bytes
        //-32768 to 32767
        short s = (short) 32768;
        System.out.println(s);
        short s1, s2;
        s1= Short.MAX_VALUE;
        s2= Short.MIN_VALUE;
        System.out.println("Short Max value : "+s1);
        System.out.println("Short Min value : "+s2);
        System.out.println(s1+1);

        //3. Int - 32 bits - 4 bytes
        //-2147483648 to 2147483647
        int i1,i2;
        i1= Integer.MAX_VALUE;
        i2= Integer.MIN_VALUE;
        System.out.println("Int Max value : "+i1);
        System.out.println("Int Min value : "+i2);
        System.out.println(i1+1);


        //4. Long - 64 bits - 8 bytes
        // -9223372036854775808 to 9223372036854775807
        long l1,l2;
        l1= Long.MAX_VALUE;
        l2= Long.MIN_VALUE;
        System.out.println("Long Max value : "+l1);
        System.out.println("Long Min value : "+l2);
        System.out.println(l1+1);

    }


}
