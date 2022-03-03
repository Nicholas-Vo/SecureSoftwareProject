package edu.illinoisstate.matt.rules;

public class Rule6 {

    public static void main(String[] args) {
        int number = 10;

        doubleNumberNonCompliant(number);
        System.out.println("The number didn't double; It's still " + number + ".");

        number = doubleNumberCompliant(number);
        System.out.println("The number is doubled! It's now " + number + ".");
    }

    public static void doubleNumberNonCompliant(int num) {
        num = num * 2; // The number is doubled, but never used
    }

    public static int doubleNumberCompliant(int num) {
        return num * 2;
    }

}
