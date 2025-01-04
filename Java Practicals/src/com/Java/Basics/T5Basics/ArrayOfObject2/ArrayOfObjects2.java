package com.Java.Basics.T5Basics.ArrayOfObject2;
/*
The Student Array contains five memory spaces each of the size of Student class in which the address of
five Student objects can be stored.
The Student objects have to be instantiated using the constructor of the Student class, and their references
should be assigned to the array elements in the following way.
 */
public class ArrayOfObjects2 {
    public static void main(String[] args) {
        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the first elements of the array
        arr[0] = new Student(1, "Ajay");

        // initialize the second elements of the array
        arr[1] = new Student(2, "Deepthi");

        // so on...
        arr[2] = new Student(3, "Dinesh");
        arr[3] = new Student(4, "Heena");
        arr[4] = new Student(5, "Sabitha");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                    + arr[i].roll_no + " "
                    + arr[i].name);
    }

}


