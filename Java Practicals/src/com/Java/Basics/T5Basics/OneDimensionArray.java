package com.Java.Basics.T5Basics;

public class OneDimensionArray {
    public static void main(String[] args) {
        //1. Declaration of an array
        int[] rollNumber;
        int number[];

        //2. Create memory space
        rollNumber= new int[10];
        float[] avg = new float[10];

        //3. Initialisation of arrrays
        String[] s={"Kamal", "Rahul","Praveen", "Tiger", "Solaris","Aravindh","Naveen","Lakshmi", "Ajay","Gangha"};
        String[] sport = new String[3];
        sport[0]= "Cricket";
        sport[1]= "Volleybal";
        sport[2]= "Badminton";
        for(int i=0; i<sport.length; i++){
            System.out.println(sport[i]);
        }

        for(String name:s){
            System.out.println(name);
        }

    }
}
