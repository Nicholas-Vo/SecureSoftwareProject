package edu.illinoisstate.nickbeard;

public class rec4 {

    public static void main(String[] args) {
        doSomething();
    }

    private final String exampleString = "Woo"; //the string is initialized

    private static void doSomething() {

        /*
        the string exampleString is reused and had no actual value due to shadowing
        it cannot output the string as it was shadowed and did not receive the
        initialized value from outside the method
         */

        String exampleString;
        System.out.println(/* exampleString */);
    }
}
