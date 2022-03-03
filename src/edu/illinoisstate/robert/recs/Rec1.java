package edu.illinoisstate.robert.recs;

public class Rec1 {

    /*
    Rec 1 Don't confuse abstract with reference
     */
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);

        String s3 = "Hello";
        String s4 = "Hello";

        System.out.println(s3.equals(s4));
    }

}
