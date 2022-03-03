package edu.illinoisstate.nickbeard;

public class rule1Correct {
    public static void main(String[] args) {
        Object nullObject = null; //creates an object with a value of null
        Object realObject = "Yes"; //creates an object with a String value of Yes
        if (nullObject == null){
            System.out.print("Value is null for nullObject, cannot continue."); //output if nullObject's value is null
        }else {
            System.out.print('\n' + nullObject.toString()); //output if nullObject's value was not null
        }
        if(realObject == null){
            System.out.print("Value is null for realObject, cannot continue."); //output if realObject's value is null
        }else {
            System.out.print('\n' + realObject.toString()); //output if realObject's value is not null
        }
    }
}
