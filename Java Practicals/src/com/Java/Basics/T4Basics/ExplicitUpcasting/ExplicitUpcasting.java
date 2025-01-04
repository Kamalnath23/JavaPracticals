package com.Java.Basics.T4Basics.ExplicitUpcasting;

public class ExplicitUpcasting {
    /*
    Explicit Upcasting
    Upcasting is the process of casting a subtype to a supertype in the inheritance tree’s upward direction.
    When a sub-class object is referenced by a superclass reference variable, an automatic process is triggered
    without any further effort.
     */
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog();
        // Calls the overridden method in Dog class
        animal.makeSound();
        // This would give a compile error as fetch() is not
        // a method in Animal class
        //animal.fetch();
    }
}
