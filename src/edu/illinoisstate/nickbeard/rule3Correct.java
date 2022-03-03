package edu.illinoisstate.nickbeard;

public class rule3Correct {
    public static final void main(String[] args) { //main method is final preventing other methods or classes from overriding it
    canFileBeWrote(); //method is called from a final method
    }

    private static final void canFileBeWrote() { //method is final and private preventing it from being overwritten by another method or class elsewhere
        SecurityManager exampleSecurityManager = new SecurityManager();
        System.setSecurityManager(exampleSecurityManager);
        exampleSecurityManager.checkWrite("rule3File.txt");
        //all of this is the same as the incorrect one
    }
}


