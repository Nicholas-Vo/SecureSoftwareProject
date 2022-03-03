package edu.illinoisstate.nickbeard;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class rule4 {
    public static void main(String[] args) throws FileNotFoundException {
        final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("rule4.txt")));
        //will create a file or overwrite what is already there if it already exists
        out.println("This is an example program for rule 4"); //items that are supposed to be written to the file
        out.println("Example");
        out.println("Test");
        Runtime.getRuntime().exit(1); //closes the program before the file can be written to
    }
}
