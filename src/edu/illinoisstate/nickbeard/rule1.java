package edu.illinoisstate.nickbeard;

public class rule1 {
    public static void main(String[] args) {
        Object exampleObject = null;
        try {
            System.out.print(exampleObject.toString()); //attempts to output exampleObject to a string
            } catch (NullPointerException e) { //catches the NullPointerException instead of fixing the problem and then outputs a message
            System.out.print("An exception occurred, but you are all good!");
        }
    }
}


