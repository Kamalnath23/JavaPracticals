package com.Java.Basics.T4Basics.ExplicitDowncasting;

public class ExplicitDowncasting {
    /*
    Explicit Downcasting
    When a subclass type refers to an object of the parent class, the process is referred to as downcasting.
    If it is done manually, the compiler issues a runtime ClassCastException error.
    It can only be done by using the instanceof operator.
    Only the downcast of an object that has already been upcast is possible.
     */
    public static void main(String[] args) {
            Animal animal = new Cat();
            animal.eat();

        // Explicit downcasting
        Cat cat = (Cat)animal;
        cat.meow();
        cat.eat();
    }
}
