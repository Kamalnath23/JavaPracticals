package com.Java.Basics.T4Basics.UpcastingVsDowncasting;

public class App {
    public static void main(String[] args) {
        // Upcasting
        Parent p = new Child();
        p.name = "Kamal";

        //Printing the parentclass name
        System.out.println(p.name);
        //parent class method is overridden method hence this will be executed
        p.method();

        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error

        // Downcasting Explicitly
        Child c = (Child)p;

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}
