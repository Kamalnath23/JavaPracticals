package com.Java.Basics.T5Basics.ArrayOfObject3;

public class ArrayOfObject3 {
    public static void main(String[] args) {
        // declares an Array and initializing  the elements of the array
        Student[] myStudents = new Student[]{new Student("Dharma"), new Student("sanvi"), new Student("Rupa"), new Student("Ajay")};

        // accessing the elements of the specified array
        for (Student m : myStudents) {
            System.out.println(m);
        }
    }
}

