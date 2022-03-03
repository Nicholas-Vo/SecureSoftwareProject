package edu.illinoisstate.robert.recs;

public class Rec3 {

    /*
    Rec 3 dont use denormalized numbers
     */
    public static void main(String[] args) {
        double a = 1 / 9.0;

        System.out.println("Original  : " + a);
        a = a * 18e-45;
        System.out.println("Normalized: " + a);
        a = a / 18e-45;
        System.out.println("Restored  : " + a);
        System.out.println();

        float b = 1 / 9.0f;
        System.out.println("Original    : " + b);
        b = b * 18e-45f;
        System.out.println("Denormalized: " + b);
        b = b / 18e-45f;
        System.out.println("Restored    : " + b);
    }

}
