package edu.illinoisstate.nickbeard;

import java.io.File;
import java.io.IOException;

public class rule2Correct {
    public static void main(String[] args) {
        try {
            File aFile = new File("rule2File.txt"); //creates a new file
            if (aFile.createNewFile()) {
                System.out.print("Success"); //output if creation was successful
            } else {
                System.out.print("File already exists"); //output if file already exists
            }

            if (!aFile.delete()){ //attempts to delete a file and check if it was successful
                System.out.print("\nFile failed to delete."); //output if file could not be deleted
            }else {
                System.out.print("\nFile was deleted successfully"); //output if file was deleted
            }

        }catch (IOException e){
            System.out.print("An error has occurred."); //if the file cannot be created for some other reason
        }
    }
}
