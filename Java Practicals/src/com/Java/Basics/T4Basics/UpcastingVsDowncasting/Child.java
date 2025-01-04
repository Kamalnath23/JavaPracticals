package com.Java.Basics.T4Basics.UpcastingVsDowncasting;

public class Child extends Parent{
    int id;

    // Overriding the parent method
    // to print the signature of the
    // child class
//    @Override
    @Override
    void method()
    {
        System.out.println("Method from Child");
    }
}
