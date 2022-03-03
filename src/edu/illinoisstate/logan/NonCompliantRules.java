package edu.illinoisstate.logan;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Logan Honts
 * IT355
 * Non-compliant Rules class
 */
public class NonCompliantRules {
    /**
     * Class for non-compliant rules
     */
    Scanner userIn = new Scanner(System.in);

    /**
     * Rule 1: NUM02-J. Ensure that division and remainder
     * operations do not result in divide-by-zero errors
     */
    public void NonRule1() {
        double num1, num2, result;

        System.out.print("Enter number 1: ");
        num1 = userIn.nextInt();

        System.out.print("Enter number 2: ");
        num2 = userIn.nextInt();

        /*
         * Without checking if num2 could be zero then a
         * divide-by-zero is possible
         */
        result = num1 / num2;
        System.out.println("Result is: " + result);
    }

    /**
     * Rule 2: NUM09-J. Do not use floating-point variables as loop counters
     */
    public void NonRule2() {
        float counter;

        /*
         * Using a floating-point variable in the loop counter here returns
         * inaccurate results
         */
        for (counter = 0.1f; counter <= 2.0f; counter += 0.1f) {
            System.out.println(counter);
        }
    }

    /**
     * Rule 3: NUM10-J. Do not construct BigDecimal objects
     * from floating-point literals
     */
    public void NonRule3() {

        /*
         * Not encasing the floating-point value in parenthesis doesn't
         * allow BigDecimal to do its job properly. Thus, resulting in unpredicatble results
         */
        System.out.println(new BigDecimal(6.9));
    }

    /**
     * Rule 4: EXP02-J. Do not use the Object.equals() method to compare two arrays
     */
    public void NonRule4() {

        String[] fruits = {"Apple", "Banana", "Strawberry"};
        String[] veggies = {"Carrot", "Broccoli", "Cucumber"};

        System.out.println(fruits.equals(veggies));

        String[] fruits2 = {"Apple", "Banana", "Strawberry"};

        /*
         * Now this should return true as fruits = fruits2,
         * but Object.equals() compares the references instead
         * of the contents so this will return false
         */
        System.out.println(fruits.equals(fruits2));
    }

    /**
     * Rule 5: NUM08-J. Check floating-point inputs for exceptional values
     */
    public void NonRule5() {
        double currentBalance = 5000;

        System.out.println("Current balance is: " + currentBalance);
        System.out.println("How much would you like to withdrawal? ");

        double val = userIn.nextInt();

        /*
         * Not checking for the exceptional values (Infinity/-infinity and NaN)
         * allows those values to make their way into the code
         */

        if (val > currentBalance) {
            System.out.println("Insufficient funds");
        } else {
            currentBalance -= val;
            System.out.println("New balance is: " + currentBalance);
        }
    }

}

/**
 * Class to run program
 */
class RunNonRules {
    public static void main(String[] args) {

        /*
         * Creating object to call methods
         */
        NonCompliantRules nonRuleObj = new NonCompliantRules();

        System.out.println("Non-Compliant Rule 1!");
        nonRuleObj.NonRule1();
        System.out.println();

        System.out.println("Non-Compliant Rule 2!");
        nonRuleObj.NonRule2();
        System.out.println();

        System.out.println("Non-Compliant Rule 3!");
        nonRuleObj.NonRule3();
        System.out.println();

        System.out.println("Non-Compliant Rule 4!");
        nonRuleObj.NonRule4();
        System.out.println();

        System.out.println("Non-Compliant Rule 5!");
        nonRuleObj.NonRule5();
        System.out.println();
    }

}



