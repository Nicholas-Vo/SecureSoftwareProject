package edu.illinoisstate.nickbeard;

public class rec4Correct {
    public static void main(String[] args) {
        doSomethingRight();
    }

    private final String exampleString = "Woo"; // the string is initialized

    private static void doSomethingRight() {
        String newString = "This is a new string!"; // a new string should be made for this method if needed with a different name to avoid shadowing
        System.out.print(newString);
        // it can now output the string
    }
}
