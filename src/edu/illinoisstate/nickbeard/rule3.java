package edu.illinoisstate.nickbeard;

public class rule3 {
    public static void main(String[] args) { //the main point of this, is that a security manager is checking access in a public/non-final method
        SecurityManager exampleSecurityManager = new SecurityManager();
        System.setSecurityManager(exampleSecurityManager);
        exampleSecurityManager.checkWrite("rule3File.txt");
        //these 3 lines of code create a Security Manager and then use it to check if rule3File.txt is writeable
        //the file was created by me in the project directory and has its permissions set to no one can do anything with it besides an admin
    }
}
