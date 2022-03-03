package edu.illinoisstate.nickbeard;

import java.io.File;
import java.io.IOException;

public class rule2 {
    public static void main(String[] args) {
        try {
            File aFile = new File("rule2File.txt"); //creates a new file
            if (aFile.createNewFile()) {
                System.out.print("Success"); //output if creation was successful
            } else {
                System.out.print("File already exists"); //output if file already exists
            }

            aFile.delete(); //deletes the file without a check for success, if it fails it will fail silently

        }catch (IOException e){
            System.out.print("An error has occurred."); //if the file cannot be created for some other reason
        }
    }
}