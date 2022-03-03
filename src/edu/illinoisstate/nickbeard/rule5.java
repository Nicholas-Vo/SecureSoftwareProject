package edu.illinoisstate.nickbeard;

public class rule5 {
    public static void main(String[] args) {
        class Male {}

        Male Joe = new Male();
        Male Joey = new Male();

        if (Joe.getClass().getName().equals(Joey.getClass().getName())) { //compares by name, this is incorrect
            System.out.print("They are the same!");
        } else {
            System.out.print("They are not the same!");
            //see the compliant solution for explanation
        }
    }
}
