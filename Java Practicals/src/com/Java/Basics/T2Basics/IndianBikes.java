package com.Java.Basics.T2Basics;

import java.util.Objects;

public class IndianBikes {
    String Bike;
    String Engine;
    int Engine_Capacity;
    float Mileage;
    double topSpeed;
    int no_of_gears;
    boolean singleExhauster;
    //Create a constructor of this method
    public IndianBikes(String Bike, float Mileage,double topSpeed,int no_of_gears,  String Engine, int Engine_Capacity, boolean singleExhauster ){
        this.Bike= Bike;
        this.Mileage = Mileage;
        this.topSpeed = topSpeed;
        this.no_of_gears=no_of_gears;
        this.Engine = Engine;
        this.Engine_Capacity = Engine_Capacity;
        this.singleExhauster=singleExhauster;
    }


    public void startMyBike(String Bike){
        System.out.println("Key is inserted and turned on");
        if(Objects.equals(Engine, "BS6")){
            System.out.println("Kill switch turned on");
            System.out.println("Ignition initiated");
        }else{
            System.out.println("kick the Kicker");
        }
        System.out.println("My bike : "+Bike +" is started");
    }

    public void stopMyBike(String Bike){
        if(Objects.equals(Engine, "BS6")){
            System.out.println("Kill switch turned off");
        }else{
            System.out.println("Kill switch turned off");
        }
        System.out.println("My bike : "+Bike +" is stop");
    }

    public void displayProperties(float Mileage,double topSpeed,int no_of_gears,  String Engine, int Engine_Capacity, boolean singleExhauster ){
        System.out.println("Mileage : "+Mileage);
        System.out.println("Top Speed : "+topSpeed);
        System.out.println("Number of gears: "+no_of_gears);
        System.out.println("Engine type : "+Engine);
        System.out.println("Engine Capacity : "+Engine_Capacity);
        System.out.println("Single exhauster : "+singleExhauster);
    }
}
