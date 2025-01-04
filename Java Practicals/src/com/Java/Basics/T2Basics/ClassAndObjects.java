package com.Java.Basics.T2Basics;

public class ClassAndObjects {
    public static void main(String[] args) {
        IndianBikes RoyalEnfield = new IndianBikes("Royal Enfield", 28.89f, 133, 5, "BS6", 349,true);
       // IndianBikes RoyalEnfield = new IndianBikes();
        String Bike1 = "Royal Enfield";
        System.out.println(RoyalEnfield.Bike);
        System.out.println(RoyalEnfield.Engine);
        System.out.println(RoyalEnfield.Engine_Capacity);
        System.out.println(RoyalEnfield.Mileage);
        System.out.println(RoyalEnfield.topSpeed);
        System.out.println(RoyalEnfield.no_of_gears);
        System.out.println(RoyalEnfield.singleExhauster);
        RoyalEnfield.startMyBike(Bike1);
        RoyalEnfield.stopMyBike(Bike1);
        RoyalEnfield.displayProperties(28.89f, 133, 5, "BS6", 349,true);

    }
}
