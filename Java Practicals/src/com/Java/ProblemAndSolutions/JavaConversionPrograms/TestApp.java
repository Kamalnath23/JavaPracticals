package com.Java.ProblemAndSolutions.JavaConversionPrograms;

public class TestApp {
    public static void main(String[] args) {
        test(2);

    }

    public static  void test(int dayOfweek){
        System.out.println("before switch");
        switch (dayOfweek){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("monday");
                break;

            default:
                System.out.println("ennter 1/2");
                break;
        }
        System.out.println("after switch");
    }
}
