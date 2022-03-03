package edu.illinoisstate.robert.rules;

public class Rule2 {

    /*
    //Rule 2: Don't use float for precise computation
     */
    public static void main(String[] args) {
        double money = 1.30;
        double cost = 0.70;
        System.out.println("Change is $" + (money - cost));

        int moneyInt = 130;
        int costInt = 70;
        System.out.println("Change is $0." + (moneyInt - costInt) / 10);
    }


}
