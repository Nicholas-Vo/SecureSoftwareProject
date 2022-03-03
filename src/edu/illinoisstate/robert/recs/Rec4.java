package edu.illinoisstate.robert.recs;

public class Rec4 {

    /*
    Rec 4 don't assume remainder operator will return non-negative
     */
    public static void main(String[] args) {
        int min = -25;
        int max = 25;
        int a = 3;

        //generate random number between -25 and 25
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random + " This is the random number");

        int m = random % a;
        System.out.println(m + " This is the modulus");
        if (m < 0) {
            System.out.println("Negative number try again.");
        } else {
            System.out.println(m);
        }

    }

}
