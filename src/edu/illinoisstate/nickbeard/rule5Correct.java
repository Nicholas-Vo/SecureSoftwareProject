package edu.illinoisstate.nickbeard;

public class rule5Correct {
    public static void main(String[] args) {
        class Male {}

        Male Joe = new Male();
        Male Joey = new Male();

        if (Joe.getClass() == Joey.getClass()) { //compares the class types and not the names
            System.out.print("They are the same!");
        } else {
            System.out.print("They are not the same!");
            //if one of the classes was loaded from a different class loader, comparing by names would be problematic
            //this is because classes can have the same name if they are loaded from different class loaders
            //therefore comparing the names would make them equal no matter what even if they are completely different classes
        }
    }
}