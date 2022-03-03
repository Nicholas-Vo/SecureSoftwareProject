package edu.illinoisstate.nickbeard;

import java.io.*;

public class rule4Correct {
    public static void main(String[] args) throws FileNotFoundException {
        final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("rule4_2.txt")));
        //will create a file or overwrite what is already there if it already exists
        try {
            out.println("This is an example program for rule 4"); //items that are to be written to the file
            out.println("Example");
            out.println("Test");
        } finally{ //now since the text had been written to the file, it will "finally" move on to closing the file
            out.close();
        }
        Runtime.getRuntime().exit(1);
        //the program closes after the file output has been closed, making sure that data is written and not corrupted
    }
}

